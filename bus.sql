-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 23-07-2019 a las 00:40:46
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
-- Estructura de tabla para la tabla `bus`
--

DROP TABLE IF EXISTS `bus`;
CREATE TABLE IF NOT EXISTS `bus` (
  `Disco` varchar(6) NOT NULL,
  `Placa` varchar(50) NOT NULL,
  `Conductor` varchar(75) NOT NULL,
  `Marca` varchar(50) NOT NULL,
  `Capacidad` int(2) NOT NULL,
  PRIMARY KEY (`Disco`,`Placa`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `bus`
--

INSERT INTO `bus` (`Disco`, `Placa`, `Conductor`, `Marca`, `Capacidad`) VALUES
('7894', 'ABC-1234', 'Javier Molina', 'Mercedes Bens', 40),
('1789', 'XDR-4987', 'Carlos R', 'Hino', 36),
('0456', 'HDB-1473', 'Juan Lopez', 'Chevrolet', 40),
('0145', 'MBC-1028', 'Alan Oña', 'Mercedes Bens', 40);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
