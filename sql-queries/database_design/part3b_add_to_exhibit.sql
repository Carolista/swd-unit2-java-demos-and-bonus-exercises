/* 
	Script to handle table updates when putting an artist's works on exhibit...
    This script should be run all at once.
*/

-- WRAP ENTIRE SCRIPT IN A TRANSACTION
START TRANSACTION;

-- Set context
USE gallery_dbd;

-- Create variables for the exhibit id and the artist's last name
SET @curr_exhibit = 2;
SET @curr_artist_ln = "O'Keeffe";

-- Look up an artist_id by last_name and store it in a variable
SET @curr_artist_id = (SELECT id FROM artists WHERE last_name = @curr_artist_ln);

-- Set the exhibit_id for all artworks with the current artist
-- Also set on_display to true
UPDATE artworks
SET exhibit_id = @curr_exhibit, on_display=1
WHERE artist_id = @curr_artist_id;

-- ROLLBACK;
COMMIT;
