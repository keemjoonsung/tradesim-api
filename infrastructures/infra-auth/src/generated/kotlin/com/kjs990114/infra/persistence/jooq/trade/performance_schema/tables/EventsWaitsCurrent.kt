/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsWaitsCurrentNestingEventType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_EVENTS_WAITS_CURRENT_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.EventsWaitsCurrentRecord

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
import org.jooq.Row19
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
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsWaitsCurrent(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, EventsWaitsCurrentRecord>?,
    parentPath: InverseForeignKey<out Record, EventsWaitsCurrentRecord>?,
    aliased: Table<EventsWaitsCurrentRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<EventsWaitsCurrentRecord>(
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
         * <code>performance_schema.events_waits_current</code>
         */
        val EVENTS_WAITS_CURRENT: EventsWaitsCurrent = EventsWaitsCurrent()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EventsWaitsCurrentRecord> = EventsWaitsCurrentRecord::class.java

    /**
     * The column
     * <code>performance_schema.events_waits_current.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<EventsWaitsCurrentRecord, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_current.EVENT_ID</code>.
     */
    val EVENT_ID: TableField<EventsWaitsCurrentRecord, ULong?> = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.END_EVENT_ID</code>.
     */
    val END_EVENT_ID: TableField<EventsWaitsCurrentRecord, ULong?> = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<EventsWaitsCurrentRecord, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_current.SOURCE</code>.
     */
    val SOURCE: TableField<EventsWaitsCurrentRecord, String?> = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.TIMER_START</code>.
     */
    val TIMER_START: TableField<EventsWaitsCurrentRecord, ULong?> = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.TIMER_END</code>.
     */
    val TIMER_END: TableField<EventsWaitsCurrentRecord, ULong?> = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.TIMER_WAIT</code>.
     */
    val TIMER_WAIT: TableField<EventsWaitsCurrentRecord, ULong?> = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_waits_current.SPINS</code>.
     */
    val SPINS: TableField<EventsWaitsCurrentRecord, UInteger?> = createField(DSL.name("SPINS"), SQLDataType.INTEGERUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.OBJECT_SCHEMA</code>.
     */
    val OBJECT_SCHEMA: TableField<EventsWaitsCurrentRecord, String?> = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.OBJECT_NAME</code>.
     */
    val OBJECT_NAME: TableField<EventsWaitsCurrentRecord, String?> = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(512), this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.INDEX_NAME</code>.
     */
    val INDEX_NAME: TableField<EventsWaitsCurrentRecord, String?> = createField(DSL.name("INDEX_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.OBJECT_TYPE</code>.
     */
    val OBJECT_TYPE: TableField<EventsWaitsCurrentRecord, String?> = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<EventsWaitsCurrentRecord, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.NESTING_EVENT_ID</code>.
     */
    val NESTING_EVENT_ID: TableField<EventsWaitsCurrentRecord, ULong?> = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.NESTING_EVENT_TYPE</code>.
     */
    val NESTING_EVENT_TYPE: TableField<EventsWaitsCurrentRecord, EventsWaitsCurrentNestingEventType?> = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(EventsWaitsCurrentNestingEventType::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.OPERATION</code>.
     */
    val OPERATION: TableField<EventsWaitsCurrentRecord, String?> = createField(DSL.name("OPERATION"), SQLDataType.VARCHAR(32).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.events_waits_current.NUMBER_OF_BYTES</code>.
     */
    val NUMBER_OF_BYTES: TableField<EventsWaitsCurrentRecord, Long?> = createField(DSL.name("NUMBER_OF_BYTES"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>performance_schema.events_waits_current.FLAGS</code>.
     */
    val FLAGS: TableField<EventsWaitsCurrentRecord, UInteger?> = createField(DSL.name("FLAGS"), SQLDataType.INTEGERUNSIGNED, this, "")

    private constructor(alias: Name, aliased: Table<EventsWaitsCurrentRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<EventsWaitsCurrentRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<EventsWaitsCurrentRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>performance_schema.events_waits_current</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.events_waits_current</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.events_waits_current</code> table
     * reference
     */
    constructor(): this(DSL.name("events_waits_current"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getPrimaryKey(): UniqueKey<EventsWaitsCurrentRecord> = KEY_EVENTS_WAITS_CURRENT_PRIMARY
    override fun `as`(alias: String): EventsWaitsCurrent = EventsWaitsCurrent(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsWaitsCurrent = EventsWaitsCurrent(alias, this)
    override fun `as`(alias: Table<*>): EventsWaitsCurrent = EventsWaitsCurrent(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsWaitsCurrent = EventsWaitsCurrent(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsWaitsCurrent = EventsWaitsCurrent(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EventsWaitsCurrent = EventsWaitsCurrent(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): EventsWaitsCurrent = EventsWaitsCurrent(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): EventsWaitsCurrent = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): EventsWaitsCurrent = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): EventsWaitsCurrent = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): EventsWaitsCurrent = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): EventsWaitsCurrent = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): EventsWaitsCurrent = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): EventsWaitsCurrent = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): EventsWaitsCurrent = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): EventsWaitsCurrent = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row19<ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, UInteger?, String?, String?, String?, String?, ULong?, ULong?, EventsWaitsCurrentNestingEventType?, String?, Long?, UInteger?> = super.fieldsRow() as Row19<ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, UInteger?, String?, String?, String?, String?, ULong?, ULong?, EventsWaitsCurrentNestingEventType?, String?, Long?, UInteger?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, UInteger?, String?, String?, String?, String?, ULong?, ULong?, EventsWaitsCurrentNestingEventType?, String?, Long?, UInteger?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, UInteger?, String?, String?, String?, String?, ULong?, ULong?, EventsWaitsCurrentNestingEventType?, String?, Long?, UInteger?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}