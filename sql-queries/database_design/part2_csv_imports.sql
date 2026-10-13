/* AFTER SUCCESSFUL SCRIPT RUN, IMPORT DATA IN THE SQL CLI */

-- In the terminal, make sure you are in the right directory before proceeding
-- Use the following command at your regular prompt, replacing your username and 
-- password for your database connection:
--      mysql -u your_username -p --local-infile=1
-- This will open the MySQL CLI and your prompt should change to mysql> 

-- IMPORTANT: Copy and paste each of these queries one at a time and run them
-- in the terminal in the MySQL CLI

-- Ensure access to your files with a relative path

-- Set context

-- Import records from categories.csv

-- Check that records have been imported successfully
-- You can also run this in MySQL Workbench

-- Import records from artists.csv

-- Check that records have been imported successfully
-- You can also run this in MySQL Workbench

-- Import records from artworks.csv; note how to handle the text 'null' for exhibit_id

-- Check that records have been imported successfully
-- You can also run this in MySQL Workbench

-- Import records from details.csv

-- Check that records have been imported successfully
-- You can also run this in MySQL Workbench

-- No exhibit records exist yet, so nothing to import for that table

-- All done? Enter the command 'exit' at the MySQL CLI prompt to go back to your
-- regular terminal prompt.
