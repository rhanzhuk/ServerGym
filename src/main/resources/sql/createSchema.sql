
drop schema if exists gymDb;
create schema gymDb;
use gymDb;

CREATE TABLE client(
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  first_name VARCHAR(30) NOT NULL ,
  last_name VARCHAR(40) NOT NULL ,
  age INT ,
  sex ENUM ('MEN','WOMEN') ,
  email VARCHAR(30) NOT NULL ,
  phone VARCHAR(13) NOT NULL ,
  login VARCHAR(50) NOT NULL ,
  password VARCHAR(50) NOT NULL ,
  photo VARCHAR(100) ,
  level ENUM ('JUNIOR','MIDDLE','SENIOR') NOT NULL ,
  role ENUM ('ATHLETE', 'COACH', 'ADMIN') NOT NULL,
  trainingPlan_id BIGINT REFERENCES training_plan(id)
)ENGINE=INNODB;

CREATE TABLE coach(
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY  ,
  first_name VARCHAR(30) NOT NULL ,
  last_name VARCHAR(40) NOT NULL ,
  age INT ,
  sex ENUM ('MEN','WOMEN') ,
  email VARCHAR(50) NOT NULL ,
  phone VARCHAR(13) NOT NULL ,
  login VARCHAR(50) NOT NULL ,
  password VARCHAR(50) NOT NULL ,
  photo VARCHAR(100) ,
  role ENUM ('ATHLETE', 'COACH', 'ADMIN') NOT NULL,
  sport_category ENUM ('GYM', 'FITNESS', 'RUN'),
  trainingPlan_id BIGINT REFERENCES training_plan(id)
)ENGINE=INNODB;



CREATE TABLE  sport_club(
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY UNIQUE ,
  name VARCHAR(40) NOT NULL ,
  location VARCHAR(100) NOT NULL ,
  description VARCHAR(1000)
)ENGINE=INNODB;



CREATE TABLE  exercise (
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY UNIQUE ,
  name VARCHAR(100) NOT NULL ,
  description VARCHAR(1000) NOT NULL ,
  icon VARCHAR(100) ,
  -- TODO просмотреть вариант
  weight INT NOT NULL ,
  count INT NOT NULL ,
  repeats INT NOT NULL,
  training_id BIGINT REFERENCES training(id)

)ENGINE=INNODB;



CREATE TABLE  training(
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY UNIQUE ,
  name VARCHAR(100) NOT NULL ,
  icon VARCHAR(100) NOT NULL ,
  comment_desc VARCHAR(1000) NOT NULL ,
  training_date DATE NOT NULL ,
  chek BOOLEAN NOT NULL,
  plan_id BIGINT REFERENCES training_plan(id)
)ENGINE=INNODB;

CREATE TABLE training_plan (
  id         BIGINT      NOT NULL AUTO_INCREMENT PRIMARY KEY UNIQUE,
  name       VARCHAR(50) NOT NULL,
  start_date DATE,
  length     INT
)ENGINE=INNODB;


-- Many to Many coach and client
CREATE TABLE  coach_client(
  coach_id BIGINT NOT NULL ,
  client_id BIGINT NOT NULL,
  PRIMARY KEY (`coach_id`, `client_id`),
  FOREIGN KEY (coach_id) REFERENCES coach (id) ,
  FOREIGN KEY (client_id) REFERENCES client (id)
)ENGINE=INNODB;

-- Many to Many coach and sportClub
CREATE TABLE coach_sportClub(
  coach_id BIGINT NOT NULL ,
  sportClub_id BIGINT NOT NULL ,
  FOREIGN KEY (coach_id) REFERENCES coach (id) ON DELETE RESTRICT ON UPDATE CASCADE,
  FOREIGN KEY (sportClub_id) REFERENCES sport_club (id) ON DELETE RESTRICT ON UPDATE CASCADE
)ENGINE=INNODB;




