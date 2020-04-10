-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 23-07-2019 a las 00:41:12
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
-- Estructura de tabla para la tabla `ruta`
--

DROP TABLE IF EXISTS `ruta`;
CREATE TABLE IF NOT EXISTS `ruta` (
  `codigo` varchar(5) NOT NULL,
  `bus` varchar(50) NOT NULL,
  `rutas` varchar(50) NOT NULL,
  `hora` time NOT NULL,
  `precio` decimal(5,2) NOT NULL,
  `Limite` int(2) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ruta`
--

INSERT INTO `ruta` (`codigo`, `bus`, `rutas`, `hora`, `precio`, `Limite`) VALUES
('R001', '0456', 'R001-Latacunga-Quito', '10:00:00', '2.50', 33),
('R002', '1789', 'R002-Latacunga-Ambato', '10:00:00', '1.50', 31),
('R003', '7894', 'R003-Latacunga-Ambato', '12:00:00', '1.50', 29),
('R004', '0145', 'R004-Ambato-Latacunga', '10:00:00', '1.50', 38);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
