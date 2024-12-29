/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.EnabledRolesRecord

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
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EnabledRoles(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, EnabledRolesRecord>?,
    parentPath: InverseForeignKey<out Record, EnabledRolesRecord>?,
    aliased: Table<EnabledRolesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<EnabledRolesRecord>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
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
         * <code>information_schema.ENABLED_ROLES</code>
         */
        val ENABLED_ROLES: EnabledRoles = EnabledRoles()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EnabledRolesRecord> = EnabledRolesRecord::class.java

    /**
     * The column <code>information_schema.ENABLED_ROLES.ROLE_NAME</code>.
     */
    val ROLE_NAME: TableField<EnabledRolesRecord, String?> = createField(DSL.name("ROLE_NAME"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>information_schema.ENABLED_ROLES.ROLE_HOST</code>.
     */
    val ROLE_HOST: TableField<EnabledRolesRecord, String?> = createField(DSL.name("ROLE_HOST"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>information_schema.ENABLED_ROLES.IS_DEFAULT</code>.
     */
    val IS_DEFAULT: TableField<EnabledRolesRecord, String?> = createField(DSL.name("IS_DEFAULT"), SQLDataType.VARCHAR(3), this, "")

    /**
     * The column <code>information_schema.ENABLED_ROLES.IS_MANDATORY</code>.
     */
    val IS_MANDATORY: TableField<EnabledRolesRecord, String?> = createField(DSL.name("IS_MANDATORY"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<EnabledRolesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<EnabledRolesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<EnabledRolesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.ENABLED_ROLES</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.ENABLED_ROLES</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.ENABLED_ROLES</code> table reference
     */
    constructor(): this(DSL.name("ENABLED_ROLES"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): EnabledRoles = EnabledRoles(DSL.name(alias), this)
    override fun `as`(alias: Name): EnabledRoles = EnabledRoles(alias, this)
    override fun `as`(alias: Table<*>): EnabledRoles = EnabledRoles(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EnabledRoles = EnabledRoles(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EnabledRoles = EnabledRoles(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EnabledRoles = EnabledRoles(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): EnabledRoles = EnabledRoles(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): EnabledRoles = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): EnabledRoles = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): EnabledRoles = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): EnabledRoles = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): EnabledRoles = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): EnabledRoles = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): EnabledRoles = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): EnabledRoles = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): EnabledRoles = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<String?, String?, String?, String?> = super.fieldsRow() as Row4<String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}