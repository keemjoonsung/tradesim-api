/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables


import com.kjs990114.infra.persistence.jooq.trade.mysql.Mysql
import com.kjs990114.infra.persistence.jooq.trade.mysql.indexes.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_CHANNEL_NAME
import com.kjs990114.infra.persistence.jooq.trade.mysql.keys.KEY_REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records.ReplicationAsynchronousConnectionFailoverRecord

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
import org.jooq.Row6
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
import org.jooq.types.UByte
import org.jooq.types.UInteger


/**
 * The source configuration details
 */
@Suppress("UNCHECKED_CAST")
open class ReplicationAsynchronousConnectionFailover(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ReplicationAsynchronousConnectionFailoverRecord>?,
    parentPath: InverseForeignKey<out Record, ReplicationAsynchronousConnectionFailoverRecord>?,
    aliased: Table<ReplicationAsynchronousConnectionFailoverRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ReplicationAsynchronousConnectionFailoverRecord>(
    alias,
    Mysql.MYSQL,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment("The source configuration details"),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>mysql.replication_asynchronous_connection_failover</code>
         */
        val REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER: ReplicationAsynchronousConnectionFailover = ReplicationAsynchronousConnectionFailover()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ReplicationAsynchronousConnectionFailoverRecord> = ReplicationAsynchronousConnectionFailoverRecord::class.java

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Channel_name</code>.
     * The replication channel name that connects source and replica.
     */
    val CHANNEL_NAME: TableField<ReplicationAsynchronousConnectionFailoverRecord, String?> = createField(DSL.name("Channel_name"), SQLDataType.CHAR(64).nullable(false), this, "The replication channel name that connects source and replica.")

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Host</code>. The
     * source hostname that the replica will attempt to switch over the
     * replication connection to in case of a failure.
     */
    val HOST: TableField<ReplicationAsynchronousConnectionFailoverRecord, String?> = createField(DSL.name("Host"), SQLDataType.CHAR(255).nullable(false), this, "The source hostname that the replica will attempt to switch over the replication connection to in case of a failure.")

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Port</code>. The
     * source port that the replica will attempt to switch over the replication
     * connection to in case of a failure.
     */
    val PORT: TableField<ReplicationAsynchronousConnectionFailoverRecord, UInteger?> = createField(DSL.name("Port"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "The source port that the replica will attempt to switch over the replication connection to in case of a failure.")

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Network_namespace</code>.
     * The source network namespace that the replica will attempt to switch over
     * the replication connection to in case of a failure. If its value is
     * empty, connections use the default (global) namespace.
     */
    val NETWORK_NAMESPACE: TableField<ReplicationAsynchronousConnectionFailoverRecord, String?> = createField(DSL.name("Network_namespace"), SQLDataType.CHAR(64).nullable(false), this, "The source network namespace that the replica will attempt to switch over the replication connection to in case of a failure. If its value is empty, connections use the default (global) namespace.")

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Weight</code>.
     * The order in which the replica shall try to switch the connection over to
     * when there are failures. Weight can be set to a number between 1 and 100,
     * where 100 is the highest weight and 1 the lowest.
     */
    val WEIGHT: TableField<ReplicationAsynchronousConnectionFailoverRecord, UByte?> = createField(DSL.name("Weight"), SQLDataType.TINYINTUNSIGNED.nullable(false), this, "The order in which the replica shall try to switch the connection over to when there are failures. Weight can be set to a number between 1 and 100, where 100 is the highest weight and 1 the lowest.")

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Managed_name</code>.
     * The name of the group which this server belongs to.
     */
    val MANAGED_NAME: TableField<ReplicationAsynchronousConnectionFailoverRecord, String?> = createField(DSL.name("Managed_name"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "The name of the group which this server belongs to.")

    private constructor(alias: Name, aliased: Table<ReplicationAsynchronousConnectionFailoverRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ReplicationAsynchronousConnectionFailoverRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ReplicationAsynchronousConnectionFailoverRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>mysql.replication_asynchronous_connection_failover</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>mysql.replication_asynchronous_connection_failover</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.replication_asynchronous_connection_failover</code>
     * table reference
     */
    constructor(): this(DSL.name("replication_asynchronous_connection_failover"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Mysql.MYSQL
    override fun getIndexes(): List<Index> = listOf(REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_CHANNEL_NAME)
    override fun getPrimaryKey(): UniqueKey<ReplicationAsynchronousConnectionFailoverRecord> = KEY_REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_PRIMARY
    override fun `as`(alias: String): ReplicationAsynchronousConnectionFailover = ReplicationAsynchronousConnectionFailover(DSL.name(alias), this)
    override fun `as`(alias: Name): ReplicationAsynchronousConnectionFailover = ReplicationAsynchronousConnectionFailover(alias, this)
    override fun `as`(alias: Table<*>): ReplicationAsynchronousConnectionFailover = ReplicationAsynchronousConnectionFailover(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ReplicationAsynchronousConnectionFailover = ReplicationAsynchronousConnectionFailover(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ReplicationAsynchronousConnectionFailover = ReplicationAsynchronousConnectionFailover(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ReplicationAsynchronousConnectionFailover = ReplicationAsynchronousConnectionFailover(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ReplicationAsynchronousConnectionFailover = ReplicationAsynchronousConnectionFailover(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ReplicationAsynchronousConnectionFailover = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ReplicationAsynchronousConnectionFailover = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ReplicationAsynchronousConnectionFailover = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ReplicationAsynchronousConnectionFailover = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ReplicationAsynchronousConnectionFailover = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ReplicationAsynchronousConnectionFailover = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ReplicationAsynchronousConnectionFailover = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ReplicationAsynchronousConnectionFailover = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ReplicationAsynchronousConnectionFailover = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<String?, String?, UInteger?, String?, UByte?, String?> = super.fieldsRow() as Row6<String?, String?, UInteger?, String?, UByte?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, UInteger?, String?, UByte?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, UInteger?, String?, UByte?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}