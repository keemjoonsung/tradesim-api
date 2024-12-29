/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.SocketInstancesState
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.SOCKET_INSTANCES_IP
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.SOCKET_INSTANCES_SOCKET_ID
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.SOCKET_INSTANCES_THREAD_ID
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_SOCKET_INSTANCES_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.SocketInstancesRecord

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
import org.jooq.Row7
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
open class SocketInstances(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, SocketInstancesRecord>?,
    parentPath: InverseForeignKey<out Record, SocketInstancesRecord>?,
    aliased: Table<SocketInstancesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<SocketInstancesRecord>(
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
         * <code>performance_schema.socket_instances</code>
         */
        val SOCKET_INSTANCES: SocketInstances = SocketInstances()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SocketInstancesRecord> = SocketInstancesRecord::class.java

    /**
     * The column <code>performance_schema.socket_instances.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<SocketInstancesRecord, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.socket_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<SocketInstancesRecord, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_instances.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<SocketInstancesRecord, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.socket_instances.SOCKET_ID</code>.
     */
    val SOCKET_ID: TableField<SocketInstancesRecord, Int?> = createField(DSL.name("SOCKET_ID"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_instances.IP</code>.
     */
    val IP: TableField<SocketInstancesRecord, String?> = createField(DSL.name("IP"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_instances.PORT</code>.
     */
    val PORT: TableField<SocketInstancesRecord, Int?> = createField(DSL.name("PORT"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_instances.STATE</code>.
     */
    val STATE: TableField<SocketInstancesRecord, SocketInstancesState?> = createField(DSL.name("STATE"), SQLDataType.VARCHAR(6).nullable(false).asEnumDataType(SocketInstancesState::class.java), this, "")

    private constructor(alias: Name, aliased: Table<SocketInstancesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<SocketInstancesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<SocketInstancesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>performance_schema.socket_instances</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.socket_instances</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.socket_instances</code> table reference
     */
    constructor(): this(DSL.name("socket_instances"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getIndexes(): List<Index> = listOf(SOCKET_INSTANCES_IP, SOCKET_INSTANCES_SOCKET_ID, SOCKET_INSTANCES_THREAD_ID)
    override fun getPrimaryKey(): UniqueKey<SocketInstancesRecord> = KEY_SOCKET_INSTANCES_PRIMARY
    override fun `as`(alias: String): SocketInstances = SocketInstances(DSL.name(alias), this)
    override fun `as`(alias: Name): SocketInstances = SocketInstances(alias, this)
    override fun `as`(alias: Table<*>): SocketInstances = SocketInstances(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SocketInstances = SocketInstances(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SocketInstances = SocketInstances(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): SocketInstances = SocketInstances(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): SocketInstances = SocketInstances(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): SocketInstances = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): SocketInstances = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): SocketInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): SocketInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): SocketInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): SocketInstances = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): SocketInstances = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): SocketInstances = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): SocketInstances = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row7<String?, ULong?, ULong?, Int?, String?, Int?, SocketInstancesState?> = super.fieldsRow() as Row7<String?, ULong?, ULong?, Int?, String?, Int?, SocketInstancesState?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, ULong?, ULong?, Int?, String?, Int?, SocketInstancesState?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, ULong?, ULong?, Int?, String?, Int?, SocketInstancesState?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
