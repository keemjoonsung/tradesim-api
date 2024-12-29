/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsStatementsCurrentExecutionEngine
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsStatementsCurrentNestingEventType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_EVENTS_STATEMENTS_CURRENT_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.EventsStatementsCurrentRecord

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
open class EventsStatementsCurrent(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, EventsStatementsCurrentRecord>?,
    parentPath: InverseForeignKey<out Record, EventsStatementsCurrentRecord>?,
    aliased: Table<EventsStatementsCurrentRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<EventsStatementsCurrentRecord>(
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
         * <code>performance_schema.events_statements_current</code>
         */
        val EVENTS_STATEMENTS_CURRENT: EventsStatementsCurrent = EventsStatementsCurrent()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EventsStatementsCurrentRecord> = EventsStatementsCurrentRecord::class.java

    /**
     * The column
     * <code>performance_schema.events_statements_current.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.EVENT_ID</code>.
     */
    val EVENT_ID: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.END_EVENT_ID</code>.
     */
    val END_EVENT_ID: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SOURCE</code>.
     */
    val SOURCE: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.TIMER_START</code>.
     */
    val TIMER_START: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.TIMER_END</code>.
     */
    val TIMER_END: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.TIMER_WAIT</code>.
     */
    val TIMER_WAIT: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.LOCK_TIME</code>.
     */
    val LOCK_TIME: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("LOCK_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SQL_TEXT</code>.
     */
    val SQL_TEXT: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("SQL_TEXT"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.DIGEST</code>.
     */
    val DIGEST: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("DIGEST"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.DIGEST_TEXT</code>.
     */
    val DIGEST_TEXT: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("DIGEST_TEXT"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.CURRENT_SCHEMA</code>.
     */
    val CURRENT_SCHEMA: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("CURRENT_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.OBJECT_TYPE</code>.
     */
    val OBJECT_TYPE: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.OBJECT_SCHEMA</code>.
     */
    val OBJECT_SCHEMA: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.OBJECT_NAME</code>.
     */
    val OBJECT_NAME: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.MYSQL_ERRNO</code>.
     */
    val MYSQL_ERRNO: TableField<EventsStatementsCurrentRecord, Int?> = createField(DSL.name("MYSQL_ERRNO"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.RETURNED_SQLSTATE</code>.
     */
    val RETURNED_SQLSTATE: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("RETURNED_SQLSTATE"), SQLDataType.VARCHAR(5), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.MESSAGE_TEXT</code>.
     */
    val MESSAGE_TEXT: TableField<EventsStatementsCurrentRecord, String?> = createField(DSL.name("MESSAGE_TEXT"), SQLDataType.VARCHAR(128), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.ERRORS</code>.
     */
    val ERRORS: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("ERRORS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.WARNINGS</code>.
     */
    val WARNINGS: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("WARNINGS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.ROWS_AFFECTED</code>.
     */
    val ROWS_AFFECTED: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("ROWS_AFFECTED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.ROWS_SENT</code>.
     */
    val ROWS_SENT: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("ROWS_SENT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.ROWS_EXAMINED</code>.
     */
    val ROWS_EXAMINED: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("ROWS_EXAMINED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.CREATED_TMP_DISK_TABLES</code>.
     */
    val CREATED_TMP_DISK_TABLES: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("CREATED_TMP_DISK_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.CREATED_TMP_TABLES</code>.
     */
    val CREATED_TMP_TABLES: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("CREATED_TMP_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SELECT_FULL_JOIN</code>.
     */
    val SELECT_FULL_JOIN: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("SELECT_FULL_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SELECT_FULL_RANGE_JOIN</code>.
     */
    val SELECT_FULL_RANGE_JOIN: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("SELECT_FULL_RANGE_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SELECT_RANGE</code>.
     */
    val SELECT_RANGE: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("SELECT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SELECT_RANGE_CHECK</code>.
     */
    val SELECT_RANGE_CHECK: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("SELECT_RANGE_CHECK"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SELECT_SCAN</code>.
     */
    val SELECT_SCAN: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("SELECT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SORT_MERGE_PASSES</code>.
     */
    val SORT_MERGE_PASSES: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("SORT_MERGE_PASSES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SORT_RANGE</code>.
     */
    val SORT_RANGE: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("SORT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SORT_ROWS</code>.
     */
    val SORT_ROWS: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("SORT_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.SORT_SCAN</code>.
     */
    val SORT_SCAN: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("SORT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.NO_INDEX_USED</code>.
     */
    val NO_INDEX_USED: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("NO_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.NO_GOOD_INDEX_USED</code>.
     */
    val NO_GOOD_INDEX_USED: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("NO_GOOD_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.NESTING_EVENT_ID</code>.
     */
    val NESTING_EVENT_ID: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.NESTING_EVENT_TYPE</code>.
     */
    val NESTING_EVENT_TYPE: TableField<EventsStatementsCurrentRecord, EventsStatementsCurrentNestingEventType?> = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(EventsStatementsCurrentNestingEventType::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.NESTING_EVENT_LEVEL</code>.
     */
    val NESTING_EVENT_LEVEL: TableField<EventsStatementsCurrentRecord, Int?> = createField(DSL.name("NESTING_EVENT_LEVEL"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.STATEMENT_ID</code>.
     */
    val STATEMENT_ID: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("STATEMENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.CPU_TIME</code>.
     */
    val CPU_TIME: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("CPU_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.MAX_CONTROLLED_MEMORY</code>.
     */
    val MAX_CONTROLLED_MEMORY: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("MAX_CONTROLLED_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.MAX_TOTAL_MEMORY</code>.
     */
    val MAX_TOTAL_MEMORY: TableField<EventsStatementsCurrentRecord, ULong?> = createField(DSL.name("MAX_TOTAL_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_statements_current.EXECUTION_ENGINE</code>.
     */
    val EXECUTION_ENGINE: TableField<EventsStatementsCurrentRecord, EventsStatementsCurrentExecutionEngine?> = createField(DSL.name("EXECUTION_ENGINE"), SQLDataType.VARCHAR(9).asEnumDataType(EventsStatementsCurrentExecutionEngine::class.java), this, "")

    private constructor(alias: Name, aliased: Table<EventsStatementsCurrentRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<EventsStatementsCurrentRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<EventsStatementsCurrentRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.events_statements_current</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.events_statements_current</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.events_statements_current</code> table
     * reference
     */
    constructor(): this(DSL.name("events_statements_current"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getPrimaryKey(): UniqueKey<EventsStatementsCurrentRecord> = KEY_EVENTS_STATEMENTS_CURRENT_PRIMARY
    override fun `as`(alias: String): EventsStatementsCurrent = EventsStatementsCurrent(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsStatementsCurrent = EventsStatementsCurrent(alias, this)
    override fun `as`(alias: Table<*>): EventsStatementsCurrent = EventsStatementsCurrent(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsStatementsCurrent = EventsStatementsCurrent(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsStatementsCurrent = EventsStatementsCurrent(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EventsStatementsCurrent = EventsStatementsCurrent(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): EventsStatementsCurrent = EventsStatementsCurrent(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): EventsStatementsCurrent = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): EventsStatementsCurrent = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): EventsStatementsCurrent = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): EventsStatementsCurrent = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): EventsStatementsCurrent = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): EventsStatementsCurrent = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): EventsStatementsCurrent = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): EventsStatementsCurrent = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): EventsStatementsCurrent = where(DSL.notExists(select))
}
