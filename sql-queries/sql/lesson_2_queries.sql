# IMPORTANT: Run only one query at a time — this is not a top-to-bottom script,
# just a series of independent queries.

-- Create a new table, artists, with an auto-generated id, first_name, last_name, 
-- full_name (generated from first and last names), and country
CREATE TABLE gallery_sql.artists (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(40) NOT NULL,
    last_name VARCHAR(40) NOT NULL,
    full_name VARCHAR(81) GENERATED ALWAYS AS (CONCAT(first_name, ' ', last_name)) VIRTUAL,
    country VARCHAR(40)
);

-- View empty table
SELECT * FROM gallery_sql.artists;

-- Add records for van Gogh, da Vinci, Vermeer, Dalí and Monet (ids will auto-generate)
INSERT INTO gallery_sql.artists (first_name, last_name, nationality)
VALUES ("Vincent", "van Gogh", "Netherlands"),
("Leonardo", "da Vinci", "Italy"),
("Johannes", "Vermeer", "Netherlands"),
("Salvador", "Dalí", "Spain"),
("Claude", "Monet", "France");

-- Select all records from artists table
SELECT * FROM gallery_sql.artists;

-- Select an inner join on the artwork table using the artists' names 
SELECT artist FROM gallery_sql.artworks
INNER JOIN gallery_sql.artists ON artist = full_name;

-- Run the previous query but eliminate duplicates 
SELECT DISTINCT artist FROM gallery_sql.artworks
INNER JOIN gallery_sql.artists ON artist = full_name;

-- List all artwork titles and artists and add nationalities from artist table using a left inner join
SELECT title, artist, nationality
FROM gallery_sql.artworks
LEFT JOIN gallery_sql.artists ON artist = full_name;

-- List all artwork titles and styles and add full_name and nationality from artist table using a right inner join
SELECT title, category, full_name, nationality
FROM gallery_sql.artworks
RIGHT JOIN gallery_sql.artists ON artist = full_name;

-- Do an inner join on artwork using artists' names and group by artist with a total
SELECT full_name, COUNT(*)
FROM gallery_sql.artists INNER JOIN gallery_sql.artworks ON artist = full_name
GROUP BY full_name;

-- Use a subquery to look up which artists in the artist table have artworks on display
SELECT full_name FROM gallery_sql.artists
WHERE full_name IN (SELECT artist FROM gallery_sql.artworks WHERE on_display=1);