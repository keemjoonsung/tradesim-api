/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import com.kjs990114.infra.persistence.jooq.trade.sys.tables.IoGlobalByFileByLatency

import org.jooq.Field
import org.jooq.Record9
import org.jooq.Row9
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class IoGlobalByFileByLatencyRecord() : TableRecordImpl<IoGlobalByFileByLatencyRecord>(IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY), Record9<String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?> {

    open var file: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var total: ULong?
        set(value): Unit = set(1, value)
        get(): ULong? = get(1) as ULong?

    open var totalLatency: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var countRead: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var readLatency: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var countWrite: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var writeLatency: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var countMisc: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    open var miscLatency: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row9<String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?> = super.fieldsRow() as Row9<String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?>
    override fun valuesRow(): Row9<String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?> = super.valuesRow() as Row9<String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?>
    override fun field1(): Field<String?> = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY.FILE
    override fun field2(): Field<ULong?> = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY.TOTAL
    override fun field3(): Field<String?> = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY.TOTAL_LATENCY
    override fun field4(): Field<ULong?> = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY.COUNT_READ
    override fun field5(): Field<String?> = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY.READ_LATENCY
    override fun field6(): Field<ULong?> = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY.COUNT_WRITE
    override fun field7(): Field<String?> = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY.WRITE_LATENCY
    override fun field8(): Field<ULong?> = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY.COUNT_MISC
    override fun field9(): Field<String?> = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY.MISC_LATENCY
    override fun component1(): String? = file
    override fun component2(): ULong? = total
    override fun component3(): String? = totalLatency
    override fun component4(): ULong? = countRead
    override fun component5(): String? = readLatency
    override fun component6(): ULong? = countWrite
    override fun component7(): String? = writeLatency
    override fun component8(): ULong? = countMisc
    override fun component9(): String? = miscLatency
    override fun value1(): String? = file
    override fun value2(): ULong? = total
    override fun value3(): String? = totalLatency
    override fun value4(): ULong? = countRead
    override fun value5(): String? = readLatency
    override fun value6(): ULong? = countWrite
    override fun value7(): String? = writeLatency
    override fun value8(): ULong? = countMisc
    override fun value9(): String? = miscLatency

    override fun value1(value: String?): IoGlobalByFileByLatencyRecord {
        set(0, value)
        return this
    }

    override fun value2(value: ULong?): IoGlobalByFileByLatencyRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): IoGlobalByFileByLatencyRecord {
        set(2, value)
        return this
    }

    override fun value4(value: ULong?): IoGlobalByFileByLatencyRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): IoGlobalByFileByLatencyRecord {
        set(4, value)
        return this
    }

    override fun value6(value: ULong?): IoGlobalByFileByLatencyRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): IoGlobalByFileByLatencyRecord {
        set(6, value)
        return this
    }

    override fun value8(value: ULong?): IoGlobalByFileByLatencyRecord {
        set(7, value)
        return this
    }

    override fun value9(value: String?): IoGlobalByFileByLatencyRecord {
        set(8, value)
        return this
    }

    override fun values(value1: String?, value2: ULong?, value3: String?, value4: ULong?, value5: String?, value6: ULong?, value7: String?, value8: ULong?, value9: String?): IoGlobalByFileByLatencyRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        return this
    }

    /**
     * Create a detached, initialised IoGlobalByFileByLatencyRecord
     */
    constructor(file: String? = null, total: ULong? = null, totalLatency: String? = null, countRead: ULong? = null, readLatency: String? = null, countWrite: ULong? = null, writeLatency: String? = null, countMisc: ULong? = null, miscLatency: String? = null): this() {
        this.file = file
        this.total = total
        this.totalLatency = totalLatency
        this.countRead = countRead
        this.readLatency = readLatency
        this.countWrite = countWrite
        this.writeLatency = writeLatency
        this.countMisc = countMisc
        this.miscLatency = miscLatency
        resetChangedOnNotNull()
    }
}