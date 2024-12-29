/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.enums.ParametersRoutineType
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.ParametersRecord

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
import org.jooq.Row16
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
open class Parameters(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ParametersRecord>?,
    parentPath: InverseForeignKey<out Record, ParametersRecord>?,
    aliased: Table<ParametersRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ParametersRecord>(
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
         * The reference instance of <code>information_schema.PARAMETERS</code>
         */
        val PARAMETERS: Parameters = Parameters()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ParametersRecord> = ParametersRecord::class.java

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_CATALOG</code>.
     */
    val SPECIFIC_CATALOG: TableField<ParametersRecord, String?> = createField(DSL.name("SPECIFIC_CATALOG"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_SCHEMA</code>.
     */
    val SPECIFIC_SCHEMA: TableField<ParametersRecord, String?> = createField(DSL.name("SPECIFIC_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_NAME</code>.
     */
    val SPECIFIC_NAME: TableField<ParametersRecord, String?> = createField(DSL.name("SPECIFIC_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>information_schema.PARAMETERS.ORDINAL_POSITION</code>.
     */
    val ORDINAL_POSITION: TableField<ParametersRecord, ULong?> = createField(DSL.name("ORDINAL_POSITION"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.PARAMETERS.PARAMETER_MODE</code>.
     */
    val PARAMETER_MODE: TableField<ParametersRecord, String?> = createField(DSL.name("PARAMETER_MODE"), SQLDataType.VARCHAR(5), this, "")

    /**
     * The column <code>information_schema.PARAMETERS.PARAMETER_NAME</code>.
     */
    val PARAMETER_NAME: TableField<ParametersRecord, String?> = createField(DSL.name("PARAMETER_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.PARAMETERS.DATA_TYPE</code>.
     */
    val DATA_TYPE: TableField<ParametersRecord, String?> = createField(DSL.name("DATA_TYPE"), SQLDataType.CLOB, this, "")

    /**
     * The column
     * <code>information_schema.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    val CHARACTER_MAXIMUM_LENGTH: TableField<ParametersRecord, Long?> = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), SQLDataType.BIGINT, this, "")

    /**
     * The column
     * <code>information_schema.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
     */
    val CHARACTER_OCTET_LENGTH: TableField<ParametersRecord, Long?> = createField(DSL.name("CHARACTER_OCTET_LENGTH"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.PARAMETERS.NUMERIC_PRECISION</code>.
     */
    val NUMERIC_PRECISION: TableField<ParametersRecord, UInteger?> = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.INTEGERUNSIGNED, this, "")

    /**
     * The column <code>information_schema.PARAMETERS.NUMERIC_SCALE</code>.
     */
    val NUMERIC_SCALE: TableField<ParametersRecord, Long?> = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.PARAMETERS.DATETIME_PRECISION</code>.
     */
    val DATETIME_PRECISION: TableField<ParametersRecord, UInteger?> = createField(DSL.name("DATETIME_PRECISION"), SQLDataType.INTEGERUNSIGNED, this, "")

    /**
     * The column <code>information_schema.PARAMETERS.CHARACTER_SET_NAME</code>.
     */
    val CHARACTER_SET_NAME: TableField<ParametersRecord, String?> = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.PARAMETERS.COLLATION_NAME</code>.
     */
    val COLLATION_NAME: TableField<ParametersRecord, String?> = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.PARAMETERS.DTD_IDENTIFIER</code>.
     */
    val DTD_IDENTIFIER: TableField<ParametersRecord, String?> = createField(DSL.name("DTD_IDENTIFIER"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>information_schema.PARAMETERS.ROUTINE_TYPE</code>.
     */
    val ROUTINE_TYPE: TableField<ParametersRecord, ParametersRoutineType?> = createField(DSL.name("ROUTINE_TYPE"), SQLDataType.VARCHAR(9).nullable(false).asEnumDataType(ParametersRoutineType::class.java), this, "")

    private constructor(alias: Name, aliased: Table<ParametersRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ParametersRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ParametersRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.PARAMETERS</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.PARAMETERS</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.PARAMETERS</code> table reference
     */
    constructor(): this(DSL.name("PARAMETERS"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Parameters = Parameters(DSL.name(alias), this)
    override fun `as`(alias: Name): Parameters = Parameters(alias, this)
    override fun `as`(alias: Table<*>): Parameters = Parameters(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Parameters = Parameters(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Parameters = Parameters(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Parameters = Parameters(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Parameters = Parameters(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Parameters = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Parameters = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Parameters = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Parameters = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Parameters = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Parameters = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Parameters = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Parameters = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Parameters = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row16<String?, String?, String?, ULong?, String?, String?, String?, Long?, Long?, UInteger?, Long?, UInteger?, String?, String?, String?, ParametersRoutineType?> = super.fieldsRow() as Row16<String?, String?, String?, ULong?, String?, String?, String?, Long?, Long?, UInteger?, Long?, UInteger?, String?, String?, String?, ParametersRoutineType?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, ULong?, String?, String?, String?, Long?, Long?, UInteger?, Long?, UInteger?, String?, String?, String?, ParametersRoutineType?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, ULong?, String?, String?, String?, Long?, Long?, UInteger?, Long?, UInteger?, String?, String?, String?, ParametersRoutineType?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}