/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.enums.ColumnsColumnKey
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.ColumnsRecord

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
import org.jooq.Row22
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
open class Columns(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ColumnsRecord>?,
    parentPath: InverseForeignKey<out Record, ColumnsRecord>?,
    aliased: Table<ColumnsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ColumnsRecord>(
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
         * The reference instance of <code>information_schema.COLUMNS</code>
         */
        val COLUMNS: Columns = Columns()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ColumnsRecord> = ColumnsRecord::class.java

    /**
     * The column <code>information_schema.COLUMNS.TABLE_CATALOG</code>.
     */
    val TABLE_CATALOG: TableField<ColumnsRecord, String?> = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.COLUMNS.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<ColumnsRecord, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.COLUMNS.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<ColumnsRecord, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_NAME</code>.
     */
    val COLUMN_NAME: TableField<ColumnsRecord, String?> = createField(DSL.name("COLUMN_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.COLUMNS.ORDINAL_POSITION</code>.
     */
    val ORDINAL_POSITION: TableField<ColumnsRecord, UInteger?> = createField(DSL.name("ORDINAL_POSITION"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_DEFAULT</code>.
     */
    val COLUMN_DEFAULT: TableField<ColumnsRecord, String?> = createField(DSL.name("COLUMN_DEFAULT"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>information_schema.COLUMNS.IS_NULLABLE</code>.
     */
    val IS_NULLABLE: TableField<ColumnsRecord, String?> = createField(DSL.name("IS_NULLABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.COLUMNS.DATA_TYPE</code>.
     */
    val DATA_TYPE: TableField<ColumnsRecord, String?> = createField(DSL.name("DATA_TYPE"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>information_schema.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    val CHARACTER_MAXIMUM_LENGTH: TableField<ColumnsRecord, Long?> = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>information_schema.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    val CHARACTER_OCTET_LENGTH: TableField<ColumnsRecord, Long?> = createField(DSL.name("CHARACTER_OCTET_LENGTH"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.COLUMNS.NUMERIC_PRECISION</code>.
     */
    val NUMERIC_PRECISION: TableField<ColumnsRecord, ULong?> = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.COLUMNS.NUMERIC_SCALE</code>.
     */
    val NUMERIC_SCALE: TableField<ColumnsRecord, ULong?> = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.COLUMNS.DATETIME_PRECISION</code>.
     */
    val DATETIME_PRECISION: TableField<ColumnsRecord, UInteger?> = createField(DSL.name("DATETIME_PRECISION"), SQLDataType.INTEGERUNSIGNED, this, "")

    /**
     * The column <code>information_schema.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    val CHARACTER_SET_NAME: TableField<ColumnsRecord, String?> = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.COLUMNS.COLLATION_NAME</code>.
     */
    val COLLATION_NAME: TableField<ColumnsRecord, String?> = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_TYPE</code>.
     */
    val COLUMN_TYPE: TableField<ColumnsRecord, String?> = createField(DSL.name("COLUMN_TYPE"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_KEY</code>.
     */
    val COLUMN_KEY: TableField<ColumnsRecord, ColumnsColumnKey?> = createField(DSL.name("COLUMN_KEY"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(ColumnsColumnKey::class.java), this, "")

    /**
     * The column <code>information_schema.COLUMNS.EXTRA</code>.
     */
    val EXTRA: TableField<ColumnsRecord, String?> = createField(DSL.name("EXTRA"), SQLDataType.VARCHAR(256), this, "")

    /**
     * The column <code>information_schema.COLUMNS.PRIVILEGES</code>.
     */
    val PRIVILEGES: TableField<ColumnsRecord, String?> = createField(DSL.name("PRIVILEGES"), SQLDataType.VARCHAR(154), this, "")

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_COMMENT</code>.
     */
    val COLUMN_COMMENT: TableField<ColumnsRecord, String?> = createField(DSL.name("COLUMN_COMMENT"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>information_schema.COLUMNS.GENERATION_EXPRESSION</code>.
     */
    val GENERATION_EXPRESSION: TableField<ColumnsRecord, String?> = createField(DSL.name("GENERATION_EXPRESSION"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>information_schema.COLUMNS.SRS_ID</code>.
     */
    val SRS_ID: TableField<ColumnsRecord, UInteger?> = createField(DSL.name("SRS_ID"), SQLDataType.INTEGERUNSIGNED, this, "")

    private constructor(alias: Name, aliased: Table<ColumnsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ColumnsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ColumnsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.COLUMNS</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.COLUMNS</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.COLUMNS</code> table reference
     */
    constructor(): this(DSL.name("COLUMNS"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Columns = Columns(DSL.name(alias), this)
    override fun `as`(alias: Name): Columns = Columns(alias, this)
    override fun `as`(alias: Table<*>): Columns = Columns(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Columns = Columns(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Columns = Columns(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Columns = Columns(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Columns = Columns(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Columns = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Columns = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Columns = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Columns = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Columns = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Columns = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Columns = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Columns = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Columns = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row22 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row22<String?, String?, String?, String?, UInteger?, String?, String?, String?, Long?, Long?, ULong?, ULong?, UInteger?, String?, String?, String?, ColumnsColumnKey?, String?, String?, String?, String?, UInteger?> = super.fieldsRow() as Row22<String?, String?, String?, String?, UInteger?, String?, String?, String?, Long?, Long?, ULong?, ULong?, UInteger?, String?, String?, String?, ColumnsColumnKey?, String?, String?, String?, String?, UInteger?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, UInteger?, String?, String?, String?, Long?, Long?, ULong?, ULong?, UInteger?, String?, String?, String?, ColumnsColumnKey?, String?, String?, String?, String?, UInteger?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, UInteger?, String?, String?, String?, Long?, Long?, ULong?, ULong?, UInteger?, String?, String?, String?, ColumnsColumnKey?, String?, String?, String?, String?, UInteger?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}