/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryAccessMode
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryAutocommit
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryNestingEventType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsTransactionsHistoryState
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.EventsTransactionsHistory

import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsTransactionsHistoryRecord() : UpdatableRecordImpl<EventsTransactionsHistoryRecord>(EventsTransactionsHistory.EVENTS_TRANSACTIONS_HISTORY) {

    open var threadId: ULong?
        set(value): Unit = set(0, value)
        get(): ULong? = get(0) as ULong?

    open var eventId: ULong?
        set(value): Unit = set(1, value)
        get(): ULong? = get(1) as ULong?

    open var endEventId: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    open var eventName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var state: EventsTransactionsHistoryState?
        set(value): Unit = set(4, value)
        get(): EventsTransactionsHistoryState? = get(4) as EventsTransactionsHistoryState?

    open var trxId: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var gtid: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var xidFormatId: Int?
        set(value): Unit = set(7, value)
        get(): Int? = get(7) as Int?

    open var xidGtrid: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var xidBqual: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var xaState: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var source: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var timerStart: ULong?
        set(value): Unit = set(12, value)
        get(): ULong? = get(12) as ULong?

    open var timerEnd: ULong?
        set(value): Unit = set(13, value)
        get(): ULong? = get(13) as ULong?

    open var timerWait: ULong?
        set(value): Unit = set(14, value)
        get(): ULong? = get(14) as ULong?

    open var accessMode: EventsTransactionsHistoryAccessMode?
        set(value): Unit = set(15, value)
        get(): EventsTransactionsHistoryAccessMode? = get(15) as EventsTransactionsHistoryAccessMode?

    open var isolationLevel: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    open var autocommit: EventsTransactionsHistoryAutocommit?
        set(value): Unit = set(17, value)
        get(): EventsTransactionsHistoryAutocommit? = get(17) as EventsTransactionsHistoryAutocommit?

    open var numberOfSavepoints: ULong?
        set(value): Unit = set(18, value)
        get(): ULong? = get(18) as ULong?

    open var numberOfRollbackToSavepoint: ULong?
        set(value): Unit = set(19, value)
        get(): ULong? = get(19) as ULong?

    open var numberOfReleaseSavepoint: ULong?
        set(value): Unit = set(20, value)
        get(): ULong? = get(20) as ULong?

    open var objectInstanceBegin: ULong?
        set(value): Unit = set(21, value)
        get(): ULong? = get(21) as ULong?

    open var nestingEventId: ULong?
        set(value): Unit = set(22, value)
        get(): ULong? = get(22) as ULong?

    open var nestingEventType: EventsTransactionsHistoryNestingEventType?
        set(value): Unit = set(23, value)
        get(): EventsTransactionsHistoryNestingEventType? = get(23) as EventsTransactionsHistoryNestingEventType?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<ULong?, ULong?> = super.key() as Record2<ULong?, ULong?>

    /**
     * Create a detached, initialised EventsTransactionsHistoryRecord
     */
    constructor(threadId: ULong? = null, eventId: ULong? = null, endEventId: ULong? = null, eventName: String? = null, state: EventsTransactionsHistoryState? = null, trxId: ULong? = null, gtid: String? = null, xidFormatId: Int? = null, xidGtrid: String? = null, xidBqual: String? = null, xaState: String? = null, source: String? = null, timerStart: ULong? = null, timerEnd: ULong? = null, timerWait: ULong? = null, accessMode: EventsTransactionsHistoryAccessMode? = null, isolationLevel: String? = null, autocommit: EventsTransactionsHistoryAutocommit? = null, numberOfSavepoints: ULong? = null, numberOfRollbackToSavepoint: ULong? = null, numberOfReleaseSavepoint: ULong? = null, objectInstanceBegin: ULong? = null, nestingEventId: ULong? = null, nestingEventType: EventsTransactionsHistoryNestingEventType? = null): this() {
        this.threadId = threadId
        this.eventId = eventId
        this.endEventId = endEventId
        this.eventName = eventName
        this.state = state
        this.trxId = trxId
        this.gtid = gtid
        this.xidFormatId = xidFormatId
        this.xidGtrid = xidGtrid
        this.xidBqual = xidBqual
        this.xaState = xaState
        this.source = source
        this.timerStart = timerStart
        this.timerEnd = timerEnd
        this.timerWait = timerWait
        this.accessMode = accessMode
        this.isolationLevel = isolationLevel
        this.autocommit = autocommit
        this.numberOfSavepoints = numberOfSavepoints
        this.numberOfRollbackToSavepoint = numberOfRollbackToSavepoint
        this.numberOfReleaseSavepoint = numberOfReleaseSavepoint
        this.objectInstanceBegin = objectInstanceBegin
        this.nestingEventId = nestingEventId
        this.nestingEventType = nestingEventType
        resetChangedOnNotNull()
    }
}
