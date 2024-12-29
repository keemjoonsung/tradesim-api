/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.UserSummaryByStatementLatencyRecord

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
open class UserSummaryByStatementLatency(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, UserSummaryByStatementLatencyRecord>?,
    parentPath: InverseForeignKey<out Record, UserSummaryByStatementLatencyRecord>?,
    aliased: Table<UserSummaryByStatementLatencyRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<UserSummaryByStatementLatencyRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `user_summary_by_statement_latency` as select if((`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER` is null),'background',`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER`) AS `user`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`COUNT_STAR`) AS `total`,format_pico_time(sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_TIMER_WAIT`)) AS `total_latency`,format_pico_time(sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`MAX_TIMER_WAIT`)) AS `max_latency`,format_pico_time(sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_LOCK_TIME`)) AS `lock_latency`,format_pico_time(sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_CPU_TIME`)) AS `cpu_latency`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_ROWS_SENT`) AS `rows_sent`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_ROWS_EXAMINED`) AS `rows_examined`,sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_ROWS_AFFECTED`) AS `rows_affected`,(sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_NO_INDEX_USED`) + sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_NO_GOOD_INDEX_USED`)) AS `full_scans` from `performance_schema`.`events_statements_summary_by_user_by_event_name` group by if((`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER` is null),'background',`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER`) order by sum(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_TIMER_WAIT`) desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>sys.user_summary_by_statement_latency</code>
         */
        val USER_SUMMARY_BY_STATEMENT_LATENCY: UserSummaryByStatementLatency = UserSummaryByStatementLatency()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<UserSummaryByStatementLatencyRecord> = UserSummaryByStatementLatencyRecord::class.java

    /**
     * The column <code>sys.user_summary_by_statement_latency.user</code>.
     */
    val USER: TableField<UserSummaryByStatementLatencyRecord, String?> = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "")

    /**
     * The column <code>sys.user_summary_by_statement_latency.total</code>.
     */
    val TOTAL: TableField<UserSummaryByStatementLatencyRecord, BigInteger?> = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.user_summary_by_statement_latency.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<UserSummaryByStatementLatencyRecord, String?> = createField(DSL.name("total_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column
     * <code>sys.user_summary_by_statement_latency.max_latency</code>.
     */
    val MAX_LATENCY: TableField<UserSummaryByStatementLatencyRecord, String?> = createField(DSL.name("max_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column
     * <code>sys.user_summary_by_statement_latency.lock_latency</code>.
     */
    val LOCK_LATENCY: TableField<UserSummaryByStatementLatencyRecord, String?> = createField(DSL.name("lock_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column
     * <code>sys.user_summary_by_statement_latency.cpu_latency</code>.
     */
    val CPU_LATENCY: TableField<UserSummaryByStatementLatencyRecord, String?> = createField(DSL.name("cpu_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.user_summary_by_statement_latency.rows_sent</code>.
     */
    val ROWS_SENT: TableField<UserSummaryByStatementLatencyRecord, BigInteger?> = createField(DSL.name("rows_sent"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.user_summary_by_statement_latency.rows_examined</code>.
     */
    val ROWS_EXAMINED: TableField<UserSummaryByStatementLatencyRecord, BigInteger?> = createField(DSL.name("rows_examined"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column
     * <code>sys.user_summary_by_statement_latency.rows_affected</code>.
     */
    val ROWS_AFFECTED: TableField<UserSummaryByStatementLatencyRecord, BigInteger?> = createField(DSL.name("rows_affected"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.user_summary_by_statement_latency.full_scans</code>.
     */
    val FULL_SCANS: TableField<UserSummaryByStatementLatencyRecord, BigInteger?> = createField(DSL.name("full_scans"), SQLDataType.DECIMAL_INTEGER(43), this, "")

    private constructor(alias: Name, aliased: Table<UserSummaryByStatementLatencyRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<UserSummaryByStatementLatencyRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<UserSummaryByStatementLatencyRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.user_summary_by_statement_latency</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.user_summary_by_statement_latency</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.user_summary_by_statement_latency</code> table
     * reference
     */
    constructor(): this(DSL.name("user_summary_by_statement_latency"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): UserSummaryByStatementLatency = UserSummaryByStatementLatency(DSL.name(alias), this)
    override fun `as`(alias: Name): UserSummaryByStatementLatency = UserSummaryByStatementLatency(alias, this)
    override fun `as`(alias: Table<*>): UserSummaryByStatementLatency = UserSummaryByStatementLatency(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): UserSummaryByStatementLatency = UserSummaryByStatementLatency(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): UserSummaryByStatementLatency = UserSummaryByStatementLatency(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): UserSummaryByStatementLatency = UserSummaryByStatementLatency(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): UserSummaryByStatementLatency = UserSummaryByStatementLatency(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): UserSummaryByStatementLatency = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): UserSummaryByStatementLatency = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): UserSummaryByStatementLatency = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): UserSummaryByStatementLatency = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): UserSummaryByStatementLatency = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): UserSummaryByStatementLatency = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): UserSummaryByStatementLatency = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): UserSummaryByStatementLatency = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): UserSummaryByStatementLatency = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<String?, BigInteger?, String?, String?, String?, String?, BigInteger?, BigInteger?, BigInteger?, BigInteger?> = super.fieldsRow() as Row10<String?, BigInteger?, String?, String?, String?, String?, BigInteger?, BigInteger?, BigInteger?, BigInteger?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, BigInteger?, String?, String?, String?, String?, BigInteger?, BigInteger?, BigInteger?, BigInteger?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, BigInteger?, String?, String?, String?, String?, BigInteger?, BigInteger?, BigInteger?, BigInteger?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
