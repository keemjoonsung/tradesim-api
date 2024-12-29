/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import java.math.BigDecimal
import java.math.BigInteger

import org.jooq.Field
import org.jooq.Record12
import org.jooq.Row12
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class `X$hostSummaryRecord`() : TableRecordImpl<`X$hostSummaryRecord`>(com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`), Record12<String?, BigInteger?, BigInteger?, BigDecimal?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, Long?, BigInteger?, BigInteger?> {

    open var host: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var statements: BigInteger?
        set(value): Unit = set(1, value)
        get(): BigInteger? = get(1) as BigInteger?

    open var statementLatency: BigInteger?
        set(value): Unit = set(2, value)
        get(): BigInteger? = get(2) as BigInteger?

    open var statementAvgLatency: BigDecimal?
        set(value): Unit = set(3, value)
        get(): BigDecimal? = get(3) as BigDecimal?

    open var tableScans: BigInteger?
        set(value): Unit = set(4, value)
        get(): BigInteger? = get(4) as BigInteger?

    open var fileIos: BigInteger?
        set(value): Unit = set(5, value)
        get(): BigInteger? = get(5) as BigInteger?

    open var fileIoLatency: BigInteger?
        set(value): Unit = set(6, value)
        get(): BigInteger? = get(6) as BigInteger?

    open var currentConnections: BigInteger?
        set(value): Unit = set(7, value)
        get(): BigInteger? = get(7) as BigInteger?

    open var totalConnections: BigInteger?
        set(value): Unit = set(8, value)
        get(): BigInteger? = get(8) as BigInteger?

    open var uniqueUsers: Long?
        set(value): Unit = set(9, value)
        get(): Long? = get(9) as Long?

    open var currentMemory: BigInteger?
        set(value): Unit = set(10, value)
        get(): BigInteger? = get(10) as BigInteger?

    open var totalMemoryAllocated: BigInteger?
        set(value): Unit = set(11, value)
        get(): BigInteger? = get(11) as BigInteger?

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row12<String?, BigInteger?, BigInteger?, BigDecimal?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, Long?, BigInteger?, BigInteger?> = super.fieldsRow() as Row12<String?, BigInteger?, BigInteger?, BigDecimal?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, Long?, BigInteger?, BigInteger?>
    override fun valuesRow(): Row12<String?, BigInteger?, BigInteger?, BigDecimal?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, Long?, BigInteger?, BigInteger?> = super.valuesRow() as Row12<String?, BigInteger?, BigInteger?, BigDecimal?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, BigInteger?, Long?, BigInteger?, BigInteger?>
    override fun field1(): Field<String?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.HOST
    override fun field2(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.STATEMENTS
    override fun field3(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.STATEMENT_LATENCY
    override fun field4(): Field<BigDecimal?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.STATEMENT_AVG_LATENCY
    override fun field5(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.TABLE_SCANS
    override fun field6(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.FILE_IOS
    override fun field7(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.FILE_IO_LATENCY
    override fun field8(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.CURRENT_CONNECTIONS
    override fun field9(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.TOTAL_CONNECTIONS
    override fun field10(): Field<Long?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.UNIQUE_USERS
    override fun field11(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.CURRENT_MEMORY
    override fun field12(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`.TOTAL_MEMORY_ALLOCATED
    override fun component1(): String? = host
    override fun component2(): BigInteger? = statements
    override fun component3(): BigInteger? = statementLatency
    override fun component4(): BigDecimal? = statementAvgLatency
    override fun component5(): BigInteger? = tableScans
    override fun component6(): BigInteger? = fileIos
    override fun component7(): BigInteger? = fileIoLatency
    override fun component8(): BigInteger? = currentConnections
    override fun component9(): BigInteger? = totalConnections
    override fun component10(): Long? = uniqueUsers
    override fun component11(): BigInteger? = currentMemory
    override fun component12(): BigInteger? = totalMemoryAllocated
    override fun value1(): String? = host
    override fun value2(): BigInteger? = statements
    override fun value3(): BigInteger? = statementLatency
    override fun value4(): BigDecimal? = statementAvgLatency
    override fun value5(): BigInteger? = tableScans
    override fun value6(): BigInteger? = fileIos
    override fun value7(): BigInteger? = fileIoLatency
    override fun value8(): BigInteger? = currentConnections
    override fun value9(): BigInteger? = totalConnections
    override fun value10(): Long? = uniqueUsers
    override fun value11(): BigInteger? = currentMemory
    override fun value12(): BigInteger? = totalMemoryAllocated

    override fun value1(value: String?): `X$hostSummaryRecord` {
        set(0, value)
        return this
    }

    override fun value2(value: BigInteger?): `X$hostSummaryRecord` {
        set(1, value)
        return this
    }

    override fun value3(value: BigInteger?): `X$hostSummaryRecord` {
        set(2, value)
        return this
    }

    override fun value4(value: BigDecimal?): `X$hostSummaryRecord` {
        set(3, value)
        return this
    }

    override fun value5(value: BigInteger?): `X$hostSummaryRecord` {
        set(4, value)
        return this
    }

    override fun value6(value: BigInteger?): `X$hostSummaryRecord` {
        set(5, value)
        return this
    }

    override fun value7(value: BigInteger?): `X$hostSummaryRecord` {
        set(6, value)
        return this
    }

    override fun value8(value: BigInteger?): `X$hostSummaryRecord` {
        set(7, value)
        return this
    }

    override fun value9(value: BigInteger?): `X$hostSummaryRecord` {
        set(8, value)
        return this
    }

    override fun value10(value: Long?): `X$hostSummaryRecord` {
        set(9, value)
        return this
    }

    override fun value11(value: BigInteger?): `X$hostSummaryRecord` {
        set(10, value)
        return this
    }

    override fun value12(value: BigInteger?): `X$hostSummaryRecord` {
        set(11, value)
        return this
    }

    override fun values(value1: String?, value2: BigInteger?, value3: BigInteger?, value4: BigDecimal?, value5: BigInteger?, value6: BigInteger?, value7: BigInteger?, value8: BigInteger?, value9: BigInteger?, value10: Long?, value11: BigInteger?, value12: BigInteger?): `X$hostSummaryRecord` {
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
        return this
    }

    /**
     * Create a detached, initialised `X$hostSummaryRecord`
     */
    constructor(host: String? = null, statements: BigInteger? = null, statementLatency: BigInteger? = null, statementAvgLatency: BigDecimal? = null, tableScans: BigInteger? = null, fileIos: BigInteger? = null, fileIoLatency: BigInteger? = null, currentConnections: BigInteger? = null, totalConnections: BigInteger? = null, uniqueUsers: Long? = null, currentMemory: BigInteger? = null, totalMemoryAllocated: BigInteger? = null): this() {
        this.host = host
        this.statements = statements
        this.statementLatency = statementLatency
        this.statementAvgLatency = statementAvgLatency
        this.tableScans = tableScans
        this.fileIos = fileIos
        this.fileIoLatency = fileIoLatency
        this.currentConnections = currentConnections
        this.totalConnections = totalConnections
        this.uniqueUsers = uniqueUsers
        this.currentMemory = currentMemory
        this.totalMemoryAllocated = totalMemoryAllocated
        resetChangedOnNotNull()
    }
}
