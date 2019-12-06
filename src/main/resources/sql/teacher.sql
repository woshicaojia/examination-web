/*
Navicat MySQL Data Transfer

Source Server         : caojia
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : examination

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-12-06 10:51:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `sys_id` varchar(32) NOT NULL COMMENT '主键',
  `teacher_id` varchar(16) DEFAULT NULL COMMENT '教师Id',
  `teacher_name` varchar(32) DEFAULT NULL COMMENT '教师姓名',
  `teacher_sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `teacher__pic` varchar(255) DEFAULT NULL COMMENT '头像',
  `student_id` varchar(16) DEFAULT NULL COMMENT '管理学生id',
  PRIMARY KEY (`sys_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
