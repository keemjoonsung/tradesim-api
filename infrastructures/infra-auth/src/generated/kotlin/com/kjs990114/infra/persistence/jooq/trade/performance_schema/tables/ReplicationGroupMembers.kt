/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.ReplicationGroupMembersRecord

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
import org.jooq.Row8
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.SelectField
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ReplicationGroupMembers(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ReplicationGroupMembersRecord>?,
    parentPath: InverseForeignKey<out Record, ReplicationGroupMembersRecord>?,
    aliased: Table<ReplicationGroupMembersRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ReplicationGroupMembersRecord>(
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
         * <code>performance_schema.replication_group_members</code>
         */
        val REPLICATION_GROUP_MEMBERS: ReplicationGroupMembers = ReplicationGroupMembers()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ReplicationGroupMembersRecord> = ReplicationGroupMembersRecord::class.java

    /**
     * The column
     * <code>performance_schema.replication_group_members.CHANNEL_NAME</code>.
     */
    val CHANNEL_NAME: TableField<ReplicationGroupMembersRecord, String?> = createField(DSL.name("CHANNEL_NAME"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_group_members.MEMBER_ID</code>.
     */
    val MEMBER_ID: TableField<ReplicationGroupMembersRecord, String?> = createField(DSL.name("MEMBER_ID"), SQLDataType.CHAR(36).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_group_members.MEMBER_HOST</code>.
     */
    val MEMBER_HOST: TableField<ReplicationGroupMembersRecord, String?> = createField(DSL.name("MEMBER_HOST"), SQLDataType.CHAR(255).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_group_members.MEMBER_PORT</code>.
     */
    val MEMBER_PORT: TableField<ReplicationGroupMembersRecord, Int?> = createField(DSL.name("MEMBER_PORT"), SQLDataType.INTEGER, this, "")

    /**
     * The column
     * <code>performance_schema.replication_group_members.MEMBER_STATE</code>.
     */
    val MEMBER_STATE: TableField<ReplicationGroupMembersRecord, String?> = createField(DSL.name("MEMBER_STATE"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_group_members.MEMBER_ROLE</code>.
     */
    val MEMBER_ROLE: TableField<ReplicationGroupMembersRecord, String?> = createField(DSL.name("MEMBER_ROLE"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_group_members.MEMBER_VERSION</code>.
     */
    val MEMBER_VERSION: TableField<ReplicationGroupMembersRecord, String?> = createField(DSL.name("MEMBER_VERSION"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.replication_group_members.MEMBER_COMMUNICATION_STACK</code>.
     */
    val MEMBER_COMMUNICATION_STACK: TableField<ReplicationGroupMembersRecord, String?> = createField(DSL.name("MEMBER_COMMUNICATION_STACK"), SQLDataType.CHAR(64).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ReplicationGroupMembersRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ReplicationGroupMembersRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ReplicationGroupMembersRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.replication_group_members</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.replication_group_members</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.replication_group_members</code> table
     * reference
     */
    constructor(): this(DSL.name("replication_group_members"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): ReplicationGroupMembers = ReplicationGroupMembers(DSL.name(alias), this)
    override fun `as`(alias: Name): ReplicationGroupMembers = ReplicationGroupMembers(alias, this)
    override fun `as`(alias: Table<*>): ReplicationGroupMembers = ReplicationGroupMembers(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ReplicationGroupMembers = ReplicationGroupMembers(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ReplicationGroupMembers = ReplicationGroupMembers(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ReplicationGroupMembers = ReplicationGroupMembers(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): ReplicationGroupMembers = ReplicationGroupMembers(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ReplicationGroupMembers = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): ReplicationGroupMembers = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): ReplicationGroupMembers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ReplicationGroupMembers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ReplicationGroupMembers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ReplicationGroupMembers = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ReplicationGroupMembers = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ReplicationGroupMembers = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ReplicationGroupMembers = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row8<String?, String?, String?, Int?, String?, String?, String?, String?> = super.fieldsRow() as Row8<String?, String?, String?, Int?, String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, Int?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, Int?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}