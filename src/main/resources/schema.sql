create table `user`
(
    id integer primary key  autoincrement not null,
    username  varchar(20),
    password  varchar(20),
    email  varchar(20),
    phone  varchar(20),
    sex varchar(10),
    age integer,
    create_time timestamp default current_timestamp,
    update_time timestamp default current_timestamp,
    constraint uk_username unique (username)

)
;

create table `blog`
(
    id integer primary key  autoincrement not null,
    author varchar(20),
    title varchar(20),
    content varchar(200),
    create_time timestamp default current_timestamp,
    update_time timestamp default current_timestamp
)
;


INSERT INTO blog (id, author, title, content, create_time, update_time) VALUES (1, 'LiQ一', '标题一', '博客内容。。。。。。。。。。。。。。。。。。。。。。。。', '2023-11-17 07:13:58', '2023-11-17 07:13:58');
INSERT INTO blog (id, author, title, content, create_time, update_time) VALUES (2, 'LiQ2', '标题二', '博客内容。。。。。。。。。。。。。。。。。。。。。。。。', '2023-11-17 07:14:10', '2023-11-17 07:14:10');
INSERT INTO blog (id, author, title, content, create_time, update_time) VALUES (3, 'LiQ3', '标题三', '博客内容。。。。。。。。。。。。。。。。。。。。。。。。', '2023-11-17 07:14:44', '2023-11-17 07:14:44');
INSERT INTO blog (id, author, title, content, create_time, update_time) VALUES (4, 'LiQ4', '标题四', '博客内容。。。。。。。。。。。。。。。。。。。。。。。。', '2023-11-17 07:14:51', '2023-11-17 07:14:51');
INSERT INTO blog (id, author, title, content, create_time, update_time) VALUES (5, 'LiQ5', '标题五', '博客内容。。。。。。。。。。。。。。。。。。。。。。。。', '2023-11-17 07:14:58', '2023-11-17 07:14:58');

INSERT INTO user (id, username, password, email, phone, sex, age, create_time, update_time) VALUES (1, '赵一', '123456', 'zhao@test.com', '15594952639', '男', 1, '2023-11-17 07:20:14', '2023-11-17 07:20:14');
INSERT INTO user (id, username, password, email, phone, sex, age, create_time, update_time) VALUES (2, '刘二', '123456', 'liu@test.com', '15594952639', '男', 1, '2023-11-17 07:24:23', '2023-11-17 07:24:23');
INSERT INTO user (id, username, password, email, phone, sex, age, create_time, update_time) VALUES (3, '张三', '123456', 'zhang@test.com', '15594952639', '男', 1, '2023-11-17 07:24:27', '2023-11-17 07:24:27');
INSERT INTO user (id, username, password, email, phone, sex, age, create_time, update_time) VALUES (4, '李四', '123456', 'li@test.com', '15594952639', '男', 1, '2023-11-17 07:24:31', '2023-11-17 07:24:31');
INSERT INTO user (id, username, password, email, phone, sex, age, create_time, update_time) VALUES (5, '王五', '123456', 'wang@test.com', '15594952639', '男', 1, '2023-11-17 07:24:35', '2023-11-17 07:24:35');

