/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables


import com.kjs990114.infra.persistence.jooq.trade.mysql.Mysql
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.GlobalGrantsWithGrantOption
import com.kjs990114.infra.persistence.jooq.trade.mysql.keys.KEY_GLOBAL_GRANTS_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records.GlobalGrantsRecord

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


/**
 * Extended global grants
 */
@Suppress("UNCHECKED_CAST")
open class GlobalGrants(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, GlobalGrantsRecord>?,
    parentPath: InverseForeignKey<out Record, GlobalGrantsRecord>?,
    aliased: Table<GlobalGrantsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<GlobalGrantsRecord>(
    alias,
    Mysql.MYSQL,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment("Extended global grants"),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>mysql.global_grants</code>
         */
        val GLOBAL_GRANTS: GlobalGrants = GlobalGrants()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<GlobalGrantsRecord> = GlobalGrantsRecord::class.java

    /**
     * The column <code>mysql.global_grants.USER</code>.
     */
    val USER: TableField<GlobalGrantsRecord, String?> = createField(DSL.name("USER"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.global_grants.HOST</code>.
     */
    val HOST: TableField<GlobalGrantsRecord, String?> = createField(DSL.name("HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.global_grants.PRIV</code>.
     */
    val PRIV: TableField<GlobalGrantsRecord, String?> = createField(DSL.name("PRIV"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.global_grants.WITH_GRANT_OPTION</code>.
     */
    val WITH_GRANT_OPTION: TableField<GlobalGrantsRecord, GlobalGrantsWithGrantOption?> = createField(DSL.name("WITH_GRANT_OPTION"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(GlobalGrantsWithGrantOption::class.java), this, "")

    private constructor(alias: Name, aliased: Table<GlobalGrantsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<GlobalGrantsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<GlobalGrantsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>mysql.global_grants</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.global_grants</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.global_grants</code> table reference
     */
    constructor(): this(DSL.name("global_grants"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<GlobalGrantsRecord> = KEY_GLOBAL_GRANTS_PRIMARY
    override fun `as`(alias: String): GlobalGrants = GlobalGrants(DSL.name(alias), this)
    override fun `as`(alias: Name): GlobalGrants = GlobalGrants(alias, this)
    override fun `as`(alias: Table<*>): GlobalGrants = GlobalGrants(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): GlobalGrants = GlobalGrants(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): GlobalGrants = GlobalGrants(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): GlobalGrants = GlobalGrants(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): GlobalGrants = GlobalGrants(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): GlobalGrants = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): GlobalGrants = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): GlobalGrants = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): GlobalGrants = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): GlobalGrants = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): GlobalGrants = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): GlobalGrants = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): GlobalGrants = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): GlobalGrants = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<String?, String?, String?, GlobalGrantsWithGrantOption?> = super.fieldsRow() as Row4<String?, String?, String?, GlobalGrantsWithGrantOption?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, GlobalGrantsWithGrantOption?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, GlobalGrantsWithGrantOption?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
