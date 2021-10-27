drop table IF EXISTS authorities;
drop table IF EXISTS users;

create table users(
    username varchar(50) not null primary key,
    password varchar(500) not null,
    enabled boolean not null
);

insert into users values('kenyo', '$2a$10$FnSsqc9hnfZ.HLR0HDZ0gOGbNnd1yit.sZitZVibdCgle1E6cwL4a', '1');
insert into users values('vitor', '$2a$10$rSq5gJbuvmosmSQpqkyIBeHrP05Av/qqUtsY0MQT1n750nDEX8AHe', '1');

create table authorities (
    username varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);

insert into authorities values('kenyo','ADMIN');
insert into authorities values('vitor','ADMIN');

