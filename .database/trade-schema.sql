CREATE SCHEMA IF NOT EXISTS `trade`;

DROP TABLE IF EXISTS `trade`.`trader`;
CREATE TABLE `trade`.`trader`
(
    `user_id`       BIGINT          NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT 'user PK',

    `name`          VARCHAR(256)    NOT NULL UNIQUE COMMENT '이름',

    `created_at`    DATETIME        NOT NULL COMMENT '생성일시',
    `updated_at`    DATETIME        NOT NULL COMMENT '수정일시',
    `deleted`       BOOL            NOT NULL COMMENT 'Soft Delete 플래그'
)
;