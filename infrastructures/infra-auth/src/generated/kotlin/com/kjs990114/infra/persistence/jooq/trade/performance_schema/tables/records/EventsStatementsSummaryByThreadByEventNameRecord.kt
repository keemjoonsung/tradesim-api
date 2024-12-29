/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.EventsStatementsSummaryByThreadByEventName

import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsStatementsSummaryByThreadByEventNameRecord() : UpdatableRecordImpl<EventsStatementsSummaryByThreadByEventNameRecord>(EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME) {

    open var threadId: ULong?
        set(value): Unit = set(0, value)
        get(): ULong? = get(0) as ULong?

    open var eventName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var countStar: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    open var sumTimerWait: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var minTimerWait: ULong?
        set(value): Unit = set(4, value)
        get(): ULong? = get(4) as ULong?

    open var avgTimerWait: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var maxTimerWait: ULong?
        set(value): Unit = set(6, value)
        get(): ULong? = get(6) as ULong?

    open var sumLockTime: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    open var sumErrors: ULong?
        set(value): Unit = set(8, value)
        get(): ULong? = get(8) as ULong?

    open var sumWarnings: ULong?
        set(value): Unit = set(9, value)
        get(): ULong? = get(9) as ULong?

    open var sumRowsAffected: ULong?
        set(value): Unit = set(10, value)
        get(): ULong? = get(10) as ULong?

    open var sumRowsSent: ULong?
        set(value): Unit = set(11, value)
        get(): ULong? = get(11) as ULong?

    open var sumRowsExamined: ULong?
        set(value): Unit = set(12, value)
        get(): ULong? = get(12) as ULong?

    open var sumCreatedTmpDiskTables: ULong?
        set(value): Unit = set(13, value)
        get(): ULong? = get(13) as ULong?

    open var sumCreatedTmpTables: ULong?
        set(value): Unit = set(14, value)
        get(): ULong? = get(14) as ULong?

    open var sumSelectFullJoin: ULong?
        set(value): Unit = set(15, value)
        get(): ULong? = get(15) as ULong?

    open var sumSelectFullRangeJoin: ULong?
        set(value): Unit = set(16, value)
        get(): ULong? = get(16) as ULong?

    open var sumSelectRange: ULong?
        set(value): Unit = set(17, value)
        get(): ULong? = get(17) as ULong?

    open var sumSelectRangeCheck: ULong?
        set(value): Unit = set(18, value)
        get(): ULong? = get(18) as ULong?

    open var sumSelectScan: ULong?
        set(value): Unit = set(19, value)
        get(): ULong? = get(19) as ULong?

    open var sumSortMergePasses: ULong?
        set(value): Unit = set(20, value)
        get(): ULong? = get(20) as ULong?

    open var sumSortRange: ULong?
        set(value): Unit = set(21, value)
        get(): ULong? = get(21) as ULong?

    open var sumSortRows: ULong?
        set(value): Unit = set(22, value)
        get(): ULong? = get(22) as ULong?

    open var sumSortScan: ULong?
        set(value): Unit = set(23, value)
        get(): ULong? = get(23) as ULong?

    open var sumNoIndexUsed: ULong?
        set(value): Unit = set(24, value)
        get(): ULong? = get(24) as ULong?

    open var sumNoGoodIndexUsed: ULong?
        set(value): Unit = set(25, value)
        get(): ULong? = get(25) as ULong?

    open var sumCpuTime: ULong?
        set(value): Unit = set(26, value)
        get(): ULong? = get(26) as ULong?

    open var maxControlledMemory: ULong?
        set(value): Unit = set(27, value)
        get(): ULong? = get(27) as ULong?

    open var maxTotalMemory: ULong?
        set(value): Unit = set(28, value)
        get(): ULong? = get(28) as ULong?

    open var countSecondary: ULong?
        set(value): Unit = set(29, value)
        get(): ULong? = get(29) as ULong?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<ULong?, String?> = super.key() as Record2<ULong?, String?>

    /**
     * Create a detached, initialised
     * EventsStatementsSummaryByThreadByEventNameRecord
     */
    constructor(threadId: ULong? = null, eventName: String? = null, countStar: ULong? = null, sumTimerWait: ULong? = null, minTimerWait: ULong? = null, avgTimerWait: ULong? = null, maxTimerWait: ULong? = null, sumLockTime: ULong? = null, sumErrors: ULong? = null, sumWarnings: ULong? = null, sumRowsAffected: ULong? = null, sumRowsSent: ULong? = null, sumRowsExamined: ULong? = null, sumCreatedTmpDiskTables: ULong? = null, sumCreatedTmpTables: ULong? = null, sumSelectFullJoin: ULong? = null, sumSelectFullRangeJoin: ULong? = null, sumSelectRange: ULong? = null, sumSelectRangeCheck: ULong? = null, sumSelectScan: ULong? = null, sumSortMergePasses: ULong? = null, sumSortRange: ULong? = null, sumSortRows: ULong? = null, sumSortScan: ULong? = null, sumNoIndexUsed: ULong? = null, sumNoGoodIndexUsed: ULong? = null, sumCpuTime: ULong? = null, maxControlledMemory: ULong? = null, maxTotalMemory: ULong? = null, countSecondary: ULong? = null): this() {
        this.threadId = threadId
        this.eventName = eventName
        this.countStar = countStar
        this.sumTimerWait = sumTimerWait
        this.minTimerWait = minTimerWait
        this.avgTimerWait = avgTimerWait
        this.maxTimerWait = maxTimerWait
        this.sumLockTime = sumLockTime
        this.sumErrors = sumErrors
        this.sumWarnings = sumWarnings
        this.sumRowsAffected = sumRowsAffected
        this.sumRowsSent = sumRowsSent
        this.sumRowsExamined = sumRowsExamined
        this.sumCreatedTmpDiskTables = sumCreatedTmpDiskTables
        this.sumCreatedTmpTables = sumCreatedTmpTables
        this.sumSelectFullJoin = sumSelectFullJoin
        this.sumSelectFullRangeJoin = sumSelectFullRangeJoin
        this.sumSelectRange = sumSelectRange
        this.sumSelectRangeCheck = sumSelectRangeCheck
        this.sumSelectScan = sumSelectScan
        this.sumSortMergePasses = sumSortMergePasses
        this.sumSortRange = sumSortRange
        this.sumSortRows = sumSortRows
        this.sumSortScan = sumSortScan
        this.sumNoIndexUsed = sumNoIndexUsed
        this.sumNoGoodIndexUsed = sumNoGoodIndexUsed
        this.sumCpuTime = sumCpuTime
        this.maxControlledMemory = maxControlledMemory
        this.maxTotalMemory = maxTotalMemory
        this.countSecondary = countSecondary
        resetChangedOnNotNull()
    }
}
