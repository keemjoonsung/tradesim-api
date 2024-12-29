/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ThreadsExecutionEngine
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ThreadsHistory
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ThreadsInstrumented
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ThreadsTelemetryActive
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.Threads

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ThreadsRecord() : UpdatableRecordImpl<ThreadsRecord>(Threads.THREADS) {

    open var threadId: ULong?
        set(value): Unit = set(0, value)
        get(): ULong? = get(0) as ULong?

    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var type: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var processlistId: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var processlistUser: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var processlistHost: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var processlistDb: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var processlistCommand: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var processlistTime: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    open var processlistState: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var processlistInfo: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var parentThreadId: ULong?
        set(value): Unit = set(11, value)
        get(): ULong? = get(11) as ULong?

    open var role: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var instrumented: ThreadsInstrumented?
        set(value): Unit = set(13, value)
        get(): ThreadsInstrumented? = get(13) as ThreadsInstrumented?

    open var history: ThreadsHistory?
        set(value): Unit = set(14, value)
        get(): ThreadsHistory? = get(14) as ThreadsHistory?

    open var connectionType: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var threadOsId: ULong?
        set(value): Unit = set(16, value)
        get(): ULong? = get(16) as ULong?

    open var resourceGroup: String?
        set(value): Unit = set(17, value)
        get(): String? = get(17) as String?

    open var executionEngine: ThreadsExecutionEngine?
        set(value): Unit = set(18, value)
        get(): ThreadsExecutionEngine? = get(18) as ThreadsExecutionEngine?

    open var controlledMemory: ULong?
        set(value): Unit = set(19, value)
        get(): ULong? = get(19) as ULong?

    open var maxControlledMemory: ULong?
        set(value): Unit = set(20, value)
        get(): ULong? = get(20) as ULong?

    open var totalMemory: ULong?
        set(value): Unit = set(21, value)
        get(): ULong? = get(21) as ULong?

    open var maxTotalMemory: ULong?
        set(value): Unit = set(22, value)
        get(): ULong? = get(22) as ULong?

    open var telemetryActive: ThreadsTelemetryActive?
        set(value): Unit = set(23, value)
        get(): ThreadsTelemetryActive? = get(23) as ThreadsTelemetryActive?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<ULong?> = super.key() as Record1<ULong?>

    /**
     * Create a detached, initialised ThreadsRecord
     */
    constructor(threadId: ULong? = null, name: String? = null, type: String? = null, processlistId: ULong? = null, processlistUser: String? = null, processlistHost: String? = null, processlistDb: String? = null, processlistCommand: String? = null, processlistTime: Long? = null, processlistState: String? = null, processlistInfo: String? = null, parentThreadId: ULong? = null, role: String? = null, instrumented: ThreadsInstrumented? = null, history: ThreadsHistory? = null, connectionType: String? = null, threadOsId: ULong? = null, resourceGroup: String? = null, executionEngine: ThreadsExecutionEngine? = null, controlledMemory: ULong? = null, maxControlledMemory: ULong? = null, totalMemory: ULong? = null, maxTotalMemory: ULong? = null, telemetryActive: ThreadsTelemetryActive? = null): this() {
        this.threadId = threadId
        this.name = name
        this.type = type
        this.processlistId = processlistId
        this.processlistUser = processlistUser
        this.processlistHost = processlistHost
        this.processlistDb = processlistDb
        this.processlistCommand = processlistCommand
        this.processlistTime = processlistTime
        this.processlistState = processlistState
        this.processlistInfo = processlistInfo
        this.parentThreadId = parentThreadId
        this.role = role
        this.instrumented = instrumented
        this.history = history
        this.connectionType = connectionType
        this.threadOsId = threadOsId
        this.resourceGroup = resourceGroup
        this.executionEngine = executionEngine
        this.controlledMemory = controlledMemory
        this.maxControlledMemory = maxControlledMemory
        this.totalMemory = totalMemory
        this.maxTotalMemory = maxTotalMemory
        this.telemetryActive = telemetryActive
        resetChangedOnNotNull()
    }
}
