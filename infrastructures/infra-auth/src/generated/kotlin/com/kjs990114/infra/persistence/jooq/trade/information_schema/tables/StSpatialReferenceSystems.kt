/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.StSpatialReferenceSystemsRecord

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
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StSpatialReferenceSystems(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, StSpatialReferenceSystemsRecord>?,
    parentPath: InverseForeignKey<out Record, StSpatialReferenceSystemsRecord>?,
    aliased: Table<StSpatialReferenceSystemsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<StSpatialReferenceSystemsRecord>(
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
         * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS</code>
         */
        val ST_SPATIAL_REFERENCE_SYSTEMS: StSpatialReferenceSystems = StSpatialReferenceSystems()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<StSpatialReferenceSystemsRecord> = StSpatialReferenceSystemsRecord::class.java

    /**
     * The column
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME</code>.
     */
    val SRS_NAME: TableField<StSpatialReferenceSystemsRecord, String?> = createField(DSL.name("SRS_NAME"), SQLDataType.VARCHAR(80).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID</code>.
     */
    val SRS_ID: TableField<StSpatialReferenceSystemsRecord, UInteger?> = createField(DSL.name("SRS_ID"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION</code>.
     */
    val ORGANIZATION: TableField<StSpatialReferenceSystemsRecord, String?> = createField(DSL.name("ORGANIZATION"), SQLDataType.VARCHAR(256), this, "")

    /**
     * The column
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID</code>.
     */
    val ORGANIZATION_COORDSYS_ID: TableField<StSpatialReferenceSystemsRecord, UInteger?> = createField(DSL.name("ORGANIZATION_COORDSYS_ID"), SQLDataType.INTEGERUNSIGNED, this, "")

    /**
     * The column
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION</code>.
     */
    val DEFINITION: TableField<StSpatialReferenceSystemsRecord, String?> = createField(DSL.name("DEFINITION"), SQLDataType.VARCHAR(4096).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION</code>.
     */
    val DESCRIPTION: TableField<StSpatialReferenceSystemsRecord, String?> = createField(DSL.name("DESCRIPTION"), SQLDataType.VARCHAR(2048), this, "")

    private constructor(alias: Name, aliased: Table<StSpatialReferenceSystemsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<StSpatialReferenceSystemsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<StSpatialReferenceSystemsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS</code>
     * table reference
     */
    constructor(): this(DSL.name("ST_SPATIAL_REFERENCE_SYSTEMS"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): StSpatialReferenceSystems = StSpatialReferenceSystems(DSL.name(alias), this)
    override fun `as`(alias: Name): StSpatialReferenceSystems = StSpatialReferenceSystems(alias, this)
    override fun `as`(alias: Table<*>): StSpatialReferenceSystems = StSpatialReferenceSystems(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): StSpatialReferenceSystems = StSpatialReferenceSystems(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): StSpatialReferenceSystems = StSpatialReferenceSystems(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): StSpatialReferenceSystems = StSpatialReferenceSystems(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): StSpatialReferenceSystems = StSpatialReferenceSystems(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): StSpatialReferenceSystems = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): StSpatialReferenceSystems = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): StSpatialReferenceSystems = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): StSpatialReferenceSystems = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): StSpatialReferenceSystems = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): StSpatialReferenceSystems = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): StSpatialReferenceSystems = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): StSpatialReferenceSystems = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): StSpatialReferenceSystems = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<String?, UInteger?, String?, UInteger?, String?, String?> = super.fieldsRow() as Row6<String?, UInteger?, String?, UInteger?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, UInteger?, String?, UInteger?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, UInteger?, String?, UInteger?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
