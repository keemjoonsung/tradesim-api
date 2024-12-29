/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys

import java.math.BigDecimal
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
import org.jooq.Row10
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
open class `X$statementsWithErrorsOrWarnings`(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`>?,
    parentPath: InverseForeignKey<out Record, com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`>?,
    aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `x\$statements_with_errors_or_warnings` as select `performance_schema`.`events_statements_summary_by_digest`.`DIGEST_TEXT` AS `query`,`performance_schema`.`events_statements_summary_by_digest`.`SCHEMA_NAME` AS `db`,`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR` AS `exec_count`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_ERRORS` AS `errors`,(ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_ERRORS` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`,0)),0) * 100) AS `error_pct`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_WARNINGS` AS `warnings`,(ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_WARNINGS` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`,0)),0) * 100) AS `warning_pct`,`performance_schema`.`events_statements_summary_by_digest`.`FIRST_SEEN` AS `first_seen`,`performance_schema`.`events_statements_summary_by_digest`.`LAST_SEEN` AS `last_seen`,`performance_schema`.`events_statements_summary_by_digest`.`DIGEST` AS `digest` from `performance_schema`.`events_statements_summary_by_digest` where ((`performance_schema`.`events_statements_summary_by_digest`.`SUM_ERRORS` > 0) or (`performance_schema`.`events_statements_summary_by_digest`.`SUM_WARNINGS` > 0)) order by `performance_schema`.`events_statements_summary_by_digest`.`SUM_ERRORS` desc,`performance_schema`.`events_statements_summary_by_digest`.`SUM_WARNINGS` desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>sys.x$statements_with_errors_or_warnings</code>
         */
        val `X$STATEMENTS_WITH_ERRORS_OR_WARNINGS`: `X$statementsWithErrorsOrWarnings` = `X$statementsWithErrorsOrWarnings`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`::class.java

    /**
     * The column <code>sys.x$statements_with_errors_or_warnings.query</code>.
     */
    val QUERY: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`, String?> = createField(DSL.name("query"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.x$statements_with_errors_or_warnings.db</code>.
     */
    val DB: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`, String?> = createField(DSL.name("db"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_errors_or_warnings.exec_count</code>.
     */
    val EXEC_COUNT: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`, ULong?> = createField(DSL.name("exec_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$statements_with_errors_or_warnings.errors</code>.
     */
    val ERRORS: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`, ULong?> = createField(DSL.name("errors"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_errors_or_warnings.error_pct</code>.
     */
    val ERROR_PCT: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`, BigDecimal?> = createField(DSL.name("error_pct"), SQLDataType.DECIMAL(27, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_errors_or_warnings.warnings</code>.
     */
    val WARNINGS: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`, ULong?> = createField(DSL.name("warnings"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_errors_or_warnings.warning_pct</code>.
     */
    val WARNING_PCT: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`, BigDecimal?> = createField(DSL.name("warning_pct"), SQLDataType.DECIMAL(27, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_errors_or_warnings.first_seen</code>.
     */
    val FIRST_SEEN: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`, LocalDateTime?> = createField(DSL.name("first_seen"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column
     * <code>sys.x$statements_with_errors_or_warnings.last_seen</code>.
     */
    val LAST_SEEN: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`, LocalDateTime?> = createField(DSL.name("last_seen"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    /**
     * The column <code>sys.x$statements_with_errors_or_warnings.digest</code>.
     */
    val DIGEST: TableField<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`, String?> = createField(DSL.name("digest"), SQLDataType.VARCHAR(64), this, "")

    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.`X$statementsWithErrorsOrWarningsRecord`>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.x$statements_with_errors_or_warnings</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$statements_with_errors_or_warnings</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$statements_with_errors_or_warnings</code> table
     * reference
     */
    constructor(): this(DSL.name("x\$statements_with_errors_or_warnings"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): `X$statementsWithErrorsOrWarnings` = `X$statementsWithErrorsOrWarnings`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$statementsWithErrorsOrWarnings` = `X$statementsWithErrorsOrWarnings`(alias, this)
    override fun `as`(alias: Table<*>): `X$statementsWithErrorsOrWarnings` = `X$statementsWithErrorsOrWarnings`(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$statementsWithErrorsOrWarnings` = `X$statementsWithErrorsOrWarnings`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$statementsWithErrorsOrWarnings` = `X$statementsWithErrorsOrWarnings`(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): `X$statementsWithErrorsOrWarnings` = `X$statementsWithErrorsOrWarnings`(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): `X$statementsWithErrorsOrWarnings` = `X$statementsWithErrorsOrWarnings`(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): `X$statementsWithErrorsOrWarnings` = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): `X$statementsWithErrorsOrWarnings` = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): `X$statementsWithErrorsOrWarnings` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): `X$statementsWithErrorsOrWarnings` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): `X$statementsWithErrorsOrWarnings` = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): `X$statementsWithErrorsOrWarnings` = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): `X$statementsWithErrorsOrWarnings` = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): `X$statementsWithErrorsOrWarnings` = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): `X$statementsWithErrorsOrWarnings` = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<String?, String?, ULong?, ULong?, BigDecimal?, ULong?, BigDecimal?, LocalDateTime?, LocalDateTime?, String?> = super.fieldsRow() as Row10<String?, String?, ULong?, ULong?, BigDecimal?, ULong?, BigDecimal?, LocalDateTime?, LocalDateTime?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, ULong?, ULong?, BigDecimal?, ULong?, BigDecimal?, LocalDateTime?, LocalDateTime?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, ULong?, ULong?, BigDecimal?, ULong?, BigDecimal?, LocalDateTime?, LocalDateTime?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}