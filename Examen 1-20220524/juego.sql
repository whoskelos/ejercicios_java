create database Juego;
use Juego;

CREATE TABLE Arma(
  codAr int primary key,
  nombre varchar(20) not null,
  dano int
);

CREATE TABLE Escudo(
  codEs int primary key,
  nombre varchar(20) not null,
  defensa int
);
  
CREATE TABLE personaje(
  id int primary key,
  nombre varchar(20) not null,
  vida int DEFAULT 10
);

insert into Arma values
(1,'arma1',5),
(2,'arma2',3), 
(3,'arma3',4),
(4,'arma4',8),
(5,'arma5',7),
(6,'arma6',2),
(7,'arma7',10),
(8,'arma8',6),
(9,'arma9',9),
(10,'arma10',1);

insert into Escudo values
(1,'escudo1',5),
(2,'escudo2',10), 
(3,'escudo3',4),
(4,'escudo4',1),
(5,'escudo5',7),
(6,'escudo6',2),
(7,'escudo7',9),
(8,'escudo8',6),
(9,'escudo9',3),
(10,'escudo10',8);

insert into Personaje (id,nombre) values
(1,'personaje1'),
(2,'personaje2'), 
(3,'personaje3'),
(4,'personaje4'),
(5,'personaje5'),
(6,'personaje6'), 
(7,'personaje7'),
(8,'personaje8'),
(9,'personaje9'),
(10,'personaje10');