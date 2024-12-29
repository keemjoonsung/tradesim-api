/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.EventsStagesSummaryByAccountByEventName

import org.jooq.Field
import org.jooq.Record8
import org.jooq.Row8
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsStagesSummaryByAccountByEventNameRecord() : TableRecordImpl<EventsStagesSummaryByAccountByEventNameRecord>(EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME), Record8<String?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?> {

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

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<String?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?> = super.fieldsRow() as Row8<String?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?>
    override fun valuesRow(): Row8<String?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?> = super.valuesRow() as Row8<String?, String?, String?, ULong?, ULong?, ULong?, ULong?, ULong?>
    override fun field1(): Field<String?> = EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.USER
    override fun field2(): Field<String?> = EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.HOST
    override fun field3(): Field<String?> = EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.EVENT_NAME
    override fun field4(): Field<ULong?> = EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.COUNT_STAR
    override fun field5(): Field<ULong?> = EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.SUM_TIMER_WAIT
    override fun field6(): Field<ULong?> = EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.MIN_TIMER_WAIT
    override fun field7(): Field<ULong?> = EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.AVG_TIMER_WAIT
    override fun field8(): Field<ULong?> = EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.MAX_TIMER_WAIT
    override fun component1(): String? = user
    override fun component2(): String? = host
    override fun component3(): String? = eventName
    override fun component4(): ULong? = countStar
    override fun component5(): ULong? = sumTimerWait
    override fun component6(): ULong? = minTimerWait
    override fun component7(): ULong? = avgTimerWait
    override fun component8(): ULong? = maxTimerWait
    override fun value1(): String? = user
    override fun value2(): String? = host
    override fun value3(): String? = eventName
    override fun value4(): ULong? = countStar
    override fun value5(): ULong? = sumTimerWait
    override fun value6(): ULong? = minTimerWait
    override fun value7(): ULong? = avgTimerWait
    override fun value8(): ULong? = maxTimerWait

    override fun value1(value: String?): EventsStagesSummaryByAccountByEventNameRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): EventsStagesSummaryByAccountByEventNameRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): EventsStagesSummaryByAccountByEventNameRecord {
        set(2, value)
        return this
    }

    override fun value4(value: ULong?): EventsStagesSummaryByAccountByEventNameRecord {
        set(3, value)
        return this
    }

    override fun value5(value: ULong?): EventsStagesSummaryByAccountByEventNameRecord {
        set(4, value)
        return this
    }

    override fun value6(value: ULong?): EventsStagesSummaryByAccountByEventNameRecord {
        set(5, value)
        return this
    }

    override fun value7(value: ULong?): EventsStagesSummaryByAccountByEventNameRecord {
        set(6, value)
        return this
    }

    override fun value8(value: ULong?): EventsStagesSummaryByAccountByEventNameRecord {
        set(7, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: ULong?, value5: ULong?, value6: ULong?, value7: ULong?, value8: ULong?): EventsStagesSummaryByAccountByEventNameRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        return this
    }

    /**
     * Create a detached, initialised
     * EventsStagesSummaryByAccountByEventNameRecord
     */
    constructor(user: String? = null, host: String? = null, eventName: String? = null, countStar: ULong? = null, sumTimerWait: ULong? = null, minTimerWait: ULong? = null, avgTimerWait: ULong? = null, maxTimerWait: ULong? = null): this() {
        this.user = user
        this.host = host
        this.eventName = eventName
        this.countStar = countStar
        this.sumTimerWait = sumTimerWait
        this.minTimerWait = minTimerWait
        this.avgTimerWait = avgTimerWait
        this.maxTimerWait = maxTimerWait
        resetChangedOnNotNull()
    }
}