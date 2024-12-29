/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.SchemataExtensionsRecord

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
import org.jooq.Row3
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
open class SchemataExtensions(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, SchemataExtensionsRecord>?,
    parentPath: InverseForeignKey<out Record, SchemataExtensionsRecord>?,
    aliased: Table<SchemataExtensionsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<SchemataExtensionsRecord>(
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
         * <code>information_schema.SCHEMATA_EXTENSIONS</code>
         */
        val SCHEMATA_EXTENSIONS: SchemataExtensions = SchemataExtensions()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SchemataExtensionsRecord> = SchemataExtensionsRecord::class.java

    /**
     * The column
     * <code>information_schema.SCHEMATA_EXTENSIONS.CATALOG_NAME</code>.
     */
    val CATALOG_NAME: TableField<SchemataExtensionsRecord, String?> = createField(DSL.name("CATALOG_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>information_schema.SCHEMATA_EXTENSIONS.SCHEMA_NAME</code>.
     */
    val SCHEMA_NAME: TableField<SchemataExtensionsRecord, String?> = createField(DSL.name("SCHEMA_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.SCHEMATA_EXTENSIONS.OPTIONS</code>.
     */
    val OPTIONS: TableField<SchemataExtensionsRecord, String?> = createField(DSL.name("OPTIONS"), SQLDataType.VARCHAR(256), this, "")

    private constructor(alias: Name, aliased: Table<SchemataExtensionsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<SchemataExtensionsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<SchemataExtensionsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.SCHEMATA_EXTENSIONS</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.SCHEMATA_EXTENSIONS</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.SCHEMATA_EXTENSIONS</code> table
     * reference
     */
    constructor(): this(DSL.name("SCHEMATA_EXTENSIONS"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): SchemataExtensions = SchemataExtensions(DSL.name(alias), this)
    override fun `as`(alias: Name): SchemataExtensions = SchemataExtensions(alias, this)
    override fun `as`(alias: Table<*>): SchemataExtensions = SchemataExtensions(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SchemataExtensions = SchemataExtensions(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SchemataExtensions = SchemataExtensions(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): SchemataExtensions = SchemataExtensions(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): SchemataExtensions = SchemataExtensions(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): SchemataExtensions = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): SchemataExtensions = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): SchemataExtensions = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): SchemataExtensions = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): SchemataExtensions = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): SchemataExtensions = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): SchemataExtensions = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): SchemataExtensions = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): SchemataExtensions = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<String?, String?, String?> = super.fieldsRow() as Row3<String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}