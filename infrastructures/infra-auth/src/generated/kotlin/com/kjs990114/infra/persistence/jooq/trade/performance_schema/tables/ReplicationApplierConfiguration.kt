/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationApplierConfigurationRequireRowFormat
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationApplierConfigurationRequireTablePrimaryKeyCheck
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_REPLICATION_APPLIER_CONFIGURATION_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.ReplicationApplierConfigurationRecord

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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ReplicationApplierConfiguration(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ReplicationApplierConfigurationRecord>?,
    parentPath: InverseForeignKey<out Record, ReplicationApplierConfigurationRecord>?,
    aliased: Table<ReplicationApplierConfigurationRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ReplicationApplierConfigurationRecord>(
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
         * <code>performance_schema.replication_applier_configuration</code>
         */
        val REPLICATION_APPLIER_CONFIGURATION: ReplicationApplierConfiguration = ReplicationApplierConfiguration()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ReplicationApplierConfigurationRecord> = ReplicationApplierConfigurationRecord::class.java

    /**
     * The column
     * <code>performance_schema.replication_applier_configuration.CHANNEL_NAME</code>.
     */
    val CHANNEL_NAME: TableField<ReplicationApplierConfigurationRecord, String?> = createField(DSL.name("CHANNEL_NAME"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_configuration.DESIRED_DELAY</code>.
     */
    val DESIRED_DELAY: TableField<ReplicationApplierConfigurationRecord, Int?> = createField(DSL.name("DESIRED_DELAY"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_applier_configuration.PRIVILEGE_CHECKS_USER</code>.
     * User name for the security context of the applier.
     */
    val PRIVILEGE_CHECKS_USER: TableField<ReplicationApplierConfigurationRecord, String?> = createField(DSL.name("PRIVILEGE_CHECKS_USER"), SQLDataType.CLOB, this, "User name for the security context of the applier.")

    /**
     * The column
     * <code>performance_schema.replication_applier_configuration.REQUIRE_ROW_FORMAT</code>.
     * Indicates whether the channel shall only accept row based events.
     */
    val REQUIRE_ROW_FORMAT: TableField<ReplicationApplierConfigurationRecord, ReplicationApplierConfigurationRequireRowFormat?> = createField(DSL.name("REQUIRE_ROW_FORMAT"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(ReplicationApplierConfigurationRequireRowFormat::class.java), this, "Indicates whether the channel shall only accept row based events.")

    /**
     * The column
     * <code>performance_schema.replication_applier_configuration.REQUIRE_TABLE_PRIMARY_KEY_CHECK</code>.
     * Indicates what is the channel policy regarding tables without primary
     * keys on create and alter table queries
     */
    val REQUIRE_TABLE_PRIMARY_KEY_CHECK: TableField<ReplicationApplierConfigurationRecord, ReplicationApplierConfigurationRequireTablePrimaryKeyCheck?> = createField(DSL.name("REQUIRE_TABLE_PRIMARY_KEY_CHECK"), SQLDataType.VARCHAR(8).nullable(false).asEnumDataType(ReplicationApplierConfigurationRequireTablePrimaryKeyCheck::class.java), this, "Indicates what is the channel policy regarding tables without primary keys on create and alter table queries")

    /**
     * The column
     * <code>performance_schema.replication_applier_configuration.ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE</code>.
     * Indicates whether the channel will generate a new GTID for anonymous
     * transactions. OFF means that anonymous transactions will remain
     * anonymous. LOCAL means that anonymous transactions will be assigned a
     * newly generated GTID based on server_uuid. UUID indicates that anonymous
     * transactions will be assigned a newly generated GTID based on
     * Assign_gtids_to_anonymous_transactions_value
     */
    val ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE: TableField<ReplicationApplierConfigurationRecord, ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType?> = createField(DSL.name("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE"), SQLDataType.VARCHAR(5).nullable(false).asEnumDataType(ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType::class.java), this, "Indicates whether the channel will generate a new GTID for anonymous transactions. OFF means that anonymous transactions will remain anonymous. LOCAL means that anonymous transactions will be assigned a newly generated GTID based on server_uuid. UUID indicates that anonymous transactions will be assigned a newly generated GTID based on Assign_gtids_to_anonymous_transactions_value")

    /**
     * The column
     * <code>performance_schema.replication_applier_configuration.ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_VALUE</code>.
     * Indicates the UUID used while generating GTIDs for anonymous transactions
     */
    val ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_VALUE: TableField<ReplicationApplierConfigurationRecord, String?> = createField(DSL.name("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_VALUE"), SQLDataType.CLOB, this, "Indicates the UUID used while generating GTIDs for anonymous transactions")

    private constructor(alias: Name, aliased: Table<ReplicationApplierConfigurationRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ReplicationApplierConfigurationRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ReplicationApplierConfigurationRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.replication_applier_configuration</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.replication_applier_configuration</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>performance_schema.replication_applier_configuration</code> table
     * reference
     */
    constructor(): this(DSL.name("replication_applier_configuration"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getPrimaryKey(): UniqueKey<ReplicationApplierConfigurationRecord> = KEY_REPLICATION_APPLIER_CONFIGURATION_PRIMARY
    override fun `as`(alias: String): ReplicationApplierConfiguration = ReplicationApplierConfiguration(DSL.name(alias), this)
    override fun `as`(alias: Name): ReplicationApplierConfiguration = ReplicationApplierConfiguration(alias, this)
    override fun `as`(alias: Table<*>): ReplicationApplierConfiguration = ReplicationApplierConfiguration(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ReplicationApplierConfiguration = ReplicationApplierConfiguration(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ReplicationApplierConfiguration = ReplicationApplierConfiguration(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ReplicationApplierConfiguration = ReplicationApplierConfiguration(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ReplicationApplierConfiguration = ReplicationApplierConfiguration(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ReplicationApplierConfiguration = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ReplicationApplierConfiguration = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ReplicationApplierConfiguration = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ReplicationApplierConfiguration = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ReplicationApplierConfiguration = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ReplicationApplierConfiguration = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ReplicationApplierConfiguration = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ReplicationApplierConfiguration = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ReplicationApplierConfiguration = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row7<String?, Int?, String?, ReplicationApplierConfigurationRequireRowFormat?, ReplicationApplierConfigurationRequireTablePrimaryKeyCheck?, ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType?, String?> = super.fieldsRow() as Row7<String?, Int?, String?, ReplicationApplierConfigurationRequireRowFormat?, ReplicationApplierConfigurationRequireTablePrimaryKeyCheck?, ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, Int?, String?, ReplicationApplierConfigurationRequireRowFormat?, ReplicationApplierConfigurationRequireTablePrimaryKeyCheck?, ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, Int?, String?, ReplicationApplierConfigurationRequireRowFormat?, ReplicationApplierConfigurationRequireTablePrimaryKeyCheck?, ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
