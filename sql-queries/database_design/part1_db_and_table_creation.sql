# Everything below is a true script meant to run from top to bottom
# However, a TRANSACTION does not make sense here because this is pure structural setup

-- Create database if it does not already exist

-- Set context

-- Drop all tables if they already exist

-- Create categories table

-- Create artists table

-- Create exhibits table

-- Create artworks table 
-- Designate foreign keys for artists, categories, and exhibits

-- Create artwork_details table last since it references artworks
-- Its id should be the same as artworks.id since it's a one-to-one relationship
-- Designate foreign key for artworks
