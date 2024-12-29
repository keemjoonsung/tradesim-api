/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.MemorySummaryByHostByEventName

import org.jooq.Field
import org.jooq.Record12
import org.jooq.Row12
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class MemorySummaryByHostByEventNameRecord() : TableRecordImpl<MemorySummaryByHostByEventNameRecord>(MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME), Record12<String?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?> {

    open var host: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var eventName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var countAlloc: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    open var countFree: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var sumNumberOfBytesAlloc: ULong?
        set(value): Unit = set(4, value)
        get(): ULong? = get(4) as ULong?

    open var sumNumberOfBytesFree: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var lowCountUsed: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    open var currentCountUsed: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var highCountUsed: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    open var lowNumberOfBytesUsed: Long?
        set(value): Unit = set(9, value)
        get(): Long? = get(9) as Long?

    open var currentNumberOfBytesUsed: Long?
        set(value): Unit = set(10, value)
        get(): Long? = get(10) as Long?

    open var highNumberOfBytesUsed: Long?
        set(value): Unit = set(11, value)
        get(): Long? = get(11) as Long?

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row12<String?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?> = super.fieldsRow() as Row12<String?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?>
    override fun valuesRow(): Row12<String?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?> = super.valuesRow() as Row12<String?, String?, ULong?, ULong?, ULong?, ULong?, Long?, Long?, Long?, Long?, Long?, Long?>
    override fun field1(): Field<String?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.HOST
    override fun field2(): Field<String?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.EVENT_NAME
    override fun field3(): Field<ULong?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.COUNT_ALLOC
    override fun field4(): Field<ULong?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.COUNT_FREE
    override fun field5(): Field<ULong?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.SUM_NUMBER_OF_BYTES_ALLOC
    override fun field6(): Field<ULong?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.SUM_NUMBER_OF_BYTES_FREE
    override fun field7(): Field<Long?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.LOW_COUNT_USED
    override fun field8(): Field<Long?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.CURRENT_COUNT_USED
    override fun field9(): Field<Long?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.HIGH_COUNT_USED
    override fun field10(): Field<Long?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.LOW_NUMBER_OF_BYTES_USED
    override fun field11(): Field<Long?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.CURRENT_NUMBER_OF_BYTES_USED
    override fun field12(): Field<Long?> = MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME.HIGH_NUMBER_OF_BYTES_USED
    override fun component1(): String? = host
    override fun component2(): String? = eventName
    override fun component3(): ULong? = countAlloc
    override fun component4(): ULong? = countFree
    override fun component5(): ULong? = sumNumberOfBytesAlloc
    override fun component6(): ULong? = sumNumberOfBytesFree
    override fun component7(): Long? = lowCountUsed
    override fun component8(): Long? = currentCountUsed
    override fun component9(): Long? = highCountUsed
    override fun component10(): Long? = lowNumberOfBytesUsed
    override fun component11(): Long? = currentNumberOfBytesUsed
    override fun component12(): Long? = highNumberOfBytesUsed
    override fun value1(): String? = host
    override fun value2(): String? = eventName
    override fun value3(): ULong? = countAlloc
    override fun value4(): ULong? = countFree
    override fun value5(): ULong? = sumNumberOfBytesAlloc
    override fun value6(): ULong? = sumNumberOfBytesFree
    override fun value7(): Long? = lowCountUsed
    override fun value8(): Long? = currentCountUsed
    override fun value9(): Long? = highCountUsed
    override fun value10(): Long? = lowNumberOfBytesUsed
    override fun value11(): Long? = currentNumberOfBytesUsed
    override fun value12(): Long? = highNumberOfBytesUsed

    override fun value1(value: String?): MemorySummaryByHostByEventNameRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): MemorySummaryByHostByEventNameRecord {
        set(1, value)
        return this
    }

    override fun value3(value: ULong?): MemorySummaryByHostByEventNameRecord {
        set(2, value)
        return this
    }

    override fun value4(value: ULong?): MemorySummaryByHostByEventNameRecord {
        set(3, value)
        return this
    }

    override fun value5(value: ULong?): MemorySummaryByHostByEventNameRecord {
        set(4, value)
        return this
    }

    override fun value6(value: ULong?): MemorySummaryByHostByEventNameRecord {
        set(5, value)
        return this
    }

    override fun value7(value: Long?): MemorySummaryByHostByEventNameRecord {
        set(6, value)
        return this
    }

    override fun value8(value: Long?): MemorySummaryByHostByEventNameRecord {
        set(7, value)
        return this
    }

    override fun value9(value: Long?): MemorySummaryByHostByEventNameRecord {
        set(8, value)
        return this
    }

    override fun value10(value: Long?): MemorySummaryByHostByEventNameRecord {
        set(9, value)
        return this
    }

    override fun value11(value: Long?): MemorySummaryByHostByEventNameRecord {
        set(10, value)
        return this
    }

    override fun value12(value: Long?): MemorySummaryByHostByEventNameRecord {
        set(11, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: ULong?, value4: ULong?, value5: ULong?, value6: ULong?, value7: Long?, value8: Long?, value9: Long?, value10: Long?, value11: Long?, value12: Long?): MemorySummaryByHostByEventNameRecord {
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
        return this
    }

    /**
     * Create a detached, initialised MemorySummaryByHostByEventNameRecord
     */
    constructor(host: String? = null, eventName: String? = null, countAlloc: ULong? = null, countFree: ULong? = null, sumNumberOfBytesAlloc: ULong? = null, sumNumberOfBytesFree: ULong? = null, lowCountUsed: Long? = null, currentCountUsed: Long? = null, highCountUsed: Long? = null, lowNumberOfBytesUsed: Long? = null, currentNumberOfBytesUsed: Long? = null, highNumberOfBytesUsed: Long? = null): this() {
        this.host = host
        this.eventName = eventName
        this.countAlloc = countAlloc
        this.countFree = countFree
        this.sumNumberOfBytesAlloc = sumNumberOfBytesAlloc
        this.sumNumberOfBytesFree = sumNumberOfBytesFree
        this.lowCountUsed = lowCountUsed
        this.currentCountUsed = currentCountUsed
        this.highCountUsed = highCountUsed
        this.lowNumberOfBytesUsed = lowNumberOfBytesUsed
        this.currentNumberOfBytesUsed = currentNumberOfBytesUsed
        this.highNumberOfBytesUsed = highNumberOfBytesUsed
        resetChangedOnNotNull()
    }
}