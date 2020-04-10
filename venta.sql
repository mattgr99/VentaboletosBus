-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 23-07-2019 a las 00:41:25
-- Versión del servidor: 5.7.26
-- Versión de PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cooperativa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

DROP TABLE IF EXISTS `venta`;
CREATE TABLE IF NOT EXISTS `venta` (
  `Id` int(4) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(75) NOT NULL,
  `Ruta` varchar(100) NOT NULL,
  `Horario` varchar(10) NOT NULL,
  `Numero_Boletos` int(2) NOT NULL,
  `Precio` decimal(5,2) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`Id`, `Nombre`, `Ruta`, `Horario`, `Numero_Boletos`, `Precio`) VALUES
(1, 'Nicole Ariias', 'R001-Latacunga-Quito', '10:00:00', 4, '2.50'),
(2, 'Stalin Herrera', 'R002-Latacunga-Ambato', '10:00:00', 5, '1.50'),
(3, 'Stalin Herrera', 'R003-Latacunga-Ambato', '12:00:00', 4, '1.50'),
(4, 'Carlos Perez', 'R003-Ambato-Latacunga', '10:00:00', 3, '1.50'),
(5, 'Carlos Perez', 'R003-Ambato-Latacunga', '10:00:00', 4, '1.50'),
(6, 'Jose L', 'R004-Ambato-Latacunga', '10:00:00', 2, '1.50'),
(7, 'Miguel R', 'R001-Latacunga-Quito', '10:00:00', 3, '2.50');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
