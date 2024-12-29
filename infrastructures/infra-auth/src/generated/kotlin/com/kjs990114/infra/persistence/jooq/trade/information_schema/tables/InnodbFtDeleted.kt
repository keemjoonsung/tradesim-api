/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.InnodbFtDeletedRecord

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
import org.jooq.Row1
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
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbFtDeleted(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, InnodbFtDeletedRecord>?,
    parentPath: InverseForeignKey<out Record, InnodbFtDeletedRecord>?,
    aliased: Table<InnodbFtDeletedRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<InnodbFtDeletedRecord>(
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
         * <code>information_schema.INNODB_FT_DELETED</code>
         */
        val INNODB_FT_DELETED: InnodbFtDeleted = InnodbFtDeleted()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbFtDeletedRecord> = InnodbFtDeletedRecord::class.java

    /**
     * The column <code>information_schema.INNODB_FT_DELETED.DOC_ID</code>.
     */
    val DOC_ID: TableField<InnodbFtDeletedRecord, ULong?> = createField(DSL.name("DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbFtDeletedRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<InnodbFtDeletedRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<InnodbFtDeletedRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.INNODB_FT_DELETED</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_FT_DELETED</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_FT_DELETED</code> table
     * reference
     */
    constructor(): this(DSL.name("INNODB_FT_DELETED"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbFtDeleted = InnodbFtDeleted(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbFtDeleted = InnodbFtDeleted(alias, this)
    override fun `as`(alias: Table<*>): InnodbFtDeleted = InnodbFtDeleted(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbFtDeleted = InnodbFtDeleted(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbFtDeleted = InnodbFtDeleted(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): InnodbFtDeleted = InnodbFtDeleted(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): InnodbFtDeleted = InnodbFtDeleted(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): InnodbFtDeleted = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): InnodbFtDeleted = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): InnodbFtDeleted = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): InnodbFtDeleted = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): InnodbFtDeleted = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): InnodbFtDeleted = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): InnodbFtDeleted = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): InnodbFtDeleted = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): InnodbFtDeleted = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row1<ULong?> = super.fieldsRow() as Row1<ULong?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (ULong?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (ULong?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}