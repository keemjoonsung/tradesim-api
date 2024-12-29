/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_SESSION_CONNECT_ATTRS_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.SessionConnectAttrsRecord

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
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SessionConnectAttrs(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, SessionConnectAttrsRecord>?,
    parentPath: InverseForeignKey<out Record, SessionConnectAttrsRecord>?,
    aliased: Table<SessionConnectAttrsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<SessionConnectAttrsRecord>(
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
         * <code>performance_schema.session_connect_attrs</code>
         */
        val SESSION_CONNECT_ATTRS: SessionConnectAttrs = SessionConnectAttrs()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SessionConnectAttrsRecord> = SessionConnectAttrsRecord::class.java

    /**
     * The column
     * <code>performance_schema.session_connect_attrs.PROCESSLIST_ID</code>.
     */
    val PROCESSLIST_ID: TableField<SessionConnectAttrsRecord, ULong?> = createField(DSL.name("PROCESSLIST_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.session_connect_attrs.ATTR_NAME</code>.
     */
    val ATTR_NAME: TableField<SessionConnectAttrsRecord, String?> = createField(DSL.name("ATTR_NAME"), SQLDataType.VARCHAR(32).nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.session_connect_attrs.ATTR_VALUE</code>.
     */
    val ATTR_VALUE: TableField<SessionConnectAttrsRecord, String?> = createField(DSL.name("ATTR_VALUE"), SQLDataType.VARCHAR(1024), this, "")

    /**
     * The column
     * <code>performance_schema.session_connect_attrs.ORDINAL_POSITION</code>.
     */
    val ORDINAL_POSITION: TableField<SessionConnectAttrsRecord, Int?> = createField(DSL.name("ORDINAL_POSITION"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<SessionConnectAttrsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<SessionConnectAttrsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<SessionConnectAttrsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>performance_schema.session_connect_attrs</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.session_connect_attrs</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.session_connect_attrs</code> table
     * reference
     */
    constructor(): this(DSL.name("session_connect_attrs"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getPrimaryKey(): UniqueKey<SessionConnectAttrsRecord> = KEY_SESSION_CONNECT_ATTRS_PRIMARY
    override fun `as`(alias: String): SessionConnectAttrs = SessionConnectAttrs(DSL.name(alias), this)
    override fun `as`(alias: Name): SessionConnectAttrs = SessionConnectAttrs(alias, this)
    override fun `as`(alias: Table<*>): SessionConnectAttrs = SessionConnectAttrs(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SessionConnectAttrs = SessionConnectAttrs(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SessionConnectAttrs = SessionConnectAttrs(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): SessionConnectAttrs = SessionConnectAttrs(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): SessionConnectAttrs = SessionConnectAttrs(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): SessionConnectAttrs = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): SessionConnectAttrs = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): SessionConnectAttrs = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): SessionConnectAttrs = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): SessionConnectAttrs = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): SessionConnectAttrs = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): SessionConnectAttrs = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): SessionConnectAttrs = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): SessionConnectAttrs = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<ULong?, String?, String?, Int?> = super.fieldsRow() as Row4<ULong?, String?, String?, Int?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (ULong?, String?, String?, Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (ULong?, String?, String?, Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}