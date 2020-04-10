-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 23-07-2019 a las 00:41:01
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
-- Estructura de tabla para la tabla `conductor`
--

DROP TABLE IF EXISTS `conductor`;
CREATE TABLE IF NOT EXISTS `conductor` (
  `Cedula` varchar(10) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Telefono` varchar(25) NOT NULL,
  `Licencia` varchar(50) NOT NULL,
  PRIMARY KEY (`Cedula`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `conductor`
--

INSERT INTO `conductor` (`Cedula`, `Nombre`, `Telefono`, `Licencia`) VALUES
('1723456781', 'Javier Molina', '09987124735', '586974389562'),
('1748546546', 'Carlos R', '0987987945', '1045646458'),
('1489978978', 'Juan Lopez', '0987456464', '1465488978'),
('1717476987', 'Alan Oña', '0974510268', '0478984564');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
