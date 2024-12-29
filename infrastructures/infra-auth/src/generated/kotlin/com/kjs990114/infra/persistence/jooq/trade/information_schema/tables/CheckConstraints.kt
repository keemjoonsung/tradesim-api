/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.CheckConstraintsRecord

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
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CheckConstraints(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, CheckConstraintsRecord>?,
    parentPath: InverseForeignKey<out Record, CheckConstraintsRecord>?,
    aliased: Table<CheckConstraintsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<CheckConstraintsRecord>(
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
         * <code>information_schema.CHECK_CONSTRAINTS</code>
         */
        val CHECK_CONSTRAINTS: CheckConstraints = CheckConstraints()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CheckConstraintsRecord> = CheckConstraintsRecord::class.java

    /**
     * The column
     * <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    val CONSTRAINT_CATALOG: TableField<CheckConstraintsRecord, String?> = createField(DSL.name("CONSTRAINT_CATALOG"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    val CONSTRAINT_SCHEMA: TableField<CheckConstraintsRecord, String?> = createField(DSL.name("CONSTRAINT_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    val CONSTRAINT_NAME: TableField<CheckConstraintsRecord, String?> = createField(DSL.name("CONSTRAINT_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column
     * <code>information_schema.CHECK_CONSTRAINTS.CHECK_CLAUSE</code>.
     */
    val CHECK_CLAUSE: TableField<CheckConstraintsRecord, String?> = createField(DSL.name("CHECK_CLAUSE"), SQLDataType.CLOB.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<CheckConstraintsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<CheckConstraintsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<CheckConstraintsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.CHECK_CONSTRAINTS</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.CHECK_CONSTRAINTS</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.CHECK_CONSTRAINTS</code> table
     * reference
     */
    constructor(): this(DSL.name("CHECK_CONSTRAINTS"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): CheckConstraints = CheckConstraints(DSL.name(alias), this)
    override fun `as`(alias: Name): CheckConstraints = CheckConstraints(alias, this)
    override fun `as`(alias: Table<*>): CheckConstraints = CheckConstraints(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CheckConstraints = CheckConstraints(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CheckConstraints = CheckConstraints(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CheckConstraints = CheckConstraints(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): CheckConstraints = CheckConstraints(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): CheckConstraints = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): CheckConstraints = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): CheckConstraints = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): CheckConstraints = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): CheckConstraints = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): CheckConstraints = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): CheckConstraints = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): CheckConstraints = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): CheckConstraints = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<String?, String?, String?, String?> = super.fieldsRow() as Row4<String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}