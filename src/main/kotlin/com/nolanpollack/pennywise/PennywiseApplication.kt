package com.nolanpollack.pennywise

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*
import java.util.UUID
import org.springframework.data.repository.CrudRepository
import kotlin.jvm.optionals.toList


@Table("CATEGORIES")
data class Category(@Id var id: UUID?, val name: String, val budget: Int)

interface CategoryRepository : CrudRepository<Category, UUID>

@Service
class CategoryService(val db: CategoryRepository) {
    fun findCategories(): List<Category> = db.findAll().toList()

    fun findCategoryById(id: UUID): List<Category> = db.findById(id).toList()

    fun save(category: Category) {
        db.save(category)
    }

    fun delete(id: UUID) {
        db.deleteById(id)
    }
}


@SpringBootApplication
class PennywiseApplication

fun main(args: Array<String>) {
    runApplication<PennywiseApplication>(*args)
}

@RestController
class PennywiseController(val service: CategoryService) {
    @GetMapping("/categories")
    fun get() = service.findCategories()

    @GetMapping("/categories/{id}")
    fun get(@PathVariable id: UUID) = service.findCategoryById(id)

    @PostMapping("/categories")
    fun post(@RequestBody category: Category) {
        service.save(category)
    }

    @DeleteMapping("/categories/{id}")
    fun delete(@PathVariable id: UUID) {
        service.delete(id)
    }
}
