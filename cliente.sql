-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 21-07-2019 a las 02:08:56
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
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `Id` int(100) NOT NULL AUTO_INCREMENT,
  `Cedula` varchar(10) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Telefono` varchar(25) NOT NULL,
  `Direccion` varchar(200) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`Id`, `Cedula`, `Nombre`, `Telefono`, `Direccion`) VALUES
(1, '0501478991', 'Carlos Perez', '0998737475', 'Latacunga'),
(2, '1723456781', 'Stalin Herrera', '0998737755', 'Quito'),
(3, '1023751745', 'Nicole Arias', '0998731078', 'Ambato'),
(4, '1401211226', 'Jose L', '0998745231', 'Latacunga'),
(6, '1054879875', 'Miguel R', '0987456121', 'Latacunga');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
