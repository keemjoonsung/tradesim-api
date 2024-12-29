/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.SchemaIndexStatisticsRecord

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
import org.jooq.Row11
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
open class SchemaIndexStatistics(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, SchemaIndexStatisticsRecord>?,
    parentPath: InverseForeignKey<out Record, SchemaIndexStatisticsRecord>?,
    aliased: Table<SchemaIndexStatisticsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<SchemaIndexStatisticsRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `schema_index_statistics` as select `performance_schema`.`table_io_waits_summary_by_index_usage`.`OBJECT_SCHEMA` AS `table_schema`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`OBJECT_NAME` AS `table_name`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`INDEX_NAME` AS `index_name`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_FETCH` AS `rows_selected`,format_pico_time(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_FETCH`) AS `select_latency`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_INSERT` AS `rows_inserted`,format_pico_time(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_INSERT`) AS `insert_latency`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_UPDATE` AS `rows_updated`,format_pico_time(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_UPDATE`) AS `update_latency`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_DELETE` AS `rows_deleted`,format_pico_time(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_DELETE`) AS `delete_latency` from `performance_schema`.`table_io_waits_summary_by_index_usage` where (`performance_schema`.`table_io_waits_summary_by_index_usage`.`INDEX_NAME` is not null) order by `performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_WAIT` desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sys.schema_index_statistics</code>
         */
        val SCHEMA_INDEX_STATISTICS: SchemaIndexStatistics = SchemaIndexStatistics()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SchemaIndexStatisticsRecord> = SchemaIndexStatisticsRecord::class.java

    /**
     * The column <code>sys.schema_index_statistics.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<SchemaIndexStatisticsRecord, String?> = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.schema_index_statistics.table_name</code>.
     */
    val TABLE_NAME: TableField<SchemaIndexStatisticsRecord, String?> = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.schema_index_statistics.index_name</code>.
     */
    val INDEX_NAME: TableField<SchemaIndexStatisticsRecord, String?> = createField(DSL.name("index_name"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.schema_index_statistics.rows_selected</code>.
     */
    val ROWS_SELECTED: TableField<SchemaIndexStatisticsRecord, ULong?> = createField(DSL.name("rows_selected"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.schema_index_statistics.select_latency</code>.
     */
    val SELECT_LATENCY: TableField<SchemaIndexStatisticsRecord, String?> = createField(DSL.name("select_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.schema_index_statistics.rows_inserted</code>.
     */
    val ROWS_INSERTED: TableField<SchemaIndexStatisticsRecord, ULong?> = createField(DSL.name("rows_inserted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.schema_index_statistics.insert_latency</code>.
     */
    val INSERT_LATENCY: TableField<SchemaIndexStatisticsRecord, String?> = createField(DSL.name("insert_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.schema_index_statistics.rows_updated</code>.
     */
    val ROWS_UPDATED: TableField<SchemaIndexStatisticsRecord, ULong?> = createField(DSL.name("rows_updated"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.schema_index_statistics.update_latency</code>.
     */
    val UPDATE_LATENCY: TableField<SchemaIndexStatisticsRecord, String?> = createField(DSL.name("update_latency"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column <code>sys.schema_index_statistics.rows_deleted</code>.
     */
    val ROWS_DELETED: TableField<SchemaIndexStatisticsRecord, ULong?> = createField(DSL.name("rows_deleted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.schema_index_statistics.delete_latency</code>.
     */
    val DELETE_LATENCY: TableField<SchemaIndexStatisticsRecord, String?> = createField(DSL.name("delete_latency"), SQLDataType.VARCHAR(11), this, "")

    private constructor(alias: Name, aliased: Table<SchemaIndexStatisticsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<SchemaIndexStatisticsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<SchemaIndexStatisticsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.schema_index_statistics</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.schema_index_statistics</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.schema_index_statistics</code> table reference
     */
    constructor(): this(DSL.name("schema_index_statistics"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): SchemaIndexStatistics = SchemaIndexStatistics(DSL.name(alias), this)
    override fun `as`(alias: Name): SchemaIndexStatistics = SchemaIndexStatistics(alias, this)
    override fun `as`(alias: Table<*>): SchemaIndexStatistics = SchemaIndexStatistics(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SchemaIndexStatistics = SchemaIndexStatistics(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SchemaIndexStatistics = SchemaIndexStatistics(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): SchemaIndexStatistics = SchemaIndexStatistics(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): SchemaIndexStatistics = SchemaIndexStatistics(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): SchemaIndexStatistics = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): SchemaIndexStatistics = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): SchemaIndexStatistics = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): SchemaIndexStatistics = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): SchemaIndexStatistics = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): SchemaIndexStatistics = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): SchemaIndexStatistics = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): SchemaIndexStatistics = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): SchemaIndexStatistics = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row11<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?> = super.fieldsRow() as Row11<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}