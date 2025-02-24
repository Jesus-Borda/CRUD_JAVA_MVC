CREATE TABLE productos (
	codigo INT auto_increment not null,
    nombre varchar(20) unique not null,
    precio DOUBLE  Not null,
    inventario INT Not null,
    primary key (codigo)
);

INSERT INTO productos (nombre, precio, inventario) VALUES ("Manzanas",8000.0 , 65),
("Limones",2300.0 , 15),("Granadilla",2500.0 , 38),("Arandanos",9300.0 , 55),
("Tomates",2100.0 , 42),("Fresas",4100.0 , 3),("Helado",4500.0 , 41),
("Chocolates",3500.0 , 806),("Galletas",500.0 , 8),("Jamon",15000.0 , 10);