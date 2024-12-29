/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationApplierStatusServiceState
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_REPLICATION_APPLIER_STATUS_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.ReplicationApplierStatusRecord

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
open class ReplicationApplierStatus(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ReplicationApplierStatusRecord>?,
    parentPath: InverseForeignKey<out Record, ReplicationApplierStatusRecord>?,
    aliased: Table<ReplicationApplierStatusRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ReplicationApplierStatusRecord>(
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
         * <code>performance_schema.replication_applier_status</code>
         */
        val REPLICATION_APPLIER_STATUS: ReplicationApplierStatus = ReplicationApplierStatus()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ReplicationApplierStatusRecord> = ReplicationApplierStatusRecord::class.java

    /**
     * The column
     * <code>performance_schema.replication_applier_status.CHANNEL_NAME</code>.
     */
    val CHANNEL_NAME: TableField<ReplicationApplierStatusRecord, String?> = createField(DSL.name("CHANNEL_NAME"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status.SERVICE_STATE</code>.
     */
    val SERVICE_STATE: TableField<ReplicationApplierStatusRecord, ReplicationApplierStatusServiceState?> = createField(DSL.name("SERVICE_STATE"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(ReplicationApplierStatusServiceState::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status.REMAINING_DELAY</code>.
     */
    val REMAINING_DELAY: TableField<ReplicationApplierStatusRecord, UInteger?> = createField(DSL.name("REMAINING_DELAY"), SQLDataType.INTEGERUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status.COUNT_TRANSACTIONS_RETRIES</code>.
     */
    val COUNT_TRANSACTIONS_RETRIES: TableField<ReplicationApplierStatusRecord, ULong?> = createField(DSL.name("COUNT_TRANSACTIONS_RETRIES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ReplicationApplierStatusRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ReplicationApplierStatusRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ReplicationApplierStatusRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.replication_applier_status</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.replication_applier_status</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.replication_applier_status</code> table
     * reference
     */
    constructor(): this(DSL.name("replication_applier_status"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getPrimaryKey(): UniqueKey<ReplicationApplierStatusRecord> = KEY_REPLICATION_APPLIER_STATUS_PRIMARY
    override fun `as`(alias: String): ReplicationApplierStatus = ReplicationApplierStatus(DSL.name(alias), this)
    override fun `as`(alias: Name): ReplicationApplierStatus = ReplicationApplierStatus(alias, this)
    override fun `as`(alias: Table<*>): ReplicationApplierStatus = ReplicationApplierStatus(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ReplicationApplierStatus = ReplicationApplierStatus(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ReplicationApplierStatus = ReplicationApplierStatus(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ReplicationApplierStatus = ReplicationApplierStatus(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ReplicationApplierStatus = ReplicationApplierStatus(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ReplicationApplierStatus = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ReplicationApplierStatus = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ReplicationApplierStatus = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ReplicationApplierStatus = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ReplicationApplierStatus = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ReplicationApplierStatus = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ReplicationApplierStatus = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ReplicationApplierStatus = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ReplicationApplierStatus = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<String?, ReplicationApplierStatusServiceState?, UInteger?, ULong?> = super.fieldsRow() as Row4<String?, ReplicationApplierStatusServiceState?, UInteger?, ULong?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, ReplicationApplierStatusServiceState?, UInteger?, ULong?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, ReplicationApplierStatusServiceState?, UInteger?, ULong?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}