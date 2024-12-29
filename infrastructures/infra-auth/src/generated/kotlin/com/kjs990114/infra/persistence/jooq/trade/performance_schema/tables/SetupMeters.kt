/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.SetupMetersEnabled
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_SETUP_METERS_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.SetupMetersRecord

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
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SetupMeters(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, SetupMetersRecord>?,
    parentPath: InverseForeignKey<out Record, SetupMetersRecord>?,
    aliased: Table<SetupMetersRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<SetupMetersRecord>(
    alias,
    PerformanceSchema.PERFORMANCE_SCHEMA,
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
         * <code>performance_schema.setup_meters</code>
         */
        val SETUP_METERS: SetupMeters = SetupMeters()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SetupMetersRecord> = SetupMetersRecord::class.java

    /**
     * The column <code>performance_schema.setup_meters.NAME</code>.
     */
    val NAME: TableField<SetupMetersRecord, String?> = createField(DSL.name("NAME"), SQLDataType.VARCHAR(63).nullable(false), this, "")

    /**
     * The column <code>performance_schema.setup_meters.FREQUENCY</code>.
     */
    val FREQUENCY: TableField<SetupMetersRecord, UInteger?> = createField(DSL.name("FREQUENCY"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.setup_meters.ENABLED</code>.
     */
    val ENABLED: TableField<SetupMetersRecord, SetupMetersEnabled?> = createField(DSL.name("ENABLED"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(SetupMetersEnabled::class.java), this, "")

    /**
     * The column <code>performance_schema.setup_meters.DESCRIPTION</code>.
     */
    val DESCRIPTION: TableField<SetupMetersRecord, String?> = createField(DSL.name("DESCRIPTION"), SQLDataType.VARCHAR(1023), this, "")

    private constructor(alias: Name, aliased: Table<SetupMetersRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<SetupMetersRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<SetupMetersRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>performance_schema.setup_meters</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.setup_meters</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.setup_meters</code> table reference
     */
    constructor(): this(DSL.name("setup_meters"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getPrimaryKey(): UniqueKey<SetupMetersRecord> = KEY_SETUP_METERS_PRIMARY
    override fun `as`(alias: String): SetupMeters = SetupMeters(DSL.name(alias), this)
    override fun `as`(alias: Name): SetupMeters = SetupMeters(alias, this)
    override fun `as`(alias: Table<*>): SetupMeters = SetupMeters(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SetupMeters = SetupMeters(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SetupMeters = SetupMeters(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): SetupMeters = SetupMeters(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): SetupMeters = SetupMeters(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): SetupMeters = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): SetupMeters = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): SetupMeters = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): SetupMeters = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): SetupMeters = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): SetupMeters = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): SetupMeters = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): SetupMeters = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): SetupMeters = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<String?, UInteger?, SetupMetersEnabled?, String?> = super.fieldsRow() as Row4<String?, UInteger?, SetupMetersEnabled?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, UInteger?, SetupMetersEnabled?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, UInteger?, SetupMetersEnabled?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}