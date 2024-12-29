/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.TablesExtensionsRecord

import java.util.function.Function

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.JSON
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
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TablesExtensions(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, TablesExtensionsRecord>?,
    parentPath: InverseForeignKey<out Record, TablesExtensionsRecord>?,
    aliased: Table<TablesExtensionsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<TablesExtensionsRecord>(
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
         * <code>information_schema.TABLES_EXTENSIONS</code>
         */
        val TABLES_EXTENSIONS: TablesExtensions = TablesExtensions()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TablesExtensionsRecord> = TablesExtensionsRecord::class.java

    /**
     * The column
     * <code>information_schema.TABLES_EXTENSIONS.TABLE_CATALOG</code>.
     */
    val TABLE_CATALOG: TableField<TablesExtensionsRecord, String?> = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.TABLES_EXTENSIONS.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<TablesExtensionsRecord, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.TABLES_EXTENSIONS.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<TablesExtensionsRecord, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.TABLES_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    val ENGINE_ATTRIBUTE: TableField<TablesExtensionsRecord, JSON?> = createField(DSL.name("ENGINE_ATTRIBUTE"), SQLDataType.JSON, this, "")

    /**
     * The column
     * <code>information_schema.TABLES_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    val SECONDARY_ENGINE_ATTRIBUTE: TableField<TablesExtensionsRecord, JSON?> = createField(DSL.name("SECONDARY_ENGINE_ATTRIBUTE"), SQLDataType.JSON, this, "")

    private constructor(alias: Name, aliased: Table<TablesExtensionsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<TablesExtensionsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<TablesExtensionsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.TABLES_EXTENSIONS</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.TABLES_EXTENSIONS</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.TABLES_EXTENSIONS</code> table
     * reference
     */
    constructor(): this(DSL.name("TABLES_EXTENSIONS"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): TablesExtensions = TablesExtensions(DSL.name(alias), this)
    override fun `as`(alias: Name): TablesExtensions = TablesExtensions(alias, this)
    override fun `as`(alias: Table<*>): TablesExtensions = TablesExtensions(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TablesExtensions = TablesExtensions(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TablesExtensions = TablesExtensions(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TablesExtensions = TablesExtensions(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): TablesExtensions = TablesExtensions(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): TablesExtensions = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): TablesExtensions = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): TablesExtensions = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): TablesExtensions = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): TablesExtensions = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): TablesExtensions = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): TablesExtensions = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): TablesExtensions = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): TablesExtensions = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<String?, String?, String?, JSON?, JSON?> = super.fieldsRow() as Row5<String?, String?, String?, JSON?, JSON?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, JSON?, JSON?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, JSON?, JSON?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
