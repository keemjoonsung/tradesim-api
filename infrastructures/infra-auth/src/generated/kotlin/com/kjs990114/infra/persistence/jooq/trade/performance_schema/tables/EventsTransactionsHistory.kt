/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryAccessMode
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryAutocommit
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryNestingEventType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryState
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_EVENTS_TRANSACTIONS_HISTORY_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.EventsTransactionsHistoryRecord

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
open class EventsTransactionsHistory(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, EventsTransactionsHistoryRecord>?,
    parentPath: InverseForeignKey<out Record, EventsTransactionsHistoryRecord>?,
    aliased: Table<EventsTransactionsHistoryRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<EventsTransactionsHistoryRecord>(
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
         * <code>performance_schema.events_transactions_history</code>
         */
        val EVENTS_TRANSACTIONS_HISTORY: EventsTransactionsHistory = EventsTransactionsHistory()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EventsTransactionsHistoryRecord> = EventsTransactionsHistoryRecord::class.java

    /**
     * The column
     * <code>performance_schema.events_transactions_history.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.EVENT_ID</code>.
     */
    val EVENT_ID: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.END_EVENT_ID</code>.
     */
    val END_EVENT_ID: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<EventsTransactionsHistoryRecord, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.STATE</code>.
     */
    val STATE: TableField<EventsTransactionsHistoryRecord, EventsTransactionsHistoryState?> = createField(DSL.name("STATE"), SQLDataType.VARCHAR(11).asEnumDataType(EventsTransactionsHistoryState::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.TRX_ID</code>.
     */
    val TRX_ID: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("TRX_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.GTID</code>.
     */
    val GTID: TableField<EventsTransactionsHistoryRecord, String?> = createField(DSL.name("GTID"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.XID_FORMAT_ID</code>.
     */
    val XID_FORMAT_ID: TableField<EventsTransactionsHistoryRecord, Int?> = createField(DSL.name("XID_FORMAT_ID"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.XID_GTRID</code>.
     */
    val XID_GTRID: TableField<EventsTransactionsHistoryRecord, String?> = createField(DSL.name("XID_GTRID"), SQLDataType.VARCHAR(130), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.XID_BQUAL</code>.
     */
    val XID_BQUAL: TableField<EventsTransactionsHistoryRecord, String?> = createField(DSL.name("XID_BQUAL"), SQLDataType.VARCHAR(130), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.XA_STATE</code>.
     */
    val XA_STATE: TableField<EventsTransactionsHistoryRecord, String?> = createField(DSL.name("XA_STATE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.SOURCE</code>.
     */
    val SOURCE: TableField<EventsTransactionsHistoryRecord, String?> = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.TIMER_START</code>.
     */
    val TIMER_START: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.TIMER_END</code>.
     */
    val TIMER_END: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.TIMER_WAIT</code>.
     */
    val TIMER_WAIT: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.ACCESS_MODE</code>.
     */
    val ACCESS_MODE: TableField<EventsTransactionsHistoryRecord, EventsTransactionsHistoryAccessMode?> = createField(DSL.name("ACCESS_MODE"), SQLDataType.VARCHAR(10).asEnumDataType(EventsTransactionsHistoryAccessMode::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.ISOLATION_LEVEL</code>.
     */
    val ISOLATION_LEVEL: TableField<EventsTransactionsHistoryRecord, String?> = createField(DSL.name("ISOLATION_LEVEL"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.AUTOCOMMIT</code>.
     */
    val AUTOCOMMIT: TableField<EventsTransactionsHistoryRecord, EventsTransactionsHistoryAutocommit?> = createField(DSL.name("AUTOCOMMIT"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(EventsTransactionsHistoryAutocommit::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.NUMBER_OF_SAVEPOINTS</code>.
     */
    val NUMBER_OF_SAVEPOINTS: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("NUMBER_OF_SAVEPOINTS"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    val NUMBER_OF_ROLLBACK_TO_SAVEPOINT: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("NUMBER_OF_ROLLBACK_TO_SAVEPOINT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    val NUMBER_OF_RELEASE_SAVEPOINT: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("NUMBER_OF_RELEASE_SAVEPOINT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.NESTING_EVENT_ID</code>.
     */
    val NESTING_EVENT_ID: TableField<EventsTransactionsHistoryRecord, ULong?> = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_transactions_history.NESTING_EVENT_TYPE</code>.
     */
    val NESTING_EVENT_TYPE: TableField<EventsTransactionsHistoryRecord, EventsTransactionsHistoryNestingEventType?> = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(EventsTransactionsHistoryNestingEventType::class.java), this, "")

    private constructor(alias: Name, aliased: Table<EventsTransactionsHistoryRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<EventsTransactionsHistoryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<EventsTransactionsHistoryRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.events_transactions_history</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.events_transactions_history</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.events_transactions_history</code>
     * table reference
     */
    constructor(): this(DSL.name("events_transactions_history"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getPrimaryKey(): UniqueKey<EventsTransactionsHistoryRecord> = KEY_EVENTS_TRANSACTIONS_HISTORY_PRIMARY
    override fun `as`(alias: String): EventsTransactionsHistory = EventsTransactionsHistory(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsTransactionsHistory = EventsTransactionsHistory(alias, this)
    override fun `as`(alias: Table<*>): EventsTransactionsHistory = EventsTransactionsHistory(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsTransactionsHistory = EventsTransactionsHistory(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsTransactionsHistory = EventsTransactionsHistory(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EventsTransactionsHistory = EventsTransactionsHistory(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): EventsTransactionsHistory = EventsTransactionsHistory(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): EventsTransactionsHistory = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): EventsTransactionsHistory = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): EventsTransactionsHistory = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): EventsTransactionsHistory = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): EventsTransactionsHistory = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): EventsTransactionsHistory = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): EventsTransactionsHistory = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): EventsTransactionsHistory = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): EventsTransactionsHistory = where(DSL.notExists(select))
}
