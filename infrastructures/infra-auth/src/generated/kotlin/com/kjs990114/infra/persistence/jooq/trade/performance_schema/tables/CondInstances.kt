/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.COND_INSTANCES_NAME
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_COND_INSTANCES_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.CondInstancesRecord

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
import org.jooq.Row2
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
open class CondInstances(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, CondInstancesRecord>?,
    parentPath: InverseForeignKey<out Record, CondInstancesRecord>?,
    aliased: Table<CondInstancesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<CondInstancesRecord>(
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
         * <code>performance_schema.cond_instances</code>
         */
        val COND_INSTANCES: CondInstances = CondInstances()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CondInstancesRecord> = CondInstancesRecord::class.java

    /**
     * The column <code>performance_schema.cond_instances.NAME</code>.
     */
    val NAME: TableField<CondInstancesRecord, String?> = createField(DSL.name("NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.cond_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<CondInstancesRecord, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<CondInstancesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<CondInstancesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<CondInstancesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>performance_schema.cond_instances</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.cond_instances</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.cond_instances</code> table reference
     */
    constructor(): this(DSL.name("cond_instances"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getIndexes(): List<Index> = listOf(COND_INSTANCES_NAME)
    override fun getPrimaryKey(): UniqueKey<CondInstancesRecord> = KEY_COND_INSTANCES_PRIMARY
    override fun `as`(alias: String): CondInstances = CondInstances(DSL.name(alias), this)
    override fun `as`(alias: Name): CondInstances = CondInstances(alias, this)
    override fun `as`(alias: Table<*>): CondInstances = CondInstances(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CondInstances = CondInstances(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CondInstances = CondInstances(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CondInstances = CondInstances(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): CondInstances = CondInstances(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): CondInstances = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): CondInstances = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): CondInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): CondInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): CondInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): CondInstances = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): CondInstances = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): CondInstances = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): CondInstances = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<String?, ULong?> = super.fieldsRow() as Row2<String?, ULong?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, ULong?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, ULong?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}