/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.StatementAnalysisRecord

import java.math.BigInteger
import java.time.LocalDateTime

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StatementAnalysis(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, StatementAnalysisRecord>?,
    parentPath: InverseForeignKey<out Record, StatementAnalysisRecord>?,
    aliased: Table<StatementAnalysisRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<StatementAnalysisRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `statement_analysis` as select `sys`.`format_statement`(`performance_schema`.`events_statements_summary_by_digest`.`DIGEST_TEXT`) AS `query`,`performance_schema`.`events_statements_summary_by_digest`.`SCHEMA_NAME` AS `db`,if(((`performance_schema`.`events_statements_summary_by_digest`.`SUM_NO_GOOD_INDEX_USED` > 0) or (`performance_schema`.`events_statements_summary_by_digest`.`SUM_NO_INDEX_USED` > 0)),'*','') AS `full_scan`,`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR` AS `exec_count`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_ERRORS` AS `err_count`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_WARNINGS` AS `warn_count`,format_pico_time(`performance_schema`.`events_statements_summary_by_digest`.`SUM_TIMER_WAIT`) AS `total_latency`,format_pico_time(`performance_schema`.`events_statements_summary_by_digest`.`MAX_TIMER_WAIT`) AS `max_latency`,format_pico_time(`performance_schema`.`events_statements_summary_by_digest`.`AVG_TIMER_WAIT`) AS `avg_latency`,format_pico_time(`performance_schema`.`events_statements_summary_by_digest`.`SUM_LOCK_TIME`) AS `lock_latency`,format_pico_time(`performance_schema`.`events_statements_summary_by_digest`.`SUM_CPU_TIME`) AS `cpu_latency`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_ROWS_SENT` AS `rows_sent`,round(ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_ROWS_SENT` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`,0)),0),0) AS `rows_sent_avg`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_ROWS_EXAMINED` AS `rows_examined`,round(ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_ROWS_EXAMINED` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`,0)),0),0) AS `rows_examined_avg`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_ROWS_AFFECTED` AS `rows_affected`,round(ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_ROWS_AFFECTED` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`,0)),0),0) AS `rows_affected_avg`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_CREATED_TMP_TABLES` AS `tmp_tables`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_CREATED_TMP_DISK_TABLES` AS `tmp_disk_tables`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_SORT_ROWS` AS `rows_sorted`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_SORT_MERGE_PASSES` AS `sort_merge_passes`,format_bytes(`performance_schema`.`events_statements_summary_by_digest`.`MAX_CONTROLLED_MEMORY`) AS `max_controlled_memory`,format_bytes(`performance_schema`.`events_statements_summary_by_digest`.`MAX_TOTAL_MEMORY`) AS `max_total_memory`,`performance_schema`.`events_statements_summary_by_digest`.`DIGEST` AS `digest`,`performance_schema`.`events_statements_summary_by_digest`.`FIRST_SEEN` AS `first_seen`,`performance_schema`.`events_statements_summary_by_digest`.`LAST_SEEN` AS `last_seen` from `performance_schema`.`events_statements_summary_by_digest` order by `performance_schema`.`events_statements_summary_by_digest`.`SUM_TIMER_WAIT` desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sys.statement_analysis</code>
         */
        val STATEMENT_ANALYSIS: StatementAnalysis = StatementAnalysis()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<StatementAnalysisRecord> = StatementAnalysisRecord::class.java

    /**
     * The column <code>sys.statement_analysis.query</code>.
     */
    val QUERY: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("query"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.statement_analysis.db</code>.
     */
    val DB: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("db"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.statement_analysis.full_scan</code>.
     */
    val FULL_SCAN: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("full_scan"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>sys.statement_analysis.exec_count</code>.
     */
    val EXEC_COUNT: TableField<StatementAnalysisRecord, ULong?> = createField(DSL.name("exec_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.err_count</code>.
     */
    val ERR_COUNT: TableField<StatementAnalysisRecord, ULong?> = createField(DSL.name("err_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.warn_count</code>.
     */
    val WARN_COUNT: TableField<StatementAnalysisRecord, ULong?> = createField(DSL.name("warn_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("total_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.statement_analysis.max_latency</code>.
     */
    val MAX_LATENCY: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("max_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.statement_analysis.avg_latency</code>.
     */
    val AVG_LATENCY: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("avg_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.statement_analysis.lock_latency</code>.
     */
    val LOCK_LATENCY: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("lock_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.statement_analysis.cpu_latency</code>.
     */
    val CPU_LATENCY: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("cpu_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.statement_analysis.rows_sent</code>.
     */
    val ROWS_SENT: TableField<StatementAnalysisRecord, ULong?> = createField(DSL.name("rows_sent"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.rows_sent_avg</code>.
     */
    val ROWS_SENT_AVG: TableField<StatementAnalysisRecord, BigInteger?> = createField(DSL.name("rows_sent_avg"), SQLDataType.DECIMAL_INTEGER(21).nullable(false).defaultValue(DSL.inline("0", SQLDataType.DECIMAL_INTEGER)), this, "")

    /**
     * The column <code>sys.statement_analysis.rows_examined</code>.
     */
    val ROWS_EXAMINED: TableField<StatementAnalysisRecord, ULong?> = createField(DSL.name("rows_examined"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.rows_examined_avg</code>.
     */
    val ROWS_EXAMINED_AVG: TableField<StatementAnalysisRecord, BigInteger?> = createField(DSL.name("rows_examined_avg"), SQLDataType.DECIMAL_INTEGER(21).nullable(false).defaultValue(DSL.inline("0", SQLDataType.DECIMAL_INTEGER)), this, "")

    /**
     * The column <code>sys.statement_analysis.rows_affected</code>.
     */
    val ROWS_AFFECTED: TableField<StatementAnalysisRecord, ULong?> = createField(DSL.name("rows_affected"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.rows_affected_avg</code>.
     */
    val ROWS_AFFECTED_AVG: TableField<StatementAnalysisRecord, BigInteger?> = createField(DSL.name("rows_affected_avg"), SQLDataType.DECIMAL_INTEGER(21).nullable(false).defaultValue(DSL.inline("0", SQLDataType.DECIMAL_INTEGER)), this, "")

    /**
     * The column <code>sys.statement_analysis.tmp_tables</code>.
     */
    val TMP_TABLES: TableField<StatementAnalysisRecord, ULong?> = createField(DSL.name("tmp_tables"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.tmp_disk_tables</code>.
     */
    val TMP_DISK_TABLES: TableField<StatementAnalysisRecord, ULong?> = createField(DSL.name("tmp_disk_tables"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.rows_sorted</code>.
     */
    val ROWS_SORTED: TableField<StatementAnalysisRecord, ULong?> = createField(DSL.name("rows_sorted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.sort_merge_passes</code>.
     */
    val SORT_MERGE_PASSES: TableField<StatementAnalysisRecord, ULong?> = createField(DSL.name("sort_merge_passes"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.max_controlled_memory</code>.
     */
    val MAX_CONTROLLED_MEMORY: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("max_controlled_memory"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.statement_analysis.max_total_memory</code>.
     */
    val MAX_TOTAL_MEMORY: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("max_total_memory"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.statement_analysis.digest</code>.
     */
    val DIGEST: TableField<StatementAnalysisRecord, String?> = createField(DSL.name("digest"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.statement_analysis.first_seen</code>.
     */
    val FIRST_SEEN: TableField<StatementAnalysisRecord, LocalDateTime?> = createField(DSL.name("first_seen"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column <code>sys.statement_analysis.last_seen</code>.
     */
    val LAST_SEEN: TableField<StatementAnalysisRecord, LocalDateTime?> = createField(DSL.name("last_seen"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<StatementAnalysisRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<StatementAnalysisRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<StatementAnalysisRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.statement_analysis</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.statement_analysis</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.statement_analysis</code> table reference
     */
    constructor(): this(DSL.name("statement_analysis"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): StatementAnalysis = StatementAnalysis(DSL.name(alias), this)
    override fun `as`(alias: Name): StatementAnalysis = StatementAnalysis(alias, this)
    override fun `as`(alias: Table<*>): StatementAnalysis = StatementAnalysis(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): StatementAnalysis = StatementAnalysis(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): StatementAnalysis = StatementAnalysis(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): StatementAnalysis = StatementAnalysis(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): StatementAnalysis = StatementAnalysis(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): StatementAnalysis = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): StatementAnalysis = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): StatementAnalysis = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): StatementAnalysis = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): StatementAnalysis = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): StatementAnalysis = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): StatementAnalysis = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): StatementAnalysis = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): StatementAnalysis = where(DSL.notExists(select))
}
