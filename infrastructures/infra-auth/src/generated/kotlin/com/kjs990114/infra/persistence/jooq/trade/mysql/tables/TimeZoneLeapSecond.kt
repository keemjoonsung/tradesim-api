/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables


import com.kjs990114.infra.persistence.jooq.trade.mysql.Mysql
import com.kjs990114.infra.persistence.jooq.trade.mysql.keys.KEY_TIME_ZONE_LEAP_SECOND_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records.TimeZoneLeapSecondRecord

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
import org.jooq.Row2
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
 * Leap seconds information for time zones
 */
@Suppress("UNCHECKED_CAST")
open class TimeZoneLeapSecond(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, TimeZoneLeapSecondRecord>?,
    parentPath: InverseForeignKey<out Record, TimeZoneLeapSecondRecord>?,
    aliased: Table<TimeZoneLeapSecondRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<TimeZoneLeapSecondRecord>(
    alias,
    Mysql.MYSQL,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment("Leap seconds information for time zones"),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>mysql.time_zone_leap_second</code>
         */
        val TIME_ZONE_LEAP_SECOND: TimeZoneLeapSecond = TimeZoneLeapSecond()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TimeZoneLeapSecondRecord> = TimeZoneLeapSecondRecord::class.java

    /**
     * The column <code>mysql.time_zone_leap_second.Transition_time</code>.
     */
    val TRANSITION_TIME: TableField<TimeZoneLeapSecondRecord, Long?> = createField(DSL.name("Transition_time"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>mysql.time_zone_leap_second.Correction</code>.
     */
    val CORRECTION: TableField<TimeZoneLeapSecondRecord, Int?> = createField(DSL.name("Correction"), SQLDataType.INTEGER.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<TimeZoneLeapSecondRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<TimeZoneLeapSecondRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<TimeZoneLeapSecondRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>mysql.time_zone_leap_second</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.time_zone_leap_second</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.time_zone_leap_second</code> table reference
     */
    constructor(): this(DSL.name("time_zone_leap_second"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<TimeZoneLeapSecondRecord> = KEY_TIME_ZONE_LEAP_SECOND_PRIMARY
    override fun `as`(alias: String): TimeZoneLeapSecond = TimeZoneLeapSecond(DSL.name(alias), this)
    override fun `as`(alias: Name): TimeZoneLeapSecond = TimeZoneLeapSecond(alias, this)
    override fun `as`(alias: Table<*>): TimeZoneLeapSecond = TimeZoneLeapSecond(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TimeZoneLeapSecond = TimeZoneLeapSecond(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TimeZoneLeapSecond = TimeZoneLeapSecond(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TimeZoneLeapSecond = TimeZoneLeapSecond(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): TimeZoneLeapSecond = TimeZoneLeapSecond(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): TimeZoneLeapSecond = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): TimeZoneLeapSecond = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): TimeZoneLeapSecond = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): TimeZoneLeapSecond = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): TimeZoneLeapSecond = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): TimeZoneLeapSecond = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): TimeZoneLeapSecond = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): TimeZoneLeapSecond = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): TimeZoneLeapSecond = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<Long?, Int?> = super.fieldsRow() as Row2<Long?, Int?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}