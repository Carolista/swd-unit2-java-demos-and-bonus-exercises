-- Create an exhibit record 
INSERT INTO gallery_dbd.exhibits(title)
VALUES("Renaissance and Baroque Masterpieces");

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

/* 
	Before moving on, complete the exhibit-art-script 
    to handle table updates when putting works on exhibit 
*/

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- Change the @artist to another artist and re-run script for those artworks

-- Create another exhibit record, then run the script mentioned above for the 
-- new exhibit with 2 more artists
INSERT INTO exhibit(title)
VALUES("Iconic Women of Modern Art");

-- Get total number of artworks assigned to a exhibit and return along with exhibit title
SELECT exhibits.title, COUNT(*)
FROM artworks INNER JOIN exhibits ON artworks.exhibit_id = exhibits.id
WHERE exhibit_id = 1;

-- Run it again for the second exhibit id

-- Write a query to get the totals for all exhibits
SELECT exhibits.title, COUNT(*)
FROM artworks INNER JOIN exhibits ON artworks.exhibit_id = exhibits.id
GROUP BY exhibits.id;

-- Write a query to return the exhibit title, artwork title, artist, year_created, and category of each artwork on display
-- Order first by exhibit title and then by last name
SELECT exhibits.title AS exhibit_title, artworks.title AS artwork_title, CONCAT(artists.first_name, " ", artists.last_name) AS artist, artwork_details.year_created, categories.title AS category
FROM artworks
INNER JOIN exhibits ON artworks.exhibit_id = exhibits.id
INNER JOIN artists ON artworks.artist_id = artists.id
INNER JOIN artwork_details ON artworks.id = artwork_details.artwork_id
INNER JOIN categories ON artworks.category_id = categories.id
WHERE artworks.on_display = 1
ORDER BY exhibits.title, artists.last_name;