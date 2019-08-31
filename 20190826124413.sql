/*
MySQL Backup
Database: testa
Backup Time: 2019-08-26 12:44:13
*/

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `testa`.`note_talk`;
DROP TABLE IF EXISTS `testa`.`user_info`;
DROP TABLE IF EXISTS `testa`.`user_note`;
CREATE TABLE `note_talk` (
  `id` int(12) NOT NULL,
  `talker_account` varchar(255) NOT NULL COMMENT '留言者邮箱（账户）',
  `talker_nick` varchar(255) NOT NULL COMMENT '留言者昵称',
  `talk_body` varchar(255) NOT NULL COMMENT '留言内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE `user_info` (
  `id` int(6) NOT NULL,
  `user_name` varchar(32) NOT NULL COMMENT '邮箱',
  `user_password` varchar(16) NOT NULL COMMENT '密码',
  `user_level` int(2) DEFAULT NULL COMMENT '用户等级',
  `user_nick` varchar(12) NOT NULL COMMENT '昵称',
  `user_notes` int(11) DEFAULT NULL COMMENT '用户笔记',
  `user_status` int(2) unsigned zerofill NOT NULL COMMENT '用户是否登陆',
  PRIMARY KEY (`id`,`user_name`),
  KEY `note` (`user_notes`),
  CONSTRAINT `note` FOREIGN KEY (`user_notes`) REFERENCES `user_note` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE `user_note` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `note_title` varchar(50) NOT NULL COMMENT '笔记标题 ',
  `note_body` varchar(10000) NOT NULL COMMENT '笔记内容',
  `note_time` datetime NOT NULL COMMENT '发布时间',
  `note_status` int(12) unsigned zerofill NOT NULL COMMENT '文章状态',
  `note_level` int(12) NOT NULL COMMENT '文章等级（公开或私有）',
  PRIMARY KEY (`id`),
  CONSTRAINT `talk` FOREIGN KEY (`id`) REFERENCES `note_talk` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
BEGIN;
LOCK TABLES `testa`.`note_talk` WRITE;
DELETE FROM `testa`.`note_talk`;
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `testa`.`user_info` WRITE;
DELETE FROM `testa`.`user_info`;
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `testa`.`user_note` WRITE;
DELETE FROM `testa`.`user_note`;
UNLOCK TABLES;
COMMIT;
