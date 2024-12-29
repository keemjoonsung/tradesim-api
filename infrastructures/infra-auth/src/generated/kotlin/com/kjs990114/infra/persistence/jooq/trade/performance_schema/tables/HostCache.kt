/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.HostCacheHostValidated
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.HOST_CACHE_HOST
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_HOST_CACHE_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.HostCacheRecord

import java.time.LocalDateTime

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
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
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
open class HostCache(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, HostCacheRecord>?,
    parentPath: InverseForeignKey<out Record, HostCacheRecord>?,
    aliased: Table<HostCacheRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<HostCacheRecord>(
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
         * The reference instance of <code>performance_schema.host_cache</code>
         */
        val HOST_CACHE: HostCache = HostCache()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<HostCacheRecord> = HostCacheRecord::class.java

    /**
     * The column <code>performance_schema.host_cache.IP</code>.
     */
    val IP: TableField<HostCacheRecord, String?> = createField(DSL.name("IP"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>performance_schema.host_cache.HOST</code>.
     */
    val HOST: TableField<HostCacheRecord, String?> = createField(DSL.name("HOST"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>performance_schema.host_cache.HOST_VALIDATED</code>.
     */
    val HOST_VALIDATED: TableField<HostCacheRecord, HostCacheHostValidated?> = createField(DSL.name("HOST_VALIDATED"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(HostCacheHostValidated::class.java), this, "")

    /**
     * The column <code>performance_schema.host_cache.SUM_CONNECT_ERRORS</code>.
     */
    val SUM_CONNECT_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("SUM_CONNECT_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_HOST_BLOCKED_ERRORS</code>.
     */
    val COUNT_HOST_BLOCKED_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_HOST_BLOCKED_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_NAMEINFO_TRANSIENT_ERRORS</code>.
     */
    val COUNT_NAMEINFO_TRANSIENT_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_NAMEINFO_TRANSIENT_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_NAMEINFO_PERMANENT_ERRORS</code>.
     */
    val COUNT_NAMEINFO_PERMANENT_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_NAMEINFO_PERMANENT_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_FORMAT_ERRORS</code>.
     */
    val COUNT_FORMAT_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_FORMAT_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_ADDRINFO_TRANSIENT_ERRORS</code>.
     */
    val COUNT_ADDRINFO_TRANSIENT_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_ADDRINFO_TRANSIENT_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_ADDRINFO_PERMANENT_ERRORS</code>.
     */
    val COUNT_ADDRINFO_PERMANENT_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_ADDRINFO_PERMANENT_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_FCRDNS_ERRORS</code>.
     */
    val COUNT_FCRDNS_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_FCRDNS_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_HOST_ACL_ERRORS</code>.
     */
    val COUNT_HOST_ACL_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_HOST_ACL_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_NO_AUTH_PLUGIN_ERRORS</code>.
     */
    val COUNT_NO_AUTH_PLUGIN_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_NO_AUTH_PLUGIN_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_AUTH_PLUGIN_ERRORS</code>.
     */
    val COUNT_AUTH_PLUGIN_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_AUTH_PLUGIN_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_HANDSHAKE_ERRORS</code>.
     */
    val COUNT_HANDSHAKE_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_HANDSHAKE_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_PROXY_USER_ERRORS</code>.
     */
    val COUNT_PROXY_USER_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_PROXY_USER_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_PROXY_USER_ACL_ERRORS</code>.
     */
    val COUNT_PROXY_USER_ACL_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_PROXY_USER_ACL_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_AUTHENTICATION_ERRORS</code>.
     */
    val COUNT_AUTHENTICATION_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_AUTHENTICATION_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>performance_schema.host_cache.COUNT_SSL_ERRORS</code>.
     */
    val COUNT_SSL_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_SSL_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_ERRORS</code>.
     */
    val COUNT_MAX_USER_CONNECTIONS_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_MAX_USER_CONNECTIONS_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS</code>.
     */
    val COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_DEFAULT_DATABASE_ERRORS</code>.
     */
    val COUNT_DEFAULT_DATABASE_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_DEFAULT_DATABASE_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_INIT_CONNECT_ERRORS</code>.
     */
    val COUNT_INIT_CONNECT_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_INIT_CONNECT_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>performance_schema.host_cache.COUNT_LOCAL_ERRORS</code>.
     */
    val COUNT_LOCAL_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_LOCAL_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.host_cache.COUNT_UNKNOWN_ERRORS</code>.
     */
    val COUNT_UNKNOWN_ERRORS: TableField<HostCacheRecord, Long?> = createField(DSL.name("COUNT_UNKNOWN_ERRORS"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>performance_schema.host_cache.FIRST_SEEN</code>.
     */
    val FIRST_SEEN: TableField<HostCacheRecord, LocalDateTime?> = createField(DSL.name("FIRST_SEEN"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "")

    /**
     * The column <code>performance_schema.host_cache.LAST_SEEN</code>.
     */
    val LAST_SEEN: TableField<HostCacheRecord, LocalDateTime?> = createField(DSL.name("LAST_SEEN"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "")

    /**
     * The column <code>performance_schema.host_cache.FIRST_ERROR_SEEN</code>.
     */
    val FIRST_ERROR_SEEN: TableField<HostCacheRecord, LocalDateTime?> = createField(DSL.name("FIRST_ERROR_SEEN"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>performance_schema.host_cache.LAST_ERROR_SEEN</code>.
     */
    val LAST_ERROR_SEEN: TableField<HostCacheRecord, LocalDateTime?> = createField(DSL.name("LAST_ERROR_SEEN"), SQLDataType.LOCALDATETIME(0), this, "")

    private constructor(alias: Name, aliased: Table<HostCacheRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<HostCacheRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<HostCacheRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>performance_schema.host_cache</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.host_cache</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.host_cache</code> table reference
     */
    constructor(): this(DSL.name("host_cache"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getIndexes(): List<Index> = listOf(HOST_CACHE_HOST)
    override fun getPrimaryKey(): UniqueKey<HostCacheRecord> = KEY_HOST_CACHE_PRIMARY
    override fun `as`(alias: String): HostCache = HostCache(DSL.name(alias), this)
    override fun `as`(alias: Name): HostCache = HostCache(alias, this)
    override fun `as`(alias: Table<*>): HostCache = HostCache(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): HostCache = HostCache(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): HostCache = HostCache(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): HostCache = HostCache(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): HostCache = HostCache(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): HostCache = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): HostCache = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): HostCache = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): HostCache = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): HostCache = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): HostCache = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): HostCache = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): HostCache = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): HostCache = where(DSL.notExists(select))
}
