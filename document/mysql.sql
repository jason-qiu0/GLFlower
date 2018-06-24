/*
SQLyog v10.2 
MySQL - 5.7.3-m13 : Database - mysql
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mysql` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mysql`;

/*Table structure for table `tbl_bank_info` */

DROP TABLE IF EXISTS `tbl_bank_info`;

CREATE TABLE `tbl_bank_info` (
  `phone` varchar(100) NOT NULL COMMENT '手机号',
  `IDCard` varchar(100) DEFAULT NULL COMMENT '身份证',
  `bankAccount` varchar(100) DEFAULT NULL COMMENT '银行卡号',
  `bank` varchar(100) DEFAULT NULL COMMENT '银行',
  `subBank` varchar(100) DEFAULT NULL COMMENT '分行',
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_bank_info` */

insert  into `tbl_bank_info`(`phone`,`IDCard`,`bankAccount`,`bank`,`subBank`) values ('1234',NULL,NULL,NULL,NULL),('15071288878',NULL,'12345','12345','12345'),('1867401329',NULL,'12345','12345','12345'),('18986131293','429005199002208817','664644464646464646','招商银行','光谷支行');

/*Table structure for table `tbl_bank_info_base` */

DROP TABLE IF EXISTS `tbl_bank_info_base`;

CREATE TABLE `tbl_bank_info_base` (
  `phone` varchar(20) NOT NULL,
  `bankAccount` varchar(50) DEFAULT NULL,
  `bank` varchar(100) DEFAULT NULL,
  `subBank` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_bank_info_base` */

/*Table structure for table `tbl_company_info_base` */

DROP TABLE IF EXISTS `tbl_company_info_base`;

CREATE TABLE `tbl_company_info_base` (
  `phone` varchar(11) NOT NULL,
  `companyName` varchar(100) DEFAULT NULL,
  `companyAddress` varchar(100) DEFAULT NULL,
  `companyLeaderPhone` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_company_info_base` */

/*Table structure for table `tbl_login_info` */

DROP TABLE IF EXISTS `tbl_login_info`;

CREATE TABLE `tbl_login_info` (
  `LoginName` varchar(50) DEFAULT NULL COMMENT '登录用户名',
  `LoginPwd` varchar(50) DEFAULT NULL COMMENT '登录密码',
  `IsLocked` varchar(2) DEFAULT NULL COMMENT '是否锁定',
  `LoginIP` varchar(50) DEFAULT NULL COMMENT '登录IP',
  `LockTime` varchar(10) DEFAULT NULL COMMENT '锁定时长',
  `token` varchar(50) DEFAULT NULL,
  `clientId` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `imei` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_login_info` */

insert  into `tbl_login_info`(`LoginName`,`LoginPwd`,`IsLocked`,`LoginIP`,`LockTime`,`token`,`clientId`,`phone`,`imei`) values ('18986131293','123456789',NULL,NULL,NULL,NULL,NULL,NULL,'1234567'),('18674013249','12345678',NULL,NULL,NULL,NULL,NULL,NULL,'18986131293'),('13538284765','123456789',NULL,NULL,NULL,NULL,NULL,NULL,'111111'),(NULL,'123456789',NULL,NULL,NULL,NULL,NULL,'13538284766',NULL),(NULL,'123456',NULL,NULL,NULL,NULL,NULL,'18986131293',NULL);

/*Table structure for table `tbl_payment_detail` */

DROP TABLE IF EXISTS `tbl_payment_detail`;

CREATE TABLE `tbl_payment_detail` (
  `phone` varchar(100) DEFAULT NULL COMMENT '手机号码',
  `IDCard` varchar(100) DEFAULT NULL COMMENT '身份证',
  `packages` varchar(100) DEFAULT NULL COMMENT '套餐',
  `period` varchar(50) DEFAULT NULL COMMENT '周期',
  `serviceCharge` varchar(10) DEFAULT NULL COMMENT '服务费',
  `State` varchar(2) DEFAULT NULL COMMENT '状态(0:待审核、1:已审核、2:已放款、3:待还款、4:已逾期、5:逾期还款)',
  `OverdueFine` varchar(10) DEFAULT NULL COMMENT '滞纳金',
  `ApplyTime` varchar(20) DEFAULT NULL COMMENT '申请时间',
  `LendingTime` varchar(20) DEFAULT NULL COMMENT '放款时间',
  `LastRepaymentTime` varchar(20) DEFAULT NULL COMMENT '最后还款时间',
  `RealRepaymentTime` varchar(20) DEFAULT NULL COMMENT '实际还款时间',
  `RepaymentBank` varchar(100) DEFAULT NULL COMMENT '还款银行',
  `RepaymentRemark` varchar(100) DEFAULT NULL COMMENT '还款备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_payment_detail` */

insert  into `tbl_payment_detail`(`phone`,`IDCard`,`packages`,`period`,`serviceCharge`,`State`,`OverdueFine`,`ApplyTime`,`LendingTime`,`LastRepaymentTime`,`RealRepaymentTime`,`RepaymentBank`,`RepaymentRemark`) values ('2',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('3',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('4',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('5',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('6',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('7',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('8',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('9',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('10',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('11',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('12',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('13',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('14',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('15',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('16',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('17',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('19',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('18',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('20',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-27 20:01:33',NULL,NULL,NULL,NULL,NULL),('20',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-3 20:01:33',NULL,NULL,NULL,NULL,NULL),('20',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-4 20:01:33',NULL,NULL,NULL,NULL,NULL),('20',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-14 20:01:33',NULL,NULL,NULL,NULL,NULL),('20',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-5 20:01:33',NULL,NULL,NULL,NULL,NULL),('20',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-24 20:01:33',NULL,NULL,NULL,NULL,NULL),('20',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-6 20:01:33',NULL,NULL,NULL,NULL,NULL),('20',NULL,NULL,NULL,NULL,NULL,NULL,'2018-03-7 20:01:33',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `tbl_reputation_detail` */

DROP TABLE IF EXISTS `tbl_reputation_detail`;

CREATE TABLE `tbl_reputation_detail` (
  `phone` varchar(50) NOT NULL,
  `IDCard` varchar(50) DEFAULT NULL,
  `AlipayAccount` varchar(50) DEFAULT NULL COMMENT '支付宝账号',
  `AlipayPwd` varchar(50) DEFAULT NULL COMMENT '支付宝密码',
  `AlipayAuth` varchar(2) DEFAULT NULL COMMENT '支付宝授权(0:未授权、1:已授权)，用户点了按钮就表示授权',
  `JDAccount` varchar(50) DEFAULT NULL COMMENT '京东账号',
  `JDPwd` varchar(50) DEFAULT NULL COMMENT '京东密码',
  `JDAuth` varchar(50) DEFAULT NULL COMMENT '京东授权(0:未授权、1:已授权)，用户点了按钮就表示授权',
  `chsiAccount` varchar(50) DEFAULT NULL COMMENT '学信网账号',
  `chsiPwd` varchar(50) DEFAULT NULL COMMENT '学信网密码（不要保存,APP显示为****）',
  `flag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_reputation_detail` */

insert  into `tbl_reputation_detail`(`phone`,`IDCard`,`AlipayAccount`,`AlipayPwd`,`AlipayAuth`,`JDAccount`,`JDPwd`,`JDAuth`,`chsiAccount`,`chsiPwd`,`flag`) values ('',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0'),('1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1'),('11',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1'),('1234',NULL,'1234',NULL,NULL,'1234',NULL,NULL,NULL,NULL,'1'),('18986131293',NULL,'Alipay',NULL,NULL,'18986131293',NULL,NULL,NULL,NULL,'1'),('2',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1'),('3',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1'),('5',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1');

/*Table structure for table `tbl_user_contacts` */

DROP TABLE IF EXISTS `tbl_user_contacts`;

CREATE TABLE `tbl_user_contacts` (
  `phone` varchar(100) NOT NULL COMMENT '手机号码',
  `IDCard` varchar(100) DEFAULT NULL COMMENT '身份证号码',
  `contactName1` varchar(100) DEFAULT NULL COMMENT '联系人',
  `relation1` varchar(100) DEFAULT NULL COMMENT '关系',
  `contactPhone1` varchar(50) DEFAULT NULL COMMENT '联系人电话',
  `contactName2` varchar(50) DEFAULT NULL,
  `relation2` varchar(50) DEFAULT NULL,
  `contactPhone2` varchar(50) DEFAULT NULL,
  `vendorPwd` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_user_contacts` */

insert  into `tbl_user_contacts`(`phone`,`IDCard`,`contactName1`,`relation1`,`contactPhone1`,`contactName2`,`relation2`,`contactPhone2`,`vendorPwd`) values ('18674013249','429005199002208817','张三','朋友','1553838980',NULL,NULL,NULL,NULL),('18986131293',NULL,'张三三','父母','13538284761','王五五','同事','13538284762',NULL);

/*Table structure for table `tbl_user_contacts_base` */

DROP TABLE IF EXISTS `tbl_user_contacts_base`;

CREATE TABLE `tbl_user_contacts_base` (
  `phone` varchar(11) NOT NULL,
  `contactName1` varchar(50) DEFAULT NULL,
  `contactPhone1` varchar(11) DEFAULT NULL,
  `contactName2` varchar(50) DEFAULT NULL,
  `contactPhone2` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_user_contacts_base` */

insert  into `tbl_user_contacts_base`(`phone`,`contactName1`,`contactPhone1`,`contactName2`,`contactPhone2`) values ('1234',NULL,NULL,NULL,NULL);

/*Table structure for table `tbl_user_info` */

DROP TABLE IF EXISTS `tbl_user_info`;

CREATE TABLE `tbl_user_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增长',
  `name` varchar(240) DEFAULT NULL COMMENT '姓名',
  `phone` varchar(100) DEFAULT NULL COMMENT '手机号',
  `IDCard` varchar(100) DEFAULT NULL COMMENT '身份证号',
  `school` varchar(240) DEFAULT NULL COMMENT '学校',
  `schoolAddr` varchar(240) DEFAULT NULL COMMENT '学校地址',
  `education` varchar(100) DEFAULT NULL COMMENT '学历',
  `qq` varchar(100) DEFAULT NULL COMMENT 'qq号码',
  `webchat` varchar(100) DEFAULT NULL COMMENT '微信号码',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

/*Data for the table `tbl_user_info` */

insert  into `tbl_user_info`(`ID`,`name`,`phone`,`IDCard`,`school`,`schoolAddr`,`education`,`qq`,`webchat`) values (1,'陈靖','8','89898989898989898989','无哈可以极大','大多数爱迪生撒','大飒飒','432423423423','大神'),(2,'陈一','9','1234','1234','123','123','123','123'),(3,'陈二','10','429005199002208817','wuhan武汉keji武汉科技武汉科技大学','12345','124567','123','123456'),(4,'陈三','11','8989089089089089089080','武汉武汉无k武汉无','aadsdas','ad','2121331113','s'),(5,'陈四','12','4200198509272514','传媒学院','3栋108室','本科','100200300',NULL),(50,'陈无','13','429005199002208817','wuhan武汉keji武汉科技武汉科技大学','12345','124567','123','123456'),(51,'陈6','1',NULL,NULL,NULL,NULL,NULL,NULL),(52,'陈7','2',NULL,NULL,NULL,NULL,NULL,NULL),(53,'陈8','3',NULL,NULL,NULL,NULL,NULL,NULL),(54,'陈9','4',NULL,NULL,NULL,NULL,NULL,NULL),(55,'陈10','5',NULL,NULL,NULL,NULL,NULL,NULL),(56,'陈11','6',NULL,NULL,NULL,NULL,NULL,NULL),(57,'陈12','7',NULL,NULL,NULL,NULL,NULL,NULL),(58,'陈14','14',NULL,NULL,NULL,NULL,NULL,NULL),(59,'陈15','15',NULL,NULL,NULL,NULL,NULL,NULL),(60,'陈16','16',NULL,NULL,NULL,NULL,NULL,NULL),(61,'陈17','17',NULL,NULL,NULL,NULL,NULL,NULL),(62,'陈18','18',NULL,NULL,NULL,NULL,NULL,NULL),(63,'陈19','19',NULL,NULL,NULL,NULL,NULL,NULL),(64,'陈20','20',NULL,NULL,NULL,NULL,NULL,NULL),(65,'陈21','21',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `tbl_user_info_base` */

DROP TABLE IF EXISTS `tbl_user_info_base`;

CREATE TABLE `tbl_user_info_base` (
  `phone` varchar(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `idCard` varchar(50) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `webChat` varchar(50) DEFAULT NULL,
  `chsiAccount` varchar(50) DEFAULT NULL,
  `chsiPwd` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_user_info_base` */

/*Table structure for table `tbl_user_reputation_base` */

DROP TABLE IF EXISTS `tbl_user_reputation_base`;

CREATE TABLE `tbl_user_reputation_base` (
  `phone` varchar(11) NOT NULL,
  `AlipayAccount` varchar(50) DEFAULT NULL,
  `AlipayPwd` varchar(50) DEFAULT NULL,
  `AlipayAuthFlag` varchar(2) DEFAULT NULL,
  `JDAccount` varchar(50) DEFAULT NULL,
  `JDPwd` varchar(50) DEFAULT NULL,
  `JDAuthFlag` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_user_reputation_base` */

insert  into `tbl_user_reputation_base`(`phone`,`AlipayAccount`,`AlipayPwd`,`AlipayAuthFlag`,`JDAccount`,`JDPwd`,`JDAuthFlag`) values ('1234',NULL,NULL,NULL,NULL,NULL,NULL),('1234w',NULL,NULL,NULL,NULL,NULL,NULL),('12324w',NULL,NULL,NULL,NULL,NULL,NULL),('123234w',NULL,NULL,NULL,NULL,NULL,NULL),('1232324w',NULL,NULL,NULL,NULL,NULL,NULL),('12323224w','wuhan','zhongguo','1',NULL,NULL,NULL),('123232w24w','wuhan','zhongguo','1',NULL,NULL,NULL),('1232322w24w','wuhan','zhongguo','1',NULL,NULL,NULL),('1232334w','wuhan','zhongguo','1',NULL,NULL,NULL),('12323334w',NULL,'zhongguo','1',NULL,NULL,NULL),('123233234w','wuhan','zhongguo','1',NULL,NULL,NULL),('1232333234w','wuhan','zhongguo','1','zhongguo','222','2');

/*Table structure for table `tbl_verify_code` */

DROP TABLE IF EXISTS `tbl_verify_code`;

CREATE TABLE `tbl_verify_code` (
  `phone` varchar(50) DEFAULT NULL,
  `idCard` varchar(50) DEFAULT NULL,
  `verifyCode` varchar(50) DEFAULT NULL,
  `imeiVerifyCode` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_verify_code` */

insert  into `tbl_verify_code`(`phone`,`idCard`,`verifyCode`,`imeiVerifyCode`) values ('18986131293',NULL,'103520','1521391183219'),('18674013249',NULL,'152835','1529730783681');

/*Table structure for table `tbl_web_userinfo` */

DROP TABLE IF EXISTS `tbl_web_userinfo`;

CREATE TABLE `tbl_web_userinfo` (
  `account` varchar(100) DEFAULT NULL COMMENT '登录账号',
  `password` varchar(100) DEFAULT NULL COMMENT '登录密码',
  `role` varchar(30) DEFAULT NULL COMMENT '角色（管理员、普通工作人员）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_web_userinfo` */

insert  into `tbl_web_userinfo`(`account`,`password`,`role`) values ('admin','123456','管理员'),('supadmin','888888','超级管理员');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
