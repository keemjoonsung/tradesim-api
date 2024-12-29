/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import java.math.BigInteger

import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class `X$schemaTableStatisticsWithBufferRecord`() : TableRecordImpl<`X$schemaTableStatisticsWithBufferRecord`>(com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTableStatisticsWithBuffer`.`X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER`) {

    open var tableSchema: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var tableName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var rowsFetched: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    open var fetchLatency: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var rowsInserted: ULong?
        set(value): Unit = set(4, value)
        get(): ULong? = get(4) as ULong?

    open var insertLatency: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var rowsUpdated: ULong?
        set(value): Unit = set(6, value)
        get(): ULong? = get(6) as ULong?

    open var updateLatency: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    open var rowsDeleted: ULong?
        set(value): Unit = set(8, value)
        get(): ULong? = get(8) as ULong?

    open var deleteLatency: ULong?
        set(value): Unit = set(9, value)
        get(): ULong? = get(9) as ULong?

    open var ioReadRequests: BigInteger?
        set(value): Unit = set(10, value)
        get(): BigInteger? = get(10) as BigInteger?

    open var ioRead: BigInteger?
        set(value): Unit = set(11, value)
        get(): BigInteger? = get(11) as BigInteger?

    open var ioReadLatency: BigInteger?
        set(value): Unit = set(12, value)
        get(): BigInteger? = get(12) as BigInteger?

    open var ioWriteRequests: BigInteger?
        set(value): Unit = set(13, value)
        get(): BigInteger? = get(13) as BigInteger?

    open var ioWrite: BigInteger?
        set(value): Unit = set(14, value)
        get(): BigInteger? = get(14) as BigInteger?

    open var ioWriteLatency: BigInteger?
        set(value): Unit = set(15, value)
        get(): BigInteger? = get(15) as BigInteger?

    open var ioMiscRequests: BigInteger?
        set(value): Unit = set(16, value)
        get(): BigInteger? = get(16) as BigInteger?

    open var ioMiscLatency: BigInteger?
        set(value): Unit = set(17, value)
        get(): BigInteger? = get(17) as BigInteger?

    open var innodbBufferAllocated: BigInteger?
        set(value): Unit = set(18, value)
        get(): BigInteger? = get(18) as BigInteger?

    open var innodbBufferData: BigInteger?
        set(value): Unit = set(19, value)
        get(): BigInteger? = get(19) as BigInteger?

    open var innodbBufferFree: BigInteger?
        set(value): Unit = set(20, value)
        get(): BigInteger? = get(20) as BigInteger?

    open var innodbBufferPages: Long?
        set(value): Unit = set(21, value)
        get(): Long? = get(21) as Long?

    open var innodbBufferPagesHashed: Long?
        set(value): Unit = set(22, value)
        get(): Long? = get(22) as Long?

    open var innodbBufferPagesOld: Long?
        set(value): Unit = set(23, value)
        get(): Long? = get(23) as Long?

    open var innodbBufferRowsCached: BigInteger?
        set(value): Unit = set(24, value)
        get(): BigInteger? = get(24) as BigInteger?

    /**
     * Create a detached, initialised `X$schemaTableStatisticsWithBufferRecord`
     */
    constructor(tableSchema: String? = null, tableName: String? = null, rowsFetched: ULong? = null, fetchLatency: ULong? = null, rowsInserted: ULong? = null, insertLatency: ULong? = null, rowsUpdated: ULong? = null, updateLatency: ULong? = null, rowsDeleted: ULong? = null, deleteLatency: ULong? = null, ioReadRequests: BigInteger? = null, ioRead: BigInteger? = null, ioReadLatency: BigInteger? = null, ioWriteRequests: BigInteger? = null, ioWrite: BigInteger? = null, ioWriteLatency: BigInteger? = null, ioMiscRequests: BigInteger? = null, ioMiscLatency: BigInteger? = null, innodbBufferAllocated: BigInteger? = null, innodbBufferData: BigInteger? = null, innodbBufferFree: BigInteger? = null, innodbBufferPages: Long? = null, innodbBufferPagesHashed: Long? = null, innodbBufferPagesOld: Long? = null, innodbBufferRowsCached: BigInteger? = null): this() {
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.rowsFetched = rowsFetched
        this.fetchLatency = fetchLatency
        this.rowsInserted = rowsInserted
        this.insertLatency = insertLatency
        this.rowsUpdated = rowsUpdated
        this.updateLatency = updateLatency
        this.rowsDeleted = rowsDeleted
        this.deleteLatency = deleteLatency
        this.ioReadRequests = ioReadRequests
        this.ioRead = ioRead
        this.ioReadLatency = ioReadLatency
        this.ioWriteRequests = ioWriteRequests
        this.ioWrite = ioWrite
        this.ioWriteLatency = ioWriteLatency
        this.ioMiscRequests = ioMiscRequests
        this.ioMiscLatency = ioMiscLatency
        this.innodbBufferAllocated = innodbBufferAllocated
        this.innodbBufferData = innodbBufferData
        this.innodbBufferFree = innodbBufferFree
        this.innodbBufferPages = innodbBufferPages
        this.innodbBufferPagesHashed = innodbBufferPagesHashed
        this.innodbBufferPagesOld = innodbBufferPagesOld
        this.innodbBufferRowsCached = innodbBufferRowsCached
        resetChangedOnNotNull()
    }
}