/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-04-10 14:41:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_student`
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES ('13', '张三', '2018-04-10');
INSERT INTO `tb_student` VALUES ('14', '张三0', '2018-04-10');
INSERT INTO `tb_student` VALUES ('15', '张三1', '2018-04-10');
INSERT INTO `tb_student` VALUES ('16', '张三2', '2018-04-10');
INSERT INTO `tb_student` VALUES ('17', '张三3', '2018-04-10');
INSERT INTO `tb_student` VALUES ('18', '张三4', '2018-04-10');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `createtime` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'mybatis-plus-ar', '2018-04-10');
INSERT INTO `user` VALUES ('2', 'mybatis-plus-ar', '2018-04-10');
INSERT INTO `user` VALUES ('3', 'mybatis-plus-ar', '2018-04-10');
INSERT INTO `user` VALUES ('4', 'mybatis-plus-ar', '2018-04-10');
INSERT INTO `user` VALUES ('5', 'mybatis-plus-ar', '2018-04-10');

-- ----------------------------
-- Function structure for `cutString`
-- ----------------------------
DROP FUNCTION IF EXISTS `cutString`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `cutString`(`s` varchar(255),`n` int) RETURNS varchar(255) CHARSET utf8
BEGIN
	#Routine body goes here...
IF(ISNULL(s)) THEN RETURN '';  
ELSEIF CHAR_LENGTH(s)<n THEN RETURN s;  
ELSEIF CHAR_LENGTH(S)=n THEN RETURN '相等';  
ELSE RETURN CONCAT(LEFT(s,n),'...');  
END IF;  
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for `f_b_inmoney`
-- ----------------------------
DROP FUNCTION IF EXISTS `f_b_inmoney`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `f_b_inmoney`(`p_bankNO` varchar(6),`p_memberID` varchar(32),`p_merchantsysID` varchar(6),`p_merchantuserID` varchar(20),`p_moneyType` varchar(6),`p_funID` varchar(64),`p_orderNO` varchar(64),`p_amount` double) RETURNS varchar(64) CHARSET latin1
    COMMENT 'v_control number(1);           -- 0 受到双重约束，1不受约束，2受交易日约束，3受交易时间约'
BEGIN
	#Routine body goes here...
	DECLARE v_reNum VARCHAR(64) DEFAULT 0;   
	DECLARE v_control int;           
  DECLARE v_beginTime varchar(8);      
	DECLARE v_endTime varchar(8);        
	DECLARE v_actionid varchar(100);     
	DECLARE v_status int;           
  

	-- 1判断条件   银行状态(0 可用,1 不可用)  单笔最大转账金额、每日最大转账金额、每日最大转账次数 银行起始转账时间 银行结束转账时间

	-- 2生成入金流水表

	RETURN '';
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for `f_b_UpdateFundsFull`
-- ----------------------------
DROP FUNCTION IF EXISTS `f_b_UpdateFundsFull`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `f_b_UpdateFundsFull`(`p_amount` DECIMAL(20,6),`p_memberID` varchar(32),`p_merchantsysID` varchar(6),`p_merchantuserID` varchar(20)) RETURNS decimal(20,2)
BEGIN
	#Routine body goes here...


	RETURN 0;
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for `getdate`
-- ----------------------------
DROP FUNCTION IF EXISTS `getdate`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `getdate`(`gdate` datetime) RETURNS varchar(255) CHARSET utf8
BEGIN
	#Routine body goes here...
DECLARE x VARCHAR(255) DEFAULT '';  
SET x= date_format(gdate,'%Y年%m月%d日%h时%i分%s秒');  
RETURN x;  
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for `test1`
-- ----------------------------
DROP FUNCTION IF EXISTS `test1`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `test1`(`p_test` varchar(20)) RETURNS varchar(64) CHARSET latin1
BEGIN
	#Routine body goes here...
	DECLARE x VARCHAR(255) DEFAULT '';  
	SET x= date_format(gdate,'%Y年%m月%d日%h时%i分%s秒');  
	RETURN x;  
END
;;
DELIMITER ;
