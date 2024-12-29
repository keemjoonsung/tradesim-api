/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.PerformanceSchema
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.BinaryLogTransactionCompressionStatsLogType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records.BinaryLogTransactionCompressionStatsRecord

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
open class BinaryLogTransactionCompressionStats(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, BinaryLogTransactionCompressionStatsRecord>?,
    parentPath: InverseForeignKey<out Record, BinaryLogTransactionCompressionStatsRecord>?,
    aliased: Table<BinaryLogTransactionCompressionStatsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<BinaryLogTransactionCompressionStatsRecord>(
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
         * <code>performance_schema.binary_log_transaction_compression_stats</code>
         */
        val BINARY_LOG_TRANSACTION_COMPRESSION_STATS: BinaryLogTransactionCompressionStats = BinaryLogTransactionCompressionStats()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<BinaryLogTransactionCompressionStatsRecord> = BinaryLogTransactionCompressionStatsRecord::class.java

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.LOG_TYPE</code>.
     * The log type to which the transactions were written.
     */
    val LOG_TYPE: TableField<BinaryLogTransactionCompressionStatsRecord, BinaryLogTransactionCompressionStatsLogType?> = createField(DSL.name("LOG_TYPE"), SQLDataType.VARCHAR(6).nullable(false).asEnumDataType(BinaryLogTransactionCompressionStatsLogType::class.java), this, "The log type to which the transactions were written.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSION_TYPE</code>.
     * The transaction compression algorithm used.
     */
    val COMPRESSION_TYPE: TableField<BinaryLogTransactionCompressionStatsRecord, String?> = createField(DSL.name("COMPRESSION_TYPE"), SQLDataType.VARCHAR(64).nullable(false), this, "The transaction compression algorithm used.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.TRANSACTION_COUNTER</code>.
     * Number of transactions written to the log
     */
    val TRANSACTION_COUNTER: TableField<BinaryLogTransactionCompressionStatsRecord, ULong?> = createField(DSL.name("TRANSACTION_COUNTER"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Number of transactions written to the log")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSED_BYTES_COUNTER</code>.
     * The total number of bytes compressed.
     */
    val COMPRESSED_BYTES_COUNTER: TableField<BinaryLogTransactionCompressionStatsRecord, ULong?> = createField(DSL.name("COMPRESSED_BYTES_COUNTER"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "The total number of bytes compressed.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.UNCOMPRESSED_BYTES_COUNTER</code>.
     * The total number of bytes uncompressed.
     */
    val UNCOMPRESSED_BYTES_COUNTER: TableField<BinaryLogTransactionCompressionStatsRecord, ULong?> = createField(DSL.name("UNCOMPRESSED_BYTES_COUNTER"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "The total number of bytes uncompressed.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSION_PERCENTAGE</code>.
     * The compression ratio as a percentage.
     */
    val COMPRESSION_PERCENTAGE: TableField<BinaryLogTransactionCompressionStatsRecord, Short?> = createField(DSL.name("COMPRESSION_PERCENTAGE"), SQLDataType.SMALLINT.nullable(false), this, "The compression ratio as a percentage.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_ID</code>.
     * The first transaction written.
     */
    val FIRST_TRANSACTION_ID: TableField<BinaryLogTransactionCompressionStatsRecord, String?> = createField(DSL.name("FIRST_TRANSACTION_ID"), SQLDataType.CLOB, this, "The first transaction written.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_COMPRESSED_BYTES</code>.
     * First transaction written compressed bytes.
     */
    val FIRST_TRANSACTION_COMPRESSED_BYTES: TableField<BinaryLogTransactionCompressionStatsRecord, ULong?> = createField(DSL.name("FIRST_TRANSACTION_COMPRESSED_BYTES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "First transaction written compressed bytes.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_UNCOMPRESSED_BYTES</code>.
     * First transaction written uncompressed bytes.
     */
    val FIRST_TRANSACTION_UNCOMPRESSED_BYTES: TableField<BinaryLogTransactionCompressionStatsRecord, ULong?> = createField(DSL.name("FIRST_TRANSACTION_UNCOMPRESSED_BYTES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "First transaction written uncompressed bytes.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_TIMESTAMP</code>.
     * When the first transaction was written.
     */
    val FIRST_TRANSACTION_TIMESTAMP: TableField<BinaryLogTransactionCompressionStatsRecord, LocalDateTime?> = createField(DSL.name("FIRST_TRANSACTION_TIMESTAMP"), SQLDataType.LOCALDATETIME(6), this, "When the first transaction was written.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_ID</code>.
     * The last transaction written.
     */
    val LAST_TRANSACTION_ID: TableField<BinaryLogTransactionCompressionStatsRecord, String?> = createField(DSL.name("LAST_TRANSACTION_ID"), SQLDataType.CLOB, this, "The last transaction written.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_COMPRESSED_BYTES</code>.
     * Last transaction written compressed bytes.
     */
    val LAST_TRANSACTION_COMPRESSED_BYTES: TableField<BinaryLogTransactionCompressionStatsRecord, ULong?> = createField(DSL.name("LAST_TRANSACTION_COMPRESSED_BYTES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Last transaction written compressed bytes.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_UNCOMPRESSED_BYTES</code>.
     * Last transaction written uncompressed bytes.
     */
    val LAST_TRANSACTION_UNCOMPRESSED_BYTES: TableField<BinaryLogTransactionCompressionStatsRecord, ULong?> = createField(DSL.name("LAST_TRANSACTION_UNCOMPRESSED_BYTES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Last transaction written uncompressed bytes.")

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_TIMESTAMP</code>.
     * When the last transaction was written.
     */
    val LAST_TRANSACTION_TIMESTAMP: TableField<BinaryLogTransactionCompressionStatsRecord, LocalDateTime?> = createField(DSL.name("LAST_TRANSACTION_TIMESTAMP"), SQLDataType.LOCALDATETIME(6), this, "When the last transaction was written.")

    private constructor(alias: Name, aliased: Table<BinaryLogTransactionCompressionStatsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<BinaryLogTransactionCompressionStatsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<BinaryLogTransactionCompressionStatsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased
     * <code>performance_schema.binary_log_transaction_compression_stats</code>
     * table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased
     * <code>performance_schema.binary_log_transaction_compression_stats</code>
     * table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a
     * <code>performance_schema.binary_log_transaction_compression_stats</code>
     * table reference
     */
    constructor(): this(DSL.name("binary_log_transaction_compression_stats"), null)
    override fun getSchema(): Schema? = if (aliased()) null else PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): BinaryLogTransactionCompressionStats = BinaryLogTransactionCompressionStats(DSL.name(alias), this)
    override fun `as`(alias: Name): BinaryLogTransactionCompressionStats = BinaryLogTransactionCompressionStats(alias, this)
    override fun `as`(alias: Table<*>): BinaryLogTransactionCompressionStats = BinaryLogTransactionCompressionStats(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): BinaryLogTransactionCompressionStats = BinaryLogTransactionCompressionStats(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): BinaryLogTransactionCompressionStats = BinaryLogTransactionCompressionStats(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): BinaryLogTransactionCompressionStats = BinaryLogTransactionCompressionStats(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): BinaryLogTransactionCompressionStats = BinaryLogTransactionCompressionStats(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): BinaryLogTransactionCompressionStats = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): BinaryLogTransactionCompressionStats = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): BinaryLogTransactionCompressionStats = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): BinaryLogTransactionCompressionStats = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): BinaryLogTransactionCompressionStats = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): BinaryLogTransactionCompressionStats = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): BinaryLogTransactionCompressionStats = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): BinaryLogTransactionCompressionStats = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): BinaryLogTransactionCompressionStats = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row14<BinaryLogTransactionCompressionStatsLogType?, String?, ULong?, ULong?, ULong?, Short?, String?, ULong?, ULong?, LocalDateTime?, String?, ULong?, ULong?, LocalDateTime?> = super.fieldsRow() as Row14<BinaryLogTransactionCompressionStatsLogType?, String?, ULong?, ULong?, ULong?, Short?, String?, ULong?, ULong?, LocalDateTime?, String?, ULong?, ULong?, LocalDateTime?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (BinaryLogTransactionCompressionStatsLogType?, String?, ULong?, ULong?, ULong?, Short?, String?, ULong?, ULong?, LocalDateTime?, String?, ULong?, ULong?, LocalDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (BinaryLogTransactionCompressionStatsLogType?, String?, ULong?, ULong?, ULong?, Short?, String?, ULong?, ULong?, LocalDateTime?, String?, ULong?, ULong?, LocalDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
