/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.LatestFileIoRecord

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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class LatestFileIo(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, LatestFileIoRecord>?,
    parentPath: InverseForeignKey<out Record, LatestFileIoRecord>?,
    aliased: Table<LatestFileIoRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<LatestFileIoRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `latest_file_io` as select if((`information_schema`.`processlist`.`ID` is null),concat(substring_index(`performance_schema`.`threads`.`NAME`,'/',-(1)),':',`performance_schema`.`events_waits_history_long`.`THREAD_ID`),convert(concat(`information_schema`.`processlist`.`USER`,'@',`information_schema`.`processlist`.`HOST`,':',`information_schema`.`processlist`.`ID`) using utf8mb4)) AS `thread`,`sys`.`format_path`(`performance_schema`.`events_waits_history_long`.`OBJECT_NAME`) AS `file`,format_pico_time(`performance_schema`.`events_waits_history_long`.`TIMER_WAIT`) AS `latency`,`performance_schema`.`events_waits_history_long`.`OPERATION` AS `operation`,format_bytes(`performance_schema`.`events_waits_history_long`.`NUMBER_OF_BYTES`) AS `requested` from ((`performance_schema`.`events_waits_history_long` join `performance_schema`.`threads` on((`performance_schema`.`events_waits_history_long`.`THREAD_ID` = `performance_schema`.`threads`.`THREAD_ID`))) left join `information_schema`.`PROCESSLIST` on((`performance_schema`.`threads`.`PROCESSLIST_ID` = `information_schema`.`processlist`.`ID`))) where ((`performance_schema`.`events_waits_history_long`.`OBJECT_NAME` is not null) and (`performance_schema`.`events_waits_history_long`.`EVENT_NAME` like 'wait/io/file/%')) order by `performance_schema`.`events_waits_history_long`.`TIMER_START`"),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sys.latest_file_io</code>
         */
        val LATEST_FILE_IO: LatestFileIo = LatestFileIo()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<LatestFileIoRecord> = LatestFileIoRecord::class.java

    /**
     * The column <code>sys.latest_file_io.thread</code>.
     */
    val THREAD: TableField<LatestFileIoRecord, String?> = createField(DSL.name("thread"), SQLDataType.VARCHAR(317), this, "")

    /**
     * The column <code>sys.latest_file_io.file</code>.
     */
    val FILE: TableField<LatestFileIoRecord, String?> = createField(DSL.name("file"), SQLDataType.VARCHAR(512), this, "")

    /**
     * The column <code>sys.latest_file_io.latency</code>.
     */
    val LATENCY: TableField<LatestFileIoRecord, String?> = createField(DSL.name("latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.latest_file_io.operation</code>.
     */
    val OPERATION: TableField<LatestFileIoRecord, String?> = createField(DSL.name("operation"), SQLDataType.VARCHAR(32).nullable(false), this, "")

    /**
     * The column <code>sys.latest_file_io.requested</code>.
     */
    val REQUESTED: TableField<LatestFileIoRecord, String?> = createField(DSL.name("requested"), SQLDataType.VARCHAR(11), this, "")

    private constructor(alias: Name, aliased: Table<LatestFileIoRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<LatestFileIoRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<LatestFileIoRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.latest_file_io</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.latest_file_io</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.latest_file_io</code> table reference
     */
    constructor(): this(DSL.name("latest_file_io"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): LatestFileIo = LatestFileIo(DSL.name(alias), this)
    override fun `as`(alias: Name): LatestFileIo = LatestFileIo(alias, this)
    override fun `as`(alias: Table<*>): LatestFileIo = LatestFileIo(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): LatestFileIo = LatestFileIo(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): LatestFileIo = LatestFileIo(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): LatestFileIo = LatestFileIo(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): LatestFileIo = LatestFileIo(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): LatestFileIo = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): LatestFileIo = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): LatestFileIo = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): LatestFileIo = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): LatestFileIo = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): LatestFileIo = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): LatestFileIo = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): LatestFileIo = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): LatestFileIo = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<String?, String?, String?, String?, String?> = super.fieldsRow() as Row5<String?, String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
