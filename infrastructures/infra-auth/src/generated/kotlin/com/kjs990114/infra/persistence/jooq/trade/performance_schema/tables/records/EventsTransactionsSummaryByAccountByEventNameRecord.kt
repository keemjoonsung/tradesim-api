/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.EventsTransactionsSummaryByAccountByEventName

import org.jooq.Field
import org.jooq.Record18
import org.jooq.Row18
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsTransactionsSummaryByAccountByEventNameRecord() : TableRecordImpl<EventsTransactionsSummaryByAccountByEventNameRecord>(EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME), Record18<String?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?> {

    open var user: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var host: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var eventName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var countStar: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var sumTimerWait: ULong?
        set(value): Unit = set(4, value)
        get(): ULong? = get(4) as ULong?

    open var minTimerWait: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var avgTimerWait: ULong?
        set(value): Unit = set(6, value)
        get(): ULong? = get(6) as ULong?

    open var maxTimerWait: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    open var countReadWrite: ULong?
        set(value): Unit = set(8, value)
        get(): ULong? = get(8) as ULong?

    open var sumTimerReadWrite: ULong?
        set(value): Unit = set(9, value)
        get(): ULong? = get(9) as ULong?

    open var minTimerReadWrite: ULong?
        set(value): Unit = set(10, value)
        get(): ULong? = get(10) as ULong?

    open var avgTimerReadWrite: ULong?
        set(value): Unit = set(11, value)
        get(): ULong? = get(11) as ULong?

    open var maxTimerReadWrite: ULong?
        set(value): Unit = set(12, value)
        get(): ULong? = get(12) as ULong?

    open var countReadOnly: ULong?
        set(value): Unit = set(13, value)
        get(): ULong? = get(13) as ULong?

    open var sumTimerReadOnly: ULong?
        set(value): Unit = set(14, value)
        get(): ULong? = get(14) as ULong?

    open var minTimerReadOnly: ULong?
        set(value): Unit = set(15, value)
        get(): ULong? = get(15) as ULong?

    open var avgTimerReadOnly: ULong?
        set(value): Unit = set(16, value)
        get(): ULong? = get(16) as ULong?

    open var maxTimerReadOnly: ULong?
        set(value): Unit = set(17, value)
        get(): ULong? = get(17) as ULong?

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row18<String?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?> = super.fieldsRow() as Row18<String?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?>
    override fun valuesRow(): Row18<String?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?> = super.valuesRow() as Row18<String?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?, ULong?>
    override fun field1(): Field<String?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.USER
    override fun field2(): Field<String?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.HOST
    override fun field3(): Field<String?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.EVENT_NAME
    override fun field4(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.COUNT_STAR
    override fun field5(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.SUM_TIMER_WAIT
    override fun field6(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.MIN_TIMER_WAIT
    override fun field7(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.AVG_TIMER_WAIT
    override fun field8(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.MAX_TIMER_WAIT
    override fun field9(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.COUNT_READ_WRITE
    override fun field10(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.SUM_TIMER_READ_WRITE
    override fun field11(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.MIN_TIMER_READ_WRITE
    override fun field12(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.AVG_TIMER_READ_WRITE
    override fun field13(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.MAX_TIMER_READ_WRITE
    override fun field14(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.COUNT_READ_ONLY
    override fun field15(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.SUM_TIMER_READ_ONLY
    override fun field16(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.MIN_TIMER_READ_ONLY
    override fun field17(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.AVG_TIMER_READ_ONLY
    override fun field18(): Field<ULong?> = EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.MAX_TIMER_READ_ONLY
    override fun component1(): String? = user
    override fun component2(): String? = host
    override fun component3(): String? = eventName
    override fun component4(): ULong? = countStar
    override fun component5(): ULong? = sumTimerWait
    override fun component6(): ULong? = minTimerWait
    override fun component7(): ULong? = avgTimerWait
    override fun component8(): ULong? = maxTimerWait
    override fun component9(): ULong? = countReadWrite
    override fun component10(): ULong? = sumTimerReadWrite
    override fun component11(): ULong? = minTimerReadWrite
    override fun component12(): ULong? = avgTimerReadWrite
    override fun component13(): ULong? = maxTimerReadWrite
    override fun component14(): ULong? = countReadOnly
    override fun component15(): ULong? = sumTimerReadOnly
    override fun component16(): ULong? = minTimerReadOnly
    override fun component17(): ULong? = avgTimerReadOnly
    override fun component18(): ULong? = maxTimerReadOnly
    override fun value1(): String? = user
    override fun value2(): String? = host
    override fun value3(): String? = eventName
    override fun value4(): ULong? = countStar
    override fun value5(): ULong? = sumTimerWait
    override fun value6(): ULong? = minTimerWait
    override fun value7(): ULong? = avgTimerWait
    override fun value8(): ULong? = maxTimerWait
    override fun value9(): ULong? = countReadWrite
    override fun value10(): ULong? = sumTimerReadWrite
    override fun value11(): ULong? = minTimerReadWrite
    override fun value12(): ULong? = avgTimerReadWrite
    override fun value13(): ULong? = maxTimerReadWrite
    override fun value14(): ULong? = countReadOnly
    override fun value15(): ULong? = sumTimerReadOnly
    override fun value16(): ULong? = minTimerReadOnly
    override fun value17(): ULong? = avgTimerReadOnly
    override fun value18(): ULong? = maxTimerReadOnly

    override fun value1(value: String?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(2, value)
        return this
    }

    override fun value4(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(3, value)
        return this
    }

    override fun value5(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(4, value)
        return this
    }

    override fun value6(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(5, value)
        return this
    }

    override fun value7(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(6, value)
        return this
    }

    override fun value8(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(7, value)
        return this
    }

    override fun value9(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(8, value)
        return this
    }

    override fun value10(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(9, value)
        return this
    }

    override fun value11(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(10, value)
        return this
    }

    override fun value12(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(11, value)
        return this
    }

    override fun value13(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(12, value)
        return this
    }

    override fun value14(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(13, value)
        return this
    }

    override fun value15(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(14, value)
        return this
    }

    override fun value16(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(15, value)
        return this
    }

    override fun value17(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(16, value)
        return this
    }

    override fun value18(value: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
        set(17, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: ULong?, value5: ULong?, value6: ULong?, value7: ULong?, value8: ULong?, value9: ULong?, value10: ULong?, value11: ULong?, value12: ULong?, value13: ULong?, value14: ULong?, value15: ULong?, value16: ULong?, value17: ULong?, value18: ULong?): EventsTransactionsSummaryByAccountByEventNameRecord {
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
        return this
    }

    /**
     * Create a detached, initialised
     * EventsTransactionsSummaryByAccountByEventNameRecord
     */
    constructor(user: String? = null, host: String? = null, eventName: String? = null, countStar: ULong? = null, sumTimerWait: ULong? = null, minTimerWait: ULong? = null, avgTimerWait: ULong? = null, maxTimerWait: ULong? = null, countReadWrite: ULong? = null, sumTimerReadWrite: ULong? = null, minTimerReadWrite: ULong? = null, avgTimerReadWrite: ULong? = null, maxTimerReadWrite: ULong? = null, countReadOnly: ULong? = null, sumTimerReadOnly: ULong? = null, minTimerReadOnly: ULong? = null, avgTimerReadOnly: ULong? = null, maxTimerReadOnly: ULong? = null): this() {
        this.user = user
        this.host = host
        this.eventName = eventName
        this.countStar = countStar
        this.sumTimerWait = sumTimerWait
        this.minTimerWait = minTimerWait
        this.avgTimerWait = avgTimerWait
        this.maxTimerWait = maxTimerWait
        this.countReadWrite = countReadWrite
        this.sumTimerReadWrite = sumTimerReadWrite
        this.minTimerReadWrite = minTimerReadWrite
        this.avgTimerReadWrite = avgTimerReadWrite
        this.maxTimerReadWrite = maxTimerReadWrite
        this.countReadOnly = countReadOnly
        this.sumTimerReadOnly = sumTimerReadOnly
        this.minTimerReadOnly = minTimerReadOnly
        this.avgTimerReadOnly = avgTimerReadOnly
        this.maxTimerReadOnly = maxTimerReadOnly
        resetChangedOnNotNull()
    }
}
