-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-12-2020 a las 12:59:28
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


--
-- Parche para importación en HeidiSQL (MySQL/MariaDB)
-- - Crea el esquema si no existe
-- - Evita problemas con espacios en nombres (Id _CLIENTES -> id_clientes)
--
SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE IF NOT EXISTS `phone_land_profesor` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `phone_land_profesor`;

--
-- Base de datos: `phone land profesor`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `id_clientes` int(2) NOT NULL,
  `FECHA_DE_ALTA` varchar(9) DEFAULT NULL,
  `CIF_NIF` varchar(9) DEFAULT NULL,
  `NOMBRE` varchar(17) DEFAULT NULL,
  `DIRECCION` varchar(18) DEFAULT NULL,
  `CP` int(5) DEFAULT NULL,
  `CIUDAD` varchar(7) DEFAULT NULL,
  `PROVINCIA` varchar(6) DEFAULT NULL,
  `EMPRESA` varchar(2) DEFAULT NULL,
  `COMO_NOS_CONOCIO` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_clientes`, `FECHA_DE_ALTA`, `CIF_NIF`, `NOMBRE`, `DIRECCION`, `CP`, `CIUDAD`, `PROVINCIA`, `EMPRESA`, `COMO_NOS_CONOCIO`) VALUES
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
(14, '11-feb-20', 'C11111111', 'MICROSOFT IBERICA', 'AVD,AMERICAS 15', 29005, 'MALAGA', 'MALAGA', 'SI', 'REDES SOCIALES');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

DROP TABLE IF EXISTS `productos`;

CREATE TABLE `productos` (
  `id_PRODUCTO` int(2) NOT NULL,
  `NOMBRE` varchar(58) DEFAULT NULL,
  `FABRICANTE` varchar(7) DEFAULT NULL,
  `PRECIO` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_PRODUCTO`, `NOMBRE`, `FABRICANTE`, `PRECIO`) VALUES
(1, 'XIAOMI IMI10LITE5G 6GB+128GBAzulBoreal', 'XIOAMI', '220,00 €'),
(2, 'SAMSUN GALAXYS20-FE-5G 8GB+256 AZUL MARINO MOVIL LIBRE', 'SAMSUNG', '650,00 €'),
(3, 'APPLE Iphone 11 128GB BLANCO MOVIL LIBRE', 'APPLE', '650,00 €'),
(4, 'XIAOMI MI 10T Pro 8 GB+256 GB Lunar Silver movil libre', 'XIOAMI', '580,00 €'),
(5, 'SAMSUN GALAYI S20 FE 5G 8GB + 256 violeta movil libre', 'SAMSUNG', '600,00 €'),
(6, 'XIAOMI REDMI NOTE 9,4GB + 128 GB Polar white', 'XIOAMI', '100,00 €'),
(7, 'XIOAMI Mi 10 Lite 5G 6GB +128 Gris CoSmico', 'XIOAMI', '189,00 €'),
(8, 'SAMNUNG GALAXI A31 AZUL 4 GB + 64 GB Movil Libre', 'SAMSUNG', '100,00 €'),
(9, 'APPLE IPHONE 11 128GB Malva movil libre', 'APPLE', '650,00 €'),
(10, 'SAMSUN GALAXY A51 4+128GB AZUL MOVIL LIBRE', 'SAMSUNG', '190,00 €'),
(11, 'LG K30 NEGRO 2GB + 16 GB MOVIL LIBRE', 'LG', '70,00 €'),
(12, 'iaomi Redmi Note 8 Pro Mineral Grey 128 GB + 6 GB Móvil li', 'XIOAMI', '180,00 €'),
(13, 'Samsung Galaxy S10 Lite 8 GB + 128 GB Azul móvil libre', 'SAMSUNG', '300,00 €'),
(14, 'Samsung Galaxy S10 Lite 8 GB + 128 GB Azul móvil libre', 'APPLE', '600,00 €'),
(15, 'amsung Galaxy A21s 4 + 64 GB blanco móvil libre', 'SAMSUNG', '100,00 €'),
(16, 'Bronze móvil libre', 'SAMSUNG', '850,00 €'),
(17, 'Xiaomi MI 10T Pro 8 GB + 256 GB Cosmic Black móvil libre', 'XIOAMI', '580,00 €'),
(18, 'Huawei P40 Lite 6+128 GB Verde móvil libre', 'HUAWEI', '190,00 €'),
(19, 'LG K51S 3+64 GB titán móvil libr', 'LG', '100,00 €');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

DROP TABLE IF EXISTS `ventas`;

CREATE TABLE `ventas` (
  `Id_VENTAS` int(2) NOT NULL,
  `id_PRODUCTOS` int(2) DEFAULT NULL,
  `Id_CLIENTES` int(2) DEFAULT NULL,
  `FECHA_DE_VENTA` varchar(9) DEFAULT NULL,
  `UNIDADES` int(2) DEFAULT NULL,
  `unid` varchar(10) DEFAULT NULL,
  `uidadess` varchar(53) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`Id_VENTAS`, `id_PRODUCTOS`, `Id_CLIENTES`, `FECHA_DE_VENTA`, `UNIDADES`, `unid`, `uidadess`) VALUES
(1, 1, 6, '01-oct-20', 10, '', 'SAMSUN GALAYI S20 FE 5G 8GB + 256 violeta movil libre'),
(52, 2, 13, '16-sep-20', 1, '', ''),
(53, 1, 13, '30-nov-20', 1, '', ''),
(54, 10, 6, '18-dic-20', 1, '', ''),
(55, 8, 4, '19-dic-20', 1, '', ''),
(56, 7, 6, '20-dic-20', 1, '', ''),
(58, 11, 4, '22-dic-20', 1, '', ''),
(60, 5, 14, '24-dic-20', 1, '', ''),
(61, 2, 14, '18-nov-20', 1, '', ''),
(62, 2, 11, '26-dic-20', 1, '', ''),
(64, 4, 2, '28-dic-20', 1, '', ''),
(65, 6, 12, '29-dic-20', 1, '', ''),
(68, 5, 8, '01-nov-20', 1, '', ''),
(69, 9, 1, '02-ene-21', 1, '', ''),
(70, 12, 10, '03-ene-21', 1, '', ''),
(71, 12, 11, '04-ene-21', 1, '', ''),
(72, 8, 7, '05-ene-21', 1, '', ''),
(73, 3, 2, '01-oct-20', 1, '', ''),
(74, 12, 6, '07-ene-21', 1, '', ''),
(75, 9, 14, '08-ene-21', 1, '', ''),
(76, 3, 13, '09-ene-21', 1, '', ''),
(77, 12, 12, '10-ene-21', 1, '', ''),
(78, 10, 2, '11-ene-21', 1, '', ''),
(80, 6, 6, '13-ene-21', 1, '', ''),
(81, 12, 9, '14-ene-21', 1, '', ''),
(82, 3, 3, '15-ene-21', 1, '', ''),
(85, 7, 7, '18-ene-21', 1, '', ''),
(86, 8, 6, '19-ene-21', 1, '', ''),
(87, 10, 14, '20-ene-21', 1, '', ''),
(89, 9, 10, '22-ene-21', 1, '', ''),
(90, 8, 13, '23-ene-21', 1, '', ''),
(91, 1, 6, '11-nov-20', 1, '', ''),
(92, 11, 13, '25-ene-21', 1, '', ''),
(94, 2, 11, '27-ene-21', 1, '', ''),
(95, 14, 4, '28-ene-21', 1, '', ''),
(96, 8, 2, '29-ene-21', 1, '', ''),
(99, 7, 13, '01-feb-21', 1, '', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_clientes`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_PRODUCTO`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`Id_VENTAS`),
  ADD KEY `id_PRODUCTOS` (`id_PRODUCTOS`),
  ADD KEY `Id_CLIENTES` (`Id_CLIENTES`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`id_PRODUCTOS`) REFERENCES `productos` (`id_PRODUCTO`),
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`Id_CLIENTES`) REFERENCES `clientes` (`id_clientes`);
COMMIT;
SET FOREIGN_KEY_CHECKS=1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
