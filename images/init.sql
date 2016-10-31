/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.6.31 : Database - warau
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`warau` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `warau`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `cipher` char(16) DEFAULT NULL,
  `nickName` varchar(12) CHARACTER SET utf8 DEFAULT NULL,
  `head` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `lv` int(11) DEFAULT NULL,
  `content` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `account` */

insert  into `account`(`id`,`cipher`,`nickName`,`head`,`lv`,`content`) values (1070550684,'123456','warau','Image/Head/184_100.gif',10,'warau'),(1070550685,'123456','雨','Image/Head/185_100.gif',0,'更加努力吧'),(1070550686,'123456','理想','Image/Head/186_100.gif',0,'更加努力吧'),(1070550687,'123456','梦想','Image/Head/182_100.gif',0,'更加努力吧'),(1070550688,'123456','愿望','Image/Head/183_100.gif',0,'更加努力吧');

/*Table structure for table `friendgroups` */

DROP TABLE IF EXISTS `friendgroups`;

CREATE TABLE `friendgroups` (
  `genusId` int(11) DEFAULT NULL,
  `friendGroup` varchar(10) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`friendGroup`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `friendgroups` */

insert  into `friendgroups`(`genusId`,`friendGroup`) values (1070550685,'恩'),(1070550685,'我的好友'),(1070550684,'组1'),(1070550684,'组2'),(1070550684,'组3');

/*Table structure for table `friends` */

DROP TABLE IF EXISTS `friends`;

CREATE TABLE `friends` (
  `genusId` int(11) DEFAULT NULL,
  `genusGroup` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `friendId` int(11) DEFAULT NULL,
  `remarks` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `hasUpdate` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `friends` */

insert  into `friends`(`genusId`,`genusGroup`,`friendId`,`remarks`,`hasUpdate`) values (1070550684,'组1',1070550685,'.....',0),(1070550684,'组1',1070550686,'milai',0),(1070550684,'组2',1070550687,'ss',0),(1070550685,'我的好友',1070550684,'zz',1),(1070550685,'我的好友',1070550686,'ff',0),(1070550685,'我的好友',1070550687,'gg',0),(1070550685,'恩',1070550688,'kk',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
