CREATE TABLE articles
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(45) NOT NULL,
    text TEXT NOT NULL,
    date DATE
);
CREATE TABLE group_authorities
(
    group_id BIGINT(20) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_group_authorities_group FOREIGN KEY (group_id) REFERENCES groups (id)
);
CREATE INDEX fk_group_authorities_group ON group_authorities (group_id);
CREATE TABLE group_members
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    group_id BIGINT(20) NOT NULL,
    CONSTRAINT fk_group_members_group FOREIGN KEY (group_id) REFERENCES groups (id)
);
CREATE INDEX fk_group_members_group ON group_members (group_id);
CREATE TABLE groups
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    group_name VARCHAR(50) NOT NULL
);
CREATE TABLE persistent_logins
(
    username VARCHAR(64) NOT NULL,
    series VARCHAR(64) PRIMARY KEY NOT NULL,
    token VARCHAR(64) NOT NULL,
    last_used TIMESTAMP DEFAULT 'CURRENT_TIMESTAMP' NOT NULL
);
CREATE TABLE users
(
    username VARCHAR(50) PRIMARY KEY NOT NULL,
    password VARCHAR(50) NOT NULL,
    enabled TINYINT(1) NOT NULL
);