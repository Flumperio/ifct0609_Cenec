DROP DATABASE IF EXISTS phoneland_shop;

CREATE DATABASE phoneland_shop
  DEFAULT CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

USE phoneland_shop;

-- ==========================
-- TABLA CLIENTES
-- ==========================
CREATE TABLE clientes (
  idclientes INT AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  apellidos VARCHAR(50) NOT NULL,
  direccion VARCHAR(100),
  ciudad VARCHAR(50),
  provincia VARCHAR(50),
  cp VARCHAR(10),
  tipo_de_cliente VARCHAR(20),
  ingresos DOUBLE,
  fecha DATE,
  PRIMARY KEY (idclientes)
) ENGINE=InnoDB;

INSERT INTO clientes VALUES
(1,'Alberto','Ruiz','Avenida Gandalf','Gondor','Tierra media','29003','empresa',9000.5,'2023-01-15'),
(2,'Laura','Perez','Calle Frodo','Bolso cerrado','La comarca','28003','particular',6000.75,'2023-02-20'),
(3,'Sauron','Gonzalez','Avenida maligna','Mordor city','Mordor','38003','particular',8000.75,'2023-02-20'),
(4,'Cristina','Perez','Avenida Andalucia','Málaga','Málaga','29003','empresa',2900.5,'2023-02-15');

-- ==========================
-- TABLA FABRICANTE
-- ==========================
CREATE TABLE fabricante (
  idfabricante INT AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  PRIMARY KEY (idfabricante),
  UNIQUE (nombre)
) ENGINE=InnoDB;

INSERT INTO fabricante VALUES
(1,'Apple'),
(2,'Honor'),
(3,'Samsung');

-- ==========================
-- TABLA PRODUCTOS
-- ==========================
CREATE TABLE productos (
  idproducto INT AUTO_INCREMENT,
  idfabricante INT,
  nombre_producto VARCHAR(50),
  precio DOUBLE,
  PRIMARY KEY (idproducto),
  FOREIGN KEY (idfabricante)
    REFERENCES fabricante(idfabricante)
    ON DELETE SET NULL
    ON UPDATE CASCADE
) ENGINE=InnoDB;

INSERT INTO productos VALUES
(1,1,'Movil iPhone',999.99),
(2,2,'Movil Honor',499.99),
(3,3,'Movil Samsung',799.99);

-- ==========================
-- TABLA VENTAS
-- ==========================
CREATE TABLE ventas (
  idventas INT AUTO_INCREMENT,
  idclientes INT,
  idproductos INT,
  fecha_ventas DATE,
  PRIMARY KEY (idventas),
  FOREIGN KEY (idclientes)
    REFERENCES clientes(idclientes)
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  FOREIGN KEY (idproductos)
    REFERENCES productos(idproducto)
    ON DELETE SET NULL
    ON UPDATE CASCADE
) ENGINE=InnoDB;

INSERT INTO ventas VALUES
(1,1,1,'2023-01-10'),
(2,2,2,'2023-02-15'),
(3,3,3,'2023-03-20'),
(4,1,2,'2023-04-05'),
(5,2,1,'2023-05-10'),
(6,3,3,'2023-06-15');


