/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR_HOST
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.EventsErrorsSummaryByHostByErrorRecord

import java.time.LocalDateTime
import java.util.function.Function

import kotlin.collections.Collection
import kotlin.collections.List

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
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsErrorsSummaryByHostByError(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, EventsErrorsSummaryByHostByErrorRecord>?,
    parentPath: InverseForeignKey<out Record, EventsErrorsSummaryByHostByErrorRecord>?,
    aliased: Table<EventsErrorsSummaryByHostByErrorRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<EventsErrorsSummaryByHostByErrorRecord>(
    alias,
    PerformanceSchema.PERFORMANCE_SCHEMA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>performance_schema.events_errors_summary_by_host_by_error</code>
         */
        val EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR: EventsErrorsSummaryByHostByError = EventsErrorsSummaryByHostByError()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EventsErrorsSummaryByHostByErrorRecord> = EventsErrorsSummaryByHostByErrorRecord::class.java

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_host_by_error.HOST</code>.
     */
    val HOST: TableField<EventsErrorsSummaryByHostByErrorRecord, String?> = createField(DSL.name("HOST"), SQLDataType.CHAR(255), this, "")

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_host_by_error.ERROR_NUMBER</code>.
     */
    val ERROR_NUMBER: TableField<EventsErrorsSummaryByHostByErrorRecord, Int?> = createField(DSL.name("ERROR_NUMBER"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_host_by_error.ERROR_NAME</code>.
     */
    val ERROR_NAME: TableField<EventsErrorsSummaryByHostByErrorRecord, String?> = createField(DSL.name("ERROR_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_host_by_error.SQL_STATE</code>.
     */
    val SQL_STATE: TableField<EventsErrorsSummaryByHostByErrorRecord, String?> = createField(DSL.name("SQL_STATE"), SQLDataType.VARCHAR(5), this, "")

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_host_by_error.SUM_ERROR_RAISED</code>.
     */
    val SUM_ERROR_RAISED: TableField<EventsErrorsSummaryByHostByErrorRecord, ULong?> = createField(DSL.name("SUM_ERROR_RAISED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED</code>.
     */
    val SUM_ERROR_HANDLED: TableField<EventsErrorsSummaryByHostByErrorRecord, ULong?> = createField(DSL.name("SUM_ERROR_HANDLED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_host_by_error.FIRST_SEEN</code>.
     */
    val FIRST_SEEN: TableField<EventsErrorsSummaryByHostByErrorRecord, LocalDateTime?> = createField(DSL.name("FIRST_SEEN"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_host_by_error.LAST_SEEN</code>.
     */
    val LAST_SEEN: TableField<EventsErrorsSummaryByHostByErrorRecord, LocalDateTime?> = createField(DSL.name("LAST_SEEN"), SQLDataType.LOCALDATETIME(0), this, "")

    private constructor(alias: Name, aliased: Table<EventsErrorsSummaryByHostByErrorRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<EventsErrorsSummaryByHostByErrorRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<EventsErrorsSummaryByHostByErrorRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.events_errors_summary_by_host_by_error</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.events_errors_summary_by_host_by_error</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>performance_schema.events_errors_summary_by_host_by_error</code>
     * table reference
     */
    constructor(): this(DSL.name("events_errors_summary_by_host_by_error"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getUniqueKeys(): List<UniqueKey<EventsErrorsSummaryByHostByErrorRecord>> = listOf(KEY_EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR_HOST)
    override fun `as`(alias: String): EventsErrorsSummaryByHostByError = EventsErrorsSummaryByHostByError(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsErrorsSummaryByHostByError = EventsErrorsSummaryByHostByError(alias, this)
    override fun `as`(alias: Table<*>): EventsErrorsSummaryByHostByError = EventsErrorsSummaryByHostByError(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsErrorsSummaryByHostByError = EventsErrorsSummaryByHostByError(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsErrorsSummaryByHostByError = EventsErrorsSummaryByHostByError(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EventsErrorsSummaryByHostByError = EventsErrorsSummaryByHostByError(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): EventsErrorsSummaryByHostByError = EventsErrorsSummaryByHostByError(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): EventsErrorsSummaryByHostByError = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): EventsErrorsSummaryByHostByError = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): EventsErrorsSummaryByHostByError = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): EventsErrorsSummaryByHostByError = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): EventsErrorsSummaryByHostByError = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): EventsErrorsSummaryByHostByError = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): EventsErrorsSummaryByHostByError = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): EventsErrorsSummaryByHostByError = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): EventsErrorsSummaryByHostByError = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row8<String?, Int?, String?, String?, ULong?, ULong?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row8<String?, Int?, String?, String?, ULong?, ULong?, LocalDateTime?, LocalDateTime?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, Int?, String?, String?, ULong?, ULong?, LocalDateTime?, LocalDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, Int?, String?, String?, ULong?, ULong?, LocalDateTime?, LocalDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
