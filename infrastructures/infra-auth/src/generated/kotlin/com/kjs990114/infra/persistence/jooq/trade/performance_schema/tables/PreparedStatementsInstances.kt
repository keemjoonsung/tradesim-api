/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.PreparedStatementsInstancesExecutionEngine
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.PreparedStatementsInstancesOwnerObjectType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.PREPARED_STATEMENTS_INSTANCES_OWNER_OBJECT_TYPE
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.PREPARED_STATEMENTS_INSTANCES_STATEMENT_ID
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.indexes.PREPARED_STATEMENTS_INSTANCES_STATEMENT_NAME
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_PREPARED_STATEMENTS_INSTANCES_OWNER_THREAD_ID
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.keys.KEY_PREPARED_STATEMENTS_INSTANCES_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.PreparedStatementsInstancesRecord

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
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
open class PreparedStatementsInstances(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PreparedStatementsInstancesRecord>?,
    parentPath: InverseForeignKey<out Record, PreparedStatementsInstancesRecord>?,
    aliased: Table<PreparedStatementsInstancesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PreparedStatementsInstancesRecord>(
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
         * <code>performance_schema.prepared_statements_instances</code>
         */
        val PREPARED_STATEMENTS_INSTANCES: PreparedStatementsInstances = PreparedStatementsInstances()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PreparedStatementsInstancesRecord> = PreparedStatementsInstancesRecord::class.java

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.STATEMENT_ID</code>.
     */
    val STATEMENT_ID: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("STATEMENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.STATEMENT_NAME</code>.
     */
    val STATEMENT_NAME: TableField<PreparedStatementsInstancesRecord, String?> = createField(DSL.name("STATEMENT_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SQL_TEXT</code>.
     */
    val SQL_TEXT: TableField<PreparedStatementsInstancesRecord, String?> = createField(DSL.name("SQL_TEXT"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.OWNER_THREAD_ID</code>.
     */
    val OWNER_THREAD_ID: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("OWNER_THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.OWNER_EVENT_ID</code>.
     */
    val OWNER_EVENT_ID: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("OWNER_EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_TYPE</code>.
     */
    val OWNER_OBJECT_TYPE: TableField<PreparedStatementsInstancesRecord, PreparedStatementsInstancesOwnerObjectType?> = createField(DSL.name("OWNER_OBJECT_TYPE"), SQLDataType.VARCHAR(9).asEnumDataType(PreparedStatementsInstancesOwnerObjectType::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_SCHEMA</code>.
     */
    val OWNER_OBJECT_SCHEMA: TableField<PreparedStatementsInstancesRecord, String?> = createField(DSL.name("OWNER_OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_NAME</code>.
     */
    val OWNER_OBJECT_NAME: TableField<PreparedStatementsInstancesRecord, String?> = createField(DSL.name("OWNER_OBJECT_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.EXECUTION_ENGINE</code>.
     */
    val EXECUTION_ENGINE: TableField<PreparedStatementsInstancesRecord, PreparedStatementsInstancesExecutionEngine?> = createField(DSL.name("EXECUTION_ENGINE"), SQLDataType.VARCHAR(9).asEnumDataType(PreparedStatementsInstancesExecutionEngine::class.java), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.TIMER_PREPARE</code>.
     */
    val TIMER_PREPARE: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("TIMER_PREPARE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.COUNT_REPREPARE</code>.
     */
    val COUNT_REPREPARE: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("COUNT_REPREPARE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.COUNT_EXECUTE</code>.
     */
    val COUNT_EXECUTE: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("COUNT_EXECUTE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_TIMER_EXECUTE</code>.
     */
    val SUM_TIMER_EXECUTE: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_TIMER_EXECUTE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.MIN_TIMER_EXECUTE</code>.
     */
    val MIN_TIMER_EXECUTE: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("MIN_TIMER_EXECUTE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.AVG_TIMER_EXECUTE</code>.
     */
    val AVG_TIMER_EXECUTE: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("AVG_TIMER_EXECUTE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.MAX_TIMER_EXECUTE</code>.
     */
    val MAX_TIMER_EXECUTE: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("MAX_TIMER_EXECUTE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_LOCK_TIME</code>.
     */
    val SUM_LOCK_TIME: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_LOCK_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_ERRORS</code>.
     */
    val SUM_ERRORS: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_ERRORS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_WARNINGS</code>.
     */
    val SUM_WARNINGS: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_WARNINGS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_ROWS_AFFECTED</code>.
     */
    val SUM_ROWS_AFFECTED: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_ROWS_AFFECTED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_ROWS_SENT</code>.
     */
    val SUM_ROWS_SENT: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_ROWS_SENT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_ROWS_EXAMINED</code>.
     */
    val SUM_ROWS_EXAMINED: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_ROWS_EXAMINED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    val SUM_CREATED_TMP_DISK_TABLES: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_CREATED_TMP_DISK_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_TABLES</code>.
     */
    val SUM_CREATED_TMP_TABLES: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_CREATED_TMP_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_JOIN</code>.
     */
    val SUM_SELECT_FULL_JOIN: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_SELECT_FULL_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    val SUM_SELECT_FULL_RANGE_JOIN: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_SELECT_FULL_RANGE_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE</code>.
     */
    val SUM_SELECT_RANGE: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_SELECT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE_CHECK</code>.
     */
    val SUM_SELECT_RANGE_CHECK: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_SELECT_RANGE_CHECK"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_SELECT_SCAN</code>.
     */
    val SUM_SELECT_SCAN: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_SELECT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_SORT_MERGE_PASSES</code>.
     */
    val SUM_SORT_MERGE_PASSES: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_SORT_MERGE_PASSES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_SORT_RANGE</code>.
     */
    val SUM_SORT_RANGE: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_SORT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_SORT_ROWS</code>.
     */
    val SUM_SORT_ROWS: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_SORT_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_SORT_SCAN</code>.
     */
    val SUM_SORT_SCAN: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_SORT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_NO_INDEX_USED</code>.
     */
    val SUM_NO_INDEX_USED: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_NO_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_NO_GOOD_INDEX_USED</code>.
     */
    val SUM_NO_GOOD_INDEX_USED: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_NO_GOOD_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.SUM_CPU_TIME</code>.
     */
    val SUM_CPU_TIME: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("SUM_CPU_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.MAX_CONTROLLED_MEMORY</code>.
     */
    val MAX_CONTROLLED_MEMORY: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("MAX_CONTROLLED_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.MAX_TOTAL_MEMORY</code>.
     */
    val MAX_TOTAL_MEMORY: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("MAX_TOTAL_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column
     * <code>performance_schema.prepared_statements_instances.COUNT_SECONDARY</code>.
     */
    val COUNT_SECONDARY: TableField<PreparedStatementsInstancesRecord, ULong?> = createField(DSL.name("COUNT_SECONDARY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PreparedStatementsInstancesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PreparedStatementsInstancesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PreparedStatementsInstancesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.prepared_statements_instances</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.prepared_statements_instances</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.prepared_statements_instances</code>
     * table reference
     */
    constructor(): this(DSL.name("prepared_statements_instances"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun getIndexes(): List<Index> = listOf(PREPARED_STATEMENTS_INSTANCES_OWNER_OBJECT_TYPE, PREPARED_STATEMENTS_INSTANCES_STATEMENT_ID, PREPARED_STATEMENTS_INSTANCES_STATEMENT_NAME)
    override fun getPrimaryKey(): UniqueKey<PreparedStatementsInstancesRecord> = KEY_PREPARED_STATEMENTS_INSTANCES_PRIMARY
    override fun getUniqueKeys(): List<UniqueKey<PreparedStatementsInstancesRecord>> = listOf(KEY_PREPARED_STATEMENTS_INSTANCES_OWNER_THREAD_ID)
    override fun `as`(alias: String): PreparedStatementsInstances = PreparedStatementsInstances(DSL.name(alias), this)
    override fun `as`(alias: Name): PreparedStatementsInstances = PreparedStatementsInstances(alias, this)
    override fun `as`(alias: Table<*>): PreparedStatementsInstances = PreparedStatementsInstances(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PreparedStatementsInstances = PreparedStatementsInstances(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PreparedStatementsInstances = PreparedStatementsInstances(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PreparedStatementsInstances = PreparedStatementsInstances(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): PreparedStatementsInstances = PreparedStatementsInstances(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PreparedStatementsInstances = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): PreparedStatementsInstances = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): PreparedStatementsInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PreparedStatementsInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PreparedStatementsInstances = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PreparedStatementsInstances = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PreparedStatementsInstances = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PreparedStatementsInstances = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PreparedStatementsInstances = where(DSL.notExists(select))
}