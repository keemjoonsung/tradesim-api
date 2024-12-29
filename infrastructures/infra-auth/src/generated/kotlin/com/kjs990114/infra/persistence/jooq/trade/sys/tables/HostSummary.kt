/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.HostSummaryRecord

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
open class HostSummary(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, HostSummaryRecord>?,
    parentPath: InverseForeignKey<out Record, HostSummaryRecord>?,
    aliased: Table<HostSummaryRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<HostSummaryRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `host_summary` as select if((`performance_schema`.`accounts`.`HOST` is null),'background',`performance_schema`.`accounts`.`HOST`) AS `host`,sum(`sys`.`stmt`.`total`) AS `statements`,format_pico_time(sum(`sys`.`stmt`.`total_latency`)) AS `statement_latency`,format_pico_time(ifnull((sum(`sys`.`stmt`.`total_latency`) / nullif(sum(`sys`.`stmt`.`total`),0)),0)) AS `statement_avg_latency`,sum(`sys`.`stmt`.`full_scans`) AS `table_scans`,sum(`sys`.`io`.`ios`) AS `file_ios`,format_pico_time(sum(`sys`.`io`.`io_latency`)) AS `file_io_latency`,sum(`performance_schema`.`accounts`.`CURRENT_CONNECTIONS`) AS `current_connections`,sum(`performance_schema`.`accounts`.`TOTAL_CONNECTIONS`) AS `total_connections`,count(distinct `performance_schema`.`accounts`.`USER`) AS `unique_users`,format_bytes(sum(`sys`.`mem`.`current_allocated`)) AS `current_memory`,format_bytes(sum(`sys`.`mem`.`total_allocated`)) AS `total_memory_allocated` from (((`performance_schema`.`accounts` join `sys`.`x\$host_summary_by_statement_latency` `stmt` on((`performance_schema`.`accounts`.`HOST` = `sys`.`stmt`.`host`))) join `sys`.`x\$host_summary_by_file_io` `io` on((`performance_schema`.`accounts`.`HOST` = `sys`.`io`.`host`))) join `sys`.`x\$memory_by_host_by_current_bytes` `mem` on((`performance_schema`.`accounts`.`HOST` = `sys`.`mem`.`host`))) group by if((`performance_schema`.`accounts`.`HOST` is null),'background',`performance_schema`.`accounts`.`HOST`)"),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sys.host_summary</code>
         */
        val HOST_SUMMARY: HostSummary = HostSummary()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<HostSummaryRecord> = HostSummaryRecord::class.java

    /**
     * The column <code>sys.host_summary.host</code>.
     */
    val HOST: TableField<HostSummaryRecord, String?> = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>sys.host_summary.statements</code>.
     */
    val STATEMENTS: TableField<HostSummaryRecord, BigInteger?> = createField(DSL.name("statements"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    /**
     * The column <code>sys.host_summary.statement_latency</code>.
     */
    val STATEMENT_LATENCY: TableField<HostSummaryRecord, String?> = createField(DSL.name("statement_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.host_summary.statement_avg_latency</code>.
     */
    val STATEMENT_AVG_LATENCY: TableField<HostSummaryRecord, String?> = createField(DSL.name("statement_avg_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.host_summary.table_scans</code>.
     */
    val TABLE_SCANS: TableField<HostSummaryRecord, BigInteger?> = createField(DSL.name("table_scans"), SQLDataType.DECIMAL_INTEGER(65), this, "")

    /**
     * The column <code>sys.host_summary.file_ios</code>.
     */
    val FILE_IOS: TableField<HostSummaryRecord, BigInteger?> = createField(DSL.name("file_ios"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    /**
     * The column <code>sys.host_summary.file_io_latency</code>.
     */
    val FILE_IO_LATENCY: TableField<HostSummaryRecord, String?> = createField(DSL.name("file_io_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.host_summary.current_connections</code>.
     */
    val CURRENT_CONNECTIONS: TableField<HostSummaryRecord, BigInteger?> = createField(DSL.name("current_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.host_summary.total_connections</code>.
     */
    val TOTAL_CONNECTIONS: TableField<HostSummaryRecord, BigInteger?> = createField(DSL.name("total_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.host_summary.unique_users</code>.
     */
    val UNIQUE_USERS: TableField<HostSummaryRecord, Long?> = createField(DSL.name("unique_users"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>sys.host_summary.current_memory</code>.
     */
    val CURRENT_MEMORY: TableField<HostSummaryRecord, String?> = createField(DSL.name("current_memory"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.host_summary.total_memory_allocated</code>.
     */
    val TOTAL_MEMORY_ALLOCATED: TableField<HostSummaryRecord, String?> = createField(DSL.name("total_memory_allocated"), SQLDataType.VARCHAR(11), this, "")

    private constructor(alias: Name, aliased: Table<HostSummaryRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<HostSummaryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<HostSummaryRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.host_summary</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.host_summary</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.host_summary</code> table reference
     */
    constructor(): this(DSL.name("host_summary"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): HostSummary = HostSummary(DSL.name(alias), this)
    override fun `as`(alias: Name): HostSummary = HostSummary(alias, this)
    override fun `as`(alias: Table<*>): HostSummary = HostSummary(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): HostSummary = HostSummary(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): HostSummary = HostSummary(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): HostSummary = HostSummary(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): HostSummary = HostSummary(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): HostSummary = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): HostSummary = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): HostSummary = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): HostSummary = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): HostSummary = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): HostSummary = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): HostSummary = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): HostSummary = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): HostSummary = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row12<String?, BigInteger?, String?, String?, BigInteger?, BigInteger?, String?, BigInteger?, BigInteger?, Long?, String?, String?> = super.fieldsRow() as Row12<String?, BigInteger?, String?, String?, BigInteger?, BigInteger?, String?, BigInteger?, BigInteger?, Long?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, BigInteger?, String?, String?, BigInteger?, BigInteger?, String?, BigInteger?, BigInteger?, Long?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, BigInteger?, String?, String?, BigInteger?, BigInteger?, String?, BigInteger?, BigInteger?, Long?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
