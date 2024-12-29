/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.information_schema.InformationSchema
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records.InnodbMetricsRecord

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
import org.jooq.Row17
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
open class InnodbMetrics(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, InnodbMetricsRecord>?,
    parentPath: InverseForeignKey<out Record, InnodbMetricsRecord>?,
    aliased: Table<InnodbMetricsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<InnodbMetricsRecord>(
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
         * <code>information_schema.INNODB_METRICS</code>
         */
        val INNODB_METRICS: InnodbMetrics = InnodbMetrics()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InnodbMetricsRecord> = InnodbMetricsRecord::class.java

    /**
     * The column <code>information_schema.INNODB_METRICS.NAME</code>.
     */
    val NAME: TableField<InnodbMetricsRecord, String?> = createField(DSL.name("NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.SUBSYSTEM</code>.
     */
    val SUBSYSTEM: TableField<InnodbMetricsRecord, String?> = createField(DSL.name("SUBSYSTEM"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.COUNT</code>.
     */
    val COUNT: TableField<InnodbMetricsRecord, Long?> = createField(DSL.name("COUNT"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.MAX_COUNT</code>.
     */
    val MAX_COUNT: TableField<InnodbMetricsRecord, Long?> = createField(DSL.name("MAX_COUNT"), SQLDataType.BIGINT.defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.MIN_COUNT</code>.
     */
    val MIN_COUNT: TableField<InnodbMetricsRecord, Long?> = createField(DSL.name("MIN_COUNT"), SQLDataType.BIGINT.defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.AVG_COUNT</code>.
     */
    val AVG_COUNT: TableField<InnodbMetricsRecord, Double?> = createField(DSL.name("AVG_COUNT"), SQLDataType.FLOAT.defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.COUNT_RESET</code>.
     */
    val COUNT_RESET: TableField<InnodbMetricsRecord, Long?> = createField(DSL.name("COUNT_RESET"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_METRICS.MAX_COUNT_RESET</code>.
     */
    val MAX_COUNT_RESET: TableField<InnodbMetricsRecord, Long?> = createField(DSL.name("MAX_COUNT_RESET"), SQLDataType.BIGINT.defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_METRICS.MIN_COUNT_RESET</code>.
     */
    val MIN_COUNT_RESET: TableField<InnodbMetricsRecord, Long?> = createField(DSL.name("MIN_COUNT_RESET"), SQLDataType.BIGINT.defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "")

    /**
     * The column
     * <code>information_schema.INNODB_METRICS.AVG_COUNT_RESET</code>.
     */
    val AVG_COUNT_RESET: TableField<InnodbMetricsRecord, Double?> = createField(DSL.name("AVG_COUNT_RESET"), SQLDataType.FLOAT.defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_ENABLED</code>.
     */
    val TIME_ENABLED: TableField<InnodbMetricsRecord, LocalDateTime?> = createField(DSL.name("TIME_ENABLED"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_DISABLED</code>.
     */
    val TIME_DISABLED: TableField<InnodbMetricsRecord, LocalDateTime?> = createField(DSL.name("TIME_DISABLED"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_ELAPSED</code>.
     */
    val TIME_ELAPSED: TableField<InnodbMetricsRecord, Long?> = createField(DSL.name("TIME_ELAPSED"), SQLDataType.BIGINT.defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_RESET</code>.
     */
    val TIME_RESET: TableField<InnodbMetricsRecord, LocalDateTime?> = createField(DSL.name("TIME_RESET"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.STATUS</code>.
     */
    val STATUS: TableField<InnodbMetricsRecord, String?> = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.TYPE</code>.
     */
    val TYPE: TableField<InnodbMetricsRecord, String?> = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.COMMENT</code>.
     */
    val COMMENT: TableField<InnodbMetricsRecord, String?> = createField(DSL.name("COMMENT"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<InnodbMetricsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<InnodbMetricsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<InnodbMetricsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>information_schema.INNODB_METRICS</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_METRICS</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_METRICS</code> table reference
     */
    constructor(): this(DSL.name("INNODB_METRICS"), null)
    override fun getSchema(): Schema? = if (aliased()) null else InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbMetrics = InnodbMetrics(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbMetrics = InnodbMetrics(alias, this)
    override fun `as`(alias: Table<*>): InnodbMetrics = InnodbMetrics(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbMetrics = InnodbMetrics(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbMetrics = InnodbMetrics(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): InnodbMetrics = InnodbMetrics(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): InnodbMetrics = InnodbMetrics(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): InnodbMetrics = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): InnodbMetrics = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): InnodbMetrics = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): InnodbMetrics = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): InnodbMetrics = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): InnodbMetrics = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): InnodbMetrics = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): InnodbMetrics = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): InnodbMetrics = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row17<String?, String?, Long?, Long?, Long?, Double?, Long?, Long?, Long?, Double?, LocalDateTime?, LocalDateTime?, Long?, LocalDateTime?, String?, String?, String?> = super.fieldsRow() as Row17<String?, String?, Long?, Long?, Long?, Double?, Long?, Long?, Long?, Double?, LocalDateTime?, LocalDateTime?, Long?, LocalDateTime?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, Long?, Long?, Long?, Double?, Long?, Long?, Long?, Double?, LocalDateTime?, LocalDateTime?, Long?, LocalDateTime?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, Long?, Long?, Long?, Double?, Long?, Long?, Long?, Double?, LocalDateTime?, LocalDateTime?, Long?, LocalDateTime?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
