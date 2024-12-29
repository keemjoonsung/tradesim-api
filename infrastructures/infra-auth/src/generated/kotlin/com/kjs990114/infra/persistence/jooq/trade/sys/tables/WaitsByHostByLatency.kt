/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.WaitsByHostByLatencyRecord

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
import org.jooq.Row6
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
open class WaitsByHostByLatency(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, WaitsByHostByLatencyRecord>?,
    parentPath: InverseForeignKey<out Record, WaitsByHostByLatencyRecord>?,
    aliased: Table<WaitsByHostByLatencyRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<WaitsByHostByLatencyRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `waits_by_host_by_latency` as select if((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`) AS `host`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`EVENT_NAME` AS `event`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`COUNT_STAR` AS `total`,format_pico_time(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,format_pico_time(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency`,format_pico_time(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency` from `performance_schema`.`events_waits_summary_by_host_by_event_name` where ((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`EVENT_NAME` <> 'idle') and (`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` > 0)) order by if((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`),`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sys.waits_by_host_by_latency</code>
         */
        val WAITS_BY_HOST_BY_LATENCY: WaitsByHostByLatency = WaitsByHostByLatency()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<WaitsByHostByLatencyRecord> = WaitsByHostByLatencyRecord::class.java

    /**
     * The column <code>sys.waits_by_host_by_latency.host</code>.
     */
    val HOST: TableField<WaitsByHostByLatencyRecord, String?> = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>sys.waits_by_host_by_latency.event</code>.
     */
    val EVENT: TableField<WaitsByHostByLatencyRecord, String?> = createField(DSL.name("event"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>sys.waits_by_host_by_latency.total</code>.
     */
    val TOTAL: TableField<WaitsByHostByLatencyRecord, ULong?> = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.waits_by_host_by_latency.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<WaitsByHostByLatencyRecord, String?> = createField(DSL.name("total_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.waits_by_host_by_latency.avg_latency</code>.
     */
    val AVG_LATENCY: TableField<WaitsByHostByLatencyRecord, String?> = createField(DSL.name("avg_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.waits_by_host_by_latency.max_latency</code>.
     */
    val MAX_LATENCY: TableField<WaitsByHostByLatencyRecord, String?> = createField(DSL.name("max_latency"), SQLDataType.VARCHAR(11), this, "")

    private constructor(alias: Name, aliased: Table<WaitsByHostByLatencyRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<WaitsByHostByLatencyRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<WaitsByHostByLatencyRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.waits_by_host_by_latency</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.waits_by_host_by_latency</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.waits_by_host_by_latency</code> table reference
     */
    constructor(): this(DSL.name("waits_by_host_by_latency"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): WaitsByHostByLatency = WaitsByHostByLatency(DSL.name(alias), this)
    override fun `as`(alias: Name): WaitsByHostByLatency = WaitsByHostByLatency(alias, this)
    override fun `as`(alias: Table<*>): WaitsByHostByLatency = WaitsByHostByLatency(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): WaitsByHostByLatency = WaitsByHostByLatency(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): WaitsByHostByLatency = WaitsByHostByLatency(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): WaitsByHostByLatency = WaitsByHostByLatency(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): WaitsByHostByLatency = WaitsByHostByLatency(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): WaitsByHostByLatency = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): WaitsByHostByLatency = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): WaitsByHostByLatency = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): WaitsByHostByLatency = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): WaitsByHostByLatency = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): WaitsByHostByLatency = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): WaitsByHostByLatency = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): WaitsByHostByLatency = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): WaitsByHostByLatency = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<String?, String?, ULong?, String?, String?, String?> = super.fieldsRow() as Row6<String?, String?, ULong?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, ULong?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, ULong?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
