/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.RWLOCK_INSTANCES_NAME
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.RWLOCK_INSTANCES_WRITE_LOCKED_BY_THREAD_ID
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_RWLOCK_INSTANCES_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.RwlockInstancesRecord

import java.util.function.Function

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row4
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
open class RwlockInstances(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, RwlockInstancesRecord>?,
    parentPath: InverseForeignKey<out Record, RwlockInstancesRecord>?,
    aliased: Table<RwlockInstancesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<RwlockInstancesRecord>(
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
         * <code>performance_schema.rwlock_instances</code>
         */
        val RWLOCK_INSTANCES: RwlockInstances = RwlockInstances()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RwlockInstancesRecord> = RwlockInstancesRecord::class.java

    /**
     * The column <code>performance_schema.rwlock_instances.NAME</code>.
     */
    val NAME: TableField<RwlockInstancesRecord, String?> = createField(DSL.name("NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.rwlock_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<RwlockInstancesRecord, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.rwlock_instances.WRITE_LOCKED_BY_THREAD_ID</code>.
     */
    val WRITE_LOCKED_BY_THREAD_ID: TableField<RwlockInstancesRecord, ULong?> = createField(DSL.name("WRITE_LOCKED_BY_THREAD_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.rwlock_instances.READ_LOCKED_BY_COUNT</code>.
     */
    val READ_LOCKED_BY_COUNT: TableField<RwlockInstancesRecord, UInteger?> = createField(DSL.name("READ_LOCKED_BY_COUNT"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<RwlockInstancesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<RwlockInstancesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<RwlockInstancesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>performance_schema.rwlock_instances</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.rwlock_instances</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.rwlock_instances</code> table reference
     */
    constructor(): this(DSL.name("rwlock_instances"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getIndexes(): List<Index> = listOf(RWLOCK_INSTANCES_NAME, RWLOCK_INSTANCES_WRITE_LOCKED_BY_THREAD_ID)
    override fun getPrimaryKey(): UniqueKey<RwlockInstancesRecord> = KEY_RWLOCK_INSTANCES_PRIMARY
    override fun `as`(alias: String): RwlockInstances = RwlockInstances(DSL.name(alias), this)
    override fun `as`(alias: Name): RwlockInstances = RwlockInstances(alias, this)
    override fun `as`(alias: Table<*>): RwlockInstances = RwlockInstances(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): RwlockInstances = RwlockInstances(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RwlockInstances = RwlockInstances(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): RwlockInstances = RwlockInstances(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): RwlockInstances = RwlockInstances(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): RwlockInstances = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): RwlockInstances = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): RwlockInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): RwlockInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): RwlockInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): RwlockInstances = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): RwlockInstances = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): RwlockInstances = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): RwlockInstances = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<String?, ULong?, ULong?, UInteger?> = super.fieldsRow() as Row4<String?, ULong?, ULong?, UInteger?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, ULong?, ULong?, UInteger?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, ULong?, ULong?, UInteger?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}