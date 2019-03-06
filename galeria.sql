-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-03-2019 a las 15:49:14
-- Versión del servidor: 10.1.34-MariaDB
-- Versión de PHP: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `galeria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `artista`
--

CREATE TABLE `artista` (
  `id` varchar(20) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `ciudad` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `artista`
--

INSERT INTO `artista` (`id`, `nombre`, `telefono`, `direccion`, `ciudad`) VALUES
('1001', 'Armando Perez', '5332514', 'Cra 23 D # 44 - 33', 'Bogota'),
('1002', 'Lina Rojas', '6335214', 'Calle 2b # 33 - 44', 'Cali'),
('1003', 'Jose Linares', '5668798', 'Cra 33 # 15 - 14', 'Barranquilla'),
('1005', 'Ana Torres', '9885741', 'Calle 23 D # 44 - 36 sur', 'Bogota'),
('1200021', 'Da Vinchi', '100132456', 'clle 53 b ', 'Viena'),
('123', ' van gowd', '896574', 'calle cienmpreviva', 'venecia'),
('12345', 'picajazo', '12456897', 'panaderiacentral', 'italia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` varchar(20) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `pago` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `nombre`, `telefono`, `pago`) VALUES
('120051', 'Oscar Perez', '6665214', 3000),
('123', 'jhoan', '785455', 5000),
('789', 'oscar', '458745', 5000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obras_actuales`
--

CREATE TABLE `obras_actuales` (
  `codigo` varchar(20) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `nom_artista` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `impuesto` double DEFAULT NULL,
  `total` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obras_registradas`
--

CREATE TABLE `obras_registradas` (
  `codigo` varchar(20) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `nom_artista` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `impuesto` double DEFAULT NULL,
  `total` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `obras_registradas`
--

INSERT INTO `obras_registradas` (`codigo`, `nombre`, `tipo`, `nom_artista`, `precio`, `impuesto`, `total`) VALUES
('10515ew', 'Dermin', 'Pintura', ' van gowd', 250000, 11250, 261250),
('2145asd', ' las floreas', 'Pintura', ' van gowd', 451212, 20304, 471516);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obras_vendidas`
--

CREATE TABLE `obras_vendidas` (
  `codigo` varchar(20) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `nom_artista` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `impuesto` double DEFAULT NULL,
  `total` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `obras_vendidas`
--

INSERT INTO `obras_vendidas` (`codigo`, `nombre`, `tipo`, `nom_artista`, `precio`, `impuesto`, `total`) VALUES
('10515ew', 'Dermin', 'Pintura', ' van gowd', 250000, 11250, 261250),
('2145asd', ' las floreas', 'Pintura', ' van gowd', 451212, 20304, 471516);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `artista`
--
ALTER TABLE `artista`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `obras_actuales`
--
ALTER TABLE `obras_actuales`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `obras_registradas`
--
ALTER TABLE `obras_registradas`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `obras_vendidas`
--
ALTER TABLE `obras_vendidas`
  ADD PRIMARY KEY (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
