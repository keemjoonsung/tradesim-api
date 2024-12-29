/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.FileSummaryByEventName

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FileSummaryByEventNameRecord() : UpdatableRecordImpl<FileSummaryByEventNameRecord>(FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME) {

    open var eventName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var countStar: ULong?
        set(value): Unit = set(1, value)
        get(): ULong? = get(1) as ULong?

    open var sumTimerWait: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    open var minTimerWait: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var avgTimerWait: ULong?
        set(value): Unit = set(4, value)
        get(): ULong? = get(4) as ULong?

    open var maxTimerWait: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var countRead: ULong?
        set(value): Unit = set(6, value)
        get(): ULong? = get(6) as ULong?

    open var sumTimerRead: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    open var minTimerRead: ULong?
        set(value): Unit = set(8, value)
        get(): ULong? = get(8) as ULong?

    open var avgTimerRead: ULong?
        set(value): Unit = set(9, value)
        get(): ULong? = get(9) as ULong?

    open var maxTimerRead: ULong?
        set(value): Unit = set(10, value)
        get(): ULong? = get(10) as ULong?

    open var sumNumberOfBytesRead: Long?
        set(value): Unit = set(11, value)
        get(): Long? = get(11) as Long?

    open var countWrite: ULong?
        set(value): Unit = set(12, value)
        get(): ULong? = get(12) as ULong?

    open var sumTimerWrite: ULong?
        set(value): Unit = set(13, value)
        get(): ULong? = get(13) as ULong?

    open var minTimerWrite: ULong?
        set(value): Unit = set(14, value)
        get(): ULong? = get(14) as ULong?

    open var avgTimerWrite: ULong?
        set(value): Unit = set(15, value)
        get(): ULong? = get(15) as ULong?

    open var maxTimerWrite: ULong?
        set(value): Unit = set(16, value)
        get(): ULong? = get(16) as ULong?

    open var sumNumberOfBytesWrite: Long?
        set(value): Unit = set(17, value)
        get(): Long? = get(17) as Long?

    open var countMisc: ULong?
        set(value): Unit = set(18, value)
        get(): ULong? = get(18) as ULong?

    open var sumTimerMisc: ULong?
        set(value): Unit = set(19, value)
        get(): ULong? = get(19) as ULong?

    open var minTimerMisc: ULong?
        set(value): Unit = set(20, value)
        get(): ULong? = get(20) as ULong?

    open var avgTimerMisc: ULong?
        set(value): Unit = set(21, value)
        get(): ULong? = get(21) as ULong?

    open var maxTimerMisc: ULong?
        set(value): Unit = set(22, value)
        get(): ULong? = get(22) as ULong?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    /**
     * Create a detached, initialised FileSummaryByEventNameRecord
     */
    constructor(eventName: String? = null, countStar: ULong? = null, sumTimerWait: ULong? = null, minTimerWait: ULong? = null, avgTimerWait: ULong? = null, maxTimerWait: ULong? = null, countRead: ULong? = null, sumTimerRead: ULong? = null, minTimerRead: ULong? = null, avgTimerRead: ULong? = null, maxTimerRead: ULong? = null, sumNumberOfBytesRead: Long? = null, countWrite: ULong? = null, sumTimerWrite: ULong? = null, minTimerWrite: ULong? = null, avgTimerWrite: ULong? = null, maxTimerWrite: ULong? = null, sumNumberOfBytesWrite: Long? = null, countMisc: ULong? = null, sumTimerMisc: ULong? = null, minTimerMisc: ULong? = null, avgTimerMisc: ULong? = null, maxTimerMisc: ULong? = null): this() {
        this.eventName = eventName
        this.countStar = countStar
        this.sumTimerWait = sumTimerWait
        this.minTimerWait = minTimerWait
        this.avgTimerWait = avgTimerWait
        this.maxTimerWait = maxTimerWait
        this.countRead = countRead
        this.sumTimerRead = sumTimerRead
        this.minTimerRead = minTimerRead
        this.avgTimerRead = avgTimerRead
        this.maxTimerRead = maxTimerRead
        this.sumNumberOfBytesRead = sumNumberOfBytesRead
        this.countWrite = countWrite
        this.sumTimerWrite = sumTimerWrite
        this.minTimerWrite = minTimerWrite
        this.avgTimerWrite = avgTimerWrite
        this.maxTimerWrite = maxTimerWrite
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite
        this.countMisc = countMisc
        this.sumTimerMisc = sumTimerMisc
        this.minTimerMisc = minTimerMisc
        this.avgTimerMisc = avgTimerMisc
        this.maxTimerMisc = maxTimerMisc
        resetChangedOnNotNull()
    }
}
