DROP DATABASE IF EXISTS hotelesdb;
CREATE DATABASE hotelesdb;
USE hotelesdb;

CREATE TABLE `hotel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `ciudad` varchar(45) DEFAULT NULL,
  `aforo` int(11) DEFAULT NULL,
  `estrellas` varchar(11) DEFAULT NULL,
  `descripcion` blob,
  `precioXNoche` double DEFAULT NULL,
  `imagen` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
