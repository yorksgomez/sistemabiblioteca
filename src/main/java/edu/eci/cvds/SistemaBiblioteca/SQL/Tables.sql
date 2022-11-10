CREATE TABLE user (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_name varchar(50) NOT NULL ,
    mail varchar(50) NOT NULL ,
    password varchar(50) NOT NULL ,
    admin boolean NOT NULL
);

CREATE TABLE resource (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(50) NOT NULL ,
    location varchar(50) NOT NULL ,
    type varchar(50) NOT NULL ,
    capacity int NOT NULL,
    user_id int
);