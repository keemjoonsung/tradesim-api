/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys

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
import org.jooq.Row5
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
open class `X$hostSummaryByStages`(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`>?,
    parentPath: InverseForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`>?,
    aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `x\$host_summary_by_stages` as select if((`performance_schema`.`events_stages_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_stages_summary_by_host_by_event_name`.`HOST`) AS `host`,`performance_schema`.`events_stages_summary_by_host_by_event_name`.`EVENT_NAME` AS `event_name`,`performance_schema`.`events_stages_summary_by_host_by_event_name`.`COUNT_STAR` AS `total`,`performance_schema`.`events_stages_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` AS `total_latency`,`performance_schema`.`events_stages_summary_by_host_by_event_name`.`AVG_TIMER_WAIT` AS `avg_latency` from `performance_schema`.`events_stages_summary_by_host_by_event_name` where (`performance_schema`.`events_stages_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` <> 0) order by if((`performance_schema`.`events_stages_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_stages_summary_by_host_by_event_name`.`HOST`),`performance_schema`.`events_stages_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$host_summary_by_stages</code>
         */
        val `X$HOST_SUMMARY_BY_STAGES`: `X$hostSummaryByStages` = `X$hostSummaryByStages`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`::class.java

    /**
     * The column <code>sys.x$host_summary_by_stages.host</code>.
     */
    val HOST: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`, String?> = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>sys.x$host_summary_by_stages.event_name</code>.
     */
    val EVENT_NAME: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`, String?> = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>sys.x$host_summary_by_stages.total</code>.
     */
    val TOTAL: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`, ULong?> = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$host_summary_by_stages.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`, ULong?> = createField(DSL.name("total_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$host_summary_by_stages.avg_latency</code>.
     */
    val AVG_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`, ULong?> = createField(DSL.name("avg_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryByStagesRecord`>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.x$host_summary_by_stages</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$host_summary_by_stages</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$host_summary_by_stages</code> table reference
     */
    constructor(): this(DSL.name("x\$host_summary_by_stages"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): `X$hostSummaryByStages` = `X$hostSummaryByStages`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$hostSummaryByStages` = `X$hostSummaryByStages`(alias, this)
    override fun `as`(alias: Table<*>): `X$hostSummaryByStages` = `X$hostSummaryByStages`(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$hostSummaryByStages` = `X$hostSummaryByStages`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$hostSummaryByStages` = `X$hostSummaryByStages`(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): `X$hostSummaryByStages` = `X$hostSummaryByStages`(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): `X$hostSummaryByStages` = `X$hostSummaryByStages`(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): `X$hostSummaryByStages` = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): `X$hostSummaryByStages` = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): `X$hostSummaryByStages` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): `X$hostSummaryByStages` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): `X$hostSummaryByStages` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): `X$hostSummaryByStages` = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): `X$hostSummaryByStages` = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): `X$hostSummaryByStages` = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): `X$hostSummaryByStages` = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<String?, String?, ULong?, ULong?, ULong?> = super.fieldsRow() as Row5<String?, String?, ULong?, ULong?, ULong?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, ULong?, ULong?, ULong?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, ULong?, ULong?, ULong?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
