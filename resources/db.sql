CREATE TABLE `sportsclub`.`adidas` (
  `idadidas` INT NOT NULL AUTO_INCREMENT,
  `logo` VARCHAR(45) NULL,
  `bonus` INT NULL,
  `apponads` TINYINT NULL,
  `apponequipment` VARCHAR(45) NULL,
  PRIMARY KEY (`idadidas`));

INSERT INTO 'sportsclub'.'adidas'
(
'logo',
'bonus',
'apponads'
'apponequipment'
)
VALUES
(
'AdidasOriginals',
'5000',
'true',
'true'
);