-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2024 at 09:38 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banco`
--
CREATE DATABASE IF NOT EXISTS `banco` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `banco`;

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `documento` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `email` varchar(60) NOT NULL,
  `idSucursales` int(10) UNSIGNED NOT NULL,
  `idCuentaBancaria` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`documento`, `nombre`, `telefono`, `email`, `idSucursales`, `idCuentaBancaria`) VALUES
(108832933, 'Valeria', '310223329', 'vale@gmail.com', 2, 1001);

-- --------------------------------------------------------

--
-- Table structure for table `credito`
--

CREATE TABLE `credito` (
  `idCredito` int(10) UNSIGNED NOT NULL,
  `valorPrestamo` int(11) NOT NULL,
  `idCuentaBancaria` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `credito`
--

INSERT INTO `credito` (`idCredito`, `valorPrestamo`, `idCuentaBancaria`) VALUES
(1, 15000, 1001);

-- --------------------------------------------------------

--
-- Table structure for table `cuentabancaria`
--

CREATE TABLE `cuentabancaria` (
  `idCuentaBancaria` int(10) UNSIGNED NOT NULL,
  `balance` int(11) NOT NULL,
  `clave` varchar(255) NOT NULL,
  `historial` varchar(1000) NOT NULL,
  `deuda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `cuentabancaria`
--

INSERT INTO `cuentabancaria` (`idCuentaBancaria`, `balance`, `clave`, `historial`, `deuda`) VALUES
(1001, 10000, 'NDQxMjkz', '2024-05-02 14:36:47_Creacion de cuenta_0_No hay detalles|2024-05-02 14:36:56_Deposito_10000_No hay detalles|2024-05-02 14:37:08_Credito_15000_Solicitado', 0);

-- --------------------------------------------------------

--
-- Table structure for table `gerente`
--

CREATE TABLE `gerente` (
  `documento` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `codigoAcceso` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `gerente`
--

INSERT INTO `gerente` (`documento`, `nombre`, `telefono`, `codigoAcceso`) VALUES
(103238192, 'David', '3103928461', 'ODEzMjE5Mw=='),
(1089932620, 'Andres', '3016007234', 'OTkzMTgz');

-- --------------------------------------------------------

--
-- Table structure for table `sucursal`
--

CREATE TABLE `sucursal` (
  `idSucursal` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `direccion` varchar(60) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `historial` varchar(1000) NOT NULL,
  `balance` int(11) NOT NULL,
  `gerenteDocumento` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `sucursal`
--

INSERT INTO `sucursal` (`idSucursal`, `nombre`, `direccion`, `telefono`, `historial`, `balance`, `gerenteDocumento`) VALUES
(1, 'Sucursal Pereira', 'Cra. 5 #20', '547984', '2024-05-02 13:26:13_Credito_10_Solicitado por cuenta: 1006|2024-05-02 13:30:17_Credito_10_Aceptado en cuenta: 1006|2024-05-02 14:19:04_Deposito_20000_Cuenta: 1005|2024-05-02 14:24:51_Deposito_1_Cuenta: 1005|2024-05-02 14:30:17_Eliminar cliente_0_Cuenta: 1005', 119989, 1089932620),
(2, 'Dosquebradas', 'asdasdas', '438132', '2024-05-02 14:36:47_Creacion cliente_0_Valeria cread@ con cuenta: 1001|2024-05-02 14:36:56_Deposito_10000_Cuenta: 1001|2024-05-02 14:37:08_Credito_15000_Solicitado por cuenta: 1001', 110000, 103238192);

-- --------------------------------------------------------

--
-- Table structure for table `vendedor`
--

CREATE TABLE `vendedor` (
  `documento` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `codigoAcceso` varchar(255) NOT NULL,
  `idSucursal` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `vendedor`
--

INSERT INTO `vendedor` (`documento`, `nombre`, `telefono`, `codigoAcceso`, `idSucursal`) VALUES
(10329382, 'Santiago', '3882193', 'MzMzMzYzOQ==', 1),
(103823129, 'Esteban', '3102339221', 'MzE4OTQyMzM=', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`documento`),
  ADD UNIQUE KEY `documento_UNIQUE` (`documento`),
  ADD KEY `fk_Cliente_Sucursal1_idx` (`idSucursales`),
  ADD KEY `fk_Cliente_CuentaBancaria1_idx` (`idCuentaBancaria`);

--
-- Indexes for table `credito`
--
ALTER TABLE `credito`
  ADD PRIMARY KEY (`idCredito`),
  ADD KEY `fk_Credito_CuentaBancaria1_idx` (`idCuentaBancaria`);

--
-- Indexes for table `cuentabancaria`
--
ALTER TABLE `cuentabancaria`
  ADD PRIMARY KEY (`idCuentaBancaria`),
  ADD UNIQUE KEY `idcuentaBancaria_UNIQUE` (`idCuentaBancaria`);

--
-- Indexes for table `gerente`
--
ALTER TABLE `gerente`
  ADD PRIMARY KEY (`documento`),
  ADD UNIQUE KEY `documento_UNIQUE` (`documento`);

--
-- Indexes for table `sucursal`
--
ALTER TABLE `sucursal`
  ADD PRIMARY KEY (`idSucursal`),
  ADD UNIQUE KEY `idSucursal_UNIQUE` (`idSucursal`),
  ADD KEY `fk_Sucursal_Gerente1_idx` (`gerenteDocumento`);

--
-- Indexes for table `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`documento`),
  ADD UNIQUE KEY `documento_UNIQUE` (`documento`),
  ADD KEY `fk_Vendedor_Sucursal1_idx` (`idSucursal`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_Cliente_CuentaBancaria1` FOREIGN KEY (`idCuentaBancaria`) REFERENCES `cuentabancaria` (`idCuentaBancaria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Cliente_Sucursal1` FOREIGN KEY (`idSucursales`) REFERENCES `sucursal` (`idSucursal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `credito`
--
ALTER TABLE `credito`
  ADD CONSTRAINT `fk_Credito_CuentaBancaria1` FOREIGN KEY (`idCuentaBancaria`) REFERENCES `cuentabancaria` (`idCuentaBancaria`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sucursal`
--
ALTER TABLE `sucursal`
  ADD CONSTRAINT `fk_Sucursal_Gerente1` FOREIGN KEY (`gerenteDocumento`) REFERENCES `gerente` (`documento`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `vendedor`
--
ALTER TABLE `vendedor`
  ADD CONSTRAINT `fk_Vendedor_Sucursal1` FOREIGN KEY (`idSucursal`) REFERENCES `sucursal` (`idSucursal`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
