CREATE DATABASE donjondragon_jdbc;
USE donjondragon_jdbc;

DROP TABLE IF EXISTS hero;
CREATE TABLE hero(
                     id INT PRIMARY KEY AUTO_INCREMENT,
                     type VARCHAR(50),
                     nom VARCHAR(50),
                     niveau_vie INT,
                     niveau_force INT,
                     arme_ou_sort VARCHAR(50),
                     bouclier VARCHAR(50)
);