SET MODE PostgresSQL;

CREATE TABLE IF NOT EXISTS restaurants(
id int PRIMARY KEY auto_increment,
name VARCHAR,
address VARCHAR,
zipcode VARCHAR,
phone VARCHAR,
Wwebsite VARCHAR,
email VARCHAR,
);
CREATE TABLE IF NOT EXISTS foodtypes(
id int PRIMARY KEY auto_increment,
name VARCHAR
);
CREATE TABLE IF NOT EXISTS reviews(
id int PRIMARY KEY auto_increment,
writtenby VARCHAR,
rating VARCHAR,
restaurantid INTEGER
);
CREATE TABLE IF NOT EXISTS restaurants_foodtypes(
if int PRIMARY KEY auto_increment,
foodtypeid INTEGER,
restaurantid INTEGER);
CREATE TABLE IF NOT EXISTS reviews (
id int  PRIMARY KEY auto_increment,
writtenby VARCHAR,
rating VARCHAR,
restaurantid INTEGER,
createdat BIGINT
);