/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import java.math.BigDecimal
import java.math.BigInteger

import org.jooq.Field
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class `X$memoryByHostByCurrentBytesRecord`() : TableRecordImpl<`X$memoryByHostByCurrentBytesRecord`>(com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByHostByCurrentBytes`.`X$MEMORY_BY_HOST_BY_CURRENT_BYTES`), Record6<String?, BigInteger?, BigInteger?, BigDecimal?, Long?, BigInteger?> {

    open var host: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var currentCountUsed: BigInteger?
        set(value): Unit = set(1, value)
        get(): BigInteger? = get(1) as BigInteger?

    open var currentAllocated: BigInteger?
        set(value): Unit = set(2, value)
        get(): BigInteger? = get(2) as BigInteger?

    open var currentAvgAlloc: BigDecimal?
        set(value): Unit = set(3, value)
        get(): BigDecimal? = get(3) as BigDecimal?

    open var currentMaxAlloc: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var totalAllocated: BigInteger?
        set(value): Unit = set(5, value)
        get(): BigInteger? = get(5) as BigInteger?

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<String?, BigInteger?, BigInteger?, BigDecimal?, Long?, BigInteger?> = super.fieldsRow() as Row6<String?, BigInteger?, BigInteger?, BigDecimal?, Long?, BigInteger?>
    override fun valuesRow(): Row6<String?, BigInteger?, BigInteger?, BigDecimal?, Long?, BigInteger?> = super.valuesRow() as Row6<String?, BigInteger?, BigInteger?, BigDecimal?, Long?, BigInteger?>
    override fun field1(): Field<String?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByHostByCurrentBytes`.`X$MEMORY_BY_HOST_BY_CURRENT_BYTES`.HOST
    override fun field2(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByHostByCurrentBytes`.`X$MEMORY_BY_HOST_BY_CURRENT_BYTES`.CURRENT_COUNT_USED
    override fun field3(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByHostByCurrentBytes`.`X$MEMORY_BY_HOST_BY_CURRENT_BYTES`.CURRENT_ALLOCATED
    override fun field4(): Field<BigDecimal?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByHostByCurrentBytes`.`X$MEMORY_BY_HOST_BY_CURRENT_BYTES`.CURRENT_AVG_ALLOC
    override fun field5(): Field<Long?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByHostByCurrentBytes`.`X$MEMORY_BY_HOST_BY_CURRENT_BYTES`.CURRENT_MAX_ALLOC
    override fun field6(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByHostByCurrentBytes`.`X$MEMORY_BY_HOST_BY_CURRENT_BYTES`.TOTAL_ALLOCATED
    override fun component1(): String? = host
    override fun component2(): BigInteger? = currentCountUsed
    override fun component3(): BigInteger? = currentAllocated
    override fun component4(): BigDecimal? = currentAvgAlloc
    override fun component5(): Long? = currentMaxAlloc
    override fun component6(): BigInteger? = totalAllocated
    override fun value1(): String? = host
    override fun value2(): BigInteger? = currentCountUsed
    override fun value3(): BigInteger? = currentAllocated
    override fun value4(): BigDecimal? = currentAvgAlloc
    override fun value5(): Long? = currentMaxAlloc
    override fun value6(): BigInteger? = totalAllocated

    override fun value1(value: String?): `X$memoryByHostByCurrentBytesRecord` {
        set(0, value)
        return this
    }

    override fun value2(value: BigInteger?): `X$memoryByHostByCurrentBytesRecord` {
        set(1, value)
        return this
    }

    override fun value3(value: BigInteger?): `X$memoryByHostByCurrentBytesRecord` {
        set(2, value)
        return this
    }

    override fun value4(value: BigDecimal?): `X$memoryByHostByCurrentBytesRecord` {
        set(3, value)
        return this
    }

    override fun value5(value: Long?): `X$memoryByHostByCurrentBytesRecord` {
        set(4, value)
        return this
    }

    override fun value6(value: BigInteger?): `X$memoryByHostByCurrentBytesRecord` {
        set(5, value)
        return this
    }

    override fun values(value1: String?, value2: BigInteger?, value3: BigInteger?, value4: BigDecimal?, value5: Long?, value6: BigInteger?): `X$memoryByHostByCurrentBytesRecord` {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised `X$memoryByHostByCurrentBytesRecord`
     */
    constructor(host: String? = null, currentCountUsed: BigInteger? = null, currentAllocated: BigInteger? = null, currentAvgAlloc: BigDecimal? = null, currentMaxAlloc: Long? = null, totalAllocated: BigInteger? = null): this() {
        this.host = host
        this.currentCountUsed = currentCountUsed
        this.currentAllocated = currentAllocated
        this.currentAvgAlloc = currentAvgAlloc
        this.currentMaxAlloc = currentMaxAlloc
        this.totalAllocated = totalAllocated
        resetChangedOnNotNull()
    }
}
