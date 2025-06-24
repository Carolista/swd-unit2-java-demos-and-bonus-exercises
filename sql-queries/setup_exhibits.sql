-- Create an exhibit record 
INSERT INTO exhibit(title)
VALUES("Renaissance and Baroque Masterpieces");

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

/* 
	Write a script in another file to handle table 
    updates when putting works on exhibit 
*/

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- Change the @artist to another artist and re-run script for those artworks

-- Create another exhibit record, then run the script above for the new exhibit with 2 more artists
INSERT INTO exhibit(title)
VALUES("Iconic Women of Modern Art");

-- Get total number of artworks assigned to a exhibit and return along with exhibit title
SELECT exhibit.title, COUNT(*) 
FROM artwork INNER JOIN exhibit ON artwork.exhibit_id = exhibit.id
WHERE exhibit_id = 2;

-- Run it again for the second exhibit id

-- Write a query to get the totals for all exhibits
SELECT exhibit.title, COUNT(*) 
FROM artwork INNER JOIN exhibit ON artwork.exhibit_id = exhibit.id
GROUP BY exhibit.id;

-- Write a query to return the exhibit title, artwork title, artist, year_created, and style of each artwork on display
-- Order first by exhibit title and then by last name
SELECT exhibit.title, artwork.title, artist.first_name, artist.last_name, artwork_details.year_created, style.title
FROM artwork
INNER JOIN exhibit ON artwork.exhibit_id = exhibit.id
INNER JOIN artist ON artwork.artist_id = artist.id
INNER JOIN artwork_details ON artwork.details_id = artwork_details.id
INNER JOIN style ON artwork.style_id = style.id
WHERE artwork.on_display = 1
ORDER BY exhibit.title, artist.last_name;