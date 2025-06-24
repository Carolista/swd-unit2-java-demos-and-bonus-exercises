-- WRAP ENTIRE SCRIPT IN A TRANSACTION
START TRANSACTION;

-- DROP ALL TABLES IF THEY EXIST
DROP TABLE IF EXISTS artist, artwork, artwork_details, exhibit, category;

-- Create category table
CREATE TABLE category (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL
);

-- Create artist table
CREATE TABLE artist (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    country VARCHAR(20) NOT NULL
);

-- Create exhibit table
CREATE TABLE exhibit (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(80) NOT NULL
);

-- Create artwork table
-- Designate foreign keys for artist, category, and exhibit
CREATE TABLE artwork (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL,
    details_id INT NOT NULL,
    artist_id INT NOT NULL,
    category_id INT NOT NULL,
    exhibit_id INT NULL,
    on_display BOOLEAN NOT NULL DEFAULT 0,
    FOREIGN KEY (artist_id) REFERENCES artist(id),
    FOREIGN KEY (category_id) REFERENCES category(id),
    FOREIGN KEY (exhibit_id) REFERENCES exhibit(id)
);

-- Create artwork_details table
CREATE TABLE artwork_details (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    year_created VARCHAR(20) NULL,
    media VARCHAR(80) NULL
);

-- ROLLBACK;
COMMIT;

/* AFTER SUCCESSFUL SCRIPT RUN, IMPORT DATA IN THE FOLLOWING ORDER */

-- Import records from categories.csv
-- Import records from artists.csv
-- Import records from artworks.csv
-- Import records from details.csv

