/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.InnodbMetrics

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record17
import org.jooq.Row17
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbMetricsRecord() : TableRecordImpl<InnodbMetricsRecord>(InnodbMetrics.INNODB_METRICS), Record17<String?, String?, Long?, Long?, Long?, Double?, Long?, Long?, Long?, Double?, LocalDateTime?, LocalDateTime?, Long?, LocalDateTime?, String?, String?, String?> {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var subsystem: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var count: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var maxCount: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var minCount: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var avgCount: Double?
        set(value): Unit = set(5, value)
        get(): Double? = get(5) as Double?

    open var countReset: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    open var maxCountReset: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var minCountReset: Long?
        set(value): Unit = set(8, value)
        get(): Long? = get(8) as Long?

    open var avgCountReset: Double?
        set(value): Unit = set(9, value)
        get(): Double? = get(9) as Double?

    open var timeEnabled: LocalDateTime?
        set(value): Unit = set(10, value)
        get(): LocalDateTime? = get(10) as LocalDateTime?

    open var timeDisabled: LocalDateTime?
        set(value): Unit = set(11, value)
        get(): LocalDateTime? = get(11) as LocalDateTime?

    open var timeElapsed: Long?
        set(value): Unit = set(12, value)
        get(): Long? = get(12) as Long?

    open var timeReset: LocalDateTime?
        set(value): Unit = set(13, value)
        get(): LocalDateTime? = get(13) as LocalDateTime?

    open var status: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    open var type: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var comment: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row17<String?, String?, Long?, Long?, Long?, Double?, Long?, Long?, Long?, Double?, LocalDateTime?, LocalDateTime?, Long?, LocalDateTime?, String?, String?, String?> = super.fieldsRow() as Row17<String?, String?, Long?, Long?, Long?, Double?, Long?, Long?, Long?, Double?, LocalDateTime?, LocalDateTime?, Long?, LocalDateTime?, String?, String?, String?>
    override fun valuesRow(): Row17<String?, String?, Long?, Long?, Long?, Double?, Long?, Long?, Long?, Double?, LocalDateTime?, LocalDateTime?, Long?, LocalDateTime?, String?, String?, String?> = super.valuesRow() as Row17<String?, String?, Long?, Long?, Long?, Double?, Long?, Long?, Long?, Double?, LocalDateTime?, LocalDateTime?, Long?, LocalDateTime?, String?, String?, String?>
    override fun field1(): Field<String?> = InnodbMetrics.INNODB_METRICS.NAME
    override fun field2(): Field<String?> = InnodbMetrics.INNODB_METRICS.SUBSYSTEM
    override fun field3(): Field<Long?> = InnodbMetrics.INNODB_METRICS.COUNT
    override fun field4(): Field<Long?> = InnodbMetrics.INNODB_METRICS.MAX_COUNT
    override fun field5(): Field<Long?> = InnodbMetrics.INNODB_METRICS.MIN_COUNT
    override fun field6(): Field<Double?> = InnodbMetrics.INNODB_METRICS.AVG_COUNT
    override fun field7(): Field<Long?> = InnodbMetrics.INNODB_METRICS.COUNT_RESET
    override fun field8(): Field<Long?> = InnodbMetrics.INNODB_METRICS.MAX_COUNT_RESET
    override fun field9(): Field<Long?> = InnodbMetrics.INNODB_METRICS.MIN_COUNT_RESET
    override fun field10(): Field<Double?> = InnodbMetrics.INNODB_METRICS.AVG_COUNT_RESET
    override fun field11(): Field<LocalDateTime?> = InnodbMetrics.INNODB_METRICS.TIME_ENABLED
    override fun field12(): Field<LocalDateTime?> = InnodbMetrics.INNODB_METRICS.TIME_DISABLED
    override fun field13(): Field<Long?> = InnodbMetrics.INNODB_METRICS.TIME_ELAPSED
    override fun field14(): Field<LocalDateTime?> = InnodbMetrics.INNODB_METRICS.TIME_RESET
    override fun field15(): Field<String?> = InnodbMetrics.INNODB_METRICS.STATUS
    override fun field16(): Field<String?> = InnodbMetrics.INNODB_METRICS.TYPE
    override fun field17(): Field<String?> = InnodbMetrics.INNODB_METRICS.COMMENT
    override fun component1(): String? = name
    override fun component2(): String? = subsystem
    override fun component3(): Long? = count
    override fun component4(): Long? = maxCount
    override fun component5(): Long? = minCount
    override fun component6(): Double? = avgCount
    override fun component7(): Long? = countReset
    override fun component8(): Long? = maxCountReset
    override fun component9(): Long? = minCountReset
    override fun component10(): Double? = avgCountReset
    override fun component11(): LocalDateTime? = timeEnabled
    override fun component12(): LocalDateTime? = timeDisabled
    override fun component13(): Long? = timeElapsed
    override fun component14(): LocalDateTime? = timeReset
    override fun component15(): String? = status
    override fun component16(): String? = type
    override fun component17(): String? = comment
    override fun value1(): String? = name
    override fun value2(): String? = subsystem
    override fun value3(): Long? = count
    override fun value4(): Long? = maxCount
    override fun value5(): Long? = minCount
    override fun value6(): Double? = avgCount
    override fun value7(): Long? = countReset
    override fun value8(): Long? = maxCountReset
    override fun value9(): Long? = minCountReset
    override fun value10(): Double? = avgCountReset
    override fun value11(): LocalDateTime? = timeEnabled
    override fun value12(): LocalDateTime? = timeDisabled
    override fun value13(): Long? = timeElapsed
    override fun value14(): LocalDateTime? = timeReset
    override fun value15(): String? = status
    override fun value16(): String? = type
    override fun value17(): String? = comment

    override fun value1(value: String?): InnodbMetricsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): InnodbMetricsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: Long?): InnodbMetricsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: Long?): InnodbMetricsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: Long?): InnodbMetricsRecord {
        set(4, value)
        return this
    }

    override fun value6(value: Double?): InnodbMetricsRecord {
        set(5, value)
        return this
    }

    override fun value7(value: Long?): InnodbMetricsRecord {
        set(6, value)
        return this
    }

    override fun value8(value: Long?): InnodbMetricsRecord {
        set(7, value)
        return this
    }

    override fun value9(value: Long?): InnodbMetricsRecord {
        set(8, value)
        return this
    }

    override fun value10(value: Double?): InnodbMetricsRecord {
        set(9, value)
        return this
    }

    override fun value11(value: LocalDateTime?): InnodbMetricsRecord {
        set(10, value)
        return this
    }

    override fun value12(value: LocalDateTime?): InnodbMetricsRecord {
        set(11, value)
        return this
    }

    override fun value13(value: Long?): InnodbMetricsRecord {
        set(12, value)
        return this
    }

    override fun value14(value: LocalDateTime?): InnodbMetricsRecord {
        set(13, value)
        return this
    }

    override fun value15(value: String?): InnodbMetricsRecord {
        set(14, value)
        return this
    }

    override fun value16(value: String?): InnodbMetricsRecord {
        set(15, value)
        return this
    }

    override fun value17(value: String?): InnodbMetricsRecord {
        set(16, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: Long?, value4: Long?, value5: Long?, value6: Double?, value7: Long?, value8: Long?, value9: Long?, value10: Double?, value11: LocalDateTime?, value12: LocalDateTime?, value13: Long?, value14: LocalDateTime?, value15: String?, value16: String?, value17: String?): InnodbMetricsRecord {
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
        this.value16(value16)
        this.value17(value17)
        return this
    }

    /**
     * Create a detached, initialised InnodbMetricsRecord
     */
    constructor(name: String? = null, subsystem: String? = null, count: Long? = null, maxCount: Long? = null, minCount: Long? = null, avgCount: Double? = null, countReset: Long? = null, maxCountReset: Long? = null, minCountReset: Long? = null, avgCountReset: Double? = null, timeEnabled: LocalDateTime? = null, timeDisabled: LocalDateTime? = null, timeElapsed: Long? = null, timeReset: LocalDateTime? = null, status: String? = null, type: String? = null, comment: String? = null): this() {
        this.name = name
        this.subsystem = subsystem
        this.count = count
        this.maxCount = maxCount
        this.minCount = minCount
        this.avgCount = avgCount
        this.countReset = countReset
        this.maxCountReset = maxCountReset
        this.minCountReset = minCountReset
        this.avgCountReset = avgCountReset
        this.timeEnabled = timeEnabled
        this.timeDisabled = timeDisabled
        this.timeElapsed = timeElapsed
        this.timeReset = timeReset
        this.status = status
        this.type = type
        this.comment = comment
        resetChangedOnNotNull()
    }
}
