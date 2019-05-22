/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 21/05/2019 17:59:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '简介',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '内容',
  `author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '作者',
  `release_time` datetime(0) DEFAULT NULL COMMENT '发布时间',
  `source` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '来源',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '新闻表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (1, 'sun', '这是一个太阳', '这个太阳它又大又圆', '李某某', '2019-05-21 17:02:37', '云报');
INSERT INTO `news` VALUES (2, 'test', 'te', 'tw', 'fee', '2019-05-22 17:04:25', 'ee');
INSERT INTO `news` VALUES (3, 'ew', 'q', 'r', 'we', '2019-05-15 17:04:38', 'qe');
INSERT INTO `news` VALUES (4, 'ewq2', 'dwq', 'e2', 'ewqr', '2019-04-29 17:04:50', 'ew');
INSERT INTO `news` VALUES (5, '2ew', 'rq', 'ew', 'rq', '2019-05-01 17:05:04', '2ew');
INSERT INTO `news` VALUES (6, '2w', 'eq', 'ewqr', 'rqwe', '2019-05-15 17:05:15', 'rqs');
INSERT INTO `news` VALUES (7, '2wqq', 'r2', 'we', '21r', '2019-05-17 17:05:27', 'rgg');
INSERT INTO `news` VALUES (8, 'dfg', 'sfw', 'dfe', 'fwq', '2019-04-30 17:05:39', '3rw');
INSERT INTO `news` VALUES (9, 'rqws', 'ss', 'dd', 'ff', '2019-05-07 17:05:51', '22w');
INSERT INTO `news` VALUES (10, 'fe3', '1qq', '2ws', '3ed', '2019-06-01 17:06:06', 'rqw');
INSERT INTO `news` VALUES (11, '2f', 'sw2', 'wr', 'qw', '2019-06-08 17:06:18', '1w');
INSERT INTO `news` VALUES (12, 'w2', '3e', '112w', '24e', '2019-06-06 17:06:31', 'e22');
INSERT INTO `news` VALUES (13, 'e21', '2ew', '12ew', 'w21e', '2019-04-29 17:06:42', 'e2e');

SET FOREIGN_KEY_CHECKS = 1;
