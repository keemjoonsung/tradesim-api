/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.UserSummaryByFileIoTypeRecord

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
open class UserSummaryByFileIoType(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, UserSummaryByFileIoTypeRecord>?,
    parentPath: InverseForeignKey<out Record, UserSummaryByFileIoTypeRecord>?,
    aliased: Table<UserSummaryByFileIoTypeRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<UserSummaryByFileIoTypeRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `user_summary_by_file_io_type` as select if((`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER` is null),'background',`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`) AS `user`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`EVENT_NAME` AS `event_name`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`COUNT_STAR` AS `total`,format_pico_time(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`SUM_TIMER_WAIT`) AS `latency`,format_pico_time(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency` from `performance_schema`.`events_waits_summary_by_user_by_event_name` where ((`performance_schema`.`events_waits_summary_by_user_by_event_name`.`EVENT_NAME` like 'wait/io/file%') and (`performance_schema`.`events_waits_summary_by_user_by_event_name`.`COUNT_STAR` > 0)) order by if((`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER` is null),'background',`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`),`performance_schema`.`events_waits_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>sys.user_summary_by_file_io_type</code>
         */
        val USER_SUMMARY_BY_FILE_IO_TYPE: UserSummaryByFileIoType = UserSummaryByFileIoType()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<UserSummaryByFileIoTypeRecord> = UserSummaryByFileIoTypeRecord::class.java

    /**
     * The column <code>sys.user_summary_by_file_io_type.user</code>.
     */
    val USER: TableField<UserSummaryByFileIoTypeRecord, String?> = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "")

    /**
     * The column <code>sys.user_summary_by_file_io_type.event_name</code>.
     */
    val EVENT_NAME: TableField<UserSummaryByFileIoTypeRecord, String?> = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>sys.user_summary_by_file_io_type.total</code>.
     */
    val TOTAL: TableField<UserSummaryByFileIoTypeRecord, ULong?> = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.user_summary_by_file_io_type.latency</code>.
     */
    val LATENCY: TableField<UserSummaryByFileIoTypeRecord, String?> = createField(DSL.name("latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.user_summary_by_file_io_type.max_latency</code>.
     */
    val MAX_LATENCY: TableField<UserSummaryByFileIoTypeRecord, String?> = createField(DSL.name("max_latency"), SQLDataType.VARCHAR(11), this, "")

    private constructor(alias: Name, aliased: Table<UserSummaryByFileIoTypeRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<UserSummaryByFileIoTypeRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<UserSummaryByFileIoTypeRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.user_summary_by_file_io_type</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.user_summary_by_file_io_type</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.user_summary_by_file_io_type</code> table reference
     */
    constructor(): this(DSL.name("user_summary_by_file_io_type"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): UserSummaryByFileIoType = UserSummaryByFileIoType(DSL.name(alias), this)
    override fun `as`(alias: Name): UserSummaryByFileIoType = UserSummaryByFileIoType(alias, this)
    override fun `as`(alias: Table<*>): UserSummaryByFileIoType = UserSummaryByFileIoType(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): UserSummaryByFileIoType = UserSummaryByFileIoType(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): UserSummaryByFileIoType = UserSummaryByFileIoType(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): UserSummaryByFileIoType = UserSummaryByFileIoType(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): UserSummaryByFileIoType = UserSummaryByFileIoType(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): UserSummaryByFileIoType = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): UserSummaryByFileIoType = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): UserSummaryByFileIoType = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): UserSummaryByFileIoType = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): UserSummaryByFileIoType = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): UserSummaryByFileIoType = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): UserSummaryByFileIoType = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): UserSummaryByFileIoType = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): UserSummaryByFileIoType = where(DSL.notExists(select))

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
