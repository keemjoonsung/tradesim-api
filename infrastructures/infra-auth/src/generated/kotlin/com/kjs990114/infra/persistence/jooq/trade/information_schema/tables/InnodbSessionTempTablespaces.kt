/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.InnodbSessionTempTablespacesRecord

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
import org.jooq.Row6
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
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbSessionTempTablespaces(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, InnodbSessionTempTablespacesRecord>?,
    parentPath: InverseForeignKey<out Record, InnodbSessionTempTablespacesRecord>?,
    aliased: Table<InnodbSessionTempTablespacesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<InnodbSessionTempTablespacesRecord>(
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
         * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code>
         */
        val INNODB_SESSION_TEMP_TABLESPACES: InnodbSessionTempTablespaces = InnodbSessionTempTablespaces()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbSessionTempTablespacesRecord> = InnodbSessionTempTablespacesRecord::class.java

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.ID</code>.
     */
    val ID: TableField<InnodbSessionTempTablespacesRecord, UInteger?> = createField(DSL.name("ID"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.SPACE</code>.
     */
    val SPACE: TableField<InnodbSessionTempTablespacesRecord, UInteger?> = createField(DSL.name("SPACE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.PATH</code>.
     */
    val PATH: TableField<InnodbSessionTempTablespacesRecord, String?> = createField(DSL.name("PATH"), SQLDataType.VARCHAR(1333).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.SIZE</code>.
     */
    val SIZE: TableField<InnodbSessionTempTablespacesRecord, ULong?> = createField(DSL.name("SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.STATE</code>.
     */
    val STATE: TableField<InnodbSessionTempTablespacesRecord, String?> = createField(DSL.name("STATE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.PURPOSE</code>.
     */
    val PURPOSE: TableField<InnodbSessionTempTablespacesRecord, String?> = createField(DSL.name("PURPOSE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbSessionTempTablespacesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<InnodbSessionTempTablespacesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<InnodbSessionTempTablespacesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code>
     * table reference
     */
    constructor(): this(DSL.name("INNODB_SESSION_TEMP_TABLESPACES"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(alias, this)
    override fun `as`(alias: Table<*>): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): InnodbSessionTempTablespaces = InnodbSessionTempTablespaces(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): InnodbSessionTempTablespaces = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): InnodbSessionTempTablespaces = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): InnodbSessionTempTablespaces = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): InnodbSessionTempTablespaces = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): InnodbSessionTempTablespaces = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): InnodbSessionTempTablespaces = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): InnodbSessionTempTablespaces = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): InnodbSessionTempTablespaces = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): InnodbSessionTempTablespaces = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<UInteger?, UInteger?, String?, ULong?, String?, String?> = super.fieldsRow() as Row6<UInteger?, UInteger?, String?, ULong?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (UInteger?, UInteger?, String?, ULong?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (UInteger?, UInteger?, String?, ULong?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
