/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.InnodbCmpRecord

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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbCmp(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, InnodbCmpRecord>?,
    parentPath: InverseForeignKey<out Record, InnodbCmpRecord>?,
    aliased: Table<InnodbCmpRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<InnodbCmpRecord>(
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
         * The reference instance of <code>information_schema.INNODB_CMP</code>
         */
        val INNODB_CMP: InnodbCmp = InnodbCmp()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbCmpRecord> = InnodbCmpRecord::class.java

    /**
     * The column <code>information_schema.INNODB_CMP.page_size</code>.
     */
    val PAGE_SIZE: TableField<InnodbCmpRecord, Int?> = createField(DSL.name("page_size"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMP.compress_ops</code>.
     */
    val COMPRESS_OPS: TableField<InnodbCmpRecord, Int?> = createField(DSL.name("compress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMP.compress_ops_ok</code>.
     */
    val COMPRESS_OPS_OK: TableField<InnodbCmpRecord, Int?> = createField(DSL.name("compress_ops_ok"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMP.compress_time</code>.
     */
    val COMPRESS_TIME: TableField<InnodbCmpRecord, Int?> = createField(DSL.name("compress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMP.uncompress_ops</code>.
     */
    val UNCOMPRESS_OPS: TableField<InnodbCmpRecord, Int?> = createField(DSL.name("uncompress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMP.uncompress_time</code>.
     */
    val UNCOMPRESS_TIME: TableField<InnodbCmpRecord, Int?> = createField(DSL.name("uncompress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbCmpRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<InnodbCmpRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<InnodbCmpRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.INNODB_CMP</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_CMP</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_CMP</code> table reference
     */
    constructor(): this(DSL.name("INNODB_CMP"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbCmp = InnodbCmp(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbCmp = InnodbCmp(alias, this)
    override fun `as`(alias: Table<*>): InnodbCmp = InnodbCmp(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbCmp = InnodbCmp(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbCmp = InnodbCmp(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): InnodbCmp = InnodbCmp(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): InnodbCmp = InnodbCmp(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): InnodbCmp = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): InnodbCmp = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): InnodbCmp = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): InnodbCmp = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): InnodbCmp = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): InnodbCmp = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): InnodbCmp = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): InnodbCmp = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): InnodbCmp = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<Int?, Int?, Int?, Int?, Int?, Int?> = super.fieldsRow() as Row6<Int?, Int?, Int?, Int?, Int?, Int?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Int?, Int?, Int?, Int?, Int?, Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Int?, Int?, Int?, Int?, Int?, Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
