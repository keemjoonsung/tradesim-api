/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables


import com.kjs990114.infra.persistence.jooq.trade.mysql.Mysql
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.RoleEdgesWithAdminOption
import com.kjs990114.infra.persistence.jooq.trade.mysql.keys.KEY_ROLE_EDGES_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records.RoleEdgesRecord

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
import org.jooq.Row5
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
 * Role hierarchy and role grants
 */
@Suppress("UNCHECKED_CAST")
open class RoleEdges(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, RoleEdgesRecord>?,
    parentPath: InverseForeignKey<out Record, RoleEdgesRecord>?,
    aliased: Table<RoleEdgesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<RoleEdgesRecord>(
    alias,
    Mysql.MYSQL,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment("Role hierarchy and role grants"),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>mysql.role_edges</code>
         */
        val ROLE_EDGES: RoleEdges = RoleEdges()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RoleEdgesRecord> = RoleEdgesRecord::class.java

    /**
     * The column <code>mysql.role_edges.FROM_HOST</code>.
     */
    val FROM_HOST: TableField<RoleEdgesRecord, String?> = createField(DSL.name("FROM_HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.role_edges.FROM_USER</code>.
     */
    val FROM_USER: TableField<RoleEdgesRecord, String?> = createField(DSL.name("FROM_USER"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.role_edges.TO_HOST</code>.
     */
    val TO_HOST: TableField<RoleEdgesRecord, String?> = createField(DSL.name("TO_HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.role_edges.TO_USER</code>.
     */
    val TO_USER: TableField<RoleEdgesRecord, String?> = createField(DSL.name("TO_USER"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.role_edges.WITH_ADMIN_OPTION</code>.
     */
    val WITH_ADMIN_OPTION: TableField<RoleEdgesRecord, RoleEdgesWithAdminOption?> = createField(DSL.name("WITH_ADMIN_OPTION"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(RoleEdgesWithAdminOption::class.java), this, "")

    private constructor(alias: Name, aliased: Table<RoleEdgesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<RoleEdgesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<RoleEdgesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>mysql.role_edges</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.role_edges</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.role_edges</code> table reference
     */
    constructor(): this(DSL.name("role_edges"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<RoleEdgesRecord> = KEY_ROLE_EDGES_PRIMARY
    override fun `as`(alias: String): RoleEdges = RoleEdges(DSL.name(alias), this)
    override fun `as`(alias: Name): RoleEdges = RoleEdges(alias, this)
    override fun `as`(alias: Table<*>): RoleEdges = RoleEdges(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): RoleEdges = RoleEdges(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RoleEdges = RoleEdges(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): RoleEdges = RoleEdges(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): RoleEdges = RoleEdges(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): RoleEdges = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): RoleEdges = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): RoleEdges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): RoleEdges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): RoleEdges = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): RoleEdges = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): RoleEdges = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): RoleEdges = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): RoleEdges = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<String?, String?, String?, String?, RoleEdgesWithAdminOption?> = super.fieldsRow() as Row5<String?, String?, String?, String?, RoleEdgesWithAdminOption?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, RoleEdgesWithAdminOption?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, RoleEdgesWithAdminOption?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
