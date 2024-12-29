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
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class `X$waitClassesGlobalByAvgLatencyRecord`() : TableRecordImpl<`X$waitClassesGlobalByAvgLatencyRecord`>(com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByAvgLatency`.`X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY`), Record6<String?, BigInteger?, BigInteger?, ULong?, BigDecimal?, ULong?> {

    open var eventClass: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var total: BigInteger?
        set(value): Unit = set(1, value)
        get(): BigInteger? = get(1) as BigInteger?

    open var totalLatency: BigInteger?
        set(value): Unit = set(2, value)
        get(): BigInteger? = get(2) as BigInteger?

    open var minLatency: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var avgLatency: BigDecimal?
        set(value): Unit = set(4, value)
        get(): BigDecimal? = get(4) as BigDecimal?

    open var maxLatency: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<String?, BigInteger?, BigInteger?, ULong?, BigDecimal?, ULong?> = super.fieldsRow() as Row6<String?, BigInteger?, BigInteger?, ULong?, BigDecimal?, ULong?>
    override fun valuesRow(): Row6<String?, BigInteger?, BigInteger?, ULong?, BigDecimal?, ULong?> = super.valuesRow() as Row6<String?, BigInteger?, BigInteger?, ULong?, BigDecimal?, ULong?>
    override fun field1(): Field<String?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByAvgLatency`.`X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY`.EVENT_CLASS
    override fun field2(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByAvgLatency`.`X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY`.TOTAL
    override fun field3(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByAvgLatency`.`X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY`.TOTAL_LATENCY
    override fun field4(): Field<ULong?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByAvgLatency`.`X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY`.MIN_LATENCY
    override fun field5(): Field<BigDecimal?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByAvgLatency`.`X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY`.AVG_LATENCY
    override fun field6(): Field<ULong?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByAvgLatency`.`X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY`.MAX_LATENCY
    override fun component1(): String? = eventClass
    override fun component2(): BigInteger? = total
    override fun component3(): BigInteger? = totalLatency
    override fun component4(): ULong? = minLatency
    override fun component5(): BigDecimal? = avgLatency
    override fun component6(): ULong? = maxLatency
    override fun value1(): String? = eventClass
    override fun value2(): BigInteger? = total
    override fun value3(): BigInteger? = totalLatency
    override fun value4(): ULong? = minLatency
    override fun value5(): BigDecimal? = avgLatency
    override fun value6(): ULong? = maxLatency

    override fun value1(value: String?): `X$waitClassesGlobalByAvgLatencyRecord` {
        set(0, value)
        return this
    }

    override fun value2(value: BigInteger?): `X$waitClassesGlobalByAvgLatencyRecord` {
        set(1, value)
        return this
    }

    override fun value3(value: BigInteger?): `X$waitClassesGlobalByAvgLatencyRecord` {
        set(2, value)
        return this
    }

    override fun value4(value: ULong?): `X$waitClassesGlobalByAvgLatencyRecord` {
        set(3, value)
        return this
    }

    override fun value5(value: BigDecimal?): `X$waitClassesGlobalByAvgLatencyRecord` {
        set(4, value)
        return this
    }

    override fun value6(value: ULong?): `X$waitClassesGlobalByAvgLatencyRecord` {
        set(5, value)
        return this
    }

    override fun values(value1: String?, value2: BigInteger?, value3: BigInteger?, value4: ULong?, value5: BigDecimal?, value6: ULong?): `X$waitClassesGlobalByAvgLatencyRecord` {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised `X$waitClassesGlobalByAvgLatencyRecord`
     */
    constructor(eventClass: String? = null, total: BigInteger? = null, totalLatency: BigInteger? = null, minLatency: ULong? = null, avgLatency: BigDecimal? = null, maxLatency: ULong? = null): this() {
        this.eventClass = eventClass
        this.total = total
        this.totalLatency = totalLatency
        this.minLatency = minLatency
        this.avgLatency = avgLatency
        this.maxLatency = maxLatency
        resetChangedOnNotNull()
    }
}
