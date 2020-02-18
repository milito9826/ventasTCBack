CREATE DATABASE  IF NOT EXISTS `ventas_tc` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ventas_tc`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: ventas_tc
-- ------------------------------------------------------
-- Server version	5.6.47-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asesores`
--

DROP TABLE IF EXISTS `asesores`;
CREATE TABLE `asesores` (
  `ID_ASESOR` int(11) NOT NULL,
  `NOMBRE_ASESOR` varchar(60) NOT NULL,
  `ID_ESPECIALIDAD_ASESOR` int(11) NOT NULL,
  PRIMARY KEY (`ID_ASESOR`),
  KEY `ESPECIALIDAD_FK` (`ID_ESPECIALIDAD_ASESOR`),
  CONSTRAINT `ESPECIALIDAD_FK` FOREIGN KEY (`ID_ESPECIALIDAD_ASESOR`) REFERENCES `especialidad` (`ID_ESPECIALIDAD`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `ID_CLIENTE` int(11) NOT NULL,
  `NOMBRE_CLIENTE` varchar(60) NOT NULL,
  `DIRECCION_CLIENTE` varchar(30) NOT NULL,
  `CIUDAD_CLIENTE` varchar(30) NOT NULL,
  `TELEFONO` varchar(20) NOT NULL,
  `ID_ASESOR` int(11) NOT NULL,
  PRIMARY KEY (`ID_CLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `consumo_por_establecimiento`
--

DROP TABLE IF EXISTS `consumo_por_establecimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consumo_por_establecimiento` (
  `ID_CONSUMO_ESTABLECIMIENTO` int(11) NOT NULL AUTO_INCREMENT,
  `NUMERO_TARJETA` varchar(30) NOT NULL,
  `NOMBRE_ESTABLECIMIENTO` varchar(60) NOT NULL,
  `DIRECCION_ESTABLECIMIENTO` varchar(60) NOT NULL,
  `CIUDAD_ESTABLECIMIENTO` varchar(60) NOT NULL,
  `TELEFONO_ESTABLECIMIENTO` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_CONSUMO_ESTABLECIMIENTO`),
  KEY `CONSUMO_NUMERO_TARJETA_FK` (`NUMERO_TARJETA`),
  CONSTRAINT `CONSUMO_NUMERO_TARJETA_FK` FOREIGN KEY (`NUMERO_TARJETA`) REFERENCES `tarjetas` (`NUMERO_TARJETA`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `consumo_tarjeta`
--

DROP TABLE IF EXISTS `consumo_tarjeta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consumo_tarjeta` (
  `ID_CONSUMO` int(11) NOT NULL AUTO_INCREMENT,
  `NUMERO_TARJETA` varchar(30) NOT NULL,
  `FECHA_CONSUMO` datetime NOT NULL,
  `DESCRIPCION_CONSUMO` varchar(60) DEFAULT NULL,
  `monto_consumo` double NOT NULL,
  PRIMARY KEY (`ID_CONSUMO`),
  KEY `CONSUMO_TARJETA_NUMERO_TARJETA_FK` (`NUMERO_TARJETA`),
  CONSTRAINT `CONSUMO_TARJETA_NUMERO_TARJETA_FK` FOREIGN KEY (`NUMERO_TARJETA`) REFERENCES `tarjetas` (`NUMERO_TARJETA`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `especialidad`
--

DROP TABLE IF EXISTS `especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `especialidad` (
  `ID_ESPECIALIDAD` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_ESPECIALIDAD`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tarjetas`
--

DROP TABLE IF EXISTS `tarjetas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarjetas` (
  `NUMERO_TARJETA` varchar(30) NOT NULL,
  `CVV_TARJETA` int(11) NOT NULL,
  `TIPO_TARJETA` varchar(30) NOT NULL,
  `ID_CLIENTE` int(11) NOT NULL,
  PRIMARY KEY (`NUMERO_TARJETA`),
  KEY `CLIENTE_FK` (`ID_CLIENTE`),
  CONSTRAINT `CLIENTE_FK` FOREIGN KEY (`ID_CLIENTE`) REFERENCES `clientes` (`ID_CLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping events for database 'ventas_tc'
--

--
-- Dumping routines for database 'ventas_tc'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-18  1:12:14
