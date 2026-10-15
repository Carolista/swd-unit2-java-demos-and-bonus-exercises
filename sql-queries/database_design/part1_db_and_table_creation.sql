# IMPORTANT: Run database creation query once and then comment it out
-- CREATE DATABASE gallery_dbd;

# Everything below is a true script meant to run from top to bottom

-- Wrap entire script in a transaction
START TRANSACTION;

-- Set context
USE gallery_dbd;

-- Drop all tables if they already exist
DROP TABLE IF EXISTS artists, artworks, artwork_details, exhibits, categories;

-- Create categories table
CREATE TABLE categories (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL
);

-- Create artists table
CREATE TABLE artists (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(40) NOT NULL,
    last_name VARCHAR(40) NOT NULL,
    country VARCHAR(40) NOT NULL
);

-- Create exhibits table
CREATE TABLE exhibits (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(80) NOT NULL
);

-- Create artworks table
-- Designate foreign keys for artist, category, and exhibit
CREATE TABLE artworks (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    details_id INT NOT NULL,
    artist_id INT NOT NULL,
    category_id INT NOT NULL,
    exhibit_id INT NULL,
    on_display BOOLEAN NOT NULL DEFAULT 0,
    FOREIGN KEY (artist_id) REFERENCES artists(id),
    FOREIGN KEY (category_id) REFERENCES categories(id),
    FOREIGN KEY (exhibit_id) REFERENCES exhibits(id)
);

-- Create artwork_details table
CREATE TABLE artwork_details (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    year_created VARCHAR(40),
    media VARCHAR(50)
);

-- No COMMIT or ROLLBACK needed since structural changes cannot be rolled back.
-- (This is why we have the DROP IF EXISTS at the top of this transaction.)
