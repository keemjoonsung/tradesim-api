/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables


import com.kjs990114.infra.persistence.jooq.trade.mysql.Mysql
import com.kjs990114.infra.persistence.jooq.trade.mysql.keys.KEY_TIME_ZONE_NAME_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records.TimeZoneNameRecord

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
import org.jooq.types.UInteger


/**
 * Time zone names
 */
@Suppress("UNCHECKED_CAST")
open class TimeZoneName(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, TimeZoneNameRecord>?,
    parentPath: InverseForeignKey<out Record, TimeZoneNameRecord>?,
    aliased: Table<TimeZoneNameRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<TimeZoneNameRecord>(
    alias,
    Mysql.MYSQL,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment("Time zone names"),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>mysql.time_zone_name</code>
         */
        val TIME_ZONE_NAME: TimeZoneName = TimeZoneName()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TimeZoneNameRecord> = TimeZoneNameRecord::class.java

    /**
     * The column <code>mysql.time_zone_name.Name</code>.
     */
    val NAME: TableField<TimeZoneNameRecord, String?> = createField(DSL.name("Name"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column <code>mysql.time_zone_name.Time_zone_id</code>.
     */
    val TIME_ZONE_ID: TableField<TimeZoneNameRecord, UInteger?> = createField(DSL.name("Time_zone_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<TimeZoneNameRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<TimeZoneNameRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<TimeZoneNameRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>mysql.time_zone_name</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.time_zone_name</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.time_zone_name</code> table reference
     */
    constructor(): this(DSL.name("time_zone_name"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<TimeZoneNameRecord> = KEY_TIME_ZONE_NAME_PRIMARY
    override fun `as`(alias: String): TimeZoneName = TimeZoneName(DSL.name(alias), this)
    override fun `as`(alias: Name): TimeZoneName = TimeZoneName(alias, this)
    override fun `as`(alias: Table<*>): TimeZoneName = TimeZoneName(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TimeZoneName = TimeZoneName(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TimeZoneName = TimeZoneName(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TimeZoneName = TimeZoneName(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): TimeZoneName = TimeZoneName(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): TimeZoneName = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): TimeZoneName = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): TimeZoneName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): TimeZoneName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): TimeZoneName = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): TimeZoneName = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): TimeZoneName = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): TimeZoneName = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): TimeZoneName = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row2<String?, UInteger?> = super.fieldsRow() as Row2<String?, UInteger?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, UInteger?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, UInteger?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}