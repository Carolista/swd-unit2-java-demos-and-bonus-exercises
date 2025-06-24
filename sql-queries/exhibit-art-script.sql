/* Write a script to handle table updates when putting an artist's works on exhibit */

-- Create variables for the exhibit id and the artist's last name
SET @curr_exhibit = 2;
SET @curr_artist_ln = "Kahlo";

-- Look up an artist_id by last_name and store it in a variable
SET @curr_artist_id = (SELECT id FROM artist WHERE last_name = @curr_artist_ln);

-- Set the exhibit_id for all artworks with the artist_id that is @artist
-- Also set on_display to true
UPDATE artwork
SET exhibit_id = @curr_exhibit, on_display = 1
WHERE artist_id = @curr_artist_id;


/*
	IDEAS
    use wildcard lookup
    still need to create exhibits in other file before running this one
    find other things introduced in SQL & DBD modules to include
    in these examples
*/