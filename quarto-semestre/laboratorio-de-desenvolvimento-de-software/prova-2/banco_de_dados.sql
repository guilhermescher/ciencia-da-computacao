create database provadois;

use provadois;

create table produto(
  id int auto_increment primary key,
  nome varchar(60) not null,
  preco float not null,
  saldo float not null
);