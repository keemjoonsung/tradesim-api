/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME_USER
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.EventsStagesSummaryByUserByEventNameRecord

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
import org.jooq.Row7
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
open class EventsStagesSummaryByUserByEventName(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, EventsStagesSummaryByUserByEventNameRecord>?,
    parentPath: InverseForeignKey<out Record, EventsStagesSummaryByUserByEventNameRecord>?,
    aliased: Table<EventsStagesSummaryByUserByEventNameRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<EventsStagesSummaryByUserByEventNameRecord>(
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
         * <code>performance_schema.events_stages_summary_by_user_by_event_name</code>
         */
        val EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME: EventsStagesSummaryByUserByEventName = EventsStagesSummaryByUserByEventName()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EventsStagesSummaryByUserByEventNameRecord> = EventsStagesSummaryByUserByEventNameRecord::class.java

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.USER</code>.
     */
    val USER: TableField<EventsStagesSummaryByUserByEventNameRecord, String?> = createField(DSL.name("USER"), SQLDataType.CHAR(32), this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<EventsStagesSummaryByUserByEventNameRecord, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.COUNT_STAR</code>.
     */
    val COUNT_STAR: TableField<EventsStagesSummaryByUserByEventNameRecord, ULong?> = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
     */
    val SUM_TIMER_WAIT: TableField<EventsStagesSummaryByUserByEventNameRecord, ULong?> = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
     */
    val MIN_TIMER_WAIT: TableField<EventsStagesSummaryByUserByEventNameRecord, ULong?> = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
     */
    val AVG_TIMER_WAIT: TableField<EventsStagesSummaryByUserByEventNameRecord, ULong?> = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
     */
    val MAX_TIMER_WAIT: TableField<EventsStagesSummaryByUserByEventNameRecord, ULong?> = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<EventsStagesSummaryByUserByEventNameRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<EventsStagesSummaryByUserByEventNameRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<EventsStagesSummaryByUserByEventNameRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.events_stages_summary_by_user_by_event_name</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.events_stages_summary_by_user_by_event_name</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>performance_schema.events_stages_summary_by_user_by_event_name</code>
     * table reference
     */
    constructor(): this(DSL.name("events_stages_summary_by_user_by_event_name"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getUniqueKeys(): List<UniqueKey<EventsStagesSummaryByUserByEventNameRecord>> = listOf(KEY_EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME_USER)
    override fun `as`(alias: String): EventsStagesSummaryByUserByEventName = EventsStagesSummaryByUserByEventName(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsStagesSummaryByUserByEventName = EventsStagesSummaryByUserByEventName(alias, this)
    override fun `as`(alias: Table<*>): EventsStagesSummaryByUserByEventName = EventsStagesSummaryByUserByEventName(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsStagesSummaryByUserByEventName = EventsStagesSummaryByUserByEventName(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsStagesSummaryByUserByEventName = EventsStagesSummaryByUserByEventName(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EventsStagesSummaryByUserByEventName = EventsStagesSummaryByUserByEventName(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): EventsStagesSummaryByUserByEventName = EventsStagesSummaryByUserByEventName(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): EventsStagesSummaryByUserByEventName = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): EventsStagesSummaryByUserByEventName = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): EventsStagesSummaryByUserByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): EventsStagesSummaryByUserByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): EventsStagesSummaryByUserByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): EventsStagesSummaryByUserByEventName = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): EventsStagesSummaryByUserByEventName = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): EventsStagesSummaryByUserByEventName = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): EventsStagesSummaryByUserByEventName = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row7<String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?> = super.fieldsRow() as Row7<String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
