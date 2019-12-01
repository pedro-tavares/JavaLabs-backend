create table users(
	id bigint(20) auto_increment,
	user_name varchar(200),
    primary key(id)
);

insert into users (user_name) values ("Admin");