
DROP TABLE IF EXISTS artist, artwork, artwork_details, exhibit, category;

-- Create style table
CREATE TABLE category (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50)
);

-- Create artist table
CREATE TABLE artist (
	id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    country VARCHAR(20)
);

-- Create exhibit table
CREATE TABLE exhibit (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(80)
);

-- Create artwork table
-- Designate foreign keys for artist, category, and exhibit
CREATE TABLE artwork (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50),
    details_id INT,
    artist_id INT,
    category_id INT,
    exhibit_id INT,
    on_display BOOLEAN,
	FOREIGN KEY (artist_id) REFERENCES artist(id),
    FOREIGN KEY (category_id) REFERENCES category(id),
    FOREIGN KEY (exhibit_id) REFERENCES exhibit(id)
);

-- Create artwork_details table
CREATE TABLE artwork_details (
	id INT PRIMARY KEY AUTO_INCREMENT,
    year_created VARCHAR(20),
    media VARCHAR(80)
);


/* AFTER SUCCESSFUL SCRIPT RUN */

-- Import records from categories.csv
-- Import records from artists.csv
-- Import records from artworks.csv
-- Import records from details.csv

