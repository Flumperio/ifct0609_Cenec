-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.32-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para cursos
CREATE DATABASE IF NOT EXISTS `cursos2026` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `cursos2026`;

-- Volcando estructura para tabla cursos.alumno
CREATE TABLE IF NOT EXISTS `alumno` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `apellidos` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla cursos.alumno: ~2 rows (aproximadamente)
INSERT INTO `alumno` (`id`, `apellidos`, `ciudad`, `direccion`, `nombre`) VALUES
	(1, 'Perez', 'Ciudad', 'Calle Falsa 123', 'Juan'),
	(2, 'Rui', 'Sevilla', 'Calle sol', 'Alberto');

-- Volcando estructura para tabla cursos.alumnos
CREATE TABLE IF NOT EXISTS `alumnos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellidos` varchar(30) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `ciudad` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla cursos.alumnos: 5 rows
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` (`id`, `nombre`, `apellidos`, `direccion`, `ciudad`) VALUES
	(1, 'Pedro', 'González', 'Calle Falsa 123', 'Madrid'),
	(2, 'Laura', 'Martínez', 'Avenida Siempre Viva 456', 'Barcelona'),
	(3, 'Carlos', 'Sánchez', 'Calle Sol 789', 'Valencia'),
	(4, 'Ana', 'López', 'Calle Luna 101', 'Sevilla'),
	(5, 'Marta', 'García', 'Avenida Estrella 202', 'Bilbao');
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;

-- Volcando estructura para tabla cursos.asistencia
CREATE TABLE IF NOT EXISTS `asistencia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_alumno` int(11) DEFAULT NULL,
  `id_curso` int(11) DEFAULT NULL,
  `fecha_asistencia` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_alumno` (`id_alumno`),
  KEY `id_curso` (`id_curso`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla cursos.asistencia: 5 rows
/*!40000 ALTER TABLE `asistencia` DISABLE KEYS */;
INSERT INTO `asistencia` (`id`, `id_alumno`, `id_curso`, `fecha_asistencia`) VALUES
	(1, 1, 2, '2024-07-20'),
	(2, 2, 1, '2024-07-21'),
	(3, 3, 4, '2024-07-22'),
	(4, 4, 3, '2024-07-23'),
	(5, 5, 5, '2024-07-24');
/*!40000 ALTER TABLE `asistencia` ENABLE KEYS */;

-- Volcando estructura para tabla cursos.cursos
CREATE TABLE IF NOT EXISTS `cursos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre_curso` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla cursos.cursos: 6 rows
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
INSERT INTO `cursos` (`id`, `nombre_curso`, `descripcion`, `precio`) VALUES
	(1, 'Introducción a la Programación', 'Curso básico de programación en diferentes lenguajes.', NULL),
	(2, 'Bases de Datos', 'Curso sobre diseño y manejo de bases de datos relacionales.', NULL),
	(3, 'Desarrollo Web', 'Curso sobre creación y mantenimiento de sitios web.', NULL),
	(4, 'Redes Informáticas', 'Curso sobre conceptos y prácticas de redes informáticas.', NULL),
	(5, 'Seguridad Informática', 'Curso sobre prácticas y estrategias de seguridad informática.', NULL),
	(6, 'Entorno de desarrollo', 'Entorno de desarrollo ', NULL);
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;

-- Volcando estructura para tabla cursos.facturas
CREATE TABLE IF NOT EXISTS `facturas` (
  `id_factura` int(11) NOT NULL AUTO_INCREMENT,
  `id_alumno` int(11) DEFAULT NULL,
  `importe` decimal(10,2) DEFAULT NULL,
  `pagado` enum('si','no') DEFAULT NULL,
  PRIMARY KEY (`id_factura`),
  KEY `id_alumno` (`id_alumno`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla cursos.facturas: 20 rows
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
INSERT INTO `facturas` (`id_factura`, `id_alumno`, `importe`, `pagado`) VALUES
	(1, 2, 856.56, 'si'),
	(2, 1, 962.96, 'si'),
	(3, 2, 869.11, 'si'),
	(4, 5, 194.94, 'si'),
	(5, 4, 396.95, 'no'),
	(6, 4, 681.73, 'no'),
	(7, 5, 709.37, 'no'),
	(8, 5, 775.17, 'no'),
	(9, 2, 436.49, 'si'),
	(10, 1, 470.72, 'si'),
	(11, 1, 125.15, 'no'),
	(12, 1, 478.24, 'si'),
	(13, 4, 267.55, 'no'),
	(14, 3, 665.04, 'no'),
	(15, 1, 359.75, 'si'),
	(16, 1, 704.15, 'no'),
	(17, 3, 921.24, 'no'),
	(18, 3, 680.83, 'no'),
	(19, 5, 952.91, 'no'),
	(20, 3, 455.94, 'si');
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;

-- Volcando estructura para tabla cursos.profesores
CREATE TABLE IF NOT EXISTS `profesores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `domicilio` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `provincia` varchar(255) DEFAULT NULL,
  `cp` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla cursos.profesores: ~2 rows (aproximadamente)
INSERT INTO `profesores` (`id`, `nombre`, `apellidos`, `domicilio`, `ciudad`, `provincia`, `cp`, `email`) VALUES
	(1, 'Alberto', 'Ruiz', 'Calle Estacion 123', 'Málaga', 'Málaga', '29002', 'albertoruiz@cenecmalaga.es'),
	(2, 'María', 'García Fernández', 'Avenida de la Constitución 45', 'Sevilla', 'Sevilla', '41001', 'maria.garcia@example.com');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
