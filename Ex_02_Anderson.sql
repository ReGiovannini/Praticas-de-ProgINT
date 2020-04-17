create database eng2020_1_Atividadade_Aula02
default character set utf8
default collate utf8_general_ci;



CREATE TABLE IF NOT EXISTS `Pais`(
`id`INT UNSIGNED NOT NULL AUTO_INCREMENT,
`nome`VARCHAR(100) NOt NULL,
`populacao`BIGINT NOT NULL,
`area`NUMERIC(15,2),
PRIMARY KEY(`id`)
)default charset = utf8;

INSERT INTO `Pais` (`id`,`nome`,`populacao`,`area`)
VALUES (1,'Brasil','209300000','8511000');
INSERT INTO `Pais` (`id`,`nome`,`populacao`,`area`) VALUES (2,'Estados Unidos','327200000','9834000');
INSERT INTO `Pais` (`id`,`nome`,`populacao`,`area`) VALUES (3,'Alemanha','82790000','357386');
INSERT INTO `Pais` (`id`,`nome`,`populacao`,`area`) VALUES (4,'Russia','144500000','17100000');
INSERT INTO `Pais` (`id`,`nome`,`populacao`,`area`) VALUES (5,'Japao','126800000','377915');

SELECT * FROM `Pais`;
 
