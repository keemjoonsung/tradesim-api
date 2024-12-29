/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys

import java.math.BigInteger
import java.time.LocalDateTime
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
import org.jooq.Row14
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
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class `X$statementsWithFullTableScans`(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`>?,
    parentPath: InverseForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`>?,
    aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `x\$statements_with_full_table_scans` as select `performance_schema`.`events_statements_summary_by_digest`.`DIGEST_TEXT` AS `query`,`performance_schema`.`events_statements_summary_by_digest`.`SCHEMA_NAME` AS `db`,`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR` AS `exec_count`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_TIMER_WAIT` AS `total_latency`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_NO_INDEX_USED` AS `no_index_used_count`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_NO_GOOD_INDEX_USED` AS `no_good_index_used_count`,round((ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_NO_INDEX_USED` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`,0)),0) * 100),0) AS `no_index_used_pct`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_ROWS_SENT` AS `rows_sent`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_ROWS_EXAMINED` AS `rows_examined`,round((`performance_schema`.`events_statements_summary_by_digest`.`SUM_ROWS_SENT` / `performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`),0) AS `rows_sent_avg`,round((`performance_schema`.`events_statements_summary_by_digest`.`SUM_ROWS_EXAMINED` / `performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`),0) AS `rows_examined_avg`,`performance_schema`.`events_statements_summary_by_digest`.`FIRST_SEEN` AS `first_seen`,`performance_schema`.`events_statements_summary_by_digest`.`LAST_SEEN` AS `last_seen`,`performance_schema`.`events_statements_summary_by_digest`.`DIGEST` AS `digest` from `performance_schema`.`events_statements_summary_by_digest` where (((`performance_schema`.`events_statements_summary_by_digest`.`SUM_NO_INDEX_USED` > 0) or (`performance_schema`.`events_statements_summary_by_digest`.`SUM_NO_GOOD_INDEX_USED` > 0)) and (not((`performance_schema`.`events_statements_summary_by_digest`.`DIGEST_TEXT` like 'SHOW%')))) order by round((ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_NO_INDEX_USED` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`,0)),0) * 100),0) desc,`performance_schema`.`events_statements_summary_by_digest`.`SUM_TIMER_WAIT` desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>sys.x$statements_with_full_table_scans</code>
         */
        val `X$STATEMENTS_WITH_FULL_TABLE_SCANS`: `X$statementsWithFullTableScans` = `X$statementsWithFullTableScans`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`::class.java

    /**
     * The column <code>sys.x$statements_with_full_table_scans.query</code>.
     */
    val QUERY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, String?> = createField(DSL.name("query"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.x$statements_with_full_table_scans.db</code>.
     */
    val DB: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, String?> = createField(DSL.name("db"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_full_table_scans.exec_count</code>.
     */
    val EXEC_COUNT: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, ULong?> = createField(DSL.name("exec_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_full_table_scans.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, ULong?> = createField(DSL.name("total_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_full_table_scans.no_index_used_count</code>.
     */
    val NO_INDEX_USED_COUNT: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, ULong?> = createField(DSL.name("no_index_used_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_full_table_scans.no_good_index_used_count</code>.
     */
    val NO_GOOD_INDEX_USED_COUNT: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, ULong?> = createField(DSL.name("no_good_index_used_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_full_table_scans.no_index_used_pct</code>.
     */
    val NO_INDEX_USED_PCT: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, BigInteger?> = createField(DSL.name("no_index_used_pct"), SQLDataType.DECIMAL_INTEGER(24).nullable(false).defaultValue(DSL.inline("0", SQLDataType.DECIMAL_INTEGER)), this, "")

    /**
     * The column <code>sys.x$statements_with_full_table_scans.rows_sent</code>.
     */
    val ROWS_SENT: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, ULong?> = createField(DSL.name("rows_sent"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_full_table_scans.rows_examined</code>.
     */
    val ROWS_EXAMINED: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, ULong?> = createField(DSL.name("rows_examined"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_full_table_scans.rows_sent_avg</code>.
     */
    val ROWS_SENT_AVG: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, BigInteger?> = createField(DSL.name("rows_sent_avg"), SQLDataType.DECIMAL_INTEGER(21), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_full_table_scans.rows_examined_avg</code>.
     */
    val ROWS_EXAMINED_AVG: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, BigInteger?> = createField(DSL.name("rows_examined_avg"), SQLDataType.DECIMAL_INTEGER(21), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_full_table_scans.first_seen</code>.
     */
    val FIRST_SEEN: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, LocalDateTime?> = createField(DSL.name("first_seen"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column <code>sys.x$statements_with_full_table_scans.last_seen</code>.
     */
    val LAST_SEEN: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, LocalDateTime?> = createField(DSL.name("last_seen"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column <code>sys.x$statements_with_full_table_scans.digest</code>.
     */
    val DIGEST: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`, String?> = createField(DSL.name("digest"), SQLDataType.VARCHAR(64), this, "")

    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithFullTableScansRecord`>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.x$statements_with_full_table_scans</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$statements_with_full_table_scans</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$statements_with_full_table_scans</code> table
     * reference
     */
    constructor(): this(DSL.name("x\$statements_with_full_table_scans"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): `X$statementsWithFullTableScans` = `X$statementsWithFullTableScans`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$statementsWithFullTableScans` = `X$statementsWithFullTableScans`(alias, this)
    override fun `as`(alias: Table<*>): `X$statementsWithFullTableScans` = `X$statementsWithFullTableScans`(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$statementsWithFullTableScans` = `X$statementsWithFullTableScans`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$statementsWithFullTableScans` = `X$statementsWithFullTableScans`(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): `X$statementsWithFullTableScans` = `X$statementsWithFullTableScans`(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): `X$statementsWithFullTableScans` = `X$statementsWithFullTableScans`(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): `X$statementsWithFullTableScans` = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): `X$statementsWithFullTableScans` = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): `X$statementsWithFullTableScans` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): `X$statementsWithFullTableScans` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): `X$statementsWithFullTableScans` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): `X$statementsWithFullTableScans` = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): `X$statementsWithFullTableScans` = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): `X$statementsWithFullTableScans` = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): `X$statementsWithFullTableScans` = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row14<String?, String?, ULong?, ULong?, ULong?, ULong?, BigInteger?, ULong?, ULong?, BigInteger?, BigInteger?, LocalDateTime?, LocalDateTime?, String?> = super.fieldsRow() as Row14<String?, String?, ULong?, ULong?, ULong?, ULong?, BigInteger?, ULong?, ULong?, BigInteger?, BigInteger?, LocalDateTime?, LocalDateTime?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, ULong?, ULong?, ULong?, ULong?, BigInteger?, ULong?, ULong?, BigInteger?, BigInteger?, LocalDateTime?, LocalDateTime?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, ULong?, ULong?, ULong?, ULong?, BigInteger?, ULong?, ULong?, BigInteger?, BigInteger?, LocalDateTime?, LocalDateTime?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
