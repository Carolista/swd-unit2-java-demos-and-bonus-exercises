# IMPORTANT: Run only one query at a time — this is not a top-to-bottom script,
# just a series of independent queries.

-- Put the gallery_sql schema in context to simplify table references
USE gallery_sql;

-- Create a new table, artists, with an auto-generated id, first_name, last_name, 
-- full_name (generated from first and last names), and country
CREATE TABLE artists (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(40) NOT NULL,
    last_name VARCHAR(40) NOT NULL,
    full_name VARCHAR(81) GENERATED ALWAYS AS (CONCAT(first_name, " ", last_name)) VIRTUAL,
    country VARCHAR(40)
);

-- View empty table
SELECT * FROM artists;

-- Add records for van Gogh, da Vinci, Vermeer, Dalí and Monet (ids will auto-generate)
INSERT INTO artists (first_name, last_name, country)
VALUES ("Vincent", "van Gogh", "Netherlands"),
("Leonardo", "da Vinci", "Italy"),
("Johannes", "Vermeer", "Netherlands"),
("Salvador", "Dalí", "Spain"),
("Claude", "Monet", "France");

-- Select an inner join on the artwork table using the artists' names 
SELECT artist FROM artworks
INNER JOIN artists ON artist = full_name;

-- Run the previous query but eliminate duplicates 
SELECT DISTINCT artist FROM artworks
INNER JOIN artists ON artist = full_name;

-- List all artwork titles and artists and add countries from artist table using a left inner join
SELECT title, artist, country
FROM artworks
LEFT JOIN artists ON artist = full_name;

-- List all artwork titles and categories and add full names and countries from artist table using a right inner join
SELECT title, category, full_name, country
FROM artworks
RIGHT JOIN artists ON artist = full_name;

-- Do an inner join on artwork using artists' names and group by artist with a total
SELECT full_name, COUNT(*)
FROM artists INNER JOIN artworks ON artist = full_name
GROUP BY full_name;

-- Use a subquery to look up which artists in the artist table have artworks on display
SELECT * FROM artists
WHERE full_name IN (SELECT artist FROM artworks WHERE on_display=1);
