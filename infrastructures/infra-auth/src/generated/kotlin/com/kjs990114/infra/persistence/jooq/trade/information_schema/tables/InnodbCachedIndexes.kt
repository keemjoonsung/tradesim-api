/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.InnodbCachedIndexesRecord

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
open class InnodbCachedIndexes(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, InnodbCachedIndexesRecord>?,
    parentPath: InverseForeignKey<out Record, InnodbCachedIndexesRecord>?,
    aliased: Table<InnodbCachedIndexesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<InnodbCachedIndexesRecord>(
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
         * <code>information_schema.INNODB_CACHED_INDEXES</code>
         */
        val INNODB_CACHED_INDEXES: InnodbCachedIndexes = InnodbCachedIndexes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbCachedIndexesRecord> = InnodbCachedIndexesRecord::class.java

    /**
     * The column
     * <code>information_schema.INNODB_CACHED_INDEXES.SPACE_ID</code>.
     */
    val SPACE_ID: TableField<InnodbCachedIndexesRecord, UInteger?> = createField(DSL.name("SPACE_ID"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CACHED_INDEXES.INDEX_ID</code>.
     */
    val INDEX_ID: TableField<InnodbCachedIndexesRecord, ULong?> = createField(DSL.name("INDEX_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_CACHED_INDEXES.N_CACHED_PAGES</code>.
     */
    val N_CACHED_PAGES: TableField<InnodbCachedIndexesRecord, ULong?> = createField(DSL.name("N_CACHED_PAGES"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbCachedIndexesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<InnodbCachedIndexesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<InnodbCachedIndexesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.INNODB_CACHED_INDEXES</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_CACHED_INDEXES</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_CACHED_INDEXES</code> table
     * reference
     */
    constructor(): this(DSL.name("INNODB_CACHED_INDEXES"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbCachedIndexes = InnodbCachedIndexes(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbCachedIndexes = InnodbCachedIndexes(alias, this)
    override fun `as`(alias: Table<*>): InnodbCachedIndexes = InnodbCachedIndexes(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbCachedIndexes = InnodbCachedIndexes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbCachedIndexes = InnodbCachedIndexes(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): InnodbCachedIndexes = InnodbCachedIndexes(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): InnodbCachedIndexes = InnodbCachedIndexes(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): InnodbCachedIndexes = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): InnodbCachedIndexes = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): InnodbCachedIndexes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): InnodbCachedIndexes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): InnodbCachedIndexes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): InnodbCachedIndexes = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): InnodbCachedIndexes = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): InnodbCachedIndexes = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): InnodbCachedIndexes = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<UInteger?, ULong?, ULong?> = super.fieldsRow() as Row3<UInteger?, ULong?, ULong?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (UInteger?, ULong?, ULong?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (UInteger?, ULong?, ULong?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
