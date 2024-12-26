CREATE SCHEMA IF NOT EXISTS 'trade_auth';

DROP TABLE IF EXISTS `trade_auth`.`user`;
CREATE TABLE `trade_auth`.`user`
(
    `id`            BIGTINT         NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT 'PK',

    `identifier`    VARCHAR(256)    NOT NULL COMMENT 'ID(이메일)',
    `password`      VARCHAR(256)    NOT NULL COMMENT '비밀번호',
    `withdrawn`     BOOL            NOT NULL DEFAULT FALSE COMMENT '회원 탈퇴 여부',
    `role`          VARCHAR(64)     NOT NULL COMMENT 'ROLE',

    `created_at`    DATETIME        NOT NULL COMMENT '생성일시',
    `updated_by`    DATETIME        NOT NULL COMMENT '수정일시',
)
;

DROP TABLE IF EXISTS `trade_auth`.`user_token`;
CREATE TABLE `trade_auth`.`user_token`
(
    `id`              BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT 'PK',
    `user_id`         BIGINT       NOT NULL COMMENT 'user PK',

    `access_token`    VARCHAR(256) NOT NULL COMMENT 'access token',
    `access_expired`  DATETIME     NOT NULL COMMENT 'access token 만료일시',
    `refresh_token`   VARCHAR(256) NOT NULL COMMENT 'refresh token',
    `refresh_expired` DATETIME     NOT NULL COMMENT 'refresh token 만료일시',

    `created_at`      DATETIME     NOT NULL COMMENT '생성일시',
    `updated_at`      DATETIME     NOT NULL COMMENT '수정일시',

    INDEX `IDX_user_token_001` (`user_id` ASC)
)
;