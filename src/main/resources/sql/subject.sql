/*
Navicat MySQL Data Transfer

Source Server         : caojia
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : examination

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-12-06 10:50:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `sys_id` varchar(32) NOT NULL COMMENT '主键',
  `st_num` int(2) DEFAULT NULL COMMENT '题号',
  `st_title` varchar(255) DEFAULT NULL COMMENT '题干',
  `st_option_a` varchar(255) DEFAULT NULL COMMENT 'A选项',
  `st_option_b` varchar(255) DEFAULT NULL COMMENT 'B选项',
  `st_option_c` varchar(255) DEFAULT NULL COMMENT 'C选项',
  `st_option_d` varchar(255) DEFAULT NULL COMMENT 'D选项',
  `st_answer` varchar(255) DEFAULT NULL COMMENT '正确答案',
  `st_parse` varchar(255) DEFAULT NULL COMMENT '试题解析',
  `st_status` varchar(2) DEFAULT NULL COMMENT '状态1正常0删除',
  PRIMARY KEY (`sys_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
