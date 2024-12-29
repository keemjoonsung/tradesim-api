/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys

import java.math.BigDecimal
import java.math.BigInteger
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
import org.jooq.Row12
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
open class `X$hostSummary`(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`>?,
    parentPath: InverseForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`>?,
    aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `x\$host_summary` as select if((`performance_schema`.`accounts`.`HOST` is null),'background',`performance_schema`.`accounts`.`HOST`) AS `host`,sum(`sys`.`stmt`.`total`) AS `statements`,sum(`sys`.`stmt`.`total_latency`) AS `statement_latency`,(sum(`sys`.`stmt`.`total_latency`) / sum(`sys`.`stmt`.`total`)) AS `statement_avg_latency`,sum(`sys`.`stmt`.`full_scans`) AS `table_scans`,sum(`sys`.`io`.`ios`) AS `file_ios`,sum(`sys`.`io`.`io_latency`) AS `file_io_latency`,sum(`performance_schema`.`accounts`.`CURRENT_CONNECTIONS`) AS `current_connections`,sum(`performance_schema`.`accounts`.`TOTAL_CONNECTIONS`) AS `total_connections`,count(distinct `performance_schema`.`accounts`.`USER`) AS `unique_users`,sum(`sys`.`mem`.`current_allocated`) AS `current_memory`,sum(`sys`.`mem`.`total_allocated`) AS `total_memory_allocated` from (((`performance_schema`.`accounts` join `sys`.`x\$host_summary_by_statement_latency` `stmt` on((`performance_schema`.`accounts`.`HOST` = `sys`.`stmt`.`host`))) join `sys`.`x\$host_summary_by_file_io` `io` on((`performance_schema`.`accounts`.`HOST` = `sys`.`io`.`host`))) join `sys`.`x\$memory_by_host_by_current_bytes` `mem` on((`performance_schema`.`accounts`.`HOST` = `sys`.`mem`.`host`))) group by if((`performance_schema`.`accounts`.`HOST` is null),'background',`performance_schema`.`accounts`.`HOST`)"),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$host_summary</code>
         */
        val `X$HOST_SUMMARY`: `X$hostSummary` = `X$hostSummary`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`::class.java

    /**
     * The column <code>sys.x$host_summary.host</code>.
     */
    val HOST: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, String?> = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>sys.x$host_summary.statements</code>.
     */
    val STATEMENTS: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, BigInteger?> = createField(DSL.name("statements"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    /**
     * The column <code>sys.x$host_summary.statement_latency</code>.
     */
    val STATEMENT_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, BigInteger?> = createField(DSL.name("statement_latency"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    /**
     * The column <code>sys.x$host_summary.statement_avg_latency</code>.
     */
    val STATEMENT_AVG_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, BigDecimal?> = createField(DSL.name("statement_avg_latency"), SQLDataType.DECIMAL(65, 4), this, "")

    /**
     * The column <code>sys.x$host_summary.table_scans</code>.
     */
    val TABLE_SCANS: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, BigInteger?> = createField(DSL.name("table_scans"), SQLDataType.DECIMAL_INTEGER(65), this, "")

    /**
     * The column <code>sys.x$host_summary.file_ios</code>.
     */
    val FILE_IOS: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, BigInteger?> = createField(DSL.name("file_ios"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    /**
     * The column <code>sys.x$host_summary.file_io_latency</code>.
     */
    val FILE_IO_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, BigInteger?> = createField(DSL.name("file_io_latency"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    /**
     * The column <code>sys.x$host_summary.current_connections</code>.
     */
    val CURRENT_CONNECTIONS: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, BigInteger?> = createField(DSL.name("current_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.x$host_summary.total_connections</code>.
     */
    val TOTAL_CONNECTIONS: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, BigInteger?> = createField(DSL.name("total_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.x$host_summary.unique_users</code>.
     */
    val UNIQUE_USERS: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, Long?> = createField(DSL.name("unique_users"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>sys.x$host_summary.current_memory</code>.
     */
    val CURRENT_MEMORY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, BigInteger?> = createField(DSL.name("current_memory"), SQLDataType.DECIMAL_INTEGER(63), this, "")

    /**
     * The column <code>sys.x$host_summary.total_memory_allocated</code>.
     */
    val TOTAL_MEMORY_ALLOCATED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`, BigInteger?> = createField(DSL.name("total_memory_allocated"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$hostSummaryRecord`>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.x$host_summary</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$host_summary</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$host_summary</code> table reference
     */
    constructor(): this(DSL.name("x\$host_summary"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): `X$hostSummary` = `X$hostSummary`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$hostSummary` = `X$hostSummary`(alias, this)
    override fun `as`(alias: Table<*>): `X$hostSummary` = `X$hostSummary`(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$hostSummary` = `X$hostSummary`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$hostSummary` = `X$hostSummary`(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): `X$hostSummary` = `X$hostSummary`(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): `X$hostSummary` = `X$hostSummary`(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): `X$hostSummary` = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): `X$hostSummary` = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): `X$hostSummary` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): `X$hostSummary` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): `X$hostSummary` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): `X$hostSummary` = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): `X$hostSummary` = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): `X$hostSummary` = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): `X$hostSummary` = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row12<String?, BigInteger?, BigInteger?, BigDecimal?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, Long?, BigInteger?, BigInteger?> = super.fieldsRow() as Row12<String?, BigInteger?, BigInteger?, BigDecimal?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, Long?, BigInteger?, BigInteger?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, BigInteger?, BigInteger?, BigDecimal?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, Long?, BigInteger?, BigInteger?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, BigInteger?, BigInteger?, BigDecimal?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, Long?, BigInteger?, BigInteger?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
