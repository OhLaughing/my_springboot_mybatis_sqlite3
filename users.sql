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

insert into users (userName, passWord, user_sex, nick_name) values ("name1", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name2", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name3", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name4", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name5", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name6", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name7", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name8", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name9", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name10", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name11", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name12", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name13", "abcd", "MAN", "nickname1111");
insert into users (userName, passWord, user_sex, nick_name) values ("name14", "abcd", "MAN", "nickname1111");


CREATE TABLE OMMBSERVER (
  OMMBID integer PRIMARY KEY AUTOINCREMENT,
  IP char(10) NOT NULL,
  FTPUSER char(10) NOT NULL ,
  FTPPORT INTEGER(5) NOT NULL ,
  FTPPASSWORD char(10) NOT NULL ,
  TELNETUSER char(10) NOT NULL  ,
  TELNETPORT INTEGER(5) NOT NULL  ,
  DATAVERSION varchar(2000) NOT NULL,
  TELNETPASSWORD char(10),
  OMMBVERSION CHAR(50) NOT NULL ,
  STATUS CHAR(10)
);
