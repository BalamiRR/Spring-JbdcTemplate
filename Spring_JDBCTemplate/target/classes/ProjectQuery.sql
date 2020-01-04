
CREATE SCHEMA `companydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci ;




CREATE TABLE `companydb`.`employee` (
  `idemployee` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NULL,
  `experience` VARCHAR(2) NULL,
  PRIMARY KEY (`idemployee`));





SELECT * FROM companydb.employee;



INSERT INTO `companydb`.`employee` (`idemployee`, `name`, `surname`, `experience`) VALUES ('1', 'Fuat', 'Kara', '4');


ALTER TABLE `companydb`.`employee` 
CHANGE COLUMN `idemployee` `idemployee` INT(11) NOT NULL AUTO_INCREMENT ;



UPDATE `companydb`.`employee` SET `experience` = '5' WHERE (`idemployee` = '3');



DELETE FROM companydb.employee WHERE idemployee = '6';






