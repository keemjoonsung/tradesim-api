/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.HostSummaryByFileIoRecord

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
import org.jooq.Row3
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
open class HostSummaryByFileIo(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, HostSummaryByFileIoRecord>?,
    parentPath: InverseForeignKey<out Record, HostSummaryByFileIoRecord>?,
    aliased: Table<HostSummaryByFileIoRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<HostSummaryByFileIoRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `host_summary_by_file_io` as select if((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`) AS `host`,sum(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`COUNT_STAR`) AS `ios`,format_pico_time(sum(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`)) AS `io_latency` from `performance_schema`.`events_waits_summary_by_host_by_event_name` where (`performance_schema`.`events_waits_summary_by_host_by_event_name`.`EVENT_NAME` like 'wait/io/file/%') group by if((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`) order by sum(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sys.host_summary_by_file_io</code>
         */
        val HOST_SUMMARY_BY_FILE_IO: HostSummaryByFileIo = HostSummaryByFileIo()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<HostSummaryByFileIoRecord> = HostSummaryByFileIoRecord::class.java

    /**
     * The column <code>sys.host_summary_by_file_io.host</code>.
     */
    val HOST: TableField<HostSummaryByFileIoRecord, String?> = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>sys.host_summary_by_file_io.ios</code>.
     */
    val IOS: TableField<HostSummaryByFileIoRecord, BigInteger?> = createField(DSL.name("ios"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.host_summary_by_file_io.io_latency</code>.
     */
    val IO_LATENCY: TableField<HostSummaryByFileIoRecord, String?> = createField(DSL.name("io_latency"), SQLDataType.VARCHAR(11), this, "")

    private constructor(alias: Name, aliased: Table<HostSummaryByFileIoRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<HostSummaryByFileIoRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<HostSummaryByFileIoRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.host_summary_by_file_io</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.host_summary_by_file_io</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.host_summary_by_file_io</code> table reference
     */
    constructor(): this(DSL.name("host_summary_by_file_io"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): HostSummaryByFileIo = HostSummaryByFileIo(DSL.name(alias), this)
    override fun `as`(alias: Name): HostSummaryByFileIo = HostSummaryByFileIo(alias, this)
    override fun `as`(alias: Table<*>): HostSummaryByFileIo = HostSummaryByFileIo(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): HostSummaryByFileIo = HostSummaryByFileIo(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): HostSummaryByFileIo = HostSummaryByFileIo(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): HostSummaryByFileIo = HostSummaryByFileIo(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): HostSummaryByFileIo = HostSummaryByFileIo(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): HostSummaryByFileIo = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): HostSummaryByFileIo = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): HostSummaryByFileIo = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): HostSummaryByFileIo = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): HostSummaryByFileIo = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): HostSummaryByFileIo = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): HostSummaryByFileIo = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): HostSummaryByFileIo = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): HostSummaryByFileIo = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<String?, BigInteger?, String?> = super.fieldsRow() as Row3<String?, BigInteger?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, BigInteger?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, BigInteger?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
