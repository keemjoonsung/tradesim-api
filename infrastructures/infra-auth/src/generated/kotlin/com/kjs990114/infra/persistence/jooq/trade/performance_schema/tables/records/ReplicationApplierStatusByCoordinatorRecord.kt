/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationApplierStatusByCoordinatorServiceState
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.ReplicationApplierStatusByCoordinator

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record15
import org.jooq.Row15
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ReplicationApplierStatusByCoordinatorRecord() : UpdatableRecordImpl<ReplicationApplierStatusByCoordinatorRecord>(ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR), Record15<String?, ULong?, ReplicationApplierStatusByCoordinatorServiceState?, Int?, String?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?> {

    open var channelName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var threadId: ULong?
        set(value): Unit = set(1, value)
        get(): ULong? = get(1) as ULong?

    open var serviceState: ReplicationApplierStatusByCoordinatorServiceState?
        set(value): Unit = set(2, value)
        get(): ReplicationApplierStatusByCoordinatorServiceState? = get(2) as ReplicationApplierStatusByCoordinatorServiceState?

    open var lastErrorNumber: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var lastErrorMessage: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var lastErrorTimestamp: LocalDateTime?
        set(value): Unit = set(5, value)
        get(): LocalDateTime? = get(5) as LocalDateTime?

    open var lastProcessedTransaction: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var lastProcessedTransactionOriginalCommitTimestamp: LocalDateTime?
        set(value): Unit = set(7, value)
        get(): LocalDateTime? = get(7) as LocalDateTime?

    open var lastProcessedTransactionImmediateCommitTimestamp: LocalDateTime?
        set(value): Unit = set(8, value)
        get(): LocalDateTime? = get(8) as LocalDateTime?

    open var lastProcessedTransactionStartBufferTimestamp: LocalDateTime?
        set(value): Unit = set(9, value)
        get(): LocalDateTime? = get(9) as LocalDateTime?

    open var lastProcessedTransactionEndBufferTimestamp: LocalDateTime?
        set(value): Unit = set(10, value)
        get(): LocalDateTime? = get(10) as LocalDateTime?

    open var processingTransaction: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var processingTransactionOriginalCommitTimestamp: LocalDateTime?
        set(value): Unit = set(12, value)
        get(): LocalDateTime? = get(12) as LocalDateTime?

    open var processingTransactionImmediateCommitTimestamp: LocalDateTime?
        set(value): Unit = set(13, value)
        get(): LocalDateTime? = get(13) as LocalDateTime?

    open var processingTransactionStartBufferTimestamp: LocalDateTime?
        set(value): Unit = set(14, value)
        get(): LocalDateTime? = get(14) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row15<String?, ULong?, ReplicationApplierStatusByCoordinatorServiceState?, Int?, String?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row15<String?, ULong?, ReplicationApplierStatusByCoordinatorServiceState?, Int?, String?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?>
    override fun valuesRow(): Row15<String?, ULong?, ReplicationApplierStatusByCoordinatorServiceState?, Int?, String?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?> = super.valuesRow() as Row15<String?, ULong?, ReplicationApplierStatusByCoordinatorServiceState?, Int?, String?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?, LocalDateTime?, String?, LocalDateTime?, LocalDateTime?, LocalDateTime?>
    override fun field1(): Field<String?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.CHANNEL_NAME
    override fun field2(): Field<ULong?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.THREAD_ID
    override fun field3(): Field<ReplicationApplierStatusByCoordinatorServiceState?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.SERVICE_STATE
    override fun field4(): Field<Int?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_ERROR_NUMBER
    override fun field5(): Field<String?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_ERROR_MESSAGE
    override fun field6(): Field<LocalDateTime?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_ERROR_TIMESTAMP
    override fun field7(): Field<String?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_PROCESSED_TRANSACTION
    override fun field8(): Field<LocalDateTime?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
    override fun field9(): Field<LocalDateTime?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
    override fun field10(): Field<LocalDateTime?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
    override fun field11(): Field<LocalDateTime?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
    override fun field12(): Field<String?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.PROCESSING_TRANSACTION
    override fun field13(): Field<LocalDateTime?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
    override fun field14(): Field<LocalDateTime?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
    override fun field15(): Field<LocalDateTime?> = ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
    override fun component1(): String? = channelName
    override fun component2(): ULong? = threadId
    override fun component3(): ReplicationApplierStatusByCoordinatorServiceState? = serviceState
    override fun component4(): Int? = lastErrorNumber
    override fun component5(): String? = lastErrorMessage
    override fun component6(): LocalDateTime? = lastErrorTimestamp
    override fun component7(): String? = lastProcessedTransaction
    override fun component8(): LocalDateTime? = lastProcessedTransactionOriginalCommitTimestamp
    override fun component9(): LocalDateTime? = lastProcessedTransactionImmediateCommitTimestamp
    override fun component10(): LocalDateTime? = lastProcessedTransactionStartBufferTimestamp
    override fun component11(): LocalDateTime? = lastProcessedTransactionEndBufferTimestamp
    override fun component12(): String? = processingTransaction
    override fun component13(): LocalDateTime? = processingTransactionOriginalCommitTimestamp
    override fun component14(): LocalDateTime? = processingTransactionImmediateCommitTimestamp
    override fun component15(): LocalDateTime? = processingTransactionStartBufferTimestamp
    override fun value1(): String? = channelName
    override fun value2(): ULong? = threadId
    override fun value3(): ReplicationApplierStatusByCoordinatorServiceState? = serviceState
    override fun value4(): Int? = lastErrorNumber
    override fun value5(): String? = lastErrorMessage
    override fun value6(): LocalDateTime? = lastErrorTimestamp
    override fun value7(): String? = lastProcessedTransaction
    override fun value8(): LocalDateTime? = lastProcessedTransactionOriginalCommitTimestamp
    override fun value9(): LocalDateTime? = lastProcessedTransactionImmediateCommitTimestamp
    override fun value10(): LocalDateTime? = lastProcessedTransactionStartBufferTimestamp
    override fun value11(): LocalDateTime? = lastProcessedTransactionEndBufferTimestamp
    override fun value12(): String? = processingTransaction
    override fun value13(): LocalDateTime? = processingTransactionOriginalCommitTimestamp
    override fun value14(): LocalDateTime? = processingTransactionImmediateCommitTimestamp
    override fun value15(): LocalDateTime? = processingTransactionStartBufferTimestamp

    override fun value1(value: String?): ReplicationApplierStatusByCoordinatorRecord {
        set(0, value)
        return this
    }

    override fun value2(value: ULong?): ReplicationApplierStatusByCoordinatorRecord {
        set(1, value)
        return this
    }

    override fun value3(value: ReplicationApplierStatusByCoordinatorServiceState?): ReplicationApplierStatusByCoordinatorRecord {
        set(2, value)
        return this
    }

    override fun value4(value: Int?): ReplicationApplierStatusByCoordinatorRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): ReplicationApplierStatusByCoordinatorRecord {
        set(4, value)
        return this
    }

    override fun value6(value: LocalDateTime?): ReplicationApplierStatusByCoordinatorRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): ReplicationApplierStatusByCoordinatorRecord {
        set(6, value)
        return this
    }

    override fun value8(value: LocalDateTime?): ReplicationApplierStatusByCoordinatorRecord {
        set(7, value)
        return this
    }

    override fun value9(value: LocalDateTime?): ReplicationApplierStatusByCoordinatorRecord {
        set(8, value)
        return this
    }

    override fun value10(value: LocalDateTime?): ReplicationApplierStatusByCoordinatorRecord {
        set(9, value)
        return this
    }

    override fun value11(value: LocalDateTime?): ReplicationApplierStatusByCoordinatorRecord {
        set(10, value)
        return this
    }

    override fun value12(value: String?): ReplicationApplierStatusByCoordinatorRecord {
        set(11, value)
        return this
    }

    override fun value13(value: LocalDateTime?): ReplicationApplierStatusByCoordinatorRecord {
        set(12, value)
        return this
    }

    override fun value14(value: LocalDateTime?): ReplicationApplierStatusByCoordinatorRecord {
        set(13, value)
        return this
    }

    override fun value15(value: LocalDateTime?): ReplicationApplierStatusByCoordinatorRecord {
        set(14, value)
        return this
    }

    override fun values(value1: String?, value2: ULong?, value3: ReplicationApplierStatusByCoordinatorServiceState?, value4: Int?, value5: String?, value6: LocalDateTime?, value7: String?, value8: LocalDateTime?, value9: LocalDateTime?, value10: LocalDateTime?, value11: LocalDateTime?, value12: String?, value13: LocalDateTime?, value14: LocalDateTime?, value15: LocalDateTime?): ReplicationApplierStatusByCoordinatorRecord {
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
        return this
    }

    /**
     * Create a detached, initialised
     * ReplicationApplierStatusByCoordinatorRecord
     */
    constructor(channelName: String? = null, threadId: ULong? = null, serviceState: ReplicationApplierStatusByCoordinatorServiceState? = null, lastErrorNumber: Int? = null, lastErrorMessage: String? = null, lastErrorTimestamp: LocalDateTime? = null, lastProcessedTransaction: String? = null, lastProcessedTransactionOriginalCommitTimestamp: LocalDateTime? = null, lastProcessedTransactionImmediateCommitTimestamp: LocalDateTime? = null, lastProcessedTransactionStartBufferTimestamp: LocalDateTime? = null, lastProcessedTransactionEndBufferTimestamp: LocalDateTime? = null, processingTransaction: String? = null, processingTransactionOriginalCommitTimestamp: LocalDateTime? = null, processingTransactionImmediateCommitTimestamp: LocalDateTime? = null, processingTransactionStartBufferTimestamp: LocalDateTime? = null): this() {
        this.channelName = channelName
        this.threadId = threadId
        this.serviceState = serviceState
        this.lastErrorNumber = lastErrorNumber
        this.lastErrorMessage = lastErrorMessage
        this.lastErrorTimestamp = lastErrorTimestamp
        this.lastProcessedTransaction = lastProcessedTransaction
        this.lastProcessedTransactionOriginalCommitTimestamp = lastProcessedTransactionOriginalCommitTimestamp
        this.lastProcessedTransactionImmediateCommitTimestamp = lastProcessedTransactionImmediateCommitTimestamp
        this.lastProcessedTransactionStartBufferTimestamp = lastProcessedTransactionStartBufferTimestamp
        this.lastProcessedTransactionEndBufferTimestamp = lastProcessedTransactionEndBufferTimestamp
        this.processingTransaction = processingTransaction
        this.processingTransactionOriginalCommitTimestamp = processingTransactionOriginalCommitTimestamp
        this.processingTransactionImmediateCommitTimestamp = processingTransactionImmediateCommitTimestamp
        this.processingTransactionStartBufferTimestamp = processingTransactionStartBufferTimestamp
        resetChangedOnNotNull()
    }
}