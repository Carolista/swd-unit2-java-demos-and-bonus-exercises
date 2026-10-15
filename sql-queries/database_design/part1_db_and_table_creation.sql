/*
    Everything below is a true script meant to run from top to bottom
    However, a TRANSACTION does not make sense here because this is pure structural setup
*/

-- Create database if it does not already exist
CREATE DATABASE IF NOT EXISTS gallery_dbd;

-- Set context
USE gallery_dbd;

-- Drop all tables if they already exist
DROP TABLE IF EXISTS artwork_details, artworks, artists, categories, exhibits;

-- Create categories table
CREATE TABLE categories (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL
);

-- Create artists table
CREATE TABLE artists (
	id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(40) NOT NULL,
    last_name VARCHAR(40) NOT NULL,
    country VARCHAR(40) NOT NULL
);

-- Create exhibits table
CREATE TABLE exhibits (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(80) NOT NULL
);

-- Create artworks table 
-- Designate foreign keys for artists, categories, and exhibits
CREATE TABLE artworks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    artist_id INT NOT NULL,
    category_id INT NOT NULL,
    exhibit_id INT NULL,
    on_display BOOLEAN NOT NULL DEFAULT 0,
    FOREIGN KEY (artist_id) REFERENCES artists(id),
    FOREIGN KEY (category_id) REFERENCES categories(id),
    FOREIGN KEY (exhibit_id) REFERENCES exhibits(id)
);

-- Create artwork_details table last since it references artworks
-- Its id should be the same as artworks.id since it's a one-to-one relationship
-- Designate foreign key for artworks
CREATE TABLE artwork_details (
	artwork_id INT PRIMARY KEY AUTO_INCREMENT,
    year_created VARCHAR(40),
    media VARCHAR(50),
    FOREIGN KEY (artwork_id) REFERENCES artworks(id)
);
