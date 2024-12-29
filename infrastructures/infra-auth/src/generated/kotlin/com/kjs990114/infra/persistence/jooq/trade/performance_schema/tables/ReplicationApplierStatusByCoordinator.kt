/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationApplierStatusByCoordinatorServiceState
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.REPLICATION_APPLIER_STATUS_BY_COORDINATOR_THREAD_ID
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_REPLICATION_APPLIER_STATUS_BY_COORDINATOR_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.ReplicationApplierStatusByCoordinatorRecord

import java.time.LocalDateTime
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
import org.jooq.Row15
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
open class ReplicationApplierStatusByCoordinator(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ReplicationApplierStatusByCoordinatorRecord>?,
    parentPath: InverseForeignKey<out Record, ReplicationApplierStatusByCoordinatorRecord>?,
    aliased: Table<ReplicationApplierStatusByCoordinatorRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ReplicationApplierStatusByCoordinatorRecord>(
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
         * <code>performance_schema.replication_applier_status_by_coordinator</code>
         */
        val REPLICATION_APPLIER_STATUS_BY_COORDINATOR: ReplicationApplierStatusByCoordinator = ReplicationApplierStatusByCoordinator()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ReplicationApplierStatusByCoordinatorRecord> = ReplicationApplierStatusByCoordinatorRecord::class.java

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.CHANNEL_NAME</code>.
     */
    val CHANNEL_NAME: TableField<ReplicationApplierStatusByCoordinatorRecord, String?> = createField(DSL.name("CHANNEL_NAME"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<ReplicationApplierStatusByCoordinatorRecord, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.SERVICE_STATE</code>.
     */
    val SERVICE_STATE: TableField<ReplicationApplierStatusByCoordinatorRecord, ReplicationApplierStatusByCoordinatorServiceState?> = createField(DSL.name("SERVICE_STATE"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(ReplicationApplierStatusByCoordinatorServiceState::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_NUMBER</code>.
     */
    val LAST_ERROR_NUMBER: TableField<ReplicationApplierStatusByCoordinatorRecord, Int?> = createField(DSL.name("LAST_ERROR_NUMBER"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE</code>.
     */
    val LAST_ERROR_MESSAGE: TableField<ReplicationApplierStatusByCoordinatorRecord, String?> = createField(DSL.name("LAST_ERROR_MESSAGE"), SQLDataType.VARCHAR(1024).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP</code>.
     */
    val LAST_ERROR_TIMESTAMP: TableField<ReplicationApplierStatusByCoordinatorRecord, LocalDateTime?> = createField(DSL.name("LAST_ERROR_TIMESTAMP"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION</code>.
     */
    val LAST_PROCESSED_TRANSACTION: TableField<ReplicationApplierStatusByCoordinatorRecord, String?> = createField(DSL.name("LAST_PROCESSED_TRANSACTION"), SQLDataType.CHAR(57), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    val LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP: TableField<ReplicationApplierStatusByCoordinatorRecord, LocalDateTime?> = createField(DSL.name("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    val LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP: TableField<ReplicationApplierStatusByCoordinatorRecord, LocalDateTime?> = createField(DSL.name("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP</code>.
     */
    val LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP: TableField<ReplicationApplierStatusByCoordinatorRecord, LocalDateTime?> = createField(DSL.name("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP</code>.
     */
    val LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP: TableField<ReplicationApplierStatusByCoordinatorRecord, LocalDateTime?> = createField(DSL.name("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION</code>.
     */
    val PROCESSING_TRANSACTION: TableField<ReplicationApplierStatusByCoordinatorRecord, String?> = createField(DSL.name("PROCESSING_TRANSACTION"), SQLDataType.CHAR(57), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    val PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP: TableField<ReplicationApplierStatusByCoordinatorRecord, LocalDateTime?> = createField(DSL.name("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    val PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP: TableField<ReplicationApplierStatusByCoordinatorRecord, LocalDateTime?> = createField(DSL.name("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP</code>.
     */
    val PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP: TableField<ReplicationApplierStatusByCoordinatorRecord, LocalDateTime?> = createField(DSL.name("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ReplicationApplierStatusByCoordinatorRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ReplicationApplierStatusByCoordinatorRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ReplicationApplierStatusByCoordinatorRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.replication_applier_status_by_coordinator</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.replication_applier_status_by_coordinator</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>performance_schema.replication_applier_status_by_coordinator</code>
     * table reference
     */
    constructor(): this(DSL.name("replication_applier_status_by_coordinator"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getIndexes(): List<Index> = listOf(REPLICATION_APPLIER_STATUS_BY_COORDINATOR_THREAD_ID)
    override fun getPrimaryKey(): UniqueKey<ReplicationApplierStatusByCoordinatorRecord> = KEY_REPLICATION_APPLIER_STATUS_BY_COORDINATOR_PRIMARY
    override fun `as`(alias: String): ReplicationApplierStatusByCoordinator = ReplicationApplierStatusByCoordinator(DSL.name(alias), this)
    override fun `as`(alias: Name): ReplicationApplierStatusByCoordinator = ReplicationApplierStatusByCoordinator(alias, this)
    override fun `as`(alias: Table<*>): ReplicationApplierStatusByCoordinator = ReplicationApplierStatusByCoordinator(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ReplicationApplierStatusByCoordinator = ReplicationApplierStatusByCoordinator(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ReplicationApplierStatusByCoordinator = ReplicationApplierStatusByCoordinator(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ReplicationApplierStatusByCoordinator = ReplicationApplierStatusByCoordinator(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ReplicationApplierStatusByCoordinator = ReplicationApplierStatusByCoordinator(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ReplicationApplierStatusByCoordinator = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ReplicationApplierStatusByCoordinator = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ReplicationApplierStatusByCoordinator = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ReplicationApplierStatusByCoordinator = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ReplicationApplierStatusByCoordinator = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ReplicationApplierStatusByCoordinator = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ReplicationApplierStatusByCoordinator = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ReplicationApplierStatusByCoordinator = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ReplicationApplierStatusByCoordinator = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row15<String?, ULong?, ReplicationApplierStatusByCoordinatorServiceState?, Int?, String?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row15<String?, ULong?, ReplicationApplierStatusByCoordinatorServiceState?, Int?, String?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, ULong?, ReplicationApplierStatusByCoordinatorServiceState?, Int?, String?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, ULong?, ReplicationApplierStatusByCoordinatorServiceState?, Int?, String?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
