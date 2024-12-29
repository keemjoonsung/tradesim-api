/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.InnodbForeignColsRecord

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
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbForeignCols(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, InnodbForeignColsRecord>?,
    parentPath: InverseForeignKey<out Record, InnodbForeignColsRecord>?,
    aliased: Table<InnodbForeignColsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<InnodbForeignColsRecord>(
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
         * <code>information_schema.INNODB_FOREIGN_COLS</code>
         */
        val INNODB_FOREIGN_COLS: InnodbForeignCols = InnodbForeignCols()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbForeignColsRecord> = InnodbForeignColsRecord::class.java

    /**
     * The column <code>information_schema.INNODB_FOREIGN_COLS.ID</code>.
     */
    val ID: TableField<InnodbForeignColsRecord, String?> = createField(DSL.name("ID"), SQLDataType.VARCHAR(129), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_FOREIGN_COLS.FOR_COL_NAME</code>.
     */
    val FOR_COL_NAME: TableField<InnodbForeignColsRecord, String?> = createField(DSL.name("FOR_COL_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_FOREIGN_COLS.REF_COL_NAME</code>.
     */
    val REF_COL_NAME: TableField<InnodbForeignColsRecord, String?> = createField(DSL.name("REF_COL_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.INNODB_FOREIGN_COLS.POS</code>.
     */
    val POS: TableField<InnodbForeignColsRecord, UInteger?> = createField(DSL.name("POS"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<InnodbForeignColsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<InnodbForeignColsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<InnodbForeignColsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.INNODB_FOREIGN_COLS</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_FOREIGN_COLS</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_FOREIGN_COLS</code> table
     * reference
     */
    constructor(): this(DSL.name("INNODB_FOREIGN_COLS"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbForeignCols = InnodbForeignCols(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbForeignCols = InnodbForeignCols(alias, this)
    override fun `as`(alias: Table<*>): InnodbForeignCols = InnodbForeignCols(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbForeignCols = InnodbForeignCols(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbForeignCols = InnodbForeignCols(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): InnodbForeignCols = InnodbForeignCols(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): InnodbForeignCols = InnodbForeignCols(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): InnodbForeignCols = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): InnodbForeignCols = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): InnodbForeignCols = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): InnodbForeignCols = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): InnodbForeignCols = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): InnodbForeignCols = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): InnodbForeignCols = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): InnodbForeignCols = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): InnodbForeignCols = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<String?, String?, String?, UInteger?> = super.fieldsRow() as Row4<String?, String?, String?, UInteger?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, UInteger?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, UInteger?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}