CREATE TABLE IF NOT EXISTS categories
(
    id     VARCHAR(60) PRIMARY KEY,
    name   VARCHAR NOT NULL,
    budget INT     NOT NULL
);