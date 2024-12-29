/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.InnodbVirtualRecord

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
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbVirtual(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, InnodbVirtualRecord>?,
    parentPath: InverseForeignKey<out Record, InnodbVirtualRecord>?,
    aliased: Table<InnodbVirtualRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<InnodbVirtualRecord>(
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
         * <code>information_schema.INNODB_VIRTUAL</code>
         */
        val INNODB_VIRTUAL: InnodbVirtual = InnodbVirtual()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbVirtualRecord> = InnodbVirtualRecord::class.java

    /**
     * The column <code>information_schema.INNODB_VIRTUAL.TABLE_ID</code>.
     */
    val TABLE_ID: TableField<InnodbVirtualRecord, ULong?> = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_VIRTUAL.POS</code>.
     */
    val POS: TableField<InnodbVirtualRecord, UInteger?> = createField(DSL.name("POS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_VIRTUAL.BASE_POS</code>.
     */
    val BASE_POS: TableField<InnodbVirtualRecord, UInteger?> = createField(DSL.name("BASE_POS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbVirtualRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<InnodbVirtualRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<InnodbVirtualRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.INNODB_VIRTUAL</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_VIRTUAL</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_VIRTUAL</code> table reference
     */
    constructor(): this(DSL.name("INNODB_VIRTUAL"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbVirtual = InnodbVirtual(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbVirtual = InnodbVirtual(alias, this)
    override fun `as`(alias: Table<*>): InnodbVirtual = InnodbVirtual(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbVirtual = InnodbVirtual(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbVirtual = InnodbVirtual(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): InnodbVirtual = InnodbVirtual(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): InnodbVirtual = InnodbVirtual(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): InnodbVirtual = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): InnodbVirtual = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): InnodbVirtual = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): InnodbVirtual = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): InnodbVirtual = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): InnodbVirtual = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): InnodbVirtual = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): InnodbVirtual = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): InnodbVirtual = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<ULong?, UInteger?, UInteger?> = super.fieldsRow() as Row3<ULong?, UInteger?, UInteger?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (ULong?, UInteger?, UInteger?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (ULong?, UInteger?, UInteger?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
