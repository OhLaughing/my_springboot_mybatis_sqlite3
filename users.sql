/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-11-05 21:17:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT ,
  `userName` varchar(32) NOT NULL ,
  `passWord` varchar(32) NOT NULL ,
  `user_sex` varchar(32) NOT NULL ,
  `nick_name` varchar(32)
) ;


CREATE TABLE `users` (
  `id` bigint(20) ,
  `userName` ,
  `passWord` ,
  `user_sex` ,
  `nick_name` ,
  PRIMARY KEY (`id`)
) ;

