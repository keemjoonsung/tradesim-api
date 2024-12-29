/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.HostSummaryByFileIoTypeRecord

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
open class HostSummaryByFileIoType(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, HostSummaryByFileIoTypeRecord>?,
    parentPath: InverseForeignKey<out Record, HostSummaryByFileIoTypeRecord>?,
    aliased: Table<HostSummaryByFileIoTypeRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<HostSummaryByFileIoTypeRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `host_summary_by_file_io_type` as select if((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`) AS `host`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`EVENT_NAME` AS `event_name`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`COUNT_STAR` AS `total`,format_pico_time(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,format_pico_time(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency` from `performance_schema`.`events_waits_summary_by_host_by_event_name` where ((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`EVENT_NAME` like 'wait/io/file%') and (`performance_schema`.`events_waits_summary_by_host_by_event_name`.`COUNT_STAR` > 0)) order by if((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`),`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>sys.host_summary_by_file_io_type</code>
         */
        val HOST_SUMMARY_BY_FILE_IO_TYPE: HostSummaryByFileIoType = HostSummaryByFileIoType()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<HostSummaryByFileIoTypeRecord> = HostSummaryByFileIoTypeRecord::class.java

    /**
     * The column <code>sys.host_summary_by_file_io_type.host</code>.
     */
    val HOST: TableField<HostSummaryByFileIoTypeRecord, String?> = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>sys.host_summary_by_file_io_type.event_name</code>.
     */
    val EVENT_NAME: TableField<HostSummaryByFileIoTypeRecord, String?> = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>sys.host_summary_by_file_io_type.total</code>.
     */
    val TOTAL: TableField<HostSummaryByFileIoTypeRecord, ULong?> = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.host_summary_by_file_io_type.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<HostSummaryByFileIoTypeRecord, String?> = createField(DSL.name("total_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.host_summary_by_file_io_type.max_latency</code>.
     */
    val MAX_LATENCY: TableField<HostSummaryByFileIoTypeRecord, String?> = createField(DSL.name("max_latency"), SQLDataType.VARCHAR(11), this, "")

    private constructor(alias: Name, aliased: Table<HostSummaryByFileIoTypeRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<HostSummaryByFileIoTypeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<HostSummaryByFileIoTypeRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.host_summary_by_file_io_type</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.host_summary_by_file_io_type</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.host_summary_by_file_io_type</code> table reference
     */
    constructor(): this(DSL.name("host_summary_by_file_io_type"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): HostSummaryByFileIoType = HostSummaryByFileIoType(DSL.name(alias), this)
    override fun `as`(alias: Name): HostSummaryByFileIoType = HostSummaryByFileIoType(alias, this)
    override fun `as`(alias: Table<*>): HostSummaryByFileIoType = HostSummaryByFileIoType(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): HostSummaryByFileIoType = HostSummaryByFileIoType(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): HostSummaryByFileIoType = HostSummaryByFileIoType(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): HostSummaryByFileIoType = HostSummaryByFileIoType(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): HostSummaryByFileIoType = HostSummaryByFileIoType(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): HostSummaryByFileIoType = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): HostSummaryByFileIoType = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): HostSummaryByFileIoType = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): HostSummaryByFileIoType = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): HostSummaryByFileIoType = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): HostSummaryByFileIoType = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): HostSummaryByFileIoType = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): HostSummaryByFileIoType = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): HostSummaryByFileIoType = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<String?, String?, ULong?, String?, String?> = super.fieldsRow() as Row5<String?, String?, ULong?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, ULong?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, ULong?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
