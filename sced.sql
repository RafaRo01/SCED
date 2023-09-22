--
-- Base de datos: `dbalmacen`
--
create database dbalmacen2;
use dbalmacen2;

select * from tblusuarios;

-- *****************************  COMPRAS ********************************************************************************************
describe compras;
drop table if exists compras;
create table compras (idcompras int auto_increment, articulo varchar(100), cantidad varchar(100), descripcion varchar(100), fecha date, primary key(idcompras)
);

INSERT INTO `dbalmacen2`.`compras` (`articulo`, `cantidad`, `descripcion`, `fecha`) VALUES ('Pizarron', '1', 'Rojo', '203/06/14');
INSERT INTO `dbalmacen2`.`compras` (`articulo`, `cantidad`, `descripcion`, `fecha`) VALUES ('Proyector', '2', 'Cafe', '2023/06/15');
INSERT INTO `dbalmacen2`.`compras` (`articulo`, `cantidad`, `descripcion`, `fecha`) VALUES ('Sala', '3', 'Azul', '2023/06/18');
select * from compras;

DELIMITER $$ 

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarCompras` (IN `art` VARCHAR(45), IN `cant` VARCHAR(45), 
IN `descr` VARCHAR(45),IN `fec` VARCHAR(45))  BEGIN
INSERT INTO compras (articulo, cantidad, descripcion, fecha) 
VALUES (art,cant,descr,fec);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarCompras` (IN `us` VARCHAR(45))  BEGIN
SELECT * FROM compras WHERE articulo LIKE CONCAT('%',us,'%');
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `editarCompras` (IN `id` INT, IN `art` VARCHAR(45), IN `cant` VARCHAR(45), 
IN `descr` VARCHAR(45),IN `fec` VARCHAR(45))  BEGIN
UPDATE compras SET articulo=art, cantidad=cant, descripcion= descr, fecha=fec WHERE idcompras = id;
END$$
-- compras (idcompras,articulo,cantidad,descripcion,fecha) 

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarCompras` (IN `id` INT)  BEGIN
DELETE FROM compras WHERE idcompras = id;
END$$

DELIMITER ;


-- *****************************  FIN COMPRAS ********************************************************************************************

-- *****************************  SALAS ********************************************************************************************
use dbalmacen2;
describe salas;
drop table if exists salas;
create table salas(id_Sa int auto_increment, codSa varchar(15), pizar varchar(15), fp varchar(100), silla varchar(15), fs varchar(100),
mesa varchar(15), fm varchar(100),pc varchar(15), fpc varchar(100), proyec varchar(15), fpro varchar(100), lib varchar(15), fli varchar(100),
boteBa varchar(15), fbb varchar(100), microo varchar(15), fmic varchar(100),cafet varchar(15),fcaf varchar(100), tv varchar(15), ftv varchar(100),
refri varchar(15), fref varchar(100),gAgua varchar(15), fag varchar(100),ubi varchar(100), obser varchar(100), primary key(id_Sa));
select * from salas;
INSERT INTO `dbalmacen2`.`salas` (`codSa`, `pizar`,`fp`, `silla`,`fs`, `mesa`,`fm`, `pc`, `fpc`, `proyec`,`fpro`, `lib`, `fli`, `boteBa`,`fbb`, `microo`, `fmic`, `cafet`,`fcaf`, `tv`, `ftv`,`refri`,`fref`, `gAgua`,`fag`, `ubi`, `obser`) VALUES ('Sala Audiovisual ', '2','Si', '26','Si', '4','Si', '0', 'Si', '0','Si', '0','Si', '0','Si', '0','Si', '0','Si', '0','Si', '0','Si', '0','Si', '1 Piso, Lado Derecho.','Exce');
INSERT INTO `dbalmacen2`.`salas` (`codSa`, `pizar`,`fp`, `silla`,`fs`, `mesa`,`fm`, `pc`, `fpc`, `proyec`,`fpro`, `lib`, `fli`, `boteBa`,`fbb`, `microo`, `fmic`, `cafet`,`fcaf`, `tv`, `ftv`,`refri`,`fref`, `gAgua`,`fag`, `ubi`, `obser`) VALUES ('Sala de Titulación ', '1','Si', '10','Si', '2', 'Si','0','Si', '0','Si', '0','Si', '0','Si', '0','Si', '0','Si', '0','Si', '0','Si', '0','Si','1 Piso, Lado Derecho.','');
INSERT INTO `dbalmacen2`.`salas` (`codSa`, `pizar`,`fp`, `silla`,`fs`, `mesa`,`fm`, `pc`, `fpc`, `proyec`,`fpro`, `lib`, `fli`, `boteBa`,`fbb`, `microo`, `fmic`, `cafet`,`fcaf`, `tv`, `ftv`,`refri`,`fref`, `gAgua`,`fag`, `ubi`, `obser`) VALUES ('Sala de Maestros', '2','Si', '10','Si', '6','Si', '0','Si','1', 'Si','1','Si', '1','Si', '1','Si', '1','Si', '1','Si', '1','Si', '2','Si', '2 Piso, Lado Derecho.','');
INSERT INTO `dbalmacen2`.`salas` (`codSa`, `pizar`,`fp`, `silla`,`fs`, `mesa`,`fm`, `pc`, `fpc`, `proyec`,`fpro`, `lib`, `fli`, `boteBa`,`fbb`, `microo`, `fmic`, `cafet`,`fcaf`, `tv`, `ftv`,`refri`,`fref`, `gAgua`,`fag`, `ubi`, `obser`) VALUES ('SalaMM', '2','Si', '10','Si', '6','Si', '0','Si','1', 'Si','1','Si', '1','Si', '1','Si', '1','Si', '1','Si', '1','Si', '2','Si', '2 Piso, Lado Derecho.','');
describe salas;
select * from salas;
select * from salas;
--  ***********************************************
DELIMITER $$ 

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarSalas` (IN `nom` VARCHAR(45), IN `piz` VARCHAR(45), IN `fp` VARCHAR(45),
 IN `sill` VARCHAR(45),IN `fs` VARCHAR(45),IN `mes` VARCHAR(45),IN `fm` VARCHAR(45), IN `pc` VARCHAR(45), IN `fpc` VARCHAR(45), 
 IN `proy` VARCHAR(45), IN `fpro` VARCHAR(45), IN `lib` VARCHAR(45), IN `fli` VARCHAR(45),  IN `bote` VARCHAR(45), 
 IN `fbb` VARCHAR(45),  IN `micro` VARCHAR(45),  IN `fmic` VARCHAR(45), IN `cafe` VARCHAR(45), IN `fcaf` VARCHAR(45), 
 IN `tv` VARCHAR(45), IN `ftv` VARCHAR(45), IN `refri` VARCHAR(45), IN `fref` VARCHAR(45), IN `gAg` VARCHAR(45), 
 IN `fag` VARCHAR(45), IN `ubi` VARCHAR(45), IN `obser` VARCHAR(45))  BEGIN
INSERT INTO salas(codSa,pizar,fp,silla,fs,mesa,fm,pc,fpc,proyec,fpro,lib,fli,boteBa,fbb,microo,fmic,cafet,fcaf,tv,ftv,refri,fref,gAgua,fag,ubi,obser )
VALUES (nom,piz,fp,sill,fs,mes,fm,pc,fpc,proy,fpro,lib,fli,bote,fbb,micro,fmic,cafe,fcaf,tv,ftv,refri,fref,gAg,fag,ubi,obser);
END$$
-- salas(id_Sa,codSa,pizar,fp,silla,fs,mesa,fm,pc,fpc,proyec,fpro,lib,fli,boteBa,fbb,microo,fmic,cafet,fcaf,tv,ftv,refri,fref,gAgua,fag,ubi,obser )
CREATE DEFINER=`root`@`localhost` PROCEDURE `editarSalas` (IN `id` INT,IN `nom` VARCHAR(45), IN `piz` VARCHAR(45), IN `fp` VARCHAR(45),
 IN `sill` VARCHAR(45),IN `fs` VARCHAR(45), IN `mes` VARCHAR(45),IN `fm` VARCHAR(45),IN `pc` VARCHAR(45), IN `fpc` VARCHAR(45), 
 IN `proy` VARCHAR(45), IN `fpro` VARCHAR(45), IN `lib` VARCHAR(45), IN `fli` VARCHAR(45),  IN `bote` VARCHAR(45), 
 IN `fbb` VARCHAR(45),  IN `micro` VARCHAR(45),  IN `fmic` VARCHAR(45), IN `cafe` VARCHAR(45), IN `fcaf` VARCHAR(45), 
 IN `tv` VARCHAR(45), IN `ftv` VARCHAR(45), IN `refri` VARCHAR(45), IN `fref` VARCHAR(45), IN `gAg` VARCHAR(45), 
 IN `fag` VARCHAR(45), IN `ubi` VARCHAR(45), IN `obser` VARCHAR(45))  BEGIN
UPDATE salas SET codSa=nom,pizar= piz, fp= fp, silla=sill, fs=fs,mesa=mes,fm= fm, pc=pc, fpc=fpc,proyec = proy,fpro=fpro,
 lib=lib, fli=fli, boteBa=bote,  fbb=fbb, microo=micro, fmic=fmic,cafet=cafe, fcaf=fcaf,tv=tv, ftv=ftv,refri=refri,fref=fref,
 gAgua= gAg, fag =fag, ubi= ubi, obser = obser WHERE id_Sa = id;
END$$
-- salas(id_Sa,codSa,pizar,fp,silla,fs,mesa,fm,pc,fpc,proyec,fpro,lib,fli,boteBa,fbb,microo,fmic,cafet,fcaf,tv,ftv,refri,fref,gAgua,fag,ubi,obser )

-- cubiculos (codigoCubi, impresora,fi,silla,fs,mesa, fm,pc,fpc,librero,fli,boteBa,fbb,CentroMan,fcm ,ubi,obser) 
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarSalas` (IN `id` INT)  BEGIN
DELETE FROM salas WHERE id_Sa = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarSalas` (IN `nom` VARCHAR(45))  BEGIN
SELECT * FROM salas WHERE codSa LIKE CONCAT('%',nom,'%');
END$$
DELIMITER ;

-- ***************************** FIN DE SALAS ********************************************************************************************

-- *****************************  JEFES  ********************************************************************************************
use dbalmacen2;
drop table if exists jefes;
create table jefes(id_je int auto_increment, codigoJ varchar(200), pizarron varchar(100), fp varchar (50),  mesa varchar(100), fm varchar (100), silla varchar(100), fs varchar(100),
pc varchar(100), fpc varchar(100), librero varchar(100), fli varchar(100), boteBa varchar(100), fbb varchar(100), baño varchar(100), fba varchar(100),
 mueble varchar(100), fmu varchar (100), impresora varchar(100), fi varchar(100), ubi varchar (200),obser varchar(100),primary key(id_je)); 
select * from jefes;
INSERT INTO `dbalmacen2`.`jefes` (`id_je`,`codigoJ`, `pizarron`, `fp`, `mesa`, `fm`, `silla`, `fs`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `baño`, `fba`, `mueble`, `fmu`,`impresora`, `fi`, `ubi`, `obser`) VALUES ('1','Director', '1', 'Si', '2', 'Si', '3', 'Si', '2', 'Si', '2', 'Si', '1', 'Si', '1', 'Si', '1', 'Si', '0', 'Si','2 Piso, #01','Exce');
INSERT INTO `dbalmacen2`.`jefes` (`id_je`,`codigoJ`, `pizarron`, `fp`, `mesa`, `fm`, `silla`, `fs`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `baño`, `fba`, `mueble`, `fmu`,`impresora`, `fi`, `ubi`, `obser`) VALUES ('2','Secretaría', '0', 'Si', '2', 'Si', '2', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '0','Si', '2 Piso, #02','');
INSERT INTO `dbalmacen2`.`jefes` (`id_je`,`codigoJ`, `pizarron`, `fp`, `mesa`, `fm`, `silla`, `fs`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `baño`, `fba`, `mueble`, `fmu`,`impresora`, `fi`, `ubi`, `obser`) VALUES ('3','Secretaría 2', '0', 'Si', '3', 'Si', '1', 'Si', '1','Si', '0','Si', '1','Si', '0','Si', '0','Si', '0','Si','2 Piso, #03','');
INSERT INTO `dbalmacen2`.`jefes` (`id_je`,`codigoJ`, `pizarron`, `fp`, `mesa`, `fm`, `silla`, `fs`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `baño`, `fba`, `mueble`, `fmu`,`impresora`, `fi`, `ubi`, `obser`) VALUES ('4','Servicio Social', '0','Si', '2','Si', '2','Si', '0','Si', '0','Si', '0','Si', '0','Si', '0','Si', '0','Si','2 Piso, #04','');
INSERT INTO `dbalmacen2`.`jefes` (`id_je`,`codigoJ`, `pizarron`, `fp`, `mesa`, `fm`, `silla`, `fs`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `baño`, `fba`, `mueble`, `fmu`,`impresora`, `fi`, `ubi`, `obser`) VALUES ('5','Tutorías', '0', 'Si','2', 'Si','5','Si', '2','Si', '3','Si', '1','Si', '0','Si', '0','Si', '0','Si','2 Piso, #05','');
INSERT INTO `dbalmacen2`.`jefes` (`id_je`,`codigoJ`, `pizarron`, `fp`, `mesa`, `fm`, `silla`, `fs`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `baño`, `fba`, `mueble`, `fmu`,`impresora`, `fi`, `ubi`, `obser`) VALUES ('6','Auxiliar Administrativo', '0','Si', '1','Si', '1','Si', '0','Si', '0', 'Si','0','Si', '0','Si', '0','Si', '0','Si','2 Piso, #06','');
INSERT INTO `dbalmacen2`.`jefes` (`id_je`,`codigoJ`, `pizarron`, `fp`, `mesa`, `fm`, `silla`, `fs`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `baño`, `fba`, `mueble`, `fmu`,`impresora`, `fi`, `ubi`, `obser`) VALUES ('7','Vinculación', '0','Si', '3','Si', '4','Si', '1','Si', '3','Si', '1','Si', '0','Si', '0','Si', '1','Si','2 Piso, #07','');
select * from jefes;

DELIMITER $$ 


CREATE DEFINER=`root`@`localhost` PROCEDURE `editarJefes` (IN `id` INT, IN `nom` VARCHAR(45), IN `piz` VARCHAR(45), IN `fp` VARCHAR(45),
 IN `mes` VARCHAR(45),IN `fm` VARCHAR(45), IN `sill` VARCHAR(45),IN `fs` VARCHAR(45),IN `pc` VARCHAR(45), IN `fpc` VARCHAR(45), 
 IN `lib` VARCHAR(45), IN `fli` VARCHAR(45),  IN `bote` VARCHAR(45), IN `fbb` VARCHAR(45),  IN `ban` VARCHAR(45), 
 IN `fba` VARCHAR(45), IN `mueb` VARCHAR(45), IN `fmu` VARCHAR(45), IN `imp` VARCHAR(45), IN `fi` VARCHAR(45), IN `ubi` VARCHAR(45), IN `obser` VARCHAR(45))  BEGIN
UPDATE jefes SET codigoJ=nom,pizarron= piz, fp= fp,mesa=mes,fm= fm, silla=sill, fs=fs, pc=pc, fpc=fpc, 
 librero=lib, fli=fli, boteBa=bote,  fbb=fbb, baño=ban, fba=fba,mueble=mueb, fmu= fmu,impresora=imp, fi=fi, ubi= ubi, obser = obser WHERE id_je = id;
END$$
-- jefes (id_je,codigoJ,pizarron,fp,mesa,fm,silla,fs,pc,fpc,librero,fli,boteBa,fbb,baño,fba,mueble,fmu,impresora,fi,ubi,obser)


CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarJefes` (IN `id` INT)  BEGIN
DELETE FROM jefes WHERE id_je = id;
END$$

-- jefes (id_je,codigoJ,pizarron,fp,mesa,fm,silla,fs,pc,fpc,librero,fli,boteBa,fbb,baño,fba,mueble,fmu,impresora,fi,ubi,obser)

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarJefes` (IN `nom` VARCHAR(45), IN `piz` VARCHAR(45), IN `fp` VARCHAR(45),
 IN `mes` VARCHAR(45),IN `fm` VARCHAR(45), IN `sill` VARCHAR(45),IN `fs` VARCHAR(45),IN `pc` VARCHAR(45), IN `fpc` VARCHAR(45), 
 IN `lib` VARCHAR(45), IN `fli` VARCHAR(45),  IN `bote` VARCHAR(45), IN `fbb` VARCHAR(45),  IN `ban` VARCHAR(45), 
 IN `fba` VARCHAR(45), IN `mueb` VARCHAR(45), IN `fmu` VARCHAR(45), IN `imp` VARCHAR(45), IN `fi` VARCHAR(45), IN `ubi` VARCHAR(45), IN `obser` VARCHAR(45))  BEGIN
INSERT INTO jefes (codigoJ,pizarron,fp,mesa,fm,silla,fs,pc,fpc,librero,fli,boteBa,fbb,baño,fba,mueble,fmu,impresora,fi,ubi,obser)
VALUES             (nom,   piz,    fp, mes,fm, sill,fs,pc,fpc,lib,fli,bote,fbb,      ban,fba,mueb, fmu,imp, fi, ubi,obser);
END$$

select * from jefes;

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarJefes` (IN `nom` VARCHAR(45))  BEGIN
SELECT * FROM jefes WHERE codigoJ LIKE CONCAT('%',nom,'%');
END$$
DELIMITER ;

-- ***************************** FIN DE JEFES ********************************************************************************************



-- *****************************  CUBICULOS ********************************************************************************************
use dbalmacen2;
describe cubiculos;
drop table if exists cubiculos;
create table cubiculos( id_Cubi int auto_increment, codigoCubi varchar (100), impresora varchar (100), fi varchar(100), 
silla varchar (100),  fs varchar(100), mesa varchar (100),   fm varchar(100), pc  varchar (100),  fpc varchar(100), 
librero varchar (100),  fli varchar(100),  boteBa varchar (100),  fbb varchar(100), CentroMan varchar (100),  fcm varchar(100), ubi varchar(200), obser varchar(100), primary key (id_Cubi)); 
select * from cubiculos;
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('1','Cubículo 1', '0', 'Si', '2', 'Si', '2','Si', '4','Si', '1','Si', '1','Si', '0','Si','2 Piso, #1','Exce');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('2','Cubículo 2', '0', 'Si','2','Si', '2','Si', '0','Si', '1','Si', '1', 'Si','0','Si','2 Piso, #2','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('3','Cubículo 3', '0','Si', '2','Si', '2','Si', '1','Si', '2','Si', '1','Si', '0','Si','2 Piso, #3','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('4','Cubículo 4', '0','Si', '3','Si', '4','Si', '1','Si', '1','Si', '1','Si', '0','Si','2 Piso, #4','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('5','Cubículo 5', '0','Si', '2','Si', '2', 'Si','0','Si', '1','Si', '1','Si', '0','Si','2 Piso, #5','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('6','Cubículo 6', '0', 'Si', '2','Si', '2','Si', '1','Si', '1','Si', '1','Si', '0','Si','2 Piso, #6','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('7','Cubículo 7', '0','Si', '2', 'Si','2', 'Si','1','Si', '1','Si', '1','Si', '0','Si','2 Piso, #7','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('8','Cubículo 8', '0', 'Si','2','Si', '2','Si', '1','Si', '1','Si', '1', 'Si','0','Si','2 Piso, #8','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('9','Cubículo 9', '1','Si', '3','Si', '4', 'Si','4','Si', '1','Si', '1','Si', '0','Si','2 Piso, #9','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('10','Cubículo 10', '0','Si', '2','Si', '2','Si', '1','Si', '1','Si', '1','Si', '0','Si','2 Piso, #10','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('11','Cubículo 11', '0','Si', '2','Si', '2', 'Si','0','Si', '1','Si', '1','Si', '0','Si','2 Piso, #11','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('12','Cubículo 12', '0','Si', '2','Si', '3','Si', '1','Si', '1','Si', '1','Si', '0', 'Si','2 Piso, #12','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('13','Cubículo 13', '0','Si', '2','Si', '1','Si', '0','Si', '1','Si', '1','Si', '0','Si','2 Piso, #13','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('14','Cubículo 14', '0','Si', '1','Si', '2','Si', '1','Si', '1','Si', '1','Si', '0','Si','2 Piso, #14','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('15','Cubículo 15', '0','Si', '2', 'Si','2','Si', '1','Si', '1','Si', '1','Si', '0','Si','2 Piso, #15','');
INSERT INTO `dbalmacen2`.`cubiculos` (`id_Cubi`,`codigoCubi`, `impresora`, `fi`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `librero`, `fli`, `boteBa`, `fbb`, `CentroMan`,`fcm`, `ubi`, `obser`) VALUES ('16','Cubículo 16', '0','Si', '2','Si', '1','Si', '1','Si', '1','Si', '1','Si', '0','Si','2 Piso, #16','');
select * from cubiculos;

describe cubiculos;
DELIMITER $$ 
CREATE DEFINER=`root`@`localhost` PROCEDURE `editarCubiculos` (IN `id` INT, IN `nom` VARCHAR(45), IN `imp` VARCHAR(45), 
IN `fim` VARCHAR(45),IN `sill` VARCHAR(45),IN `fsil` VARCHAR(45), IN `mes` VARCHAR(45),IN `fmes` VARCHAR(45), IN `pcc` VARCHAR(45), 
IN `fpcc` VARCHAR(45), IN `lib` VARCHAR(45), IN `flibr` VARCHAR(45),  IN `bote` VARCHAR(45), IN `fbbas` VARCHAR(45),  
IN `centro` VARCHAR(45),IN `fcman` VARCHAR(45), IN `ubic` VARCHAR(45), IN `obserr` VARCHAR(45))  BEGIN
UPDATE cubiculos SET codigoCubi=nom, impresora=imp, fi= fim, silla=sill, fs=fsil, mesa=mes, fm=fmes, pc=pcc,fpc=fpcc,
 librero=lib, fli=flibr, boteBa=bote,  fbb=fbbas, CentroMan=centro, fcm=fcman, ubi= ubic, obser=obserr WHERE id_Cubi = id;
END$$
-- cubiculos (id_Cubi,codigoCubi, impresora,fi,silla,fs,mesa, fm,pc,fpc,librero,fli,boteBa,fbb,CentroMan,fcm ,ubi,obser) 
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarCubiculos` (IN `id` INT)  BEGIN
DELETE FROM cubiculos WHERE id_Cubi = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarCubiculos` (IN `nom` VARCHAR(45), IN `imp` VARCHAR(45), IN `fi` VARCHAR(45),
IN `sill` VARCHAR(45),IN `fs` VARCHAR(45), IN `mes` VARCHAR(45),IN `fm` VARCHAR(45), IN `pc` VARCHAR(45), IN `fpc` VARCHAR(45), 
 IN `lib` VARCHAR(45), IN `fli` VARCHAR(45),  IN `bote` VARCHAR(45), IN `fbb` VARCHAR(45),  IN `centro` VARCHAR(45), 
 IN `fcm` VARCHAR(45), IN `ubi` VARCHAR(45), IN `obser` VARCHAR(45))  BEGIN
INSERT INTO cubiculos (codigoCubi, impresora,fi,silla,fs,mesa, fm,pc,fpc,librero,fli,boteBa,fbb,CentroMan,fcm ,ubi,obser)
VALUES (nom,imp,fi,sill,fs,mes,fm,pc,fpc,lib,fli,bote,fbb,centro,fcm,ubi,obser);
END$$

describe cubiculos;

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarCubiculos` (IN `nom` VARCHAR(45))  BEGIN
SELECT * FROM cubiculos WHERE codigoCubi LIKE CONCAT('%',nom,'%');
END$$
DELIMITER ;

-- ***************************** FIN DE CUBICULOS ********************************************************************************************


-- *****************************  SALONES ********************************************************************************************

-- ************************************* SALONES *************************************************

describe salones;
drop table if exists salones;
create table salones( id_salon int auto_increment , codigoSalon varchar(100), pizarron int (100), f varchar (10), silla int (100),
 fs varchar (10), mesa int (100), fm varchar (10), pc int (100), fpc varchar (10), proyector int (100), fpro varchar (10),
 bBasura int (100), fbb varchar (10), mesaBan int (100),fmb varchar (10), clima varchar (100), luz varchar (100), ubi varchar(300), obser varchar(200), primary key (id_salon));
select * from salones; 

INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('1', 'FF1', '2', 'Si', '1', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '25', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('2', 'FF2', '2', 'Si', '1', 'Si','1', 'Si', '0', 'Si', '1', 'Si', '1',  'Si','28', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('3', 'FF3', '2', 'Si', '2', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si','25', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('4', 'FF4', '2', 'Si', '1', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '37', 'Si', 'Si', 'Si','1 Piso, Lado Derecho.','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('5', 'FF5', '2', 'Si', '1', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '25', 'Si', 'Si', 'Si','1 Piso, Lado Derecho.','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`)VALUES ('6', 'FF6', '2', 'Si', '1', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '30', 'Si', 'Si', 'Si','1 Piso, Lado Derecho.','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('7', 'FF7', '2', 'Si', '1', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '38', 'Si', 'Si', 'Si','1 Piso, Lado Derecho.','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('8', 'FF8', '3', 'Si', '1', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '24', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo.','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('9', 'FF9', '3', 'Si', '1', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '25', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('10', 'FFA', '2', 'Si', '1', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '28', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`)VALUES ('11', 'FFB', '2', 'Si', '1', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '27', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('12', 'FFC', '2', 'Si', '1', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '30', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `dbalmacen2`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('13', 'FFD', '2', 'Si', '1', 'Si','1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '29', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');

select * from salones; 


-- create table salones( id_salon int auto_increment , codigoSalon varchar(100), pizarron int (100), f varchar (10), silla int (100),
--  fs varchar (10), mesa int (100), fm varchar (10), pc int (100), fpc varchar (10), proyector int (100), fpro varchar (10),
-- bBasura int (100), fbb varchar (10), mesaBan int (100),fmb varchar (10), clima varchar (100), luz varchar (100), ubi varchar(300), obser varchar(200), primary key (id_salon));
 select * from salones; 
describe salones;
 
describe tblUsuarios;
-- idsalon,codigoSalon,pizarron,f,silla,fs,mesa,fm,pc,fpc,proyector,fpro,bBasura,fbb,mesaBan,fmb,clima,luz,ubi,obser
DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `editarSalones` (IN `id` INT, IN `nom` VARCHAR(45), IN `piza` int, IN `fpiz` VARCHAR(45),
IN `sill` int(45),IN `fsil` VARCHAR(45), IN `mes` int(45),IN `fme` VARCHAR(45), IN `pcc` int(45), IN `fpcc` VARCHAR(45),  IN `proy` int(45), IN `fproye` VARCHAR(45)
,  IN `bBas` int(45), IN `fbba` VARCHAR(45),  IN `mesaBanco` int(45), IN `fmba` VARCHAR(45), IN `cli` VARCHAR(45), IN `luzz` VARCHAR(45), IN `ubii` VARCHAR(45), IN `obserr` VARCHAR(45))  BEGIN
UPDATE salones SET codigoSalon=nom, pizarron=piza, f= fpiz,silla=sill,fs=fsil,mesa=mes, fm=fme,pc=pcc,fpc=fpcc, proyector=proy, fpro=fproye
, bBasura=bBas,  fbb=fbba, mesaBan=mesaBanco, fmb=fmba, clima=cli, luz=luzz, ubi= ubii,obser=obserr  WHERE id_salon = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarSalones` (IN `id` INT)  BEGIN
DELETE FROM salones WHERE id_salon = id;
END$$
describe salones;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarSalones` (IN `nom` VARCHAR(45), IN `piza` int, IN `f` VARCHAR(45),
IN `sill` int(45),IN `fs` VARCHAR(45), IN `mes` int(45),IN `fm` VARCHAR(45), IN `pc` int(45), IN `fpc` VARCHAR(45),  IN `proy` int(45), IN `fpro` VARCHAR(45)
,  IN `bBasura` int(45), IN `fbb` VARCHAR(45),  IN `mesaBan` int(45), IN `fmb` VARCHAR(45), IN `clima` VARCHAR(45), IN `luz` VARCHAR(45), IN `ubi` VARCHAR(45), IN `obser` VARCHAR(45))  BEGIN
INSERT INTO salones(CodigoSalon,pizarron,f,silla,fs,mesa,fm,pc,fpc,proyector,fpro, bBasura,fbb,mesaBan, fmb,clima,luz,ubi,obser)
VALUES             (nom,        piza,    f,sill,fs,mes,fm,pc,fpc,proy,fpro,bBasura,fbb,mesaBan,fmb,clima,luz,ubi,obser);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarSalones` (IN `nom` VARCHAR(45))  BEGIN
SELECT * FROM salones WHERE CodigoSalon LIKE CONCAT('%',nom,'%');
END$$

DELIMITER ;

-- ***************************** FIN DE SALONES ********************************************************************************************

 
-- ***************************** INICIO DE USUARIOS ********************************************************************************************
use dbalmacen2;
select * from tblUsuarios;

drop table if exists tblusuarios;
create table tblusuarios ( IdUsuarios int auto_increment, Nombre varchar(200), 
Usuario varchar(45),  numFicha varchar (200) , numControl varchar(200), 
carrera varchar(200),turno varchar(200), puesto varchar(200), 
institucion varchar(200), escuela varchar(200),  Clave varchar(150), 
Perfil varchar(200),primary key (IdUsuarios));

INSERT INTO `dbalmacen2`.`tblUsuarios` (`Nombre`, `Usuario`, `numFicha`,`numControl`, `carrera`,`turno`,`puesto`,`institucion`,`escuela`, `Clave`, `Perfil`) VALUES ('Rafael', 'r', '45','', 'sistemas','','','', '','1', 'Jefe');
INSERT INTO `dbalmacen2`.`tblUsuarios` (`Nombre`, `Usuario`, `numFicha`,`numControl`, `carrera`,`turno`,`puesto`,`institucion`,`escuela`, `Clave`, `Perfil`) VALUES ('andrea', 'a', '12','', 'sistemas','','','', '','2', 'Jefe');
select * from tblusuarios;


DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `editarUsuarios` (IN `id` INT, IN `nom` VARCHAR(45), IN `us` VARCHAR(45), IN `nf` VARCHAR(45),
IN `nc` VARCHAR(45),IN `ca` VARCHAR(45), IN `tu` VARCHAR(45),IN `pu` VARCHAR(45), IN `ins` VARCHAR(45), IN `es` VARCHAR(45),  IN `pas` VARCHAR(45), IN `perf` VARCHAR(45))  BEGIN
UPDATE tblUsuarios SET Nombre=nom, Usuario=us, numFicha= nf,numControl=nc,carrera=ca,turno=tu, puesto=pu,institucion=ins,escuela=es, Clave=pas, Perfil=perf WHERE IdUsuarios = id;
END$$


CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarUsuarios` (IN `id` INT)  BEGIN
DELETE FROM tblUsuarios WHERE IdUsuarios = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarUsuarios` (IN `nom` VARCHAR(45), IN `us` VARCHAR(45), IN `nf` VARCHAR(45),
IN `nc` VARCHAR(45),IN `ca` VARCHAR(45), IN `tu` VARCHAR(45),IN `pu` VARCHAR(45), IN `ins` VARCHAR(45), IN `es` VARCHAR(45),  IN `pas` VARCHAR(45), IN `perf` VARCHAR(45))  BEGIN
INSERT INTO tblUsuarios (Nombre, Usuario, numFicha, numControl,carrera, turno, puesto, institucion, escuela, Clave, Perfil) 
VALUES (nom, us,nf,nc,ca,tu,pu,ins,es ,pas, perf);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `RegistrarUsuarios2` (IN `nom` VARCHAR(45), IN `us` VARCHAR(45), IN `nf` VARCHAR(45),
IN `nc` VARCHAR(45),IN `ca` VARCHAR(45), IN `tu` VARCHAR(45),IN `pu` VARCHAR(45), IN `ins` VARCHAR(45), IN `es` VARCHAR(45), 
 IN `pas` VARCHAR(45), IN `perf` VARCHAR(45) ,IN `idUsu` VARCHAR(45),IN `usua` VARCHAR(45))  BEGIN
INSERT INTO tblUsuarios (Nombre, Usuario, numFicha, numControl,carrera, turno, puesto, institucion, escuela, Clave, Perfil,idUsu,usuarios) 
VALUES (nom, us,nf,nc,ca,tu,pu,ins,es ,pas, perf,idUsu,usua);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarUsuarioJefe` (IN `nom` VARCHAR(45), IN `us` VARCHAR(45), IN `nf` VARCHAR(45),
 IN `car` varchar(45), IN `pas` VARCHAR(45), IN `perf` VARCHAR(45))  BEGIN
INSERT INTO tblUsuarios (Nombre, Usuario, numFicha,carrera, Clave, Perfil) 
VALUES (nom, us,nf,car ,pas, perf);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarUsuarioProfe` (IN `nom` VARCHAR(45), IN `us` VARCHAR(45), IN `nf` VARCHAR(45),
  IN `car` varchar(45), IN `pas` VARCHAR(45), IN `perf` VARCHAR(45))  BEGIN
INSERT INTO tblUsuarios (Nombre, Usuario, numFicha,carrera, Clave, Perfil) 
VALUES (nom, us,nf,car, pas, perf);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarUsuarioSS` (IN `nom` VARCHAR(45), IN `us` VARCHAR(45),
IN `nc` VARCHAR(45),IN `ca` VARCHAR(45), IN `tu` VARCHAR(45), IN `es` VARCHAR(45),  IN `pas` VARCHAR(45), IN `perf` VARCHAR(45))  BEGIN
INSERT INTO tblUsuarios (Nombre, Usuario,  numControl,carrera, turno, escuela, Clave, Perfil) 
VALUES (nom, us,nc,ca,tu,es ,pas, perf);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarUsuarioInvitado` (IN `nom` VARCHAR(45),
 IN `us` VARCHAR(45),IN `pu` VARCHAR(45), IN `ins` VARCHAR(45),  IN `pas` VARCHAR(45), 
 IN `perf` VARCHAR(45))  BEGIN
INSERT INTO tblUsuarios (Nombre, Usuario,puesto, institucion,  Clave, Perfil) 
VALUES (nom, us,pu,ins ,pas, perf);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `loginUsuarios`(in us varchar(45), in contra varchar(45)) BEGIN
Select * from tblusuarios where Usuario = us and Clave = contra;
END$$


CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarUsuarios` (IN `us` VARCHAR(45))  BEGIN
SELECT * FROM tblUsuarios WHERE Usuario LIKE CONCAT('%',us,'%');
END$$








DELIMITER ;

-- --------------------------------------------------------







CREATE TABLE `tblusuarios` (
  `IdUsuarios` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Usuario` varchar(45) NOT NULL,
  `Clave` varchar(45) NOT NULL,
  `Perfil` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tblusuarios`
--

INSERT INTO `tblusuarios` (`IdUsuarios`, `Nombre`, `Usuario`, `Clave`, `Perfil`) VALUES
(1, 'Rafael', 'Rafa', '12345', 'Administrador');


drop table if exists salones;
create table salones( id_salon int auto_increment, codigoSalon varchar(100), pizarron varchar (100), f varchar (10), silla varchar (100),
 fs varchar (10), mesa varchar (100), fm varchar (10), pc varchar (100), fpc varchar (10), proyector varchar (100), fpro varchar (10),
 bBasura varchar (100), fbb varchar (10), mesaBan varchar (100),fmb varchar (10), clima varchar (100), luz varchar (100), ubi varchar(300), obser varchar(200), primary key (id_salon));
select * from salones; 

INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('1', 'FF1', '2', 'Si', '1', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '25', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('2', 'FF2', '2', 'Si', '1', 'Si','1', 'Si', '0', 'Si', '1', 'Si', '1',  'Si','28', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('3', 'FF3', '2', 'Si', '2', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si','25', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('4', 'FF4', '2', 'Si', '1', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '37', 'Si', 'Si', 'Si','1 Piso, Lado Derecho.','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('5', 'FF5', '2', 'Si', '1', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '25', 'Si', 'Si', 'Si','1 Piso, Lado Derecho.','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`)VALUES ('6', 'FF6', '2', 'Si', '1', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '30', 'Si', 'Si', 'Si','1 Piso, Lado Derecho.','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('7', 'FF7', '2', 'Si', '1', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '38', 'Si', 'Si', 'Si','1 Piso, Lado Derecho.','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('8', 'FF8', '3', 'Si', '1', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '24', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo.','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('9', 'FF9', '3', 'Si', '1', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '25', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('10', 'FFA', '2', 'Si', '1', 'Si', '2', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '28', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`)VALUES ('11', 'FFB', '2', 'Si', '1', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '27', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('12', 'FFC', '2', 'Si', '1', 'Si', '1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '30', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');
INSERT INTO `resi`.`salones` (`id_salon`, `codigoSalon`, `pizarron`, `f`, `silla`, `fs`, `mesa`, `fm`, `pc`, `fpc`, `proyector`, `fpro`, `bBasura`, `fbb`, `mesaBan`, `fmb`, `clima`, `luz`, `ubi`, `obser`) VALUES ('13', 'FFD', '2', 'Si', '1', 'Si','1', 'Si', '0', 'Si', '1', 'Si', '1', 'Si', '29', 'Si', 'Si', 'Si','1 Piso, Lado Izquierdo','');

select * from salones; 