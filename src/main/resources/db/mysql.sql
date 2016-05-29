CREATE DATABASE `blog` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE articles
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(45) NOT NULL COMMENT 'Заголовок статьи',
    text TEXT NOT NULL COMMENT 'Текст статьи',
    date TIMESTAMP DEFAULT 'CURRENT_TIMESTAMP' NOT NULL COMMENT 'Дата добавления статьи.'
);
CREATE UNIQUE INDEX title_UNIQUE ON articles (title);
CREATE TABLE contacts
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    login VARCHAR(45) NOT NULL,
    name VARCHAR(45) NOT NULL,
    value VARCHAR(60) NOT NULL,
    CONSTRAINT FK_Login_Contacts FOREIGN KEY (login) REFERENCES users (login)
);
CREATE INDEX FK_Login_Contacts ON contacts (login);
CREATE UNIQUE INDEX value_UNIQUE ON contacts (value);
CREATE TABLE groupuser
(
    name VARCHAR(20) PRIMARY KEY NOT NULL COMMENT 'Наименование группы',
    users_login VARCHAR(15) NOT NULL COMMENT 'Вторичный ключ от таблицы users',
    CONSTRAINT fk_groupuser_users FOREIGN KEY (users_login) REFERENCES users (login)
);
CREATE INDEX fk_groupuser_users ON groupuser (users_login);
CREATE TABLE groupuser_has_articles
(
    groupuser_name VARCHAR(20) NOT NULL,
    articles_id INT(11) NOT NULL,
    CONSTRAINT `PRIMARY` PRIMARY KEY (groupuser_name, articles_id),
    CONSTRAINT fk_groupuser_has_articles_articles1 FOREIGN KEY (articles_id) REFERENCES articles (id),
    CONSTRAINT fk_groupuser_has_articles_groupuser1 FOREIGN KEY (groupuser_name) REFERENCES groupuser (name)
);
CREATE INDEX fk_groupuser_has_articles_articles1 ON groupuser_has_articles (articles_id);
CREATE INDEX fk_groupuser_has_articles_groupuser1 ON groupuser_has_articles (groupuser_name);
CREATE TABLE messages
(
    id INT(11) PRIMARY KEY NOT NULL,
    text VARCHAR(255) NOT NULL COMMENT 'Текст сообщения',
    date TIMESTAMP DEFAULT 'CURRENT_TIMESTAMP' NOT NULL COMMENT 'Дата мессаги',
    users_login VARCHAR(15) NOT NULL COMMENT 'Юзер пославший мессагу',
    articles_id INT(11) NOT NULL COMMENT 'Статье к которой послан комент',
    CONSTRAINT fk_messages_articles1 FOREIGN KEY (articles_id) REFERENCES articles (id),
    CONSTRAINT fk_messages_users1 FOREIGN KEY (users_login) REFERENCES users (login)
);
CREATE INDEX fk_messages_articles1 ON messages (articles_id);
CREATE INDEX fk_messages_users1 ON messages (users_login);
CREATE TABLE users
(
    login VARCHAR(15) PRIMARY KEY NOT NULL COMMENT 'Логин',
    pass VARCHAR(45) NOT NULL COMMENT 'Пароль',
    email VARCHAR(45) NOT NULL
);