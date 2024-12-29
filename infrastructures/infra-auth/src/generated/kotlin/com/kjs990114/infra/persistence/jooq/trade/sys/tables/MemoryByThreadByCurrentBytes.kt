/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.MemoryByThreadByCurrentBytesRecord

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
import org.jooq.Row7
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
open class MemoryByThreadByCurrentBytes(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, MemoryByThreadByCurrentBytesRecord>?,
    parentPath: InverseForeignKey<out Record, MemoryByThreadByCurrentBytesRecord>?,
    aliased: Table<MemoryByThreadByCurrentBytesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<MemoryByThreadByCurrentBytesRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `memory_by_thread_by_current_bytes` as select `mt`.`THREAD_ID` AS `thread_id`,if((`t`.`NAME` = 'thread/sql/one_connection'),concat(`t`.`PROCESSLIST_USER`,'@',convert(`t`.`PROCESSLIST_HOST` using utf8mb4)),replace(`t`.`NAME`,'thread/','')) AS `user`,sum(`mt`.`CURRENT_COUNT_USED`) AS `current_count_used`,format_bytes(sum(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`)) AS `current_allocated`,format_bytes(ifnull((sum(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`) / nullif(sum(`mt`.`CURRENT_COUNT_USED`),0)),0)) AS `current_avg_alloc`,format_bytes(max(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`)) AS `current_max_alloc`,format_bytes(sum(`mt`.`SUM_NUMBER_OF_BYTES_ALLOC`)) AS `total_allocated` from (`performance_schema`.`memory_summary_by_thread_by_event_name` `mt` join `performance_schema`.`threads` `t` on((`mt`.`THREAD_ID` = `t`.`THREAD_ID`))) group by `mt`.`THREAD_ID`,if((`t`.`NAME` = 'thread/sql/one_connection'),concat(`t`.`PROCESSLIST_USER`,'@',convert(`t`.`PROCESSLIST_HOST` using utf8mb4)),replace(`t`.`NAME`,'thread/','')) order by sum(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`) desc"),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>sys.memory_by_thread_by_current_bytes</code>
         */
        val MEMORY_BY_THREAD_BY_CURRENT_BYTES: MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<MemoryByThreadByCurrentBytesRecord> = MemoryByThreadByCurrentBytesRecord::class.java

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.thread_id</code>.
     */
    val THREAD_ID: TableField<MemoryByThreadByCurrentBytesRecord, ULong?> = createField(DSL.name("thread_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.user</code>.
     */
    val USER: TableField<MemoryByThreadByCurrentBytesRecord, String?> = createField(DSL.name("user"), SQLDataType.VARCHAR(288), this, "")

    /**
     * The column
     * <code>sys.memory_by_thread_by_current_bytes.current_count_used</code>.
     */
    val CURRENT_COUNT_USED: TableField<MemoryByThreadByCurrentBytesRecord, BigInteger?> = createField(DSL.name("current_count_used"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column
     * <code>sys.memory_by_thread_by_current_bytes.current_allocated</code>.
     */
    val CURRENT_ALLOCATED: TableField<MemoryByThreadByCurrentBytesRecord, String?> = createField(DSL.name("current_allocated"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column
     * <code>sys.memory_by_thread_by_current_bytes.current_avg_alloc</code>.
     */
    val CURRENT_AVG_ALLOC: TableField<MemoryByThreadByCurrentBytesRecord, String?> = createField(DSL.name("current_avg_alloc"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column
     * <code>sys.memory_by_thread_by_current_bytes.current_max_alloc</code>.
     */
    val CURRENT_MAX_ALLOC: TableField<MemoryByThreadByCurrentBytesRecord, String?> = createField(DSL.name("current_max_alloc"), SQLDataType.VARCHAR(11), this, "")

    /**
     * The column
     * <code>sys.memory_by_thread_by_current_bytes.total_allocated</code>.
     */
    val TOTAL_ALLOCATED: TableField<MemoryByThreadByCurrentBytesRecord, String?> = createField(DSL.name("total_allocated"), SQLDataType.VARCHAR(11), this, "")

    private constructor(alias: Name, aliased: Table<MemoryByThreadByCurrentBytesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<MemoryByThreadByCurrentBytesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<MemoryByThreadByCurrentBytesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.memory_by_thread_by_current_bytes</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.memory_by_thread_by_current_bytes</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.memory_by_thread_by_current_bytes</code> table
     * reference
     */
    constructor(): this(DSL.name("memory_by_thread_by_current_bytes"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(DSL.name(alias), this)
    override fun `as`(alias: Name): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(alias, this)
    override fun `as`(alias: Table<*>): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): MemoryByThreadByCurrentBytes = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): MemoryByThreadByCurrentBytes = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): MemoryByThreadByCurrentBytes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): MemoryByThreadByCurrentBytes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): MemoryByThreadByCurrentBytes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): MemoryByThreadByCurrentBytes = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): MemoryByThreadByCurrentBytes = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): MemoryByThreadByCurrentBytes = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): MemoryByThreadByCurrentBytes = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row7<ULong?, String?, BigInteger?, String?, String?, String?, String?> = super.fieldsRow() as Row7<ULong?, String?, BigInteger?, String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (ULong?, String?, BigInteger?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (ULong?, String?, BigInteger?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}