/* AFTER SUCCESSFUL SCRIPT RUN, IMPORT DATA IN THE SQL CLI */

-- In the terminal, make sure you are in the right directory before proceeding
-- Use the following command at your regular prompt, replacing your username and 
-- password for your database connection:
--      mysql -u your_username -p --local-infile=1
-- This will open the MySQL CLI and your prompt should change to mysql> 

-- IMPORTANT: Copy and paste each of these queries one at a time and run them
-- in the terminal in the MySQL CLI

-- Ensure access to your files with a relative path
SET GLOBAL local_infile = 1;

-- Set context
USE gallery_dbd;

-- Import records from categories.csv
LOAD DATA LOCAL INFILE 'data/categories.csv'
INTO TABLE categories
FIELDS TERMINATED BY ',' 
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\n' -- \r\n for Windows
IGNORE 1 ROWS;

-- Check that records have been imported successfully
-- You can also run this in MySQL Workbench
SELECT * FROM gallery_dbd.categories;

-- Import records from artists.csv
LOAD DATA LOCAL INFILE 'data/artists.csv'
INTO TABLE artists
FIELDS TERMINATED BY ',' 
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\n' -- \r\n for Windows
IGNORE 1 ROWS;

-- Check that records have been imported successfully
-- You can also run this in MySQL Workbench
SELECT * FROM gallery_dbd.artists;

-- Import records from artworks.csv; note how to handle the text 'null' for exhibit_id
LOAD DATA LOCAL INFILE 'data/artworks.csv'
INTO TABLE artworks
FIELDS TERMINATED BY ',' 
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\n' -- \r\n for Windows
IGNORE 1 ROWS
(id, title, details_id, artist_id, category_id, @var_exhibit, on_display)
SET exhibit_id = NULLIF(@var_exhibit, 'null');

-- Check that records have been imported successfully
-- You can also run this in MySQL Workbench
SELECT * FROM gallery_dbd.artworks;

-- Import records from details.csv
LOAD DATA LOCAL INFILE 'data/details.csv'
INTO TABLE artwork_details
FIELDS TERMINATED BY ',' 
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\n' -- \r\n for Windows
IGNORE 1 ROWS;

-- Check that records have been imported successfully
-- You can also run this in MySQL Workbench
SELECT * FROM gallery_dbd.artwork_details; 

-- No exhibit records exist yet, so nothing to import for that table

-- All done? Enter the command 'exit' at the MySQL CLI prompt to go back to your
-- regular terminal prompt.
