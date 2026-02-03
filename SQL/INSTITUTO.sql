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


-- Volcando estructura de base de datos para instituto
CREATE DATABASE IF NOT EXISTS `instituto` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `instituto`;

-- Volcando estructura para tabla instituto.alumno
CREATE TABLE IF NOT EXISTS `alumno` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `apellido1` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `apellido2` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fecha_nacimiento` date NOT NULL,
  `es_repetidor` enum('sí','no') COLLATE utf8mb4_general_ci NOT NULL,
  `telefono` varchar(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla instituto.alumno: ~10 rows (aproximadamente)
INSERT INTO `alumno` (`id`, `nombre`, `apellido1`, `apellido2`, `fecha_nacimiento`, `es_repetidor`, `telefono`) VALUES
	(1, 'María', 'Sánchez', 'Pérez', '1990-12-01', 'no', NULL),
	(2, 'Juan', 'Sáez', 'Vega', '1998-04-02', 'no', '618253876'),
	(3, 'Pepe', 'Ramírez', 'Gea', '1988-01-03', 'no', '4444'),
	(4, 'Lucía', 'Sánchez', 'Ortega', '1993-06-13', 'sí', '678516294'),
	(5, 'Paco', 'Martínez', 'López', '1995-11-24', 'no', '692735409'),
	(6, 'Irene', 'Gutiérrez', 'Sánchez', '1991-03-28', 'sí', '455454'),
	(7, 'Cristina', 'Fernández', 'Ramírez', '1996-09-17', 'no', '628349590'),
	(8, 'Antonio', 'Carretero', 'Ortega', '1994-05-20', 'sí', '612345633'),
	(9, 'Manuel', 'Domínguez', 'Hernández', '1999-07-08', 'no', '45454'),
	(10, 'Daniel', 'Moreno', 'Ruiz', '1998-02-03', 'no', '45454'),
	(13, 'Sauron', 'Mordor', 'perez', '2013-03-03', 'no', '11111');

-- Volcando estructura para tabla instituto.alumnocenec
CREATE TABLE IF NOT EXISTS `alumnocenec` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido1` varchar(50) DEFAULT NULL,
  `apellido2` varchar(50) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `es_repetidor` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla instituto.alumnocenec: 19 rows
/*!40000 ALTER TABLE `alumnocenec` DISABLE KEYS */;
INSERT INTO `alumnocenec` (`id`, `nombre`, `apellido1`, `apellido2`, `fecha_nacimiento`, `es_repetidor`, `telefono`) VALUES
	(1, 'Sauron', 'Mordor', 'perez', '2013-03-03', 'No', '11111'),
	(2, 'Frodo', 'Bolson', 'Ruiz', '2003-01-01', 'No', '22222'),
	(3, 'Frodo', 'Bolson', 'Ruiz', '2003-01-01', 'No', '22222'),
	(4, 'Frodo', 'Bolson', 'Ruiz', '2003-01-01', 'No', '22222'),
	(5, 'Frodo', 'Bolson', 'Ruiz', '2003-01-01', 'No', '22222'),
	(6, 'Frodo', 'Bolson', 'Ruiz', '2003-01-01', 'No', '22222'),
	(7, 'Frodo', 'Bolson', 'Ruiz', '2003-01-01', 'No', '22222'),
	(8, 'SAMSANGAZ', 'NOSE', 'PEREZ', '1993-01-01', 'Sí', '33333'),
	(9, 'SAMSANGAZ', 'NOSE', 'PEREZ', '1993-01-01', 'Sí', '33333'),
	(10, 'SAMSANGAZ', 'NOSE', 'PEREZ', '1993-01-01', 'Sí', '33333'),
	(11, 'SAMSANGAZ', 'NOSE', 'PEREZ', '1993-01-01', 'Sí', '33333'),
	(12, 'Alberto', 'Ruiz', 'Rodriguez', '1975-05-05', 'No', '33333'),
	(13, 'Alberto', 'Ruiz', 'Rodriguez', '1975-05-05', 'No', '33333'),
	(14, 'Alberto', 'Ruiz', 'Rodriguez', '1975-05-05', 'No', '33333'),
	(15, 'Alberto', 'Ruiz', 'Rodriguez', '1975-05-05', 'No', '33333'),
	(16, 'Alberto', 'Ruiz', 'Rodriguez', '1975-05-05', 'No', '33333'),
	(17, 'Alberto', 'Ruiz', 'Rodriguez', '1975-05-05', 'No', '33333'),
	(18, 'Alberto', 'Ruiz', 'Rodriguez', '1975-05-05', 'No', '33333'),
	(19, 'Alberto', 'Ruiz', 'Rodriguez', '1975-05-05', 'No', '33333');
/*!40000 ALTER TABLE `alumnocenec` ENABLE KEYS */;

-- Volcando estructura para tabla instituto.alumnos_replica
CREATE TABLE IF NOT EXISTS `alumnos_replica` (
  `id` int NOT NULL,
  `alumno` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla instituto.alumnos_replica: ~1 rows (aproximadamente)
INSERT INTO `alumnos_replica` (`id`, `alumno`) VALUES
	(0, 'Sauron');

-- Volcando estructura para función instituto.area_circulo
DELIMITER //
CREATE FUNCTION `area_circulo`(`radio` FLOAT) RETURNS float
BEGIN
    DECLARE area FLOAT;
    
    SET area = PI() * POW(radio, 2);
    SET area = TRUNCATE(area, 2); -- Redondear a dos decimales
    
    RETURN area;


END//
DELIMITER ;

-- Volcando estructura para tabla instituto.audita
CREATE TABLE IF NOT EXISTS `audita` (
  `mensaje` varchar(200) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla instituto.audita: ~8 rows (aproximadamente)
INSERT INTO `audita` (`mensaje`) VALUES
	('modificacion realizada por root@localhost el dia 2023-05-22 11:32:07 valores antiguos 11 y Gandalf valores nuevos 11 Bilbo'),
	('modificacion realizada por root@localhost el dia 2023-12-08 13:51:17 valores antiguos 11 y Bilbo valores nuevos 11 Bilbo'),
	('modificacion realizada por root@localhost el dia 2023-12-08 13:52:13 valores antiguos 11 y Bilbo valores nuevos 11 Bilbo'),
	('modificacion realizada por root@localhost el dia 2023-12-08 13:53:10 valores antiguos 11 y Bilbo valores nuevos 11 Bilbo'),
	('modificacion realizada por root@localhost el dia 2023-12-08 13:53:15 valores antiguos 10 y Daniel valores nuevos 10 Daniel'),
	('modificacion realizada por root@localhost el dia 2023-12-08 13:53:17 valores antiguos 9 y Manuel valores nuevos 9 Manuel'),
	('modificacion realizada por root@localhost el dia 2023-12-08 13:53:20 valores antiguos 6 y Irene valores nuevos 6 Irene'),
	('modificacion realizada por root@localhost el dia 2023-12-08 13:53:22 valores antiguos 3 y Pepe valores nuevos 3 Pepe');

-- Volcando estructura para procedimiento instituto.CURSOR2
DELIMITER //
CREATE PROCEDURE `CURSOR2`()
BEGIN
    DECLARE v_id INT;
    DECLARE v_nombre VARCHAR(50);
    DECLARE v_ultima_fila INT DEFAULT 0;
    DECLARE c_alumnos CURSOR FOR
        SELECT id, nombre FROM alumno WHERE id<=6;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET v_ultima_fila=1;
    OPEN c_alumnos;
    alumnos_cursor: LOOP
        FETCH c_alumnos INTO v_id, v_nombre;
        IF v_ultima_fila=1 THEN
            LEAVE alumnos_cursor;
        END IF;
        SELECT v_id, v_nombre;
    END LOOP alumnos_cursor;
    CLOSE c_alumnos;
END//
DELIMITER ;

-- Volcando estructura para función instituto.diff_fechas
DELIMITER //
CREATE FUNCTION `diff_fechas`(`fecha1` DATE, `fecha2` DATE) RETURNS int
BEGIN
    DECLARE diff INT;
    
    SET diff = DATEDIFF(fecha1, fecha2);
    SET diff = TRUNCATE(diff/365, 0); -- Dividir entre 365 y truncar
    
    RETURN diff;

END//
DELIMITER ;

-- Volcando estructura para procedimiento instituto.error1
DELIMITER //
CREATE PROCEDURE `error1`(`p_id` INT)
    MODIFIES SQL DATA
BEGIN
    

    insert into clientes (id_clientes) values (p_id);
END//
DELIMITER ;

-- Volcando estructura para función instituto.es_par
DELIMITER //
CREATE FUNCTION `es_par`(`numero` INT) RETURNS tinyint(1)
BEGIN
    IF numero % 2 = 0 THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
END//
DELIMITER ;

-- Volcando estructura para función instituto.max_precio_fabricante
DELIMITER //
CREATE FUNCTION `max_precio_fabricante`(nombre_fabricante VARCHAR(50)) RETURNS decimal(10,2)
BEGIN
    DECLARE max_precio DECIMAL(10,2);
    SELECT MAX(precio) INTO max_precio FROM productos pr
    INNER JOIN proveedores p ON p.id_proveedor = pr.id_PRODUCTO 
    WHERE p.nombre_proveedor = nombre_fabricante COLLATE utf8_general_ci; -- Asegura que la collation sea la correcta
    RETURN max_precio;
END//
DELIMITER ;

-- Volcando estructura para función instituto.mayor_de_tres
DELIMITER //
CREATE FUNCTION `mayor_de_tres`(`num1` FLOAT, `num2` FLOAT, `num3` FLOAT) RETURNS float
BEGIN
    DECLARE mayor FLOAT;
    
    IF num1 >= num2 AND num1 >= num3 THEN
        SET mayor = num1;
    ELSEIF num2 >= num1 AND num2 >= num3 THEN
        SET mayor = num2;
    ELSE
        SET mayor = num3;
    END IF;
    
    RETURN mayor;

END//
DELIMITER ;

-- Volcando estructura para función instituto.nombre_dia_semana
DELIMITER //
CREATE FUNCTION `nombre_dia_semana`(`dia` INT) RETURNS varchar(20) CHARSET utf8mb4 COLLATE utf8mb4_general_ci
BEGIN
    DECLARE nombre VARCHAR(20);
    
    CASE dia
        WHEN 1 THEN SET nombre = 'lunes';
        WHEN 2 THEN SET nombre = 'martes';
        WHEN 3 THEN SET nombre = 'miércoles';
        WHEN 4 THEN SET nombre = 'jueves';
        WHEN 5 THEN SET nombre = 'viernes';
        WHEN 6 THEN SET nombre = 'sábado';
        WHEN 7 THEN SET nombre = 'domingo';
        ELSE SET nombre = 'día inválido';
    END CASE;
    
    RETURN nombre;
END//
DELIMITER ;

-- Volcando estructura para disparador instituto.TRIGGER1
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';
DELIMITER //
CREATE TRIGGER `TRIGGER1` BEFORE INSERT ON `alumno` FOR EACH ROW BEGIN
    INSERT INTO alumnos_replica  VALUES (NEW.id,NEW.nombre);
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Volcando estructura para disparador instituto.TRIGGER2
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';
DELIMITER //
CREATE TRIGGER `TRIGGER2` AFTER UPDATE ON `alumno` FOR EACH ROW BEGIN
    INSERT INTO audita
    VALUES (
        CONCAT('modificacion realizada por ', USER(),
        ' el dia ', NOW(), ' valores antiguos ', OLD.id, ' y ',
        OLD.nombre, ' valores nuevos ', NEW.id, ' ', NEW.nombre)
    );
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
