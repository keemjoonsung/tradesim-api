/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.RoleColumnGrantsRecord

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
import org.jooq.Row10
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
open class RoleColumnGrants(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, RoleColumnGrantsRecord>?,
    parentPath: InverseForeignKey<out Record, RoleColumnGrantsRecord>?,
    aliased: Table<RoleColumnGrantsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<RoleColumnGrantsRecord>(
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
         * <code>information_schema.ROLE_COLUMN_GRANTS</code>
         */
        val ROLE_COLUMN_GRANTS: RoleColumnGrants = RoleColumnGrants()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RoleColumnGrantsRecord> = RoleColumnGrantsRecord::class.java

    /**
     * The column <code>information_schema.ROLE_COLUMN_GRANTS.GRANTOR</code>.
     */
    val GRANTOR: TableField<RoleColumnGrantsRecord, String?> = createField(DSL.name("GRANTOR"), SQLDataType.VARCHAR(97), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.GRANTOR_HOST</code>.
     */
    val GRANTOR_HOST: TableField<RoleColumnGrantsRecord, String?> = createField(DSL.name("GRANTOR_HOST"), SQLDataType.VARCHAR(256), this, "")

    /**
     * The column <code>information_schema.ROLE_COLUMN_GRANTS.GRANTEE</code>.
     */
    val GRANTEE: TableField<RoleColumnGrantsRecord, String?> = createField(DSL.name("GRANTEE"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.GRANTEE_HOST</code>.
     */
    val GRANTEE_HOST: TableField<RoleColumnGrantsRecord, String?> = createField(DSL.name("GRANTEE_HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_CATALOG</code>.
     */
    val TABLE_CATALOG: TableField<RoleColumnGrantsRecord, String?> = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<RoleColumnGrantsRecord, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<RoleColumnGrantsRecord, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.COLUMN_NAME</code>.
     */
    val COLUMN_NAME: TableField<RoleColumnGrantsRecord, String?> = createField(DSL.name("COLUMN_NAME"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.PRIVILEGE_TYPE</code>.
     */
    val PRIVILEGE_TYPE: TableField<RoleColumnGrantsRecord, String?> = createField(DSL.name("PRIVILEGE_TYPE"), SQLDataType.VARCHAR(31).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.IS_GRANTABLE</code>.
     */
    val IS_GRANTABLE: TableField<RoleColumnGrantsRecord, String?> = createField(DSL.name("IS_GRANTABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<RoleColumnGrantsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<RoleColumnGrantsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<RoleColumnGrantsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.ROLE_COLUMN_GRANTS</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.ROLE_COLUMN_GRANTS</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.ROLE_COLUMN_GRANTS</code> table
     * reference
     */
    constructor(): this(DSL.name("ROLE_COLUMN_GRANTS"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): RoleColumnGrants = RoleColumnGrants(DSL.name(alias), this)
    override fun `as`(alias: Name): RoleColumnGrants = RoleColumnGrants(alias, this)
    override fun `as`(alias: Table<*>): RoleColumnGrants = RoleColumnGrants(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): RoleColumnGrants = RoleColumnGrants(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RoleColumnGrants = RoleColumnGrants(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): RoleColumnGrants = RoleColumnGrants(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): RoleColumnGrants = RoleColumnGrants(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): RoleColumnGrants = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): RoleColumnGrants = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): RoleColumnGrants = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): RoleColumnGrants = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): RoleColumnGrants = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): RoleColumnGrants = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): RoleColumnGrants = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): RoleColumnGrants = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): RoleColumnGrants = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, String?, String?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, String?, String?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}