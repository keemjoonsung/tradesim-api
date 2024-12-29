/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import java.math.BigDecimal

import org.jooq.Field
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class `X$memoryGlobalByCurrentBytesRecord`() : TableRecordImpl<`X$memoryGlobalByCurrentBytesRecord`>(com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes`.`X$MEMORY_GLOBAL_BY_CURRENT_BYTES`), Record7<String?, Long?, Long?, BigDecimal?, Long?, Long?, BigDecimal?> {

    open var eventName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var currentCount: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var currentAlloc: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var currentAvgAlloc: BigDecimal?
        set(value): Unit = set(3, value)
        get(): BigDecimal? = get(3) as BigDecimal?

    open var highCount: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var highAlloc: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var highAvgAlloc: BigDecimal?
        set(value): Unit = set(6, value)
        get(): BigDecimal? = get(6) as BigDecimal?

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<String?, Long?, Long?, BigDecimal?, Long?, Long?, BigDecimal?> = super.fieldsRow() as Row7<String?, Long?, Long?, BigDecimal?, Long?, Long?, BigDecimal?>
    override fun valuesRow(): Row7<String?, Long?, Long?, BigDecimal?, Long?, Long?, BigDecimal?> = super.valuesRow() as Row7<String?, Long?, Long?, BigDecimal?, Long?, Long?, BigDecimal?>
    override fun field1(): Field<String?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes`.`X$MEMORY_GLOBAL_BY_CURRENT_BYTES`.EVENT_NAME
    override fun field2(): Field<Long?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes`.`X$MEMORY_GLOBAL_BY_CURRENT_BYTES`.CURRENT_COUNT
    override fun field3(): Field<Long?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes`.`X$MEMORY_GLOBAL_BY_CURRENT_BYTES`.CURRENT_ALLOC
    override fun field4(): Field<BigDecimal?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes`.`X$MEMORY_GLOBAL_BY_CURRENT_BYTES`.CURRENT_AVG_ALLOC
    override fun field5(): Field<Long?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes`.`X$MEMORY_GLOBAL_BY_CURRENT_BYTES`.HIGH_COUNT
    override fun field6(): Field<Long?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes`.`X$MEMORY_GLOBAL_BY_CURRENT_BYTES`.HIGH_ALLOC
    override fun field7(): Field<BigDecimal?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes`.`X$MEMORY_GLOBAL_BY_CURRENT_BYTES`.HIGH_AVG_ALLOC
    override fun component1(): String? = eventName
    override fun component2(): Long? = currentCount
    override fun component3(): Long? = currentAlloc
    override fun component4(): BigDecimal? = currentAvgAlloc
    override fun component5(): Long? = highCount
    override fun component6(): Long? = highAlloc
    override fun component7(): BigDecimal? = highAvgAlloc
    override fun value1(): String? = eventName
    override fun value2(): Long? = currentCount
    override fun value3(): Long? = currentAlloc
    override fun value4(): BigDecimal? = currentAvgAlloc
    override fun value5(): Long? = highCount
    override fun value6(): Long? = highAlloc
    override fun value7(): BigDecimal? = highAvgAlloc

    override fun value1(value: String?): `X$memoryGlobalByCurrentBytesRecord` {
        set(0, value)
        return this
    }

    override fun value2(value: Long?): `X$memoryGlobalByCurrentBytesRecord` {
        set(1, value)
        return this
    }

    override fun value3(value: Long?): `X$memoryGlobalByCurrentBytesRecord` {
        set(2, value)
        return this
    }

    override fun value4(value: BigDecimal?): `X$memoryGlobalByCurrentBytesRecord` {
        set(3, value)
        return this
    }

    override fun value5(value: Long?): `X$memoryGlobalByCurrentBytesRecord` {
        set(4, value)
        return this
    }

    override fun value6(value: Long?): `X$memoryGlobalByCurrentBytesRecord` {
        set(5, value)
        return this
    }

    override fun value7(value: BigDecimal?): `X$memoryGlobalByCurrentBytesRecord` {
        set(6, value)
        return this
    }

    override fun values(value1: String?, value2: Long?, value3: Long?, value4: BigDecimal?, value5: Long?, value6: Long?, value7: BigDecimal?): `X$memoryGlobalByCurrentBytesRecord` {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        return this
    }

    /**
     * Create a detached, initialised `X$memoryGlobalByCurrentBytesRecord`
     */
    constructor(eventName: String? = null, currentCount: Long? = null, currentAlloc: Long? = null, currentAvgAlloc: BigDecimal? = null, highCount: Long? = null, highAlloc: Long? = null, highAvgAlloc: BigDecimal? = null): this() {
        this.eventName = eventName
        this.currentCount = currentCount
        this.currentAlloc = currentAlloc
        this.currentAvgAlloc = currentAvgAlloc
        this.highCount = highCount
        this.highAlloc = highAlloc
        this.highAvgAlloc = highAvgAlloc
        resetChangedOnNotNull()
    }
}
