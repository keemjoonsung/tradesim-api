/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaTableStatistics

import java.math.BigInteger

import org.jooq.Field
import org.jooq.Record19
import org.jooq.Row19
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SchemaTableStatisticsRecord() : TableRecordImpl<SchemaTableStatisticsRecord>(SchemaTableStatistics.SCHEMA_TABLE_STATISTICS), Record19<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?, BigInteger?, String?, String?, BigInteger?, String?, String?, BigInteger?, String?> {

    open var tableSchema: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var tableName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var totalLatency: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var rowsFetched: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var fetchLatency: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var rowsInserted: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var insertLatency: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var rowsUpdated: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    open var updateLatency: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var rowsDeleted: ULong?
        set(value): Unit = set(9, value)
        get(): ULong? = get(9) as ULong?

    open var deleteLatency: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var ioReadRequests: BigInteger?
        set(value): Unit = set(11, value)
        get(): BigInteger? = get(11) as BigInteger?

    open var ioRead: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var ioReadLatency: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var ioWriteRequests: BigInteger?
        set(value): Unit = set(14, value)
        get(): BigInteger? = get(14) as BigInteger?

    open var ioWrite: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var ioWriteLatency: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    open var ioMiscRequests: BigInteger?
        set(value): Unit = set(17, value)
        get(): BigInteger? = get(17) as BigInteger?

    open var ioMiscLatency: String?
        set(value): Unit = set(18, value)
        get(): String? = get(18) as String?

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row19<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?, BigInteger?, String?, String?, BigInteger?, String?, String?, BigInteger?, String?> = super.fieldsRow() as Row19<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?, BigInteger?, String?, String?, BigInteger?, String?, String?, BigInteger?, String?>
    override fun valuesRow(): Row19<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?, BigInteger?, String?, String?, BigInteger?, String?, String?, BigInteger?, String?> = super.valuesRow() as Row19<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?, BigInteger?, String?, String?, BigInteger?, String?, String?, BigInteger?, String?>
    override fun field1(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.TABLE_SCHEMA
    override fun field2(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.TABLE_NAME
    override fun field3(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.TOTAL_LATENCY
    override fun field4(): Field<ULong?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.ROWS_FETCHED
    override fun field5(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.FETCH_LATENCY
    override fun field6(): Field<ULong?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.ROWS_INSERTED
    override fun field7(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.INSERT_LATENCY
    override fun field8(): Field<ULong?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.ROWS_UPDATED
    override fun field9(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.UPDATE_LATENCY
    override fun field10(): Field<ULong?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.ROWS_DELETED
    override fun field11(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.DELETE_LATENCY
    override fun field12(): Field<BigInteger?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.IO_READ_REQUESTS
    override fun field13(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.IO_READ
    override fun field14(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.IO_READ_LATENCY
    override fun field15(): Field<BigInteger?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.IO_WRITE_REQUESTS
    override fun field16(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.IO_WRITE
    override fun field17(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.IO_WRITE_LATENCY
    override fun field18(): Field<BigInteger?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.IO_MISC_REQUESTS
    override fun field19(): Field<String?> = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS.IO_MISC_LATENCY
    override fun component1(): String? = tableSchema
    override fun component2(): String? = tableName
    override fun component3(): String? = totalLatency
    override fun component4(): ULong? = rowsFetched
    override fun component5(): String? = fetchLatency
    override fun component6(): ULong? = rowsInserted
    override fun component7(): String? = insertLatency
    override fun component8(): ULong? = rowsUpdated
    override fun component9(): String? = updateLatency
    override fun component10(): ULong? = rowsDeleted
    override fun component11(): String? = deleteLatency
    override fun component12(): BigInteger? = ioReadRequests
    override fun component13(): String? = ioRead
    override fun component14(): String? = ioReadLatency
    override fun component15(): BigInteger? = ioWriteRequests
    override fun component16(): String? = ioWrite
    override fun component17(): String? = ioWriteLatency
    override fun component18(): BigInteger? = ioMiscRequests
    override fun component19(): String? = ioMiscLatency
    override fun value1(): String? = tableSchema
    override fun value2(): String? = tableName
    override fun value3(): String? = totalLatency
    override fun value4(): ULong? = rowsFetched
    override fun value5(): String? = fetchLatency
    override fun value6(): ULong? = rowsInserted
    override fun value7(): String? = insertLatency
    override fun value8(): ULong? = rowsUpdated
    override fun value9(): String? = updateLatency
    override fun value10(): ULong? = rowsDeleted
    override fun value11(): String? = deleteLatency
    override fun value12(): BigInteger? = ioReadRequests
    override fun value13(): String? = ioRead
    override fun value14(): String? = ioReadLatency
    override fun value15(): BigInteger? = ioWriteRequests
    override fun value16(): String? = ioWrite
    override fun value17(): String? = ioWriteLatency
    override fun value18(): BigInteger? = ioMiscRequests
    override fun value19(): String? = ioMiscLatency

    override fun value1(value: String?): SchemaTableStatisticsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): SchemaTableStatisticsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): SchemaTableStatisticsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: ULong?): SchemaTableStatisticsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): SchemaTableStatisticsRecord {
        set(4, value)
        return this
    }

    override fun value6(value: ULong?): SchemaTableStatisticsRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): SchemaTableStatisticsRecord {
        set(6, value)
        return this
    }

    override fun value8(value: ULong?): SchemaTableStatisticsRecord {
        set(7, value)
        return this
    }

    override fun value9(value: String?): SchemaTableStatisticsRecord {
        set(8, value)
        return this
    }

    override fun value10(value: ULong?): SchemaTableStatisticsRecord {
        set(9, value)
        return this
    }

    override fun value11(value: String?): SchemaTableStatisticsRecord {
        set(10, value)
        return this
    }

    override fun value12(value: BigInteger?): SchemaTableStatisticsRecord {
        set(11, value)
        return this
    }

    override fun value13(value: String?): SchemaTableStatisticsRecord {
        set(12, value)
        return this
    }

    override fun value14(value: String?): SchemaTableStatisticsRecord {
        set(13, value)
        return this
    }

    override fun value15(value: BigInteger?): SchemaTableStatisticsRecord {
        set(14, value)
        return this
    }

    override fun value16(value: String?): SchemaTableStatisticsRecord {
        set(15, value)
        return this
    }

    override fun value17(value: String?): SchemaTableStatisticsRecord {
        set(16, value)
        return this
    }

    override fun value18(value: BigInteger?): SchemaTableStatisticsRecord {
        set(17, value)
        return this
    }

    override fun value19(value: String?): SchemaTableStatisticsRecord {
        set(18, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: ULong?, value5: String?, value6: ULong?, value7: String?, value8: ULong?, value9: String?, value10: ULong?, value11: String?, value12: BigInteger?, value13: String?, value14: String?, value15: BigInteger?, value16: String?, value17: String?, value18: BigInteger?, value19: String?): SchemaTableStatisticsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        this.value10(value10)
        this.value11(value11)
        this.value12(value12)
        this.value13(value13)
        this.value14(value14)
        this.value15(value15)
        this.value16(value16)
        this.value17(value17)
        this.value18(value18)
        this.value19(value19)
        return this
    }

    /**
     * Create a detached, initialised SchemaTableStatisticsRecord
     */
    constructor(tableSchema: String? = null, tableName: String? = null, totalLatency: String? = null, rowsFetched: ULong? = null, fetchLatency: String? = null, rowsInserted: ULong? = null, insertLatency: String? = null, rowsUpdated: ULong? = null, updateLatency: String? = null, rowsDeleted: ULong? = null, deleteLatency: String? = null, ioReadRequests: BigInteger? = null, ioRead: String? = null, ioReadLatency: String? = null, ioWriteRequests: BigInteger? = null, ioWrite: String? = null, ioWriteLatency: String? = null, ioMiscRequests: BigInteger? = null, ioMiscLatency: String? = null): this() {
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.totalLatency = totalLatency
        this.rowsFetched = rowsFetched
        this.fetchLatency = fetchLatency
        this.rowsInserted = rowsInserted
        this.insertLatency = insertLatency
        this.rowsUpdated = rowsUpdated
        this.updateLatency = updateLatency
        this.rowsDeleted = rowsDeleted
        this.deleteLatency = deleteLatency
        this.ioReadRequests = ioReadRequests
        this.ioRead = ioRead
        this.ioReadLatency = ioReadLatency
        this.ioWriteRequests = ioWriteRequests
        this.ioWrite = ioWrite
        this.ioWriteLatency = ioWriteLatency
        this.ioMiscRequests = ioMiscRequests
        this.ioMiscLatency = ioMiscLatency
        resetChangedOnNotNull()
    }
}