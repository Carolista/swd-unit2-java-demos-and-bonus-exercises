# IMPORTANT: Run only one query at a time — this is not a top-to-bottom script,
# just a series of independent queries.

-- Create database
CREATE DATABASE gallery_sql;

-- Create artworks table
CREATE TABLE gallery_sql.artworks (
    id INT PRIMARY KEY,
    title VARCHAR(80) NOT NULL,
    artist VARCHAR(60) NOT NULL,
    category VARCHAR(40)
);

-- View empty table (and re-run this in future to see records)
SELECT * FROM gallery_sql.artworks;

-- Add first record
INSERT INTO gallery_sql.artworks
VALUES (1, "Mona Lisa", "Leonardo da Vinci", "Renaissance");

-- Add second record with partial values
INSERT INTO gallery_sql.artworks(id, title, artist)
VALUES (2, "Girl with a Pearl Earring", "Johannes Vermeer");

-- Add 2 more records at the same time
INSERT INTO gallery_sql.artworks
VALUES (3, "The Starry Night", "Vincent van Gogh", "Post-Impressionism"),
(4, "The Kiss", "Gustav Klimt", "Art Nouveau");

-- Add a new column, on_display, to the existing table
ALTER TABLE gallery_sql.artworks
ADD on_display BOOLEAN;

-- Update the third record to indicate that it is on display
UPDATE gallery_sql.artworks
SET on_display=1
WHERE id=3;

-- Update the second record to assign the category and indicate that it is on display
UPDATE gallery_sql.artworks
SET category="Baroque", on_display=1
WHERE id=2;

-- View all records in the table
SELECT * FROM gallery_sql.artworks;

-- View only artwork currently on display
SELECT * FROM gallery_sql.artworks
WHERE on_display=1;

-- Look up ID using name of artist
SELECT id, title, artist FROM gallery_sql.artworks
WHERE artist="Gustav Klimt";

-- Add a few more records
INSERT INTO gallery_sql.artworks
VALUES (5, "Vase with Twelve Sunflowers", "Vincent van Gogh", "Post-Impressionism", 0),
(6, "The Church at Auvers", "Vincent van Gogh", "Post-Impressionism", 0),
(7, "Still Life with a Curtain", "Paul Cézanne", "Post-Impressionism", 1),
(8, "The Milkmaid", "Johannes Vermeer", "Baroque", 0),
(9, "The Last Supper", "Leonardo da Vinci", "Renaissance", 1);

-- View only records with ids greater than 5
SELECT * FROM gallery_sql.artworks WHERE id > 5;

-- View titles, artist, and categories of all post-impressionist artwork
SELECT title, artist, category
FROM gallery_sql.artworks
WHERE category="Post-Impressionism";

-- Run a similar query as the last but only those NOT on display
SELECT title, artist, category
FROM gallery_sql.artworks
WHERE (category="Post-Impressionism") AND (on_display!=1);

-- View titles and artist if artwork is by either da Vinci or Vermeer using OR
SELECT title, artist
FROM gallery_sql.artworks
WHERE (artist="Leonardo da Vinci") OR (artist="Johannes Vermeer");

-- Rewrite the previous query using IN
SELECT title, artist
FROM gallery_sql.artworks
WHERE artist IN ("Leonardo da Vinci","Johannes Vermeer");

-- View only records where the title begins with "The"
SELECT * FROM gallery_sql.artworks
WHERE title LIKE "The%";

-- View all records again, but order by style, ascending
SELECT * FROM gallery_sql.artworks
ORDER BY category ASC;

-- Delete "The Church at Auvers" record (use ID number)
DELETE FROM gallery_sql.artworks
WHERE id=6;

-- View all records, concatenating using an alias as follows: Title by Artist
SELECT CONCAT(title, " by ", artist) AS title_and_artist
FROM gallery_sql.artworks;

-- View the first three records
SELECT * FROM gallery_sql.artworks LIMIT 3;

-- View the next three records
SELECT * FROM gallery_sql.artworks LIMIT 3 OFFSET 3;
