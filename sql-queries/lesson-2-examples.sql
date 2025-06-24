-- Create a new table, artist, with an id, first_name, last_name, full_name, and nationality
-- Add UQ and AI properties for id column
-- Use G property for full_name and use an expression to auto-generate it from first_name and last_name

-- Add records for van Gogh, da Vinci, Vermeer, Dalí and Monet (ids will auto-generate)
INSERT INTO artist (first_name, last_name, nationality)
VALUES ("Vincent", "van Gogh", "Dutch"),
("Leonardo", "da Vinci", "Italian"),
("Johannes", "Vermeer", "Dutch"),
("Salvador", "Dalí", "Spanish"),
("Claude", "Monet", "French");


-- Select an inner join on the artwork table using the artists' names 
SELECT artwork.artist FROM artwork
INNER JOIN artist ON artwork.artist = artist.full_name;

-- Run the previous query but eliminate duplicates 
SELECT DISTINCT artwork.artist FROM artwork
INNER JOIN artist ON artwork.artist = artist.full_name;

-- List all artwork titles and artists and add nationalities from artist table using a left inner join
SELECT DISTINCT artwork.title, artwork.artist, artist.nationality
FROM artwork
LEFT JOIN artist ON artwork.artist = artist.full_name;

-- List all artwork titles and styles and add full_name and nationality from artist table using a right inner join
SELECT DISTINCT artwork.title, artwork.category, artist.full_name, artist.nationality
FROM artwork
RIGHT JOIN artist ON artwork.artist = artist.full_name;

-- Do an inner join on artwork using artists' names and group by artist with a total
SELECT artist.full_name, COUNT(*)
FROM artist INNER JOIN artwork ON artwork.artist = artist.full_name
GROUP BY artist.full_name;

-- Use a subquery to look up which artists in the artist table have artworks on display
SELECT full_name FROM artist
WHERE full_name IN (SELECT artist FROM artwork WHERE on_display=1);
