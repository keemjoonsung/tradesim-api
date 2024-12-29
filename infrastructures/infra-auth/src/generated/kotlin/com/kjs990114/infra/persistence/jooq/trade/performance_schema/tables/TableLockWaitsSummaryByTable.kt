/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_TABLE_LOCK_WAITS_SUMMARY_BY_TABLE_OBJECT
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.TableLockWaitsSummaryByTableRecord

import kotlin.collections.Collection
import kotlin.collections.List

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
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TableLockWaitsSummaryByTable(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, TableLockWaitsSummaryByTableRecord>?,
    parentPath: InverseForeignKey<out Record, TableLockWaitsSummaryByTableRecord>?,
    aliased: Table<TableLockWaitsSummaryByTableRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<TableLockWaitsSummaryByTableRecord>(
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
         * <code>performance_schema.table_lock_waits_summary_by_table</code>
         */
        val TABLE_LOCK_WAITS_SUMMARY_BY_TABLE: TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TableLockWaitsSummaryByTableRecord> = TableLockWaitsSummaryByTableRecord::class.java

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_TYPE</code>.
     */
    val OBJECT_TYPE: TableField<TableLockWaitsSummaryByTableRecord, String?> = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_SCHEMA</code>.
     */
    val OBJECT_SCHEMA: TableField<TableLockWaitsSummaryByTableRecord, String?> = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_NAME</code>.
     */
    val OBJECT_NAME: TableField<TableLockWaitsSummaryByTableRecord, String?> = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_STAR</code>.
     */
    val COUNT_STAR: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WAIT</code>.
     */
    val SUM_TIMER_WAIT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WAIT</code>.
     */
    val MIN_TIMER_WAIT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WAIT</code>.
     */
    val AVG_TIMER_WAIT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WAIT</code>.
     */
    val MAX_TIMER_WAIT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ</code>.
     */
    val COUNT_READ: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ</code>.
     */
    val SUM_TIMER_READ: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ</code>.
     */
    val MIN_TIMER_READ: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ</code>.
     */
    val AVG_TIMER_READ: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ</code>.
     */
    val MAX_TIMER_READ: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE</code>.
     */
    val COUNT_WRITE: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE</code>.
     */
    val SUM_TIMER_WRITE: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE</code>.
     */
    val MIN_TIMER_WRITE: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE</code>.
     */
    val AVG_TIMER_WRITE: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE</code>.
     */
    val MAX_TIMER_WRITE: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NORMAL</code>.
     */
    val COUNT_READ_NORMAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_READ_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NORMAL</code>.
     */
    val SUM_TIMER_READ_NORMAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_READ_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NORMAL</code>.
     */
    val MIN_TIMER_READ_NORMAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_READ_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NORMAL</code>.
     */
    val AVG_TIMER_READ_NORMAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_READ_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NORMAL</code>.
     */
    val MAX_TIMER_READ_NORMAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_READ_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_WITH_SHARED_LOCKS</code>.
     */
    val COUNT_READ_WITH_SHARED_LOCKS: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_READ_WITH_SHARED_LOCKS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    val SUM_TIMER_READ_WITH_SHARED_LOCKS: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_READ_WITH_SHARED_LOCKS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    val MIN_TIMER_READ_WITH_SHARED_LOCKS: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_READ_WITH_SHARED_LOCKS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    val AVG_TIMER_READ_WITH_SHARED_LOCKS: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_READ_WITH_SHARED_LOCKS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    val MAX_TIMER_READ_WITH_SHARED_LOCKS: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_READ_WITH_SHARED_LOCKS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_HIGH_PRIORITY</code>.
     */
    val COUNT_READ_HIGH_PRIORITY: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_READ_HIGH_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_HIGH_PRIORITY</code>.
     */
    val SUM_TIMER_READ_HIGH_PRIORITY: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_READ_HIGH_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_HIGH_PRIORITY</code>.
     */
    val MIN_TIMER_READ_HIGH_PRIORITY: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_READ_HIGH_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_HIGH_PRIORITY</code>.
     */
    val AVG_TIMER_READ_HIGH_PRIORITY: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_READ_HIGH_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_HIGH_PRIORITY</code>.
     */
    val MAX_TIMER_READ_HIGH_PRIORITY: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_READ_HIGH_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NO_INSERT</code>.
     */
    val COUNT_READ_NO_INSERT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_READ_NO_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NO_INSERT</code>.
     */
    val SUM_TIMER_READ_NO_INSERT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_READ_NO_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NO_INSERT</code>.
     */
    val MIN_TIMER_READ_NO_INSERT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_READ_NO_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NO_INSERT</code>.
     */
    val AVG_TIMER_READ_NO_INSERT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_READ_NO_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NO_INSERT</code>.
     */
    val MAX_TIMER_READ_NO_INSERT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_READ_NO_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_EXTERNAL</code>.
     */
    val COUNT_READ_EXTERNAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_READ_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_EXTERNAL</code>.
     */
    val SUM_TIMER_READ_EXTERNAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_READ_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_EXTERNAL</code>.
     */
    val MIN_TIMER_READ_EXTERNAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_READ_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_EXTERNAL</code>.
     */
    val AVG_TIMER_READ_EXTERNAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_READ_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_EXTERNAL</code>.
     */
    val MAX_TIMER_READ_EXTERNAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_READ_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_ALLOW_WRITE</code>.
     */
    val COUNT_WRITE_ALLOW_WRITE: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_WRITE_ALLOW_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    val SUM_TIMER_WRITE_ALLOW_WRITE: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_WRITE_ALLOW_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    val MIN_TIMER_WRITE_ALLOW_WRITE: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_WRITE_ALLOW_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    val AVG_TIMER_WRITE_ALLOW_WRITE: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_WRITE_ALLOW_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    val MAX_TIMER_WRITE_ALLOW_WRITE: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_WRITE_ALLOW_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_CONCURRENT_INSERT</code>.
     */
    val COUNT_WRITE_CONCURRENT_INSERT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_WRITE_CONCURRENT_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    val SUM_TIMER_WRITE_CONCURRENT_INSERT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_WRITE_CONCURRENT_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    val MIN_TIMER_WRITE_CONCURRENT_INSERT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_WRITE_CONCURRENT_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    val AVG_TIMER_WRITE_CONCURRENT_INSERT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_WRITE_CONCURRENT_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    val MAX_TIMER_WRITE_CONCURRENT_INSERT: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_WRITE_CONCURRENT_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_LOW_PRIORITY</code>.
     */
    val COUNT_WRITE_LOW_PRIORITY: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_WRITE_LOW_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    val SUM_TIMER_WRITE_LOW_PRIORITY: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_WRITE_LOW_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    val MIN_TIMER_WRITE_LOW_PRIORITY: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_WRITE_LOW_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    val AVG_TIMER_WRITE_LOW_PRIORITY: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_WRITE_LOW_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    val MAX_TIMER_WRITE_LOW_PRIORITY: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_WRITE_LOW_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_NORMAL</code>.
     */
    val COUNT_WRITE_NORMAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_WRITE_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_NORMAL</code>.
     */
    val SUM_TIMER_WRITE_NORMAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_WRITE_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_NORMAL</code>.
     */
    val MIN_TIMER_WRITE_NORMAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_WRITE_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_NORMAL</code>.
     */
    val AVG_TIMER_WRITE_NORMAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_WRITE_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_NORMAL</code>.
     */
    val MAX_TIMER_WRITE_NORMAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_WRITE_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_EXTERNAL</code>.
     */
    val COUNT_WRITE_EXTERNAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("COUNT_WRITE_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_EXTERNAL</code>.
     */
    val SUM_TIMER_WRITE_EXTERNAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("SUM_TIMER_WRITE_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_EXTERNAL</code>.
     */
    val MIN_TIMER_WRITE_EXTERNAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MIN_TIMER_WRITE_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_EXTERNAL</code>.
     */
    val AVG_TIMER_WRITE_EXTERNAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("AVG_TIMER_WRITE_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_EXTERNAL</code>.
     */
    val MAX_TIMER_WRITE_EXTERNAL: TableField<TableLockWaitsSummaryByTableRecord, ULong?> = createField(DSL.name("MAX_TIMER_WRITE_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<TableLockWaitsSummaryByTableRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<TableLockWaitsSummaryByTableRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<TableLockWaitsSummaryByTableRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.table_lock_waits_summary_by_table</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.table_lock_waits_summary_by_table</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>performance_schema.table_lock_waits_summary_by_table</code> table
     * reference
     */
    constructor(): this(DSL.name("table_lock_waits_summary_by_table"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getUniqueKeys(): List<UniqueKey<TableLockWaitsSummaryByTableRecord>> = listOf(KEY_TABLE_LOCK_WAITS_SUMMARY_BY_TABLE_OBJECT)
    override fun `as`(alias: String): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(DSL.name(alias), this)
    override fun `as`(alias: Name): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(alias, this)
    override fun `as`(alias: Table<*>): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): TableLockWaitsSummaryByTable = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): TableLockWaitsSummaryByTable = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): TableLockWaitsSummaryByTable = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): TableLockWaitsSummaryByTable = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): TableLockWaitsSummaryByTable = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): TableLockWaitsSummaryByTable = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): TableLockWaitsSummaryByTable = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): TableLockWaitsSummaryByTable = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): TableLockWaitsSummaryByTable = where(DSL.notExists(select))
}