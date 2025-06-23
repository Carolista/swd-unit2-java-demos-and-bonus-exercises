/* 
	Create table using SQL Workbench context menu 
    instead of a script 
*/

# Add a record with all values
INSERT INTO artwork
VALUES (1, "Mona Lisa", "Leonardo da Vinci", "Renaissance");

-- Add a record with partial values
INSERT INTO artwork(id, title, artist)
VALUES(2, "Girl with a Pearl Earring", "Johannes Vermeer");

-- Add 2 more records at the same time
INSERT INTO artwork
VALUES (3, "The Starry Night", "Vincent van Gogh", "Post-Impressionism"),
(4, "The Kiss", "Gustav Klimt", "Art Nouveau");

-- Add a new column, on_display, to the existing table
ALTER TABLE artwork
ADD on_display BOOLEAN;

-- Update the third record to indicate that it is on display
UPDATE artwork
SET on_display=1
WHERE id=3;

-- Update the second record to assign the category and indicate that it is on display
UPDATE artwork
SET category="Baroque", on_display=1
WHERE id=2;

-- View all records in the table
SELECT * FROM artwork;

-- View only artwork currently on display
SELECT * FROM artwork
WHERE on_display=1;

-- Look up ID using name of artist
SELECT id, title, artist FROM artwork
WHERE artist="Gustav Klimt";

-- Add a few more records
INSERT INTO artwork
VALUES (5, "Vase with Twelve Sunflowers", "Vincent van Gogh", "Post-Impressionism", 0),
(6, "The Church at Auvers", "Vincent van Gogh", "Post-Impressionism", 0),
(7, "Still Life with a Curtain", "Paul Cézanne", "Post-Impressionism", 1),
(8, "The Milkmaid", "Johannes Vermeer", "Baroque", 0),
(9, "The Last Supper", "Leonardo da Vinci", "Renaissance", 1);

-- View only records with ids greater than 5
SELECT * FROM artwork WHERE id > 5;

-- View titles, artist, and categories of all post-impressionist artwork
SELECT title, artist, category
FROM artwork
WHERE category="Post-Impressionism";

-- Run a similar query as the last but only those NOT on display
SELECT title, artist, category
FROM artwork
WHERE (category="Post-Impressionism") AND (on_display!=1);

-- View titles and artist if artwork is by either da Vinci or Vermeer using OR
SELECT title, artist
FROM artwork
WHERE (artist="Leonardo da Vinci") OR (artist="Johannes Vermeer");

-- Rewrite the previous query using IN
SELECT title, artist
FROM artwork
WHERE artist IN ("Leonardo da Vinci","Johannes Vermeer");

-- View only records where the title begins with "The"
SELECT * FROM artwork
WHERE title LIKE "The%";

-- View all records again, but order by style, ascending
SELECT * FROM artwork
ORDER BY category ASC;

-- Delete "The Church at Auvers" record (use ID number)
DELETE FROM artwork
WHERE id=6;

-- View all records, concatenating using an alias as follows: Title by Artist
SELECT CONCAT(title, " by ", artist) AS title_and_artist
FROM artwork;

-- View the first three records
SELECT * FROM artwork LIMIT 3;

-- View the next three records
SELECT * FROM artwork LIMIT 3 OFFSET 3;



