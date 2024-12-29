/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.MemorySummaryByThreadByEventNameRecord

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
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class MemorySummaryByThreadByEventName(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, MemorySummaryByThreadByEventNameRecord>?,
    parentPath: InverseForeignKey<out Record, MemorySummaryByThreadByEventNameRecord>?,
    aliased: Table<MemorySummaryByThreadByEventNameRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<MemorySummaryByThreadByEventNameRecord>(
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
         * <code>performance_schema.memory_summary_by_thread_by_event_name</code>
         */
        val MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME: MemorySummaryByThreadByEventName = MemorySummaryByThreadByEventName()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<MemorySummaryByThreadByEventNameRecord> = MemorySummaryByThreadByEventNameRecord::class.java

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<MemorySummaryByThreadByEventNameRecord, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<MemorySummaryByThreadByEventNameRecord, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.COUNT_ALLOC</code>.
     */
    val COUNT_ALLOC: TableField<MemorySummaryByThreadByEventNameRecord, ULong?> = createField(DSL.name("COUNT_ALLOC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.COUNT_FREE</code>.
     */
    val COUNT_FREE: TableField<MemorySummaryByThreadByEventNameRecord, ULong?> = createField(DSL.name("COUNT_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    val SUM_NUMBER_OF_BYTES_ALLOC: TableField<MemorySummaryByThreadByEventNameRecord, ULong?> = createField(DSL.name("SUM_NUMBER_OF_BYTES_ALLOC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    val SUM_NUMBER_OF_BYTES_FREE: TableField<MemorySummaryByThreadByEventNameRecord, ULong?> = createField(DSL.name("SUM_NUMBER_OF_BYTES_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.LOW_COUNT_USED</code>.
     */
    val LOW_COUNT_USED: TableField<MemorySummaryByThreadByEventNameRecord, Long?> = createField(DSL.name("LOW_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.CURRENT_COUNT_USED</code>.
     */
    val CURRENT_COUNT_USED: TableField<MemorySummaryByThreadByEventNameRecord, Long?> = createField(DSL.name("CURRENT_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.HIGH_COUNT_USED</code>.
     */
    val HIGH_COUNT_USED: TableField<MemorySummaryByThreadByEventNameRecord, Long?> = createField(DSL.name("HIGH_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    val LOW_NUMBER_OF_BYTES_USED: TableField<MemorySummaryByThreadByEventNameRecord, Long?> = createField(DSL.name("LOW_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    val CURRENT_NUMBER_OF_BYTES_USED: TableField<MemorySummaryByThreadByEventNameRecord, Long?> = createField(DSL.name("CURRENT_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    val HIGH_NUMBER_OF_BYTES_USED: TableField<MemorySummaryByThreadByEventNameRecord, Long?> = createField(DSL.name("HIGH_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<MemorySummaryByThreadByEventNameRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<MemorySummaryByThreadByEventNameRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<MemorySummaryByThreadByEventNameRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.memory_summary_by_thread_by_event_name</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.memory_summary_by_thread_by_event_name</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>performance_schema.memory_summary_by_thread_by_event_name</code>
     * table reference
     */
    constructor(): this(DSL.name("memory_summary_by_thread_by_event_name"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getPrimaryKey(): UniqueKey<MemorySummaryByThreadByEventNameRecord> = KEY_MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME_PRIMARY
    override fun `as`(alias: String): MemorySummaryByThreadByEventName = MemorySummaryByThreadByEventName(DSL.name(alias), this)
    override fun `as`(alias: Name): MemorySummaryByThreadByEventName = MemorySummaryByThreadByEventName(alias, this)
    override fun `as`(alias: Table<*>): MemorySummaryByThreadByEventName = MemorySummaryByThreadByEventName(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): MemorySummaryByThreadByEventName = MemorySummaryByThreadByEventName(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): MemorySummaryByThreadByEventName = MemorySummaryByThreadByEventName(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): MemorySummaryByThreadByEventName = MemorySummaryByThreadByEventName(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): MemorySummaryByThreadByEventName = MemorySummaryByThreadByEventName(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): MemorySummaryByThreadByEventName = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): MemorySummaryByThreadByEventName = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): MemorySummaryByThreadByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): MemorySummaryByThreadByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): MemorySummaryByThreadByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): MemorySummaryByThreadByEventName = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): MemorySummaryByThreadByEventName = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): MemorySummaryByThreadByEventName = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): MemorySummaryByThreadByEventName = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row12<ULong?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?> = super.fieldsRow() as Row12<ULong?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (ULong?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (ULong?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
