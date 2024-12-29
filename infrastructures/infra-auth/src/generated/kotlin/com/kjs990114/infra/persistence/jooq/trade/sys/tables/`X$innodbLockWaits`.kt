/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys

import java.time.LocalDateTime
import java.time.LocalTime

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class `X$innodbLockWaits`(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`>?,
    parentPath: InverseForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`>?,
    aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `x\$innodb_lock_waits` as select `r`.`trx_wait_started` AS `wait_started`,timediff(now(),`r`.`trx_wait_started`) AS `wait_age`,timestampdiff(SECOND,`r`.`trx_wait_started`,now()) AS `wait_age_secs`,concat(`sys`.`quote_identifier`(`rl`.`OBJECT_SCHEMA`),'.',`sys`.`quote_identifier`(`rl`.`OBJECT_NAME`)) AS `locked_table`,`rl`.`OBJECT_SCHEMA` AS `locked_table_schema`,`rl`.`OBJECT_NAME` AS `locked_table_name`,`rl`.`PARTITION_NAME` AS `locked_table_partition`,`rl`.`SUBPARTITION_NAME` AS `locked_table_subpartition`,`rl`.`INDEX_NAME` AS `locked_index`,`rl`.`LOCK_TYPE` AS `locked_type`,`r`.`trx_id` AS `waiting_trx_id`,`r`.`trx_started` AS `waiting_trx_started`,timediff(now(),`r`.`trx_started`) AS `waiting_trx_age`,`r`.`trx_rows_locked` AS `waiting_trx_rows_locked`,`r`.`trx_rows_modified` AS `waiting_trx_rows_modified`,`r`.`trx_mysql_thread_id` AS `waiting_pid`,`r`.`trx_query` AS `waiting_query`,`rl`.`ENGINE_LOCK_ID` AS `waiting_lock_id`,`rl`.`LOCK_MODE` AS `waiting_lock_mode`,`b`.`trx_id` AS `blocking_trx_id`,`b`.`trx_mysql_thread_id` AS `blocking_pid`,`b`.`trx_query` AS `blocking_query`,`bl`.`ENGINE_LOCK_ID` AS `blocking_lock_id`,`bl`.`LOCK_MODE` AS `blocking_lock_mode`,`b`.`trx_started` AS `blocking_trx_started`,timediff(now(),`b`.`trx_started`) AS `blocking_trx_age`,`b`.`trx_rows_locked` AS `blocking_trx_rows_locked`,`b`.`trx_rows_modified` AS `blocking_trx_rows_modified`,concat('KILL QUERY ',`b`.`trx_mysql_thread_id`) AS `sql_kill_blocking_query`,concat('KILL ',`b`.`trx_mysql_thread_id`) AS `sql_kill_blocking_connection` from ((((`performance_schema`.`data_lock_waits` `w` join `information_schema`.`INNODB_TRX` `b` on((`b`.`trx_id` = cast(`w`.`BLOCKING_ENGINE_TRANSACTION_ID` as char charset utf8mb4)))) join `information_schema`.`INNODB_TRX` `r` on((`r`.`trx_id` = cast(`w`.`REQUESTING_ENGINE_TRANSACTION_ID` as char charset utf8mb4)))) join `performance_schema`.`data_locks` `bl` on((`bl`.`ENGINE_LOCK_ID` = `w`.`BLOCKING_ENGINE_LOCK_ID`))) join `performance_schema`.`data_locks` `rl` on((`rl`.`ENGINE_LOCK_ID` = `w`.`REQUESTING_ENGINE_LOCK_ID`))) order by `r`.`trx_wait_started`"),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$innodb_lock_waits</code>
         */
        val `X$INNODB_LOCK_WAITS`: `X$innodbLockWaits` = `X$innodbLockWaits`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`::class.java

    /**
     * The column <code>sys.x$innodb_lock_waits.wait_started</code>.
     */
    val WAIT_STARTED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, LocalDateTime?> = createField(DSL.name("wait_started"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.wait_age</code>.
     */
    val WAIT_AGE: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, LocalTime?> = createField(DSL.name("wait_age"), SQLDataType.LOCALTIME, this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.wait_age_secs</code>.
     */
    val WAIT_AGE_SECS: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, Long?> = createField(DSL.name("wait_age_secs"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.locked_table</code>.
     */
    val LOCKED_TABLE: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("locked_table"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.locked_table_schema</code>.
     */
    val LOCKED_TABLE_SCHEMA: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("locked_table_schema"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.locked_table_name</code>.
     */
    val LOCKED_TABLE_NAME: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("locked_table_name"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.locked_table_partition</code>.
     */
    val LOCKED_TABLE_PARTITION: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("locked_table_partition"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>sys.x$innodb_lock_waits.locked_table_subpartition</code>.
     */
    val LOCKED_TABLE_SUBPARTITION: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("locked_table_subpartition"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.locked_index</code>.
     */
    val LOCKED_INDEX: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("locked_index"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.locked_type</code>.
     */
    val LOCKED_TYPE: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("locked_type"), SQLDataType.VARCHAR(32).nullable(false), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.waiting_trx_id</code>.
     */
    val WAITING_TRX_ID: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, ULong?> = createField(DSL.name("waiting_trx_id"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.waiting_trx_started</code>.
     */
    val WAITING_TRX_STARTED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, LocalDateTime?> = createField(DSL.name("waiting_trx_started"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.waiting_trx_age</code>.
     */
    val WAITING_TRX_AGE: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, LocalTime?> = createField(DSL.name("waiting_trx_age"), SQLDataType.LOCALTIME, this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.waiting_trx_rows_locked</code>.
     */
    val WAITING_TRX_ROWS_LOCKED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, ULong?> = createField(DSL.name("waiting_trx_rows_locked"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>sys.x$innodb_lock_waits.waiting_trx_rows_modified</code>.
     */
    val WAITING_TRX_ROWS_MODIFIED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, ULong?> = createField(DSL.name("waiting_trx_rows_modified"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.waiting_pid</code>.
     */
    val WAITING_PID: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, ULong?> = createField(DSL.name("waiting_pid"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.waiting_query</code>.
     */
    val WAITING_QUERY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("waiting_query"), SQLDataType.VARCHAR(1024), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.waiting_lock_id</code>.
     */
    val WAITING_LOCK_ID: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("waiting_lock_id"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.waiting_lock_mode</code>.
     */
    val WAITING_LOCK_MODE: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("waiting_lock_mode"), SQLDataType.VARCHAR(32).nullable(false), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.blocking_trx_id</code>.
     */
    val BLOCKING_TRX_ID: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, ULong?> = createField(DSL.name("blocking_trx_id"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.blocking_pid</code>.
     */
    val BLOCKING_PID: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, ULong?> = createField(DSL.name("blocking_pid"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.blocking_query</code>.
     */
    val BLOCKING_QUERY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("blocking_query"), SQLDataType.VARCHAR(1024), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.blocking_lock_id</code>.
     */
    val BLOCKING_LOCK_ID: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("blocking_lock_id"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.blocking_lock_mode</code>.
     */
    val BLOCKING_LOCK_MODE: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("blocking_lock_mode"), SQLDataType.VARCHAR(32).nullable(false), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.blocking_trx_started</code>.
     */
    val BLOCKING_TRX_STARTED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, LocalDateTime?> = createField(DSL.name("blocking_trx_started"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.blocking_trx_age</code>.
     */
    val BLOCKING_TRX_AGE: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, LocalTime?> = createField(DSL.name("blocking_trx_age"), SQLDataType.LOCALTIME, this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.blocking_trx_rows_locked</code>.
     */
    val BLOCKING_TRX_ROWS_LOCKED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, ULong?> = createField(DSL.name("blocking_trx_rows_locked"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>sys.x$innodb_lock_waits.blocking_trx_rows_modified</code>.
     */
    val BLOCKING_TRX_ROWS_MODIFIED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, ULong?> = createField(DSL.name("blocking_trx_rows_modified"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>sys.x$innodb_lock_waits.sql_kill_blocking_query</code>.
     */
    val SQL_KILL_BLOCKING_QUERY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("sql_kill_blocking_query"), SQLDataType.VARCHAR(33).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>sys.x$innodb_lock_waits.sql_kill_blocking_connection</code>.
     */
    val SQL_KILL_BLOCKING_CONNECTION: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`, String?> = createField(DSL.name("sql_kill_blocking_connection"), SQLDataType.VARCHAR(27).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$innodbLockWaitsRecord`>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.x$innodb_lock_waits</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$innodb_lock_waits</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$innodb_lock_waits</code> table reference
     */
    constructor(): this(DSL.name("x\$innodb_lock_waits"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): `X$innodbLockWaits` = `X$innodbLockWaits`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$innodbLockWaits` = `X$innodbLockWaits`(alias, this)
    override fun `as`(alias: Table<*>): `X$innodbLockWaits` = `X$innodbLockWaits`(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$innodbLockWaits` = `X$innodbLockWaits`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$innodbLockWaits` = `X$innodbLockWaits`(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): `X$innodbLockWaits` = `X$innodbLockWaits`(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): `X$innodbLockWaits` = `X$innodbLockWaits`(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): `X$innodbLockWaits` = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): `X$innodbLockWaits` = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): `X$innodbLockWaits` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): `X$innodbLockWaits` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): `X$innodbLockWaits` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): `X$innodbLockWaits` = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): `X$innodbLockWaits` = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): `X$innodbLockWaits` = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): `X$innodbLockWaits` = where(DSL.notExists(select))
}