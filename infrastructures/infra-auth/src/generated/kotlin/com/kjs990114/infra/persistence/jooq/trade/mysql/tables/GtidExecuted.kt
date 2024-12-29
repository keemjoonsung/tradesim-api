/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables


import com.kjs990114.infra.persistence.jooq.trade.mysql.Mysql
import com.kjs990114.infra.persistence.jooq.trade.mysql.keys.KEY_GTID_EXECUTED_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records.GtidExecutedRecord

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
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class GtidExecuted(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, GtidExecutedRecord>?,
    parentPath: InverseForeignKey<out Record, GtidExecutedRecord>?,
    aliased: Table<GtidExecutedRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<GtidExecutedRecord>(
    alias,
    Mysql.MYSQL,
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
         * The reference instance of <code>mysql.gtid_executed</code>
         */
        val GTID_EXECUTED: GtidExecuted = GtidExecuted()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<GtidExecutedRecord> = GtidExecutedRecord::class.java

    /**
     * The column <code>mysql.gtid_executed.source_uuid</code>. uuid of the
     * source where the transaction was originally executed.
     */
    val SOURCE_UUID: TableField<GtidExecutedRecord, String?> = createField(DSL.name("source_uuid"), SQLDataType.CHAR(36).nullable(false), this, "uuid of the source where the transaction was originally executed.")

    /**
     * The column <code>mysql.gtid_executed.interval_start</code>. First number
     * of interval.
     */
    val INTERVAL_START: TableField<GtidExecutedRecord, Long?> = createField(DSL.name("interval_start"), SQLDataType.BIGINT.nullable(false), this, "First number of interval.")

    /**
     * The column <code>mysql.gtid_executed.interval_end</code>. Last number of
     * interval.
     */
    val INTERVAL_END: TableField<GtidExecutedRecord, Long?> = createField(DSL.name("interval_end"), SQLDataType.BIGINT.nullable(false), this, "Last number of interval.")

    private constructor(alias: Name, aliased: Table<GtidExecutedRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<GtidExecutedRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<GtidExecutedRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>mysql.gtid_executed</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.gtid_executed</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.gtid_executed</code> table reference
     */
    constructor(): this(DSL.name("gtid_executed"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<GtidExecutedRecord> = KEY_GTID_EXECUTED_PRIMARY
    override fun `as`(alias: String): GtidExecuted = GtidExecuted(DSL.name(alias), this)
    override fun `as`(alias: Name): GtidExecuted = GtidExecuted(alias, this)
    override fun `as`(alias: Table<*>): GtidExecuted = GtidExecuted(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): GtidExecuted = GtidExecuted(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): GtidExecuted = GtidExecuted(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): GtidExecuted = GtidExecuted(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): GtidExecuted = GtidExecuted(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): GtidExecuted = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): GtidExecuted = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): GtidExecuted = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): GtidExecuted = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): GtidExecuted = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): GtidExecuted = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): GtidExecuted = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): GtidExecuted = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): GtidExecuted = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<String?, Long?, Long?> = super.fieldsRow() as Row3<String?, Long?, Long?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, Long?, Long?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, Long?, Long?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}