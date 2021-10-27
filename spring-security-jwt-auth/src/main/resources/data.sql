drop table IF EXISTS users_perfis;
drop table IF EXISTS users;
drop table IF EXISTS perfil;

create table users(
    username varchar(50) not null primary key,
    password varchar(500) not null,
    enabled boolean not null
);

insert into users values('kenyo', '$2a$10$FnSsqc9hnfZ.HLR0HDZ0gOGbNnd1yit.sZitZVibdCgle1E6cwL4a', '1');
insert into users values('vitor', '$2a$10$rSq5gJbuvmosmSQpqkyIBeHrP05Av/qqUtsY0MQT1n750nDEX8AHe', '1');

create table perfil(
	id serial not null primary key,
	nome varchar(20) not null
);

insert into perfil(nome) values ('ADMIN');
insert into perfil(nome) values ('CUSTOMER');
insert into perfil(nome) values ('SELLER');

create table users_perfis(
	usuario_username  varchar(50) not null,
	perfis_id integer not null,
	constraint pk_usuario_perfil primary key (usuario_username , perfis_id)
);

insert into users_perfis values ('kenyo',1);
insert into users_perfis values ('vitor',3);
