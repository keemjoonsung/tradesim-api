/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.enums.ViewsCheckOption
import com.kjs990114.infra.persistence.jooq.trade.information_schema.enums.ViewsIsUpdatable
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.ViewsRecord

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
open class Views(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ViewsRecord>?,
    parentPath: InverseForeignKey<out Record, ViewsRecord>?,
    aliased: Table<ViewsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ViewsRecord>(
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
         * The reference instance of <code>information_schema.VIEWS</code>
         */
        val VIEWS: Views = Views()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ViewsRecord> = ViewsRecord::class.java

    /**
     * The column <code>information_schema.VIEWS.TABLE_CATALOG</code>.
     */
    val TABLE_CATALOG: TableField<ViewsRecord, String?> = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.VIEWS.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<ViewsRecord, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.VIEWS.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<ViewsRecord, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.VIEWS.VIEW_DEFINITION</code>.
     */
    val VIEW_DEFINITION: TableField<ViewsRecord, String?> = createField(DSL.name("VIEW_DEFINITION"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>information_schema.VIEWS.CHECK_OPTION</code>.
     */
    val CHECK_OPTION: TableField<ViewsRecord, ViewsCheckOption?> = createField(DSL.name("CHECK_OPTION"), SQLDataType.VARCHAR(8).asEnumDataType(ViewsCheckOption::class.java), this, "")

    /**
     * The column <code>information_schema.VIEWS.IS_UPDATABLE</code>.
     */
    val IS_UPDATABLE: TableField<ViewsRecord, ViewsIsUpdatable?> = createField(DSL.name("IS_UPDATABLE"), SQLDataType.VARCHAR(3).asEnumDataType(ViewsIsUpdatable::class.java), this, "")

    /**
     * The column <code>information_schema.VIEWS.DEFINER</code>.
     */
    val DEFINER: TableField<ViewsRecord, String?> = createField(DSL.name("DEFINER"), SQLDataType.VARCHAR(288), this, "")

    /**
     * The column <code>information_schema.VIEWS.SECURITY_TYPE</code>.
     */
    val SECURITY_TYPE: TableField<ViewsRecord, String?> = createField(DSL.name("SECURITY_TYPE"), SQLDataType.VARCHAR(7), this, "")

    /**
     * The column <code>information_schema.VIEWS.CHARACTER_SET_CLIENT</code>.
     */
    val CHARACTER_SET_CLIENT: TableField<ViewsRecord, String?> = createField(DSL.name("CHARACTER_SET_CLIENT"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.VIEWS.COLLATION_CONNECTION</code>.
     */
    val COLLATION_CONNECTION: TableField<ViewsRecord, String?> = createField(DSL.name("COLLATION_CONNECTION"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ViewsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ViewsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ViewsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.VIEWS</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.VIEWS</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.VIEWS</code> table reference
     */
    constructor(): this(DSL.name("VIEWS"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Views = Views(DSL.name(alias), this)
    override fun `as`(alias: Name): Views = Views(alias, this)
    override fun `as`(alias: Table<*>): Views = Views(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Views = Views(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Views = Views(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Views = Views(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Views = Views(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Views = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Views = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Views = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Views = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Views = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Views = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Views = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Views = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Views = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<String?, String?, String?, String?, ViewsCheckOption?, ViewsIsUpdatable?, String?, String?, String?, String?> = super.fieldsRow() as Row10<String?, String?, String?, String?, ViewsCheckOption?, ViewsIsUpdatable?, String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, ViewsCheckOption?, ViewsIsUpdatable?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, ViewsCheckOption?, ViewsIsUpdatable?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}