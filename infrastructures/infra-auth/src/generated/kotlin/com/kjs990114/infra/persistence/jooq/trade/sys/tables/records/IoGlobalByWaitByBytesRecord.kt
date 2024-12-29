/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import com.kjs990114.infra.persistence.jooq.trade.sys.tables.IoGlobalByWaitByBytes

import org.jooq.Field
import org.jooq.Record13
import org.jooq.Row13
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class IoGlobalByWaitByBytesRecord() : TableRecordImpl<IoGlobalByWaitByBytesRecord>(IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES), Record13<String?, ULong?, String?, String?, String?, String?, ULong?, String?, String?, ULong?, String?, String?, String?> {

    open var eventName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var total: ULong?
        set(value): Unit = set(1, value)
        get(): ULong? = get(1) as ULong?

    open var totalLatency: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var minLatency: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var avgLatency: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var maxLatency: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var countRead: ULong?
        set(value): Unit = set(6, value)
        get(): ULong? = get(6) as ULong?

    open var totalRead: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var avgRead: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var countWrite: ULong?
        set(value): Unit = set(9, value)
        get(): ULong? = get(9) as ULong?

    open var totalWritten: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var avgWritten: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var totalRequested: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row13<String?, ULong?, String?, String?, String?, String?, ULong?, String?, String?, ULong?, String?, String?, String?> = super.fieldsRow() as Row13<String?, ULong?, String?, String?, String?, String?, ULong?, String?, String?, ULong?, String?, String?, String?>
    override fun valuesRow(): Row13<String?, ULong?, String?, String?, String?, String?, ULong?, String?, String?, ULong?, String?, String?, String?> = super.valuesRow() as Row13<String?, ULong?, String?, String?, String?, String?, ULong?, String?, String?, ULong?, String?, String?, String?>
    override fun field1(): Field<String?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.EVENT_NAME
    override fun field2(): Field<ULong?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.TOTAL
    override fun field3(): Field<String?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.TOTAL_LATENCY
    override fun field4(): Field<String?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.MIN_LATENCY
    override fun field5(): Field<String?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.AVG_LATENCY
    override fun field6(): Field<String?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.MAX_LATENCY
    override fun field7(): Field<ULong?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.COUNT_READ
    override fun field8(): Field<String?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.TOTAL_READ
    override fun field9(): Field<String?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.AVG_READ
    override fun field10(): Field<ULong?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.COUNT_WRITE
    override fun field11(): Field<String?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.TOTAL_WRITTEN
    override fun field12(): Field<String?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.AVG_WRITTEN
    override fun field13(): Field<String?> = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES.TOTAL_REQUESTED
    override fun component1(): String? = eventName
    override fun component2(): ULong? = total
    override fun component3(): String? = totalLatency
    override fun component4(): String? = minLatency
    override fun component5(): String? = avgLatency
    override fun component6(): String? = maxLatency
    override fun component7(): ULong? = countRead
    override fun component8(): String? = totalRead
    override fun component9(): String? = avgRead
    override fun component10(): ULong? = countWrite
    override fun component11(): String? = totalWritten
    override fun component12(): String? = avgWritten
    override fun component13(): String? = totalRequested
    override fun value1(): String? = eventName
    override fun value2(): ULong? = total
    override fun value3(): String? = totalLatency
    override fun value4(): String? = minLatency
    override fun value5(): String? = avgLatency
    override fun value6(): String? = maxLatency
    override fun value7(): ULong? = countRead
    override fun value8(): String? = totalRead
    override fun value9(): String? = avgRead
    override fun value10(): ULong? = countWrite
    override fun value11(): String? = totalWritten
    override fun value12(): String? = avgWritten
    override fun value13(): String? = totalRequested

    override fun value1(value: String?): IoGlobalByWaitByBytesRecord {
        set(0, value)
        return this
    }

    override fun value2(value: ULong?): IoGlobalByWaitByBytesRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): IoGlobalByWaitByBytesRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): IoGlobalByWaitByBytesRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): IoGlobalByWaitByBytesRecord {
        set(4, value)
        return this
    }

    override fun value6(value: String?): IoGlobalByWaitByBytesRecord {
        set(5, value)
        return this
    }

    override fun value7(value: ULong?): IoGlobalByWaitByBytesRecord {
        set(6, value)
        return this
    }

    override fun value8(value: String?): IoGlobalByWaitByBytesRecord {
        set(7, value)
        return this
    }

    override fun value9(value: String?): IoGlobalByWaitByBytesRecord {
        set(8, value)
        return this
    }

    override fun value10(value: ULong?): IoGlobalByWaitByBytesRecord {
        set(9, value)
        return this
    }

    override fun value11(value: String?): IoGlobalByWaitByBytesRecord {
        set(10, value)
        return this
    }

    override fun value12(value: String?): IoGlobalByWaitByBytesRecord {
        set(11, value)
        return this
    }

    override fun value13(value: String?): IoGlobalByWaitByBytesRecord {
        set(12, value)
        return this
    }

    override fun values(value1: String?, value2: ULong?, value3: String?, value4: String?, value5: String?, value6: String?, value7: ULong?, value8: String?, value9: String?, value10: ULong?, value11: String?, value12: String?, value13: String?): IoGlobalByWaitByBytesRecord {
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
        return this
    }

    /**
     * Create a detached, initialised IoGlobalByWaitByBytesRecord
     */
    constructor(eventName: String? = null, total: ULong? = null, totalLatency: String? = null, minLatency: String? = null, avgLatency: String? = null, maxLatency: String? = null, countRead: ULong? = null, totalRead: String? = null, avgRead: String? = null, countWrite: ULong? = null, totalWritten: String? = null, avgWritten: String? = null, totalRequested: String? = null): this() {
        this.eventName = eventName
        this.total = total
        this.totalLatency = totalLatency
        this.minLatency = minLatency
        this.avgLatency = avgLatency
        this.maxLatency = maxLatency
        this.countRead = countRead
        this.totalRead = totalRead
        this.avgRead = avgRead
        this.countWrite = countWrite
        this.totalWritten = totalWritten
        this.avgWritten = avgWritten
        this.totalRequested = totalRequested
        resetChangedOnNotNull()
    }
}
