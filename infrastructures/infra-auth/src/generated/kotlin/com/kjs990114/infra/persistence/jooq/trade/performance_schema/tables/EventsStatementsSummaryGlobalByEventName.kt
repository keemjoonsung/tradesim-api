/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.EventsStatementsSummaryGlobalByEventNameRecord

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
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
open class EventsStatementsSummaryGlobalByEventName(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, EventsStatementsSummaryGlobalByEventNameRecord>?,
    parentPath: InverseForeignKey<out Record, EventsStatementsSummaryGlobalByEventNameRecord>?,
    aliased: Table<EventsStatementsSummaryGlobalByEventNameRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<EventsStatementsSummaryGlobalByEventNameRecord>(
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
         * <code>performance_schema.events_statements_summary_global_by_event_name</code>
         */
        val EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME: EventsStatementsSummaryGlobalByEventName = EventsStatementsSummaryGlobalByEventName()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EventsStatementsSummaryGlobalByEventNameRecord> = EventsStatementsSummaryGlobalByEventNameRecord::class.java

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<EventsStatementsSummaryGlobalByEventNameRecord, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.COUNT_STAR</code>.
     */
    val COUNT_STAR: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
     */
    val SUM_TIMER_WAIT: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
     */
    val MIN_TIMER_WAIT: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
     */
    val AVG_TIMER_WAIT: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
     */
    val MAX_TIMER_WAIT: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_LOCK_TIME</code>.
     */
    val SUM_LOCK_TIME: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_LOCK_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ERRORS</code>.
     */
    val SUM_ERRORS: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_ERRORS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_WARNINGS</code>.
     */
    val SUM_WARNINGS: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_WARNINGS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_AFFECTED</code>.
     */
    val SUM_ROWS_AFFECTED: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_ROWS_AFFECTED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_SENT</code>.
     */
    val SUM_ROWS_SENT: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_ROWS_SENT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_EXAMINED</code>.
     */
    val SUM_ROWS_EXAMINED: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_ROWS_EXAMINED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    val SUM_CREATED_TMP_DISK_TABLES: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_CREATED_TMP_DISK_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_CREATED_TMP_TABLES</code>.
     */
    val SUM_CREATED_TMP_TABLES: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_CREATED_TMP_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_FULL_JOIN</code>.
     */
    val SUM_SELECT_FULL_JOIN: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_SELECT_FULL_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    val SUM_SELECT_FULL_RANGE_JOIN: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_SELECT_FULL_RANGE_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_RANGE</code>.
     */
    val SUM_SELECT_RANGE: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_SELECT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
     */
    val SUM_SELECT_RANGE_CHECK: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_SELECT_RANGE_CHECK"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_SCAN</code>.
     */
    val SUM_SELECT_SCAN: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_SELECT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_MERGE_PASSES</code>.
     */
    val SUM_SORT_MERGE_PASSES: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_SORT_MERGE_PASSES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_RANGE</code>.
     */
    val SUM_SORT_RANGE: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_SORT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_ROWS</code>.
     */
    val SUM_SORT_ROWS: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_SORT_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_SCAN</code>.
     */
    val SUM_SORT_SCAN: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_SORT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_NO_INDEX_USED</code>.
     */
    val SUM_NO_INDEX_USED: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_NO_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
     */
    val SUM_NO_GOOD_INDEX_USED: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_NO_GOOD_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.SUM_CPU_TIME</code>.
     */
    val SUM_CPU_TIME: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("SUM_CPU_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.MAX_CONTROLLED_MEMORY</code>.
     */
    val MAX_CONTROLLED_MEMORY: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("MAX_CONTROLLED_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.MAX_TOTAL_MEMORY</code>.
     */
    val MAX_TOTAL_MEMORY: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("MAX_TOTAL_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_summary_global_by_event_name.COUNT_SECONDARY</code>.
     */
    val COUNT_SECONDARY: TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong?> = createField(DSL.name("COUNT_SECONDARY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<EventsStatementsSummaryGlobalByEventNameRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<EventsStatementsSummaryGlobalByEventNameRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<EventsStatementsSummaryGlobalByEventNameRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.events_statements_summary_global_by_event_name</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.events_statements_summary_global_by_event_name</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>performance_schema.events_statements_summary_global_by_event_name</code>
     * table reference
     */
    constructor(): this(DSL.name("events_statements_summary_global_by_event_name"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getPrimaryKey(): UniqueKey<EventsStatementsSummaryGlobalByEventNameRecord> = KEY_EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME_PRIMARY
    override fun `as`(alias: String): EventsStatementsSummaryGlobalByEventName = EventsStatementsSummaryGlobalByEventName(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsStatementsSummaryGlobalByEventName = EventsStatementsSummaryGlobalByEventName(alias, this)
    override fun `as`(alias: Table<*>): EventsStatementsSummaryGlobalByEventName = EventsStatementsSummaryGlobalByEventName(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsStatementsSummaryGlobalByEventName = EventsStatementsSummaryGlobalByEventName(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsStatementsSummaryGlobalByEventName = EventsStatementsSummaryGlobalByEventName(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EventsStatementsSummaryGlobalByEventName = EventsStatementsSummaryGlobalByEventName(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): EventsStatementsSummaryGlobalByEventName = EventsStatementsSummaryGlobalByEventName(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): EventsStatementsSummaryGlobalByEventName = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): EventsStatementsSummaryGlobalByEventName = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): EventsStatementsSummaryGlobalByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): EventsStatementsSummaryGlobalByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): EventsStatementsSummaryGlobalByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): EventsStatementsSummaryGlobalByEventName = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): EventsStatementsSummaryGlobalByEventName = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): EventsStatementsSummaryGlobalByEventName = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): EventsStatementsSummaryGlobalByEventName = where(DSL.notExists(select))
}
