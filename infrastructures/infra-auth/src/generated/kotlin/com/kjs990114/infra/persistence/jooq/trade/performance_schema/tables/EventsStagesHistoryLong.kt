/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsStagesHistoryLongNestingEventType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.EventsStagesHistoryLongRecord

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
import org.jooq.Row12
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
open class EventsStagesHistoryLong(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, EventsStagesHistoryLongRecord>?,
    parentPath: InverseForeignKey<out Record, EventsStagesHistoryLongRecord>?,
    aliased: Table<EventsStagesHistoryLongRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<EventsStagesHistoryLongRecord>(
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
         * <code>performance_schema.events_stages_history_long</code>
         */
        val EVENTS_STAGES_HISTORY_LONG: EventsStagesHistoryLong = EventsStagesHistoryLong()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EventsStagesHistoryLongRecord> = EventsStagesHistoryLongRecord::class.java

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<EventsStagesHistoryLongRecord, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.EVENT_ID</code>.
     */
    val EVENT_ID: TableField<EventsStagesHistoryLongRecord, ULong?> = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.END_EVENT_ID</code>.
     */
    val END_EVENT_ID: TableField<EventsStagesHistoryLongRecord, ULong?> = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<EventsStagesHistoryLongRecord, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.SOURCE</code>.
     */
    val SOURCE: TableField<EventsStagesHistoryLongRecord, String?> = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.TIMER_START</code>.
     */
    val TIMER_START: TableField<EventsStagesHistoryLongRecord, ULong?> = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.TIMER_END</code>.
     */
    val TIMER_END: TableField<EventsStagesHistoryLongRecord, ULong?> = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.TIMER_WAIT</code>.
     */
    val TIMER_WAIT: TableField<EventsStagesHistoryLongRecord, ULong?> = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.WORK_COMPLETED</code>.
     */
    val WORK_COMPLETED: TableField<EventsStagesHistoryLongRecord, ULong?> = createField(DSL.name("WORK_COMPLETED"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.WORK_ESTIMATED</code>.
     */
    val WORK_ESTIMATED: TableField<EventsStagesHistoryLongRecord, ULong?> = createField(DSL.name("WORK_ESTIMATED"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.NESTING_EVENT_ID</code>.
     */
    val NESTING_EVENT_ID: TableField<EventsStagesHistoryLongRecord, ULong?> = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_stages_history_long.NESTING_EVENT_TYPE</code>.
     */
    val NESTING_EVENT_TYPE: TableField<EventsStagesHistoryLongRecord, EventsStagesHistoryLongNestingEventType?> = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(EventsStagesHistoryLongNestingEventType::class.java), this, "")

    private constructor(alias: Name, aliased: Table<EventsStagesHistoryLongRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<EventsStagesHistoryLongRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<EventsStagesHistoryLongRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.events_stages_history_long</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.events_stages_history_long</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.events_stages_history_long</code> table
     * reference
     */
    constructor(): this(DSL.name("events_stages_history_long"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): EventsStagesHistoryLong = EventsStagesHistoryLong(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsStagesHistoryLong = EventsStagesHistoryLong(alias, this)
    override fun `as`(alias: Table<*>): EventsStagesHistoryLong = EventsStagesHistoryLong(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsStagesHistoryLong = EventsStagesHistoryLong(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsStagesHistoryLong = EventsStagesHistoryLong(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EventsStagesHistoryLong = EventsStagesHistoryLong(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): EventsStagesHistoryLong = EventsStagesHistoryLong(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): EventsStagesHistoryLong = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): EventsStagesHistoryLong = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): EventsStagesHistoryLong = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): EventsStagesHistoryLong = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): EventsStagesHistoryLong = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): EventsStagesHistoryLong = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): EventsStagesHistoryLong = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): EventsStagesHistoryLong = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): EventsStagesHistoryLong = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row12<ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, EventsStagesHistoryLongNestingEventType?> = super.fieldsRow() as Row12<ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, EventsStagesHistoryLongNestingEventType?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, EventsStagesHistoryLongNestingEventType?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, EventsStagesHistoryLongNestingEventType?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
