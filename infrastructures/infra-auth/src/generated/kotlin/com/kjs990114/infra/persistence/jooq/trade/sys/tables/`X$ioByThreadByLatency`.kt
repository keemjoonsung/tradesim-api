/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys

import java.math.BigDecimal
import java.math.BigInteger
import java.util.function.Function

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row8
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.SelectField
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
open class `X$ioByThreadByLatency`(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`>?,
    parentPath: InverseForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`>?,
    aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `x\$io_by_thread_by_latency` as select if((`performance_schema`.`threads`.`PROCESSLIST_ID` is null),substring_index(`performance_schema`.`threads`.`NAME`,'/',-(1)),concat(`performance_schema`.`threads`.`PROCESSLIST_USER`,'@',convert(`performance_schema`.`threads`.`PROCESSLIST_HOST` using utf8mb4))) AS `user`,sum(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`COUNT_STAR`) AS `total`,sum(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,min(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`MIN_TIMER_WAIT`) AS `min_latency`,avg(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency`,max(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency`,`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`THREAD_ID` AS `thread_id`,`performance_schema`.`threads`.`PROCESSLIST_ID` AS `processlist_id` from (`performance_schema`.`events_waits_summary_by_thread_by_event_name` left join `performance_schema`.`threads` on((`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`THREAD_ID` = `performance_schema`.`threads`.`THREAD_ID`))) where ((`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`EVENT_NAME` like 'wait/io/file/%') and (`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`SUM_TIMER_WAIT` > 0)) group by `performance_schema`.`events_waits_summary_by_thread_by_event_name`.`THREAD_ID`,`performance_schema`.`threads`.`PROCESSLIST_ID`,`user` order by sum(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`SUM_TIMER_WAIT`) desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$io_by_thread_by_latency</code>
         */
        val `X$IO_BY_THREAD_BY_LATENCY`: `X$ioByThreadByLatency` = `X$ioByThreadByLatency`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`::class.java

    /**
     * The column <code>sys.x$io_by_thread_by_latency.user</code>.
     */
    val USER: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`, String?> = createField(DSL.name("user"), SQLDataType.VARCHAR(288), this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.total</code>.
     */
    val TOTAL: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`, BigInteger?> = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`, BigInteger?> = createField(DSL.name("total_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.min_latency</code>.
     */
    val MIN_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`, ULong?> = createField(DSL.name("min_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.avg_latency</code>.
     */
    val AVG_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`, BigDecimal?> = createField(DSL.name("avg_latency"), SQLDataType.DECIMAL(24, 4), this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.max_latency</code>.
     */
    val MAX_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`, ULong?> = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.thread_id</code>.
     */
    val THREAD_ID: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`, ULong?> = createField(DSL.name("thread_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.processlist_id</code>.
     */
    val PROCESSLIST_ID: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`, ULong?> = createField(DSL.name("processlist_id"), SQLDataType.BIGINTUNSIGNED, this, "")

    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$ioByThreadByLatencyRecord`>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.x$io_by_thread_by_latency</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$io_by_thread_by_latency</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$io_by_thread_by_latency</code> table reference
     */
    constructor(): this(DSL.name("x\$io_by_thread_by_latency"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(alias, this)
    override fun `as`(alias: Table<*>): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): `X$ioByThreadByLatency` = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): `X$ioByThreadByLatency` = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): `X$ioByThreadByLatency` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): `X$ioByThreadByLatency` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): `X$ioByThreadByLatency` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): `X$ioByThreadByLatency` = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): `X$ioByThreadByLatency` = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): `X$ioByThreadByLatency` = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): `X$ioByThreadByLatency` = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row8<String?, BigInteger?, BigInteger?, ULong?, BigDecimal?, ULong?, ULong?, ULong?> = super.fieldsRow() as Row8<String?, BigInteger?, BigInteger?, ULong?, BigDecimal?, ULong?, ULong?, ULong?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, BigInteger?, BigInteger?, ULong?, BigDecimal?, ULong?, ULong?, ULong?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, BigInteger?, BigInteger?, ULong?, BigDecimal?, ULong?, ULong?, ULong?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
