/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsStatementsHistoryExecutionEngine
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsStatementsHistoryNestingEventType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.EventsStatementsHistory

import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsStatementsHistoryRecord() : UpdatableRecordImpl<EventsStatementsHistoryRecord>(EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY) {

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

    open var source: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var timerStart: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var timerEnd: ULong?
        set(value): Unit = set(6, value)
        get(): ULong? = get(6) as ULong?

    open var timerWait: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    open var lockTime: ULong?
        set(value): Unit = set(8, value)
        get(): ULong? = get(8) as ULong?

    open var sqlText: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var digest: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var digestText: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var currentSchema: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var objectType: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var objectSchema: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    open var objectName: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var objectInstanceBegin: ULong?
        set(value): Unit = set(16, value)
        get(): ULong? = get(16) as ULong?

    open var mysqlErrno: Int?
        set(value): Unit = set(17, value)
        get(): Int? = get(17) as Int?

    open var returnedSqlstate: String?
        set(value): Unit = set(18, value)
        get(): String? = get(18) as String?

    open var messageText: String?
        set(value): Unit = set(19, value)
        get(): String? = get(19) as String?

    open var errors: ULong?
        set(value): Unit = set(20, value)
        get(): ULong? = get(20) as ULong?

    open var warnings: ULong?
        set(value): Unit = set(21, value)
        get(): ULong? = get(21) as ULong?

    open var rowsAffected: ULong?
        set(value): Unit = set(22, value)
        get(): ULong? = get(22) as ULong?

    open var rowsSent: ULong?
        set(value): Unit = set(23, value)
        get(): ULong? = get(23) as ULong?

    open var rowsExamined: ULong?
        set(value): Unit = set(24, value)
        get(): ULong? = get(24) as ULong?

    open var createdTmpDiskTables: ULong?
        set(value): Unit = set(25, value)
        get(): ULong? = get(25) as ULong?

    open var createdTmpTables: ULong?
        set(value): Unit = set(26, value)
        get(): ULong? = get(26) as ULong?

    open var selectFullJoin: ULong?
        set(value): Unit = set(27, value)
        get(): ULong? = get(27) as ULong?

    open var selectFullRangeJoin: ULong?
        set(value): Unit = set(28, value)
        get(): ULong? = get(28) as ULong?

    open var selectRange: ULong?
        set(value): Unit = set(29, value)
        get(): ULong? = get(29) as ULong?

    open var selectRangeCheck: ULong?
        set(value): Unit = set(30, value)
        get(): ULong? = get(30) as ULong?

    open var selectScan: ULong?
        set(value): Unit = set(31, value)
        get(): ULong? = get(31) as ULong?

    open var sortMergePasses: ULong?
        set(value): Unit = set(32, value)
        get(): ULong? = get(32) as ULong?

    open var sortRange: ULong?
        set(value): Unit = set(33, value)
        get(): ULong? = get(33) as ULong?

    open var sortRows: ULong?
        set(value): Unit = set(34, value)
        get(): ULong? = get(34) as ULong?

    open var sortScan: ULong?
        set(value): Unit = set(35, value)
        get(): ULong? = get(35) as ULong?

    open var noIndexUsed: ULong?
        set(value): Unit = set(36, value)
        get(): ULong? = get(36) as ULong?

    open var noGoodIndexUsed: ULong?
        set(value): Unit = set(37, value)
        get(): ULong? = get(37) as ULong?

    open var nestingEventId: ULong?
        set(value): Unit = set(38, value)
        get(): ULong? = get(38) as ULong?

    open var nestingEventType: EventsStatementsHistoryNestingEventType?
        set(value): Unit = set(39, value)
        get(): EventsStatementsHistoryNestingEventType? = get(39) as EventsStatementsHistoryNestingEventType?

    open var nestingEventLevel: Int?
        set(value): Unit = set(40, value)
        get(): Int? = get(40) as Int?

    open var statementId: ULong?
        set(value): Unit = set(41, value)
        get(): ULong? = get(41) as ULong?

    open var cpuTime: ULong?
        set(value): Unit = set(42, value)
        get(): ULong? = get(42) as ULong?

    open var maxControlledMemory: ULong?
        set(value): Unit = set(43, value)
        get(): ULong? = get(43) as ULong?

    open var maxTotalMemory: ULong?
        set(value): Unit = set(44, value)
        get(): ULong? = get(44) as ULong?

    open var executionEngine: EventsStatementsHistoryExecutionEngine?
        set(value): Unit = set(45, value)
        get(): EventsStatementsHistoryExecutionEngine? = get(45) as EventsStatementsHistoryExecutionEngine?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<ULong?, ULong?> = super.key() as Record2<ULong?, ULong?>

    /**
     * Create a detached, initialised EventsStatementsHistoryRecord
     */
    constructor(threadId: ULong? = null, eventId: ULong? = null, endEventId: ULong? = null, eventName: String? = null, source: String? = null, timerStart: ULong? = null, timerEnd: ULong? = null, timerWait: ULong? = null, lockTime: ULong? = null, sqlText: String? = null, digest: String? = null, digestText: String? = null, currentSchema: String? = null, objectType: String? = null, objectSchema: String? = null, objectName: String? = null, objectInstanceBegin: ULong? = null, mysqlErrno: Int? = null, returnedSqlstate: String? = null, messageText: String? = null, errors: ULong? = null, warnings: ULong? = null, rowsAffected: ULong? = null, rowsSent: ULong? = null, rowsExamined: ULong? = null, createdTmpDiskTables: ULong? = null, createdTmpTables: ULong? = null, selectFullJoin: ULong? = null, selectFullRangeJoin: ULong? = null, selectRange: ULong? = null, selectRangeCheck: ULong? = null, selectScan: ULong? = null, sortMergePasses: ULong? = null, sortRange: ULong? = null, sortRows: ULong? = null, sortScan: ULong? = null, noIndexUsed: ULong? = null, noGoodIndexUsed: ULong? = null, nestingEventId: ULong? = null, nestingEventType: EventsStatementsHistoryNestingEventType? = null, nestingEventLevel: Int? = null, statementId: ULong? = null, cpuTime: ULong? = null, maxControlledMemory: ULong? = null, maxTotalMemory: ULong? = null, executionEngine: EventsStatementsHistoryExecutionEngine? = null): this() {
        this.threadId = threadId
        this.eventId = eventId
        this.endEventId = endEventId
        this.eventName = eventName
        this.source = source
        this.timerStart = timerStart
        this.timerEnd = timerEnd
        this.timerWait = timerWait
        this.lockTime = lockTime
        this.sqlText = sqlText
        this.digest = digest
        this.digestText = digestText
        this.currentSchema = currentSchema
        this.objectType = objectType
        this.objectSchema = objectSchema
        this.objectName = objectName
        this.objectInstanceBegin = objectInstanceBegin
        this.mysqlErrno = mysqlErrno
        this.returnedSqlstate = returnedSqlstate
        this.messageText = messageText
        this.errors = errors
        this.warnings = warnings
        this.rowsAffected = rowsAffected
        this.rowsSent = rowsSent
        this.rowsExamined = rowsExamined
        this.createdTmpDiskTables = createdTmpDiskTables
        this.createdTmpTables = createdTmpTables
        this.selectFullJoin = selectFullJoin
        this.selectFullRangeJoin = selectFullRangeJoin
        this.selectRange = selectRange
        this.selectRangeCheck = selectRangeCheck
        this.selectScan = selectScan
        this.sortMergePasses = sortMergePasses
        this.sortRange = sortRange
        this.sortRows = sortRows
        this.sortScan = sortScan
        this.noIndexUsed = noIndexUsed
        this.noGoodIndexUsed = noGoodIndexUsed
        this.nestingEventId = nestingEventId
        this.nestingEventType = nestingEventType
        this.nestingEventLevel = nestingEventLevel
        this.statementId = statementId
        this.cpuTime = cpuTime
        this.maxControlledMemory = maxControlledMemory
        this.maxTotalMemory = maxTotalMemory
        this.executionEngine = executionEngine
        resetChangedOnNotNull()
    }
}
