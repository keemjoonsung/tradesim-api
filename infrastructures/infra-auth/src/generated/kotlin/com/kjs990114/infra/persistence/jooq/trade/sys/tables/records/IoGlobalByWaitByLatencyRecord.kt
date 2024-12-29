/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import com.kjs990114.infra.persistence.jooq.trade.sys.tables.IoGlobalByWaitByLatency

import org.jooq.Field
import org.jooq.Record14
import org.jooq.Row14
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class IoGlobalByWaitByLatencyRecord() : TableRecordImpl<IoGlobalByWaitByLatencyRecord>(IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY), Record14<String?, ULong?, String?, String?, String?, String?, String?, String?, ULong?, String?, String?, ULong?, String?, String?> {

    open var eventName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var total: ULong?
        set(value): Unit = set(1, value)
        get(): ULong? = get(1) as ULong?

    open var totalLatency: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var avgLatency: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var maxLatency: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var readLatency: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var writeLatency: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var miscLatency: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var countRead: ULong?
        set(value): Unit = set(8, value)
        get(): ULong? = get(8) as ULong?

    open var totalRead: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var avgRead: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var countWrite: ULong?
        set(value): Unit = set(11, value)
        get(): ULong? = get(11) as ULong?

    open var totalWritten: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var avgWritten: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row14<String?, ULong?, String?, String?, String?, String?, String?, String?, ULong?, String?, String?, ULong?, String?, String?> = super.fieldsRow() as Row14<String?, ULong?, String?, String?, String?, String?, String?, String?, ULong?, String?, String?, ULong?, String?, String?>
    override fun valuesRow(): Row14<String?, ULong?, String?, String?, String?, String?, String?, String?, ULong?, String?, String?, ULong?, String?, String?> = super.valuesRow() as Row14<String?, ULong?, String?, String?, String?, String?, String?, String?, ULong?, String?, String?, ULong?, String?, String?>
    override fun field1(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.EVENT_NAME
    override fun field2(): Field<ULong?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.TOTAL
    override fun field3(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.TOTAL_LATENCY
    override fun field4(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.AVG_LATENCY
    override fun field5(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.MAX_LATENCY
    override fun field6(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.READ_LATENCY
    override fun field7(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.WRITE_LATENCY
    override fun field8(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.MISC_LATENCY
    override fun field9(): Field<ULong?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.COUNT_READ
    override fun field10(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.TOTAL_READ
    override fun field11(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.AVG_READ
    override fun field12(): Field<ULong?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.COUNT_WRITE
    override fun field13(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.TOTAL_WRITTEN
    override fun field14(): Field<String?> = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY.AVG_WRITTEN
    override fun component1(): String? = eventName
    override fun component2(): ULong? = total
    override fun component3(): String? = totalLatency
    override fun component4(): String? = avgLatency
    override fun component5(): String? = maxLatency
    override fun component6(): String? = readLatency
    override fun component7(): String? = writeLatency
    override fun component8(): String? = miscLatency
    override fun component9(): ULong? = countRead
    override fun component10(): String? = totalRead
    override fun component11(): String? = avgRead
    override fun component12(): ULong? = countWrite
    override fun component13(): String? = totalWritten
    override fun component14(): String? = avgWritten
    override fun value1(): String? = eventName
    override fun value2(): ULong? = total
    override fun value3(): String? = totalLatency
    override fun value4(): String? = avgLatency
    override fun value5(): String? = maxLatency
    override fun value6(): String? = readLatency
    override fun value7(): String? = writeLatency
    override fun value8(): String? = miscLatency
    override fun value9(): ULong? = countRead
    override fun value10(): String? = totalRead
    override fun value11(): String? = avgRead
    override fun value12(): ULong? = countWrite
    override fun value13(): String? = totalWritten
    override fun value14(): String? = avgWritten

    override fun value1(value: String?): IoGlobalByWaitByLatencyRecord {
        set(0, value)
        return this
    }

    override fun value2(value: ULong?): IoGlobalByWaitByLatencyRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): IoGlobalByWaitByLatencyRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): IoGlobalByWaitByLatencyRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): IoGlobalByWaitByLatencyRecord {
        set(4, value)
        return this
    }

    override fun value6(value: String?): IoGlobalByWaitByLatencyRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): IoGlobalByWaitByLatencyRecord {
        set(6, value)
        return this
    }

    override fun value8(value: String?): IoGlobalByWaitByLatencyRecord {
        set(7, value)
        return this
    }

    override fun value9(value: ULong?): IoGlobalByWaitByLatencyRecord {
        set(8, value)
        return this
    }

    override fun value10(value: String?): IoGlobalByWaitByLatencyRecord {
        set(9, value)
        return this
    }

    override fun value11(value: String?): IoGlobalByWaitByLatencyRecord {
        set(10, value)
        return this
    }

    override fun value12(value: ULong?): IoGlobalByWaitByLatencyRecord {
        set(11, value)
        return this
    }

    override fun value13(value: String?): IoGlobalByWaitByLatencyRecord {
        set(12, value)
        return this
    }

    override fun value14(value: String?): IoGlobalByWaitByLatencyRecord {
        set(13, value)
        return this
    }

    override fun values(value1: String?, value2: ULong?, value3: String?, value4: String?, value5: String?, value6: String?, value7: String?, value8: String?, value9: ULong?, value10: String?, value11: String?, value12: ULong?, value13: String?, value14: String?): IoGlobalByWaitByLatencyRecord {
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
        return this
    }

    /**
     * Create a detached, initialised IoGlobalByWaitByLatencyRecord
     */
    constructor(eventName: String? = null, total: ULong? = null, totalLatency: String? = null, avgLatency: String? = null, maxLatency: String? = null, readLatency: String? = null, writeLatency: String? = null, miscLatency: String? = null, countRead: ULong? = null, totalRead: String? = null, avgRead: String? = null, countWrite: ULong? = null, totalWritten: String? = null, avgWritten: String? = null): this() {
        this.eventName = eventName
        this.total = total
        this.totalLatency = totalLatency
        this.avgLatency = avgLatency
        this.maxLatency = maxLatency
        this.readLatency = readLatency
        this.writeLatency = writeLatency
        this.miscLatency = miscLatency
        this.countRead = countRead
        this.totalRead = totalRead
        this.avgRead = avgRead
        this.countWrite = countWrite
        this.totalWritten = totalWritten
        this.avgWritten = avgWritten
        resetChangedOnNotNull()
    }
}