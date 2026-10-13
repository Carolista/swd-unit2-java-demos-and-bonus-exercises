# IMPORTANT: Run database creation query once and then comment it out
-- CREATE DATABASE gallery_dbd;

# Everything below is a true script meant to run from top to bottom,

-- Wrap entire script in a transaction
START TRANSACTION;

-- Set context
USE gallery_dbd;

-- Drop all tables if they already exist
DROP TABLE IF EXISTS artists, artworks, artwork_details, exhibits, categories;

-- Create category table
CREATE TABLE categories (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL
);

-- Create artist table
CREATE TABLE artists (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(40) NOT NULL,
    last_name VARCHAR(40) NOT NULL,
    country VARCHAR(40) NOT NULL
);

-- Create exhibit table
CREATE TABLE exhibits (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(80) NOT NULL
);

-- Create artwork table
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

-- ROLLBACK;
COMMIT;

/* AFTER SUCCESSFUL SCRIPT RUN, IMPORT DATA IN THE FOLLOWING ORDER */

-- Import records from categories.csv
-- Import records from artists.csv
-- Import records from artworks.csv
-- Import records from details.csv

-- No exhibit records exist yet, so nothing to import for that table