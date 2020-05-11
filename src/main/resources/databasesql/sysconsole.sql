/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : sysconsole

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 11/05/2020 09:39:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_func
-- ----------------------------
DROP TABLE IF EXISTS `sys_func`;
CREATE TABLE `sys_func` (
  `seqid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `preId` int(11) DEFAULT NULL,
  `cud_id` varchar(20) DEFAULT NULL,
  `level_f` tinyint(4) DEFAULT NULL COMMENT '模块级别',
  PRIMARY KEY (`seqid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of sys_func
-- ----------------------------
BEGIN;
INSERT INTO `sys_func` VALUES (1, 'ADMINGREET', '/admin/greeting', NULL, NULL, NULL);
INSERT INTO `sys_func` VALUES (2, 'EMPLOYEE', '/employee/*', NULL, NULL, NULL);
INSERT INTO `sys_func` VALUES (3, 'ADMIN', '/admin/**', NULL, NULL, NULL);
INSERT INTO `sys_func` VALUES (4, 'EMPLOYEELOGIN', '/employee/login', NULL, NULL, NULL);
INSERT INTO `sys_func` VALUES (5, 'INDEX', '/index', NULL, NULL, NULL);
INSERT INTO `sys_func` VALUES (6, 'INDEX', '/', NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `seqid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`seqid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
BEGIN;
INSERT INTO `sys_role` VALUES (1, 'ROLE_ADMIN');
INSERT INTO `sys_role` VALUES (2, 'ROLE_EMPLOYEE');
COMMIT;

-- ----------------------------
-- Table structure for sys_role_func
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_func`;
CREATE TABLE `sys_role_func` (
  `seqid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `func_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`seqid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of sys_role_func
-- ----------------------------
BEGIN;
INSERT INTO `sys_role_func` VALUES (1, '无', 1, 1);
INSERT INTO `sys_role_func` VALUES (2, NULL, 1, 2);
INSERT INTO `sys_role_func` VALUES (3, NULL, 1, 5);
INSERT INTO `sys_role_func` VALUES (4, NULL, 1, 6);
COMMIT;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `seqid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `role_name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`seqid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_user` VALUES (1, 'admin', 1, 'ROLE_ADMIN', '123456');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
