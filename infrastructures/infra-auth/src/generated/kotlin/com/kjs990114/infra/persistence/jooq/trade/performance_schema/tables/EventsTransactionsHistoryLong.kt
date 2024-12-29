/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryLongAccessMode
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryLongAutocommit
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryLongNestingEventType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryLongState
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.EventsTransactionsHistoryLongRecord

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
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsTransactionsHistoryLong(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, EventsTransactionsHistoryLongRecord>?,
    parentPath: InverseForeignKey<out Record, EventsTransactionsHistoryLongRecord>?,
    aliased: Table<EventsTransactionsHistoryLongRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<EventsTransactionsHistoryLongRecord>(
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
         * <code>performance_schema.events_transactions_history_long</code>
         */
        val EVENTS_TRANSACTIONS_HISTORY_LONG: EventsTransactionsHistoryLong = EventsTransactionsHistoryLong()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EventsTransactionsHistoryLongRecord> = EventsTransactionsHistoryLongRecord::class.java

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.EVENT_ID</code>.
     */
    val EVENT_ID: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.END_EVENT_ID</code>.
     */
    val END_EVENT_ID: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<EventsTransactionsHistoryLongRecord, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.STATE</code>.
     */
    val STATE: TableField<EventsTransactionsHistoryLongRecord, EventsTransactionsHistoryLongState?> = createField(DSL.name("STATE"), SQLDataType.VARCHAR(11).asEnumDataType(EventsTransactionsHistoryLongState::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.TRX_ID</code>.
     */
    val TRX_ID: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("TRX_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.GTID</code>.
     */
    val GTID: TableField<EventsTransactionsHistoryLongRecord, String?> = createField(DSL.name("GTID"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.XID_FORMAT_ID</code>.
     */
    val XID_FORMAT_ID: TableField<EventsTransactionsHistoryLongRecord, Int?> = createField(DSL.name("XID_FORMAT_ID"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.XID_GTRID</code>.
     */
    val XID_GTRID: TableField<EventsTransactionsHistoryLongRecord, String?> = createField(DSL.name("XID_GTRID"), SQLDataType.VARCHAR(130), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.XID_BQUAL</code>.
     */
    val XID_BQUAL: TableField<EventsTransactionsHistoryLongRecord, String?> = createField(DSL.name("XID_BQUAL"), SQLDataType.VARCHAR(130), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.XA_STATE</code>.
     */
    val XA_STATE: TableField<EventsTransactionsHistoryLongRecord, String?> = createField(DSL.name("XA_STATE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.SOURCE</code>.
     */
    val SOURCE: TableField<EventsTransactionsHistoryLongRecord, String?> = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.TIMER_START</code>.
     */
    val TIMER_START: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.TIMER_END</code>.
     */
    val TIMER_END: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.TIMER_WAIT</code>.
     */
    val TIMER_WAIT: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.ACCESS_MODE</code>.
     */
    val ACCESS_MODE: TableField<EventsTransactionsHistoryLongRecord, EventsTransactionsHistoryLongAccessMode?> = createField(DSL.name("ACCESS_MODE"), SQLDataType.VARCHAR(10).asEnumDataType(EventsTransactionsHistoryLongAccessMode::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.ISOLATION_LEVEL</code>.
     */
    val ISOLATION_LEVEL: TableField<EventsTransactionsHistoryLongRecord, String?> = createField(DSL.name("ISOLATION_LEVEL"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.AUTOCOMMIT</code>.
     */
    val AUTOCOMMIT: TableField<EventsTransactionsHistoryLongRecord, EventsTransactionsHistoryLongAutocommit?> = createField(DSL.name("AUTOCOMMIT"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(EventsTransactionsHistoryLongAutocommit::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.NUMBER_OF_SAVEPOINTS</code>.
     */
    val NUMBER_OF_SAVEPOINTS: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("NUMBER_OF_SAVEPOINTS"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    val NUMBER_OF_ROLLBACK_TO_SAVEPOINT: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("NUMBER_OF_ROLLBACK_TO_SAVEPOINT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    val NUMBER_OF_RELEASE_SAVEPOINT: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("NUMBER_OF_RELEASE_SAVEPOINT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.NESTING_EVENT_ID</code>.
     */
    val NESTING_EVENT_ID: TableField<EventsTransactionsHistoryLongRecord, ULong?> = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history_long.NESTING_EVENT_TYPE</code>.
     */
    val NESTING_EVENT_TYPE: TableField<EventsTransactionsHistoryLongRecord, EventsTransactionsHistoryLongNestingEventType?> = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(EventsTransactionsHistoryLongNestingEventType::class.java), this, "")

    private constructor(alias: Name, aliased: Table<EventsTransactionsHistoryLongRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<EventsTransactionsHistoryLongRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<EventsTransactionsHistoryLongRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.events_transactions_history_long</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.events_transactions_history_long</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.events_transactions_history_long</code>
     * table reference
     */
    constructor(): this(DSL.name("events_transactions_history_long"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): EventsTransactionsHistoryLong = EventsTransactionsHistoryLong(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsTransactionsHistoryLong = EventsTransactionsHistoryLong(alias, this)
    override fun `as`(alias: Table<*>): EventsTransactionsHistoryLong = EventsTransactionsHistoryLong(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsTransactionsHistoryLong = EventsTransactionsHistoryLong(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsTransactionsHistoryLong = EventsTransactionsHistoryLong(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EventsTransactionsHistoryLong = EventsTransactionsHistoryLong(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): EventsTransactionsHistoryLong = EventsTransactionsHistoryLong(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): EventsTransactionsHistoryLong = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): EventsTransactionsHistoryLong = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): EventsTransactionsHistoryLong = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): EventsTransactionsHistoryLong = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): EventsTransactionsHistoryLong = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): EventsTransactionsHistoryLong = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): EventsTransactionsHistoryLong = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): EventsTransactionsHistoryLong = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): EventsTransactionsHistoryLong = where(DSL.notExists(select))
}