/*
Navicat MySQL Data Transfer

Source Server         : caojia
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : examination

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-12-06 10:50:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sys_id` varchar(32) NOT NULL COMMENT '主键',
  `student_id` varchar(16) DEFAULT NULL COMMENT '学生账号',
  `student_name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `student_sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `s_class` varchar(8) DEFAULT NULL COMMENT '所在班级',
  `s_picture` varchar(255) DEFAULT NULL COMMENT '头像',
  `teacher_id` varchar(16) DEFAULT NULL COMMENT '班主任id',
  `create_time` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `s_status` varchar(2) DEFAULT NULL COMMENT '状态1正常0删除',
  PRIMARY KEY (`sys_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
