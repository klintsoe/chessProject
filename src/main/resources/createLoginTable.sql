CREATE  TABLE users (
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(45) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));
   
CREATE TABLE user_roles (
  user_role_id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (role,username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));
 
INSERT INTO users(username,password,enabled)
VALUES ('soren','soren', true);
INSERT INTO users(username,password,enabled)
VALUES ('hest','hest', true);
 
INSERT INTO user_roles (username, role)
VALUES ('soren', 'ROLE_USER');
INSERT INTO user_roles (username, role)
VALUES ('soren', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role)
VALUES ('hest', 'ROLE_USER');