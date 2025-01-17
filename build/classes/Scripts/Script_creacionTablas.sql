/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  prueba
 * Created: 8/01/2025
 */

create database Crud_Java_Mvc
use Crud_Java_Mvc

create table Roles(
id int not null auto_increment,
nombre varchar(20) not null,
primary key (id)
);
create table Persona(
id int not null auto_increment,
Nombre varchar(100) not null,
Apellidos varchar(100) not null,
Correo varchar(150) not null,
Fecha_Nacimiento Date not null,
Pais varchar(50) not null,
Profesion varchar(150) not null,
rol_id int not null,
primary key (id),
foreign key (rol_id) references Roles (id)
);