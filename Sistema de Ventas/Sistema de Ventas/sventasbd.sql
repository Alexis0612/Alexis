-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2021 a las 12:11:00
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sventasbd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `Id_clientes` int(11) NOT NULL,
  `Identificacion` int(11) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Apellido` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Direccion` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Telefono` int(11) NOT NULL,
  `Ciudad` int(11) NOT NULL,
  `Fecha_Nacimiento` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Fecha_Ingreso` varchar(20) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`Id_clientes`, `Identificacion`, `Nombre`, `Apellido`, `Direccion`, `Telefono`, `Ciudad`, `Fecha_Nacimiento`, `Fecha_Ingreso`) VALUES
(0, 3, 'Joel', 'Galvez', 'Estor', 31696621, 4, '10071987', '221092021'),
(1, 1, 'Melvin', 'Torres', 'Coban, A.V. zona 12', 22343242, 1, '31-07-1986', '01-02-2012'),
(2, 3, 'Marta', 'Caal', 'Coban, A.V. zona 1', 23423497, 1, '25-03-1988', '15-02-2019'),
(3, 2, 'Jose', 'Torres', 'Coban, A.V.', 23442343, 2, '12-01-2000', '01-01-2020');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `fecha` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `cliente` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `producto` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `cantidad` int(11) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`fecha`, `cliente`, `producto`, `cantidad`, `total`) VALUES
('29-10-2021', 'Melvin Torres', 'Laptop', 2, 2500),
('29-10-2021', 'Jose Torres', 'Escritorio para pc', 1, 750),
('29-10-2021', 'Marta Caal', 'Mouse Optico', 1, 75),
('30/10/2021', 'Melvin', 'Laptop', 1, 2500),
('30/10/2021', 'Marta', 'Escritorio para Computadora', 2, 750);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `Id_factura` int(11) NOT NULL,
  `fecha` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Id_clientes` int(11) NOT NULL,
  `Id_productos` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Descripcion` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Precio` float NOT NULL,
  `Monto` float NOT NULL,
  `Total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`Id_factura`, `fecha`, `Id_clientes`, `Id_productos`, `Descripcion`, `Precio`, `Monto`, `Total`) VALUES
(1, '29-20-2021', 1, '1', 'Laptop', 2500, 2500, 2500),
(2, '29-10-2021', 3, '3', 'Ipad Mini', 3200, 3200, 3200);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `mostrarproducto`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `mostrarproducto` (
`Id_productos` varchar(50)
,`Descripcion` varchar(50)
,`Precio` int(11)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `Id_productos` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Descripcion` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Precio` int(11) NOT NULL,
  `IVA` int(11) NOT NULL,
  `Nota` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`Id_productos`, `Descripcion`, `Precio`, `IVA`, `Nota`) VALUES
('0', 'Laptop', 2500, 1, 'Laptop'),
('1', 'Escritorio para Computadora', 2500, 2, 'Madera caoba'),
('3', 'Ipad Mini', 3200, 0, 'HP'),
('4', 'Table Lenovo 7\"', 1500, 0, 'HP'),
('5', 'Mouse Optico', 250, 0, 'Dell'),
('6', 'Laptop', 3500, 0, 'Dell'),
('7', 'Laptop', 2750, 0, 'HP'),
('8', 'Laptop', 5000, 0, 'Toshiba');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Id_usuarios` int(11) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Apellido` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Clave` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Id_Perfil` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Id_usuarios`, `Nombre`, `Apellido`, `Clave`, `Id_Perfil`) VALUES
(0, 'Joel', 'Alexis', '123', 1),
(2, 'Olga Elena ', 'Perez', '123', 2),
(3, 'Jose', 'Veliz', '123', 1),
(4, 'Karina', 'Cuc Perez', '123', 2),
(5, 'Marcos', 'Teni', '123', 2),
(6, 'Melvin', 'Torres', '123', 2),
(7, 'Marvin', 'Veliz Cruz', '123', 1),
(8, 'Pedro', 'Fernandez', '123', 1);

-- --------------------------------------------------------

--
-- Estructura para la vista `mostrarproducto`
--
DROP TABLE IF EXISTS `mostrarproducto`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `mostrarproducto`  AS SELECT `productos`.`Id_productos` AS `Id_productos`, `productos`.`Descripcion` AS `Descripcion`, `productos`.`Precio` AS `Precio` FROM `productos` ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`Id_clientes`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`Id_factura`),
  ADD KEY `FK_Idc` (`Id_clientes`),
  ADD KEY `FK_Idp` (`Id_productos`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`Id_productos`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Id_usuarios`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `Id_factura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `FK_Idc` FOREIGN KEY (`Id_clientes`) REFERENCES `clientes` (`Id_clientes`),
  ADD CONSTRAINT `FK_Idp` FOREIGN KEY (`Id_productos`) REFERENCES `productos` (`Id_productos`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
