/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import com.kjs990114.infra.persistence.jooq.trade.sys.tables.HostSummaryByFileIo

import java.math.BigInteger

import org.jooq.Field
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class HostSummaryByFileIoRecord() : TableRecordImpl<HostSummaryByFileIoRecord>(HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO), Record3<String?, BigInteger?, String?> {

    open var host: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var ios: BigInteger?
        set(value): Unit = set(1, value)
        get(): BigInteger? = get(1) as BigInteger?

    open var ioLatency: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<String?, BigInteger?, String?> = super.fieldsRow() as Row3<String?, BigInteger?, String?>
    override fun valuesRow(): Row3<String?, BigInteger?, String?> = super.valuesRow() as Row3<String?, BigInteger?, String?>
    override fun field1(): Field<String?> = HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO.HOST
    override fun field2(): Field<BigInteger?> = HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO.IOS
    override fun field3(): Field<String?> = HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO.IO_LATENCY
    override fun component1(): String? = host
    override fun component2(): BigInteger? = ios
    override fun component3(): String? = ioLatency
    override fun value1(): String? = host
    override fun value2(): BigInteger? = ios
    override fun value3(): String? = ioLatency

    override fun value1(value: String?): HostSummaryByFileIoRecord {
        set(0, value)
        return this
    }

    override fun value2(value: BigInteger?): HostSummaryByFileIoRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): HostSummaryByFileIoRecord {
        set(2, value)
        return this
    }

    override fun values(value1: String?, value2: BigInteger?, value3: String?): HostSummaryByFileIoRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised HostSummaryByFileIoRecord
     */
    constructor(host: String? = null, ios: BigInteger? = null, ioLatency: String? = null): this() {
        this.host = host
        this.ios = ios
        this.ioLatency = ioLatency
        resetChangedOnNotNull()
    }
}