CREATE DATABASE my_local_mysql_db;
SHOW DATABASES;
USE my_local_mysql_db;

# There would be one table corresponding to each object you are willing to provide persistence.
# Consider Employee objects need to be stored and retrieved into the following RDBMS table

CREATE TABLE EMPLOYEE (
  id         INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(20)  DEFAULT NULL,
  last_name  VARCHAR(20)  DEFAULT NULL,
  salary     INT          DEFAULT NULL,
  PRIMARY KEY (id)
);