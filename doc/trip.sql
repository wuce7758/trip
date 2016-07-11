/*
SQLyog Ultimate v11.24 (64 bit)
MySQL - 5.5.28 : Database - trip
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`trip` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `trip`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `user_name` varchar(50) NOT NULL COMMENT '用户名',
  `pass_word` varchar(64) DEFAULT NULL COMMENT '登录密码',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别',
  `dateline` datetime DEFAULT NULL COMMENT '注册日期',
  `state` tinyint(4) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`uid`,`user_name`,`pass_word`,`sex`,`dateline`,`state`) values (1,'王爵','0B67C089B62B4DE251CB6D2454064D4A',1,'2016-07-11 11:07:07',1),(2,'rose','0B67C089B62B4DE251CB6D2454064D4A',0,'2016-07-06 11:30:01',1),(3,'jack','0B67C089B62B4DE251CB6D2454064D4A',1,'2016-07-15 11:30:14',0),(4,'bill','0B67C089B62B4DE251CB6D2454064D4A',1,'2016-06-16 11:30:25',2),(5,'jelly','0B67C089B62B4DE251CB6D2454064D4A',1,'2016-07-06 11:30:47',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
