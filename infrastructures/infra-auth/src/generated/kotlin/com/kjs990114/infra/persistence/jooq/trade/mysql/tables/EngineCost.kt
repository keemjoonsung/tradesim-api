/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables


import com.kjs990114.infra.persistence.jooq.trade.mysql.Mysql
import com.kjs990114.infra.persistence.jooq.trade.mysql.keys.KEY_ENGINE_COST_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records.EngineCostRecord

import java.time.LocalDateTime
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
import org.jooq.Row7
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
open class EngineCost(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, EngineCostRecord>?,
    parentPath: InverseForeignKey<out Record, EngineCostRecord>?,
    aliased: Table<EngineCostRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<EngineCostRecord>(
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
         * The reference instance of <code>mysql.engine_cost</code>
         */
        val ENGINE_COST: EngineCost = EngineCost()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<EngineCostRecord> = EngineCostRecord::class.java

    /**
     * The column <code>mysql.engine_cost.engine_name</code>.
     */
    val ENGINE_NAME: TableField<EngineCostRecord, String?> = createField(DSL.name("engine_name"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>mysql.engine_cost.device_type</code>.
     */
    val DEVICE_TYPE: TableField<EngineCostRecord, Int?> = createField(DSL.name("device_type"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>mysql.engine_cost.cost_name</code>.
     */
    val COST_NAME: TableField<EngineCostRecord, String?> = createField(DSL.name("cost_name"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>mysql.engine_cost.cost_value</code>.
     */
    val COST_VALUE: TableField<EngineCostRecord, Double?> = createField(DSL.name("cost_value"), SQLDataType.FLOAT, this, "")

    /**
     * The column <code>mysql.engine_cost.last_update</code>.
     */
    val LAST_UPDATE: TableField<EngineCostRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>mysql.engine_cost.comment</code>.
     */
    val COMMENT: TableField<EngineCostRecord, String?> = createField(DSL.name("comment"), SQLDataType.VARCHAR(1024), this, "")

    /**
     * The column <code>mysql.engine_cost.default_value</code>.
     */
    val DEFAULT_VALUE: TableField<EngineCostRecord, Double?> = createField(DSL.name("default_value"), SQLDataType.FLOAT, this, "")

    private constructor(alias: Name, aliased: Table<EngineCostRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<EngineCostRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<EngineCostRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>mysql.engine_cost</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.engine_cost</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.engine_cost</code> table reference
     */
    constructor(): this(DSL.name("engine_cost"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<EngineCostRecord> = KEY_ENGINE_COST_PRIMARY
    override fun `as`(alias: String): EngineCost = EngineCost(DSL.name(alias), this)
    override fun `as`(alias: Name): EngineCost = EngineCost(alias, this)
    override fun `as`(alias: Table<*>): EngineCost = EngineCost(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EngineCost = EngineCost(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EngineCost = EngineCost(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): EngineCost = EngineCost(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): EngineCost = EngineCost(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): EngineCost = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): EngineCost = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): EngineCost = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): EngineCost = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): EngineCost = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): EngineCost = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): EngineCost = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): EngineCost = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): EngineCost = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row7<String?, Int?, String?, Double?, LocalDateTime?, String?, Double?> = super.fieldsRow() as Row7<String?, Int?, String?, Double?, LocalDateTime?, String?, Double?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, Int?, String?, Double?, LocalDateTime?, String?, Double?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, Int?, String?, Double?, LocalDateTime?, String?, Double?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}