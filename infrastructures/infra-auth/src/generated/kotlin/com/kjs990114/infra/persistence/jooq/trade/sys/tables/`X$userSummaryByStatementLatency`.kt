/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys

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
import org.jooq.Row10
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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class `X$userSummaryByStatementLatency`(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`>?,
    parentPath: InverseForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`>?,
    aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `x\$user_summary_by_statement_latency` as select if((`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER` is null),'background',`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER`) AS `user`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`COUNT_STAR`) AS `total`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_LOCK_TIME`) AS `lock_latency`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_CPU_TIME`) AS `cpu_latency`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_ROWS_SENT`) AS `rows_sent`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_ROWS_EXAMINED`) AS `rows_examined`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_ROWS_AFFECTED`) AS `rows_affected`,(sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_NO_INDEX_USED`) + sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_NO_GOOD_INDEX_USED`)) AS `full_scans` from `performance_schema`.`events_statements_summary_by_user_by_event_name` group by if((`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER` is null),'background',`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER`) order by sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_TIMER_WAIT`) desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>sys.x$user_summary_by_statement_latency</code>
         */
        val `X$USER_SUMMARY_BY_STATEMENT_LATENCY`: `X$userSummaryByStatementLatency` = `X$userSummaryByStatementLatency`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`::class.java

    /**
     * The column <code>sys.x$user_summary_by_statement_latency.user</code>.
     */
    val USER: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`, String?> = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "")

    /**
     * The column <code>sys.x$user_summary_by_statement_latency.total</code>.
     */
    val TOTAL: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`, BigInteger?> = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.x$user_summary_by_statement_latency.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`, BigInteger?> = createField(DSL.name("total_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.x$user_summary_by_statement_latency.max_latency</code>.
     */
    val MAX_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`, BigInteger?> = createField(DSL.name("max_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.x$user_summary_by_statement_latency.lock_latency</code>.
     */
    val LOCK_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`, BigInteger?> = createField(DSL.name("lock_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.x$user_summary_by_statement_latency.cpu_latency</code>.
     */
    val CPU_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`, BigInteger?> = createField(DSL.name("cpu_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.x$user_summary_by_statement_latency.rows_sent</code>.
     */
    val ROWS_SENT: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`, BigInteger?> = createField(DSL.name("rows_sent"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.x$user_summary_by_statement_latency.rows_examined</code>.
     */
    val ROWS_EXAMINED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`, BigInteger?> = createField(DSL.name("rows_examined"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.x$user_summary_by_statement_latency.rows_affected</code>.
     */
    val ROWS_AFFECTED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`, BigInteger?> = createField(DSL.name("rows_affected"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.x$user_summary_by_statement_latency.full_scans</code>.
     */
    val FULL_SCANS: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`, BigInteger?> = createField(DSL.name("full_scans"), SQLDataType.DECIMAL_INTEGER(43), this, "")

    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$userSummaryByStatementLatencyRecord`>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.x$user_summary_by_statement_latency</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$user_summary_by_statement_latency</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$user_summary_by_statement_latency</code> table
     * reference
     */
    constructor(): this(DSL.name("x\$user_summary_by_statement_latency"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): `X$userSummaryByStatementLatency` = `X$userSummaryByStatementLatency`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$userSummaryByStatementLatency` = `X$userSummaryByStatementLatency`(alias, this)
    override fun `as`(alias: Table<*>): `X$userSummaryByStatementLatency` = `X$userSummaryByStatementLatency`(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$userSummaryByStatementLatency` = `X$userSummaryByStatementLatency`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$userSummaryByStatementLatency` = `X$userSummaryByStatementLatency`(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): `X$userSummaryByStatementLatency` = `X$userSummaryByStatementLatency`(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): `X$userSummaryByStatementLatency` = `X$userSummaryByStatementLatency`(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): `X$userSummaryByStatementLatency` = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): `X$userSummaryByStatementLatency` = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): `X$userSummaryByStatementLatency` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): `X$userSummaryByStatementLatency` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): `X$userSummaryByStatementLatency` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): `X$userSummaryByStatementLatency` = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): `X$userSummaryByStatementLatency` = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): `X$userSummaryByStatementLatency` = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): `X$userSummaryByStatementLatency` = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<String?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?> = super.fieldsRow() as Row10<String?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}