create database Libros;
use Libros;
create table autores ( 
identificacion bigint not null,
nombres varchar(50) not null,
apellidos varchar(50) not null,
titulo varchar(100) not null,
constraint pk_autores primary key (identificacion)
);
INSERT INTO autores VALUES
(1085, 'Gabriel', 'Garcia', '100 años de soledad'),
(1234, 'Julio', 'Mendoza', 'Biblia de los caidos'),
(9876, 'Bill', 'Gates', 'Camino al futuro');
select * from autores;
INSERT INTO autores VALUES
(9987,'Cesar','Castellanos','Universidad de la vida'),
(2245,'Julio','Cortazar','Rayuela');
