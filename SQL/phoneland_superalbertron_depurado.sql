-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.31 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para phoneland
DROP DATABASE IF EXISTS `phoneland`;
CREATE DATABASE `phoneland` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `phoneland`;

-- Volcando estructura para función phoneland.calavgprice1
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `calavgprice1`;
DELIMITER //
CREATE FUNCTION `calavgprice1`(precio DECIMAL(10,2)) RETURNS decimal(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE precio_medio DECIMAL(10,2);

    SELECT AVG(precio) INTO precio_medio FROM productos
    GROUP BY fabricante;

    RETURN precio_medio;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.CalcEdad
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `CalcEdad`;
DELIMITER //
CREATE PROCEDURE `CalcEdad`(IN an_nac INT, OUT edad INT)
begin
	DECLARE an_actual INT DEFAULT 2023;
	SET edad=an_actual-an_nac;
end//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.CalculaMayoriaEdad
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `CalculaMayoriaEdad`;
DELIMITER //
CREATE PROCEDURE `CalculaMayoriaEdad`(IN fecha_nacimiento INT, 
OUT edad INT, OUT tipo VARCHAR(20))
BEGIN
    DECLARE actual INT DEFAULT 2023;
    SET edad = actual - fecha_nacimiento;
   IF edad >= 18 THEN
        SELECT CONCAT(edad, " ",'Mayor de edad');
    ELSE
        SELECT 'Menor de edad';
    END IF;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.CalculaMayoriaEdad2
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `CalculaMayoriaEdad2`;
DELIMITER //
CREATE PROCEDURE `CalculaMayoriaEdad2`(IN fecha_nacimiento INT)
BEGIN
    DECLARE actual INT DEFAULT 2023;
    SET @edad := actual - fecha_nacimiento;
   IF @edad >= 18 THEN
        SELECT CONCAT(@edad, " ",'Mayor de edad');
    ELSE
        SELECT 'Menor de edad';
    END IF;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.calcularEdad
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `calcularEdad`;
DELIMITER //
CREATE PROCEDURE `calcularEdad`(IN nacimiento int, 
OUT edad int)
BEGIN
    	DECLARE ACTUAL INT DEFAULT 2021;
      
        SET EDAD=ACTUAL-NACIMIENTO;
        
 END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.CalcularIvaYTotal
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `CalcularIvaYTotal`;
DELIMITER //
CREATE PROCEDURE `CalcularIvaYTotal`()
BEGIN     SELECT nombre, precio, precio * 0.21 AS iva, precio * 1.21 AS total FROM productos; END//
DELIMITER ;

-- Volcando estructura para función phoneland.calcularPrecioIncrementado
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `calcularPrecioIncrementado`;
DELIMITER //
CREATE FUNCTION `calcularPrecioIncrementado`(precio DECIMAL(10,2), tipo VARCHAR(3)) RETURNS decimal(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE incre DECIMAL(10,2);

    IF tipo = '90' THEN
        SET incre = 300;
    ELSEIF tipo = '120' THEN
        SET incre = 600;
    ELSE
        SET incre = 0;
    END IF;

    RETURN precio + incre;
END//
DELIMITER ;

-- Volcando estructura para función phoneland.calcularPrecioMedioPorFabricante
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `calcularPrecioMedioPorFabricante`;
DELIMITER //
CREATE FUNCTION `calcularPrecioMedioPorFabricante`() RETURNS decimal(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE precio_medio DECIMAL(10,2);

    SELECT AVG(precio) INTO precio_medio FROM productos
    GROUP BY nombrefabricante;

    RETURN precio_medio;
END//
DELIMITER ;

-- Volcando estructura para función phoneland.calcular_iva
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `calcular_iva`;
DELIMITER //
CREATE FUNCTION `calcular_iva`(`precio` DECIMAL(10,2), `fabricante` VARCHAR(50)) RETURNS decimal(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE iva DECIMAL(10,2);
    
    DECLARE fabricante_not_found CONDITION FOR SQLSTATE '45000';
    
    IF fabricante <> 'XIAOMI' THEN
        SET iva = precio * 0.21;
    ELSE
        SET iva = 0;
    END IF;
    
    IF iva IS NULL THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'No se pudo calcular el IVA.';
    END IF;
    
    RETURN iva;
END//
DELIMITER ;

-- Volcando estructura para función phoneland.calcular_iva1
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `calcular_iva1`;
DELIMITER //
CREATE FUNCTION `calcular_iva1`(`precio` DECIMAL(10,2), `fabricante` VARCHAR(50)) RETURNS decimal(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE iva DECIMAL(10,2);
    
    DECLARE fabricante_not_found CONDITION FOR SQLSTATE '45000';
    
    IF fabricante <> 'XIAOMI' THEN
        SET iva = precio * 0.21;
    ELSE
        SET iva = 0;
    END IF;
    
    IF iva IS NULL THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'No se pudo calcular el IVA.';
    END IF;
    
    RETURN iva;
END//
DELIMITER ;

-- Volcando estructura para función phoneland.calcular_iva5
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `calcular_iva5`;
DELIMITER //
CREATE FUNCTION `calcular_iva5`(precio DECIMAL(10,2), fabricante VARCHAR(40)) RETURNS decimal(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE iva DECIMAL(10,2);

    IF fabricante <> 'XIAOMI' THEN
        SET iva = precio * 0.21;
    ELSE
        SET iva = 0;
    END IF;

    RETURN iva;
END//
DELIMITER ;

-- Volcando estructura para función phoneland.calcular_iva69
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `calcular_iva69`;
DELIMITER //
CREATE FUNCTION `calcular_iva69`(`precio` DECIMAL(10,2), `fabricante` VARCHAR(50)) RETURNS decimal(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE iva DECIMAL(10,2);
    
    DECLARE fabricante_not_found CONDITION FOR SQLSTATE '45000';
    
    IF fabricante <> 'XIAOMI' THEN
        SET iva = precio * 0.21;
    ELSE
        SET iva = 0;
    END IF;
    
    IF iva IS NULL THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'No se pudo calcular el IVA.';
    END IF;
    
    RETURN iva;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.calcular_precio_con_iva
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `calcular_precio_con_iva`;
DELIMITER //
CREATE PROCEDURE `calcular_precio_con_iva`(IN `precio` DECIMAL(10,2))
BEGIN
	 DECLARE precio_total decimal (10,2);
    SET precio_total = precio+precio_con_iva(precio);
	select precio "el importe es ",precio," el iva es ", precio_con_iva(precio), " ", precio_total;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.calculator_while
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `calculator_while`;
DELIMITER //
CREATE PROCEDURE `calculator_while`(IN `numero` INT)
BEGIN
DECLARE contador,operacion INT;

WHILE contador <= 10 DO
SET operacion = numero * contador;
SET contador = contador + 1;
SELECT CONCAT(numero, " x " ,contador, " = ",operacion);
END WHILE;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.calcula_edad
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `calcula_edad`;
DELIMITER //
CREATE PROCEDURE `calcula_edad`(IN `nacimiento` INT)
BEGIN
    	DECLARE ACTUAL INT DEFAULT 2021;
        DECLARE EDAD INT;
        SET EDAD=ACTUAL-NACIMIENTO;
        SELECT EDAD;
     END//
DELIMITER ;

-- Volcando estructura para tabla phoneland.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `Id_CLIENTES` int NOT NULL,
  `fecha_de_alta` varchar(255) DEFAULT NULL,
  `cif_nif` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `CP` int DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `provincia` varchar(255) DEFAULT NULL,
  `empresa` varchar(255) DEFAULT NULL,
  `como_nos_conocio` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id_CLIENTES`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla phoneland.clientes: ~16 rows (aproximadamente)
INSERT INTO `clientes` (`Id_CLIENTES`, `fecha_de_alta`, `cif_nif`, `nombre`, `direccion`, `CP`, `ciudad`, `provincia`, `empresa`, `como_nos_conocio`) VALUES
	(1, '15-nov-20', '11111111A', 'ANA PEREZ', 'CALLE SOL,12', 29002, 'GRANADA', 'MALAGA', 'NO', 'GOOGLE'),
	(2, '16-nov-20', '33241111J', 'EVA RUIZ', 'CALLE LUNA,13', 29003, 'SEVILLA', 'MALAGA', 'NO', 'GOOGLE'),
	(3, '19-nov-20', '11111116A', 'ALBERTO GONZALEZ', 'AV.ANDALUCIA,14', 29005, 'MALAGA', 'MALAGA', 'NO', 'GOOGLE'),
	(4, '21-nov-20', '33111111A', 'MARIO VARGAS', 'AV. ANDALUCIA, 15', 29005, 'MALAGA', 'MALAGA', 'NO', 'GOOGLE'),
	(5, '22-nov-20', '11341111A', 'ALFREDO SANEZ', 'CALLE CUARTELES 1', 29002, 'MALAGA', 'MALAGA', 'NO', 'GOOGLE'),
	(6, '23-nov-20', '34113411C', 'BARTOLOME SANCHEZ', 'CALLE SALISTRE ,12', 29002, 'MALAGA', 'MALAGA', 'NO', 'GOOGLE'),
	(7, '24-nov-20', '11111111A', 'CARMEN RUIZ perez', 'HUELIN, 23', 29002, 'MALAGA', 'MALAGA', 'NO', 'REDES SOCIALES'),
	(8, '26-nov-20', '33111111J', 'MARIA RUIZ', 'CALLE SALISTRE,14', 29002, 'MALAGA', 'MALAGA', 'NO', 'REDES SOCILAES'),
	(9, '28-nov-20', '11111111A', 'MARIO SANCHEZ', 'CALLE SALISTRE,22', 29002, 'MALAGA', 'MALAGA', 'NO', 'REDES SOCIALES'),
	(10, '03-dic-20', 'B33111111', 'CORSAN', 'CALLE CUARTELES', 29002, 'MALAGA', 'MALAGA', 'SI', 'REDES SOCIALES'),
	(11, '05-dic-20', 'A11111111', 'FERROVIAL', 'HUELIN ,34', 29002, 'SEVILLA', 'MALAGA', 'SI', 'REDES SOCIALES'),
	(12, '06-dic-20', 'C33111111', 'CORTES INGLES', 'AVD , AMERICAS 12', 29005, 'MALAGA', 'MALAGA', 'SI', 'REDES SOCIALES'),
	(13, '10-feb-20', 'C11111111', 'ENDESA', 'AVD, AMERICAS 14', 29005, 'MALAGA', 'MALAGA', 'SI', 'REDES SOCIALES'),
	(14, '11-feb-20', 'C11111111', 'MICROSOFT IBERICA', 'AVD,AMERICAS 15', 29005, 'MALAGA', 'MALAGA', 'SI', 'REDES SOCIALES'),
	(102, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(121, NULL, NULL, 'Gandalf', NULL, NULL, NULL, NULL, NULL, NULL);

-- Volcando estructura para procedimiento phoneland.complemento
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `complemento`;
DELIMITER //
CREATE PROCEDURE `complemento`(IN `tipo_puesto` VARCHAR(20), OUT `complemento_salarial` DECIMAL(10,2))
BEGIN
    IF tipo_puesto = 'administrativo' THEN
        SET complemento_salarial = 100;
    ELSEIF tipo_puesto = 'programador' THEN
        SET complemento_salarial = 300;
    ELSEIF tipo_puesto = 'director' THEN
        SET complemento_salarial = 500;
    ELSE
        SET complemento_salarial = 0;
    END IF;

END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.cursor1
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `cursor1`;
DELIMITER //
CREATE PROCEDURE `cursor1`()
BEGIN
     DECLARE v_id int;
     DECLARE v_nombre varchar(17);
     DECLARE c_clientes CURSOR FOR
     SELECT Id_CLIENTES, NOMBRE FROM clientes WHERE Id_CLIENTES > 5; 
     OPEN c_clientes;
     FETCH c_clientes INTO v_id, v_nombre;
     SELECT v_id, v_nombre;
     CLOSE c_clientes;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.cursor2
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `cursor2`;
DELIMITER //
CREATE PROCEDURE `cursor2`()
BEGIN
     DECLARE v_id int;
     DECLARE v_nombre varchar(17);
     DECLARE last_row int default 0;
     DECLARE c_clientes CURSOR FOR
     SELECT Id_CLIENTES, NOMBRE FROM clientes WHERE Id_CLIENTES >= 3;
     DECLARE CONTINUE HANDLER FOR NOT FOUND SET last_row = 1;
     OPEN c_clientes;
     clientes_cur: LOOP
         FETCH c_clientes INTO v_id, v_nombre;
         IF last_row=1 THEN
             LEAVE clientes_cur;
         END IF;
         SELECT v_id, v_nombre;
     END LOOP clientes_cur;
CLOSE c_clientes;
END//
DELIMITER ;

-- Volcando estructura para función phoneland.diff_fechas
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `diff_fechas`;
DELIMITER //
CREATE FUNCTION `diff_fechas`(`fecha1` DATE, `fecha2` DATE) RETURNS int
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE diff INT;
    
    SET diff = DATEDIFF(fecha1, fecha2);
    SET diff = TRUNCATE(diff/365, 0); -- Dividir entre 365 y truncar
    
    RETURN diff;

END//
DELIMITER ;

-- Volcando estructura para función phoneland.divide
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `divide`;
DELIMITER //
CREATE FUNCTION `divide`(`dividendo` INT, `divisor` INT) RETURNS int
DETERMINISTIC
READS SQL DATA
begin
    declare aux int;
    declare contador int;
    declare resto int;
    set contador = 0;
    set aux = 0;
    while (aux + divisor) <= dividendo do
        set aux = aux + divisor ;
        set contador = contador + 1;
    end while;
    set resto = dividendo - aux ;
return contador;
end//
DELIMITER ;

-- Volcando estructura para función phoneland.duplicar
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `duplicar`;
DELIMITER //
CREATE FUNCTION `duplicar`(`valor` INT) RETURNS int
DETERMINISTIC
READS SQL DATA
BEGIN
    RETURN valor * 2;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.ejemplo1
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `ejemplo1`;
DELIMITER //
CREATE PROCEDURE `ejemplo1`()
BEGIN
SELECT 'Mi primer programa en MySQL';
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.ejemplo2
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `ejemplo2`;
DELIMITER //
CREATE PROCEDURE `ejemplo2`()
BEGIN
  DECLARE precio double;
  DECLARE iva double DEFAULT 0.21;
  DECLARE total double;
  set precio=100;
  SET total = precio+(precio * iva);
  SELECT CONCAT('El IVA es ', iva, ', el precio es ', precio, ' y el total es ', total);
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.ejemplo_bucle_loop
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `ejemplo_bucle_loop`;
DELIMITER //
CREATE PROCEDURE `ejemplo_bucle_loop`( IN tope INT , OUT suma INT )
BEGIN
	DECLARE contador INT ;
	SET contador = 1 ;
	SET suma = 0 ;
	bucle: LOOP
		IF contador > tope THEN
			LEAVE bucle;
		END IF ;
		SET suma = suma + contador;
		SET contador = contador + 1 ;
	END LOOP ;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.ejemplo_bucle_repeat
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `ejemplo_bucle_repeat`;
DELIMITER //
CREATE PROCEDURE `ejemplo_bucle_repeat`( IN tope INT , OUT suma INT )
BEGIN
	DECLARE contador INT ;
	SET contador = 1 ;
	SET suma = 0 ;
	REPEAT
		SET suma = suma + contador;
		SET contador = contador + 1 ;
	UNTIL contador > tope
	END REPEAT;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.ejemplo_bucle_while
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `ejemplo_bucle_while`;
DELIMITER //
CREATE PROCEDURE `ejemplo_bucle_while`( IN tope INT , OUT suma INT )
BEGIN
	DECLARE contador INT ;
	SET contador = 1 ;
	SET suma = 0 ;
	WHILE contador <= tope DO
		SET suma = suma + contador;
		SET contador = contador + 1 ;
	END WHILE ;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.error1
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `error1`;
DELIMITER //
CREATE PROCEDURE `error1`(`p_id` INT)
    MODIFIES SQL DATA
BEGIN
    DECLARE CONTINUE HANDLER FOR 1062
    SELECT CONCAT('El código introducido ', p_id, ' está duplicado') AS error_grave;
    INSERT INTO clientes (id_clientes) VALUES (p_id);
END//
DELIMITER ;

-- Volcando estructura para función phoneland.funcion1
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `funcion1`;
DELIMITER //
CREATE FUNCTION `funcion1`(`precio` INT) RETURNS int
DETERMINISTIC
READS SQL DATA
BEGIN
	RETURN PRECIO*0.21;
END//
DELIMITER ;

-- Volcando estructura para función phoneland.funcion2
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `funcion2`;
DELIMITER //
CREATE FUNCTION `funcion2`(`precio` INT) RETURNS int
DETERMINISTIC
READS SQL DATA
BEGIN
	RETURN funcion1(PRECIO)+PRECIO;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.generar_tabla_multiplicar_loop
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `generar_tabla_multiplicar_loop`;
DELIMITER //
CREATE PROCEDURE `generar_tabla_multiplicar_loop`(IN numero INT)
BEGIN
    DECLARE multiplicador INT;
    SET multiplicador = 1;
    tabla: LOOP
        IF multiplicador > 10 THEN
            LEAVE tabla;
        END IF;
        SELECT CONCAT(numero, " x ", multiplicador, " = ", numero * multiplicador);
        SET multiplicador = multiplicador + 1;
    END LOOP;
END//
DELIMITER ;

-- Volcando estructura para tabla phoneland.historial
CREATE TABLE IF NOT EXISTS `historial` (
  `idhistorial` int NOT NULL AUTO_INCREMENT,
  `fecha_hora_actual` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `mensaje` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idhistorial`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla phoneland.historial: 0 rows
/*!40000 ALTER TABLE `historial` DISABLE KEYS */;
/*!40000 ALTER TABLE `historial` ENABLE KEYS */;

-- Volcando estructura para función phoneland.INCREMENTO
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `INCREMENTO`;
DELIMITER //
CREATE FUNCTION `INCREMENTO`(`tipo` VARCHAR(3), `precio` DECIMAL(10,2)) RETURNS decimal(20,2)
DETERMINISTIC
READS SQL DATA
BEGIN
	DECLARE incre int;
	if tipo="90" THEN
    	set incre=300;
    elseif tipo="120" THEN
    	set incre=600;
    ELSE
        SET incre = 0;
    END IF;
    
   RETURN precio + incre;

END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.iva21
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `iva21`;
DELIMITER //
CREATE PROCEDURE `iva21`()
BEGIN
	DECLARE iva, total DECIMAL(2, 2);
	SET iva:=0.21;
    SELECT  
    @total:=(precio*iva) as total, unidades, unidades*@total as totalin
    FROM productos inner join ventas on  productos.id_PRODUCTO=ventas.id_PRODUCTOS;
   
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.iva21_descuento
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `iva21_descuento`;
DELIMITER //
CREATE PROCEDURE `iva21_descuento`()
BEGIN
    DECLARE iva DECIMAL(4, 2);
    DECLARE total_sin_iva, total_con_iva, total_con_descuento DECIMAL(10, 2);

    SET iva := 0.21;

    SELECT productos.NOMBRE, productos.precio, ventas.unidades,
        productos.precio * ventas.unidades AS 'Total sin IVA',
        (productos.precio * ventas.unidades) * (1 + iva) AS 'Total con IVA',
        ((productos.precio * ventas.unidades) * (1 + iva)) * 0.9 AS 'Total con descuento'
    FROM productos INNER JOIN ventas ON productos.id_PRODUCTO = ventas.id_PRODUCTOS;
END//
DELIMITER ;

-- Volcando estructura para función phoneland.max_precio_fabricante
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `max_precio_fabricante`;
DELIMITER //
CREATE FUNCTION `max_precio_fabricante`(nombre_fabricante VARCHAR(50)) RETURNS decimal(10,2)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE max_precio DECIMAL(10,2);
    SELECT MAX(precio) INTO max_precio FROM productos pr
    INNER JOIN proveedores p ON p.id_proveedor=pr.id_PRODUCTO 
    WHERE p.nombre_proveedor = nombre_fabricante; -- aquí se agrega el cierre del paréntesis y la cláusula WHERE
    RETURN max_precio;
END//
DELIMITER ;

-- Volcando estructura para función phoneland.precio_con_iva
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `precio_con_iva`;
DELIMITER //
CREATE FUNCTION `precio_con_iva`(`tipo` VARCHAR(3), `precio` DECIMAL(10,2)) RETURNS decimal(20,2)
DETERMINISTIC
READS SQL DATA
BEGIN
	DECLARE incre int;
	if tipo="90" THEN
    	set incre=300;
    elseif tipo="120" THEN
    	set incre=600;
    ELSE
        SET incre = 0;
    END IF;
    
   RETURN precio + incre;

END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.procesar
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `procesar`;
DELIMITER //
CREATE PROCEDURE `procesar`(IN `valor` INT, OUT `resultado` INT)
BEGIN
    SET resultado = duplicar(valor);
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.procesar_clientes
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `procesar_clientes`;
DELIMITER //
CREATE PROCEDURE `procesar_clientes`()
BEGIN
  DECLARE done INT DEFAULT FALSE;
  DECLARE id_cliente INT;
  DECLARE nombre_cliente VARCHAR(50);
  DECLARE cur_clientes CURSOR FOR SELECT id_clientes, clientes.NOMBRE FROM clientes;
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
  OPEN cur_clientes;
  LOOP_CLIENTES: LOOP
    FETCH cur_clientes INTO id_cliente, nombre_cliente;
    IF done THEN
      LEAVE LOOP_CLIENTES;
    END IF;
    
    -- Aquí va el código para procesar el registro del cliente
    SELECT CONCAT('Cliente: ', id_cliente, ' - ', nombre_cliente);
     DEALLOCATE PREPARE cur_clientes;
  END LOOP;
  CLOSE cur_clientes;
END//
DELIMITER ;

-- Volcando estructura para tabla phoneland.productos
CREATE TABLE IF NOT EXISTS `productos` (
  `id_PRODUCTO` int NOT NULL,
  `id_proveedor` int NOT NULL,
  `NOMBRE` varchar(58) DEFAULT NULL,
  `FABRICANTE` varchar(7) DEFAULT NULL,
  `PRECIO` varchar(8) DEFAULT NULL,
  `PVP` decimal(10,2) DEFAULT NULL,
  `Descripcion` varchar(50) DEFAULT NULL,
  `fecha_entrada` date DEFAULT NULL,
  PRIMARY KEY (`id_PRODUCTO`),
  KEY `id_proveedor` (`id_proveedor`),
  CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores` (`id_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla phoneland.productos: ~20 rows (aproximadamente)
INSERT INTO `productos` (`id_PRODUCTO`, `id_proveedor`, `NOMBRE`, `FABRICANTE`, `PRECIO`, `PVP`, `Descripcion`, `fecha_entrada`) VALUES
	(1, 3, 'XIAOMI IMI10LITE5G 6GB+128GBAzulBoreal', 'XIOAMI', '220,00 €', NULL, 'Alta gama usando en entornos de empresa', '2023-10-18'),
	(2, 5, 'SAMSUN GALAXYS20-FE-5G 8GB+256 AZUL MARINO MOVIL LIBRE', 'SAMSUNG', '650,00 €', NULL, NULL, '2023-10-18'),
	(3, 1, 'APPLE Iphone 11 128GB BLANCO MOVIL LIBRE', 'APPLE', '650,00 €', NULL, NULL, '2023-10-18'),
	(4, 3, 'XIAOMI MI 10T Pro 8 GB+256 GB Lunar Silver movil libre', 'XIOAMI', '580,00 €', NULL, 'gama baja entorno hogar', '2023-10-18'),
	(5, 5, 'SAMSUN GALAYI S20 FE 5G 8GB + 256 violeta movil libre', 'SAMSUNG', '600,00 €', NULL, NULL, '2023-10-18'),
	(6, 3, 'XIAOMI REDMI NOTE 9,4GB + 128 GB Polar white', 'XIOAMI', '100,00 €', NULL, NULL, '2023-10-18'),
	(7, 3, 'XIOAMI Mi 10 Lite 5G 6GB +128 Gris CoSmico', 'XIOAMI', '189,00 €', NULL, NULL, '2023-10-18'),
	(8, 5, 'SAMNUNG GALAXI A31 AZUL 4 GB + 64 GB Movil Libre', 'SAMSUNG', '100,00 €', NULL, NULL, '2023-10-18'),
	(9, 1, 'APPLE IPHONE 11 128GB Malva movil libre', 'APPLE', '650,00 €', NULL, 'alta gama entorno empresa', '2023-10-18'),
	(10, 5, 'SAMSUN GALAXY A51 4+128GB AZUL MOVIL LIBRE', 'SAMSUNG', '190,00 €', NULL, NULL, '2023-10-18'),
	(11, 8, 'LG K30 NEGRO 2GB + 16 GB MOVIL LIBRE', 'LG', '70,00 €', NULL, NULL, '2023-10-18'),
	(12, 3, 'iaomi Redmi Note 8 Pro Mineral Grey 128 GB + 6 GB Móvil li', 'XIOAMI', '180,00 €', NULL, NULL, '2023-10-18'),
	(13, 5, 'Samsung Galaxy S10 Lite 8 GB + 128 GB Azul móvil libre', 'SAMSUNG', '300,00 €', NULL, 'alta gama entorno hogar', '2023-10-18'),
	(14, 1, 'Samsung Galaxy S10 Lite 8 GB + 128 GB Azul móvil libre', 'APPLE', '600,00 €', NULL, NULL, '2023-10-18'),
	(15, 5, 'amsung Galaxy A21s 4 + 64 GB blanco móvil libre', 'SAMSUNG', '100,00 €', NULL, NULL, '2023-10-18'),
	(16, 5, 'Bronze móvil libre', 'SAMSUNG', '850,00 €', NULL, 'baja gama entorno empresa', '2023-10-18'),
	(17, 3, 'Xiaomi MI 10T Pro 8 GB + 256 GB Cosmic Black móvil libre', 'XIOAMI', '580,00 €', NULL, NULL, '2023-10-18'),
	(18, 4, 'Huawei P40 Lite 6+128 GB Verde móvil libre', 'HUAWEI', '190,00 €', NULL, NULL, '2023-10-18'),
	(19, 8, 'LG K51S 3+64 GB titán móvil libr', 'LG', '100,00 €', NULL, NULL, '2023-10-18'),
	(20, 7, 'LENOVO ONM', 'LENOVO', '200', NULL, NULL, '2023-10-18');

-- Volcando estructura para tabla phoneland.proveedores
CREATE TABLE IF NOT EXISTS `proveedores` (
  `id_proveedor` int NOT NULL AUTO_INCREMENT,
  `nombre_proveedor` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `tlf_proveedor` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla phoneland.proveedores: ~8 rows (aproximadamente)
INSERT INTO `proveedores` (`id_proveedor`, `nombre_proveedor`, `tlf_proveedor`) VALUES
	(1, 'Apple', '123456789'),
	(2, 'Microsoft', '123456789'),
	(3, 'XIOAMI', '1212323'),
	(4, 'HONOR', '2323'),
	(5, 'SAMSUNG', '2323'),
	(6, 'SONY', '23'),
	(7, 'LENOVO', '232323'),
	(8, 'LG', '');

-- Volcando estructura para procedimiento phoneland.tabla_multiplica
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `tabla_multiplica`;
DELIMITER //
CREATE PROCEDURE `tabla_multiplica`(IN `VALOR` INT)
BEGIN
  DECLARE contador int DEFAULT 0;
  DECLARE operacion int;
  tabla_mul: LOOP  
    SET contador=contador+1;
    SET operacion=valor*contador;
    IF contador=11 THEN
      LEAVE tabla_mul;
    END IF;

    SELECT valor, "x", contador, "=", operacion;

  END LOOP tabla_mul;
END//
DELIMITER ;

-- Volcando estructura para procedimiento phoneland.tabla_while
-- (DEPURADO) asegurar recreación
DROP PROCEDURE IF EXISTS `tabla_while`;
DELIMITER //
CREATE PROCEDURE `tabla_while`(IN `num` INT)
BEGIN
DECLARE i INT DEFAULT 1;
WHILE i <= 10 DO
SELECT CONCAT(num, " x ", i, " = ", num * i) as tabla;
SET i = i + 1;
END WHILE;
END//
DELIMITER ;

-- Volcando estructura para función phoneland.TIPO_PHONE
-- (DEPURADO) asegurar recreación
DROP FUNCTION IF EXISTS `TIPO_PHONE`;
DELIMITER //
CREATE FUNCTION `TIPO_PHONE`(`PRECIOMOVIL` INT) RETURNS varchar(11) CHARSET utf8mb4 COLLATE utf8mb4_general_ci
DETERMINISTIC
READS SQL DATA
begin
    declare TIPO VARCHAR(11);
    IF PRECIOMOVIL>300 THEN
	 	SET TIPO="GAMA ALTA";
	 	ELSE
	 	SET TIPO="GAMA BAJA";
    END IF;
    
return TIPO;
end//
DELIMITER ;

-- Volcando estructura para tabla phoneland.ventas
CREATE TABLE IF NOT EXISTS `ventas` (
  `Id_VENTAS` int NOT NULL,
  `id_PRODUCTOS` int DEFAULT NULL,
  `Id_CLIENTES` int DEFAULT NULL,
  `FECHA_DE_VENTA` varchar(9) DEFAULT NULL,
  `UNIDADES` int DEFAULT NULL,
  `FEMISION` date DEFAULT NULL,
  PRIMARY KEY (`Id_VENTAS`),
  KEY `id_PRODUCTOS` (`id_PRODUCTOS`),
  KEY `Id_CLIENTES` (`Id_CLIENTES`),
  CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`id_PRODUCTOS`) REFERENCES `productos` (`id_PRODUCTO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`Id_CLIENTES`) REFERENCES `clientes` (`Id_CLIENTES`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Volcando datos para la tabla phoneland.ventas: ~37 rows (aproximadamente)
INSERT INTO `ventas` (`Id_VENTAS`, `id_PRODUCTOS`, `Id_CLIENTES`, `FECHA_DE_VENTA`, `UNIDADES`, `FEMISION`) VALUES
	(1, 1, 6, '01-oct-20', 10, '2023-03-15'),
	(52, 2, 13, '16-sep-20', 1, '2023-03-15'),
	(53, 1, 13, '30-nov-20', 1, '2023-03-15'),
	(54, 10, 6, '18-dic-20', 1, '2023-03-15'),
	(55, 8, 4, '19-dic-20', 1, '2023-03-15'),
	(56, 7, 6, '20-dic-20', 1, NULL),
	(58, 11, 4, '22-dic-20', 1, NULL),
	(60, 5, 14, '24-dic-20', 1, NULL),
	(61, 2, 14, '18-nov-20', 1, NULL),
	(62, 2, 11, '26-dic-20', 1, NULL),
	(64, 4, 2, '28-dic-20', 1, NULL),
	(65, 6, 12, '29-dic-20', 1, NULL),
	(68, 5, 8, '01-nov-20', 1, NULL),
	(69, 9, 1, '02-ene-21', 1, NULL),
	(70, 12, 10, '03-ene-21', 1, NULL),
	(71, 12, 11, '04-ene-21', 1, NULL),
	(72, 8, 7, '05-ene-21', 1, NULL),
	(73, 3, 2, '01-oct-20', 1, NULL),
	(74, 12, 6, '07-ene-21', 1, NULL),
	(75, 9, 14, '08-ene-21', 1, NULL),
	(76, 3, 13, '09-ene-21', 1, NULL),
	(77, 12, 12, '10-ene-21', 1, NULL),
	(78, 10, 2, '11-ene-21', 1, NULL),
	(80, 6, 6, '13-ene-21', 1, NULL),
	(81, 12, 9, '14-ene-21', 1, NULL),
	(82, 3, 3, '15-ene-21', 1, NULL),
	(85, 7, 7, '18-ene-21', 1, NULL),
	(86, 8, 6, '19-ene-21', 1, NULL),
	(87, 10, 14, '20-ene-21', 1, NULL),
	(89, 9, 10, '22-ene-21', 1, NULL),
	(90, 8, 13, '23-ene-21', 1, NULL),
	(91, 1, 6, '11-nov-20', 1, NULL),
	(92, 11, 13, '25-ene-21', 1, NULL),
	(94, 2, 11, '27-ene-21', 1, NULL),
	(95, 14, 4, '28-ene-21', 1, NULL),
	(96, 8, 2, '29-ene-21', 1, NULL),
	(99, 7, 13, '01-feb-21', 1, NULL);

-- Volcando estructura para disparador phoneland.TRIGGER1
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';
DELIMITER //
CREATE TRIGGER `TRIGGER1` BEFORE INSERT ON `clientes` FOR EACH ROW BEGIN
    INSERT INTO clientes_copia  VALUES (NEW.id_clientes,NEW.nombre);
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
