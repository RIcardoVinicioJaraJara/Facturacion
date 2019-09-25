-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema facturacion
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema facturacion
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `facturacion` DEFAULT CHARACTER SET utf8 ;
USE `facturacion` ;

-- -----------------------------------------------------
-- Table `facturacion`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `facturacion`.`Usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cedula` VARCHAR(45) NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `rol` VARCHAR(45) NULL,
  `correo` VARCHAR(45) NULL,
  `contrasenia` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `facturacion`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `facturacion`.`Categoria` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `facturacion`.`Proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `facturacion`.`Proveedor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ruc` VARCHAR(45) NULL,
  `nombre` VARCHAR(45) NULL,
  `nacionalidad` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `facturacion`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `facturacion`.`Producto` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `precio` DECIMAL(8,2) NULL,
  `stock` INT NULL,
  `codigo` INT NULL,
  `Categoria` INT NULL,
  `Proveedor` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Producto_Categoria_idx` (`Categoria` ASC) ,
  INDEX `fk_Producto_Proveedor_idx` (`Proveedor` ASC) ,
  CONSTRAINT `fk_Producto_Categoria`
    FOREIGN KEY (`Categoria`)
    REFERENCES `facturacion`.`Categoria` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_Proveedor`
    FOREIGN KEY (`Proveedor`)
    REFERENCES `facturacion`.`Proveedor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `facturacion`.`factura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `facturacion`.`factura` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `subtotal` DECIMAL(8,2) NULL,
  `iva` DECIMAL(8,2) NULL,
  `total` DECIMAL(8,2) NULL,
  `fecha` VARCHAR(45) NULL,
  `Usuarios` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_factura_Usuarios1_idx` (`Usuarios` ASC) ,
  CONSTRAINT `fk_factura_Usuarios1`
    FOREIGN KEY (`Usuarios`)
    REFERENCES `facturacion`.`Usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `facturacion`.`detalle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `facturacion`.`detalle` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cantiddad` INT NULL,
  `subtotal` DECIMAL(8,2) NULL,
  `Producto` INT NOT NULL,
  `factura` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_detalle_factura1_idx` (`factura` ASC) ,
  INDEX `fk_detalle_Producto1_idx` (`Producto` ASC) ,
  CONSTRAINT `fk_detalle_factura1`
    FOREIGN KEY (`factura`)
    REFERENCES `facturacion`.`factura` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_Producto1`
    FOREIGN KEY (`Producto`)
    REFERENCES `facturacion`.`Producto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
