/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME_USER
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.MemorySummaryByUserByEventNameRecord

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
open class MemorySummaryByUserByEventName(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, MemorySummaryByUserByEventNameRecord>?,
    parentPath: InverseForeignKey<out Record, MemorySummaryByUserByEventNameRecord>?,
    aliased: Table<MemorySummaryByUserByEventNameRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<MemorySummaryByUserByEventNameRecord>(
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
         * <code>performance_schema.memory_summary_by_user_by_event_name</code>
         */
        val MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME: MemorySummaryByUserByEventName = MemorySummaryByUserByEventName()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<MemorySummaryByUserByEventNameRecord> = MemorySummaryByUserByEventNameRecord::class.java

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.USER</code>.
     */
    val USER: TableField<MemorySummaryByUserByEventNameRecord, String?> = createField(DSL.name("USER"), SQLDataType.CHAR(32), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<MemorySummaryByUserByEventNameRecord, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.COUNT_ALLOC</code>.
     */
    val COUNT_ALLOC: TableField<MemorySummaryByUserByEventNameRecord, ULong?> = createField(DSL.name("COUNT_ALLOC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.COUNT_FREE</code>.
     */
    val COUNT_FREE: TableField<MemorySummaryByUserByEventNameRecord, ULong?> = createField(DSL.name("COUNT_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    val SUM_NUMBER_OF_BYTES_ALLOC: TableField<MemorySummaryByUserByEventNameRecord, ULong?> = createField(DSL.name("SUM_NUMBER_OF_BYTES_ALLOC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    val SUM_NUMBER_OF_BYTES_FREE: TableField<MemorySummaryByUserByEventNameRecord, ULong?> = createField(DSL.name("SUM_NUMBER_OF_BYTES_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.LOW_COUNT_USED</code>.
     */
    val LOW_COUNT_USED: TableField<MemorySummaryByUserByEventNameRecord, Long?> = createField(DSL.name("LOW_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.CURRENT_COUNT_USED</code>.
     */
    val CURRENT_COUNT_USED: TableField<MemorySummaryByUserByEventNameRecord, Long?> = createField(DSL.name("CURRENT_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.HIGH_COUNT_USED</code>.
     */
    val HIGH_COUNT_USED: TableField<MemorySummaryByUserByEventNameRecord, Long?> = createField(DSL.name("HIGH_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    val LOW_NUMBER_OF_BYTES_USED: TableField<MemorySummaryByUserByEventNameRecord, Long?> = createField(DSL.name("LOW_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    val CURRENT_NUMBER_OF_BYTES_USED: TableField<MemorySummaryByUserByEventNameRecord, Long?> = createField(DSL.name("CURRENT_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.memory_summary_by_user_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    val HIGH_NUMBER_OF_BYTES_USED: TableField<MemorySummaryByUserByEventNameRecord, Long?> = createField(DSL.name("HIGH_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<MemorySummaryByUserByEventNameRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<MemorySummaryByUserByEventNameRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<MemorySummaryByUserByEventNameRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.memory_summary_by_user_by_event_name</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.memory_summary_by_user_by_event_name</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>performance_schema.memory_summary_by_user_by_event_name</code>
     * table reference
     */
    constructor(): this(DSL.name("memory_summary_by_user_by_event_name"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getUniqueKeys(): List<UniqueKey<MemorySummaryByUserByEventNameRecord>> = listOf(KEY_MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME_USER)
    override fun `as`(alias: String): MemorySummaryByUserByEventName = MemorySummaryByUserByEventName(DSL.name(alias), this)
    override fun `as`(alias: Name): MemorySummaryByUserByEventName = MemorySummaryByUserByEventName(alias, this)
    override fun `as`(alias: Table<*>): MemorySummaryByUserByEventName = MemorySummaryByUserByEventName(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): MemorySummaryByUserByEventName = MemorySummaryByUserByEventName(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): MemorySummaryByUserByEventName = MemorySummaryByUserByEventName(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): MemorySummaryByUserByEventName = MemorySummaryByUserByEventName(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): MemorySummaryByUserByEventName = MemorySummaryByUserByEventName(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): MemorySummaryByUserByEventName = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): MemorySummaryByUserByEventName = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): MemorySummaryByUserByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): MemorySummaryByUserByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): MemorySummaryByUserByEventName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): MemorySummaryByUserByEventName = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): MemorySummaryByUserByEventName = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): MemorySummaryByUserByEventName = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): MemorySummaryByUserByEventName = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row12<String?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?> = super.fieldsRow() as Row12<String?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
