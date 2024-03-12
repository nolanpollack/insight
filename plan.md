# Building a budgeting app

## Problem
- Coming from college or moving to a new city, it's difficult to know how much money you'll need to spend on different things
- App helps fix that by using AI powered insights to build a personalized budget, also factoring in the cost of living of your city

## Features
- Integrations with financial services
- Take in all transactions and categorize them
  - Maybe monthly spending to start?
- Model which suggests (using AI) budgets based on spending history
- For each category, show how you are doing on budget for the month (on pace)
- AI chat to decide where to make cuts (some would rather cut restaurants than bars, or vice versa)
- Comparing cities to live in? 
- Suggest investing at a certain amount, and help make investment portfolio with education (maybe a diversification score?)

## Front End
- Figma: 

## Back End
- REST endpoints for CRUD, can calculate recommended budgets
- Kotlin with Spring Boot

## Database
- Postgres database
- Design: https://app.quickdatabasediagrams.com/#/d/vcSif4

## Flow
- Create new account
- Add transactions somehow (maybe CSV before integrations?), ask monthly income

## TODO
- Create Spring boot application
- Store simple budget data (inflows outflows)
- Create model to predict budget and where budget can be improved
- Create front end to consume backend

## Requirements
- Authentication (Auth0)
- Legal requirements for storing financial information

## Marketing
- Can get students at Northeastern to try out for free, see if it's any good