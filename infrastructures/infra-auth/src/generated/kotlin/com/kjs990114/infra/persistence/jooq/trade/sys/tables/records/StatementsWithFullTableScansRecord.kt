/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import com.kjs990114.infra.persistence.jooq.trade.sys.tables.StatementsWithFullTableScans

import java.math.BigInteger
import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record14
import org.jooq.Row14
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StatementsWithFullTableScansRecord() : TableRecordImpl<StatementsWithFullTableScansRecord>(StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS), Record14<String?, String?, ULong?, String?, ULong?, ULong?, BigInteger?, ULong?, ULong?, BigInteger?, BigInteger?, LocalDateTime?, LocalDateTime?, String?> {

    open var query: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var db: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var execCount: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    open var totalLatency: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var noIndexUsedCount: ULong?
        set(value): Unit = set(4, value)
        get(): ULong? = get(4) as ULong?

    open var noGoodIndexUsedCount: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var noIndexUsedPct: BigInteger?
        set(value): Unit = set(6, value)
        get(): BigInteger? = get(6) as BigInteger?

    open var rowsSent: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    open var rowsExamined: ULong?
        set(value): Unit = set(8, value)
        get(): ULong? = get(8) as ULong?

    open var rowsSentAvg: BigInteger?
        set(value): Unit = set(9, value)
        get(): BigInteger? = get(9) as BigInteger?

    open var rowsExaminedAvg: BigInteger?
        set(value): Unit = set(10, value)
        get(): BigInteger? = get(10) as BigInteger?

    open var firstSeen: LocalDateTime?
        set(value): Unit = set(11, value)
        get(): LocalDateTime? = get(11) as LocalDateTime?

    open var lastSeen: LocalDateTime?
        set(value): Unit = set(12, value)
        get(): LocalDateTime? = get(12) as LocalDateTime?

    open var digest: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row14<String?, String?, ULong?, String?, ULong?, ULong?, BigInteger?, ULong?, ULong?, BigInteger?, BigInteger?, LocalDateTime?, LocalDateTime?, String?> = super.fieldsRow() as Row14<String?, String?, ULong?, String?, ULong?, ULong?, BigInteger?, ULong?, ULong?, BigInteger?, BigInteger?, LocalDateTime?, LocalDateTime?, String?>
    override fun valuesRow(): Row14<String?, String?, ULong?, String?, ULong?, ULong?, BigInteger?, ULong?, ULong?, BigInteger?, BigInteger?, LocalDateTime?, LocalDateTime?, String?> = super.valuesRow() as Row14<String?, String?, ULong?, String?, ULong?, ULong?, BigInteger?, ULong?, ULong?, BigInteger?, BigInteger?, LocalDateTime?, LocalDateTime?, String?>
    override fun field1(): Field<String?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.QUERY
    override fun field2(): Field<String?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.DB
    override fun field3(): Field<ULong?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.EXEC_COUNT
    override fun field4(): Field<String?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.TOTAL_LATENCY
    override fun field5(): Field<ULong?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.NO_INDEX_USED_COUNT
    override fun field6(): Field<ULong?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.NO_GOOD_INDEX_USED_COUNT
    override fun field7(): Field<BigInteger?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.NO_INDEX_USED_PCT
    override fun field8(): Field<ULong?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.ROWS_SENT
    override fun field9(): Field<ULong?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.ROWS_EXAMINED
    override fun field10(): Field<BigInteger?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.ROWS_SENT_AVG
    override fun field11(): Field<BigInteger?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.ROWS_EXAMINED_AVG
    override fun field12(): Field<LocalDateTime?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.FIRST_SEEN
    override fun field13(): Field<LocalDateTime?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.LAST_SEEN
    override fun field14(): Field<String?> = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS.DIGEST
    override fun component1(): String? = query
    override fun component2(): String? = db
    override fun component3(): ULong? = execCount
    override fun component4(): String? = totalLatency
    override fun component5(): ULong? = noIndexUsedCount
    override fun component6(): ULong? = noGoodIndexUsedCount
    override fun component7(): BigInteger? = noIndexUsedPct
    override fun component8(): ULong? = rowsSent
    override fun component9(): ULong? = rowsExamined
    override fun component10(): BigInteger? = rowsSentAvg
    override fun component11(): BigInteger? = rowsExaminedAvg
    override fun component12(): LocalDateTime? = firstSeen
    override fun component13(): LocalDateTime? = lastSeen
    override fun component14(): String? = digest
    override fun value1(): String? = query
    override fun value2(): String? = db
    override fun value3(): ULong? = execCount
    override fun value4(): String? = totalLatency
    override fun value5(): ULong? = noIndexUsedCount
    override fun value6(): ULong? = noGoodIndexUsedCount
    override fun value7(): BigInteger? = noIndexUsedPct
    override fun value8(): ULong? = rowsSent
    override fun value9(): ULong? = rowsExamined
    override fun value10(): BigInteger? = rowsSentAvg
    override fun value11(): BigInteger? = rowsExaminedAvg
    override fun value12(): LocalDateTime? = firstSeen
    override fun value13(): LocalDateTime? = lastSeen
    override fun value14(): String? = digest

    override fun value1(value: String?): StatementsWithFullTableScansRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): StatementsWithFullTableScansRecord {
        set(1, value)
        return this
    }

    override fun value3(value: ULong?): StatementsWithFullTableScansRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): StatementsWithFullTableScansRecord {
        set(3, value)
        return this
    }

    override fun value5(value: ULong?): StatementsWithFullTableScansRecord {
        set(4, value)
        return this
    }

    override fun value6(value: ULong?): StatementsWithFullTableScansRecord {
        set(5, value)
        return this
    }

    override fun value7(value: BigInteger?): StatementsWithFullTableScansRecord {
        set(6, value)
        return this
    }

    override fun value8(value: ULong?): StatementsWithFullTableScansRecord {
        set(7, value)
        return this
    }

    override fun value9(value: ULong?): StatementsWithFullTableScansRecord {
        set(8, value)
        return this
    }

    override fun value10(value: BigInteger?): StatementsWithFullTableScansRecord {
        set(9, value)
        return this
    }

    override fun value11(value: BigInteger?): StatementsWithFullTableScansRecord {
        set(10, value)
        return this
    }

    override fun value12(value: LocalDateTime?): StatementsWithFullTableScansRecord {
        set(11, value)
        return this
    }

    override fun value13(value: LocalDateTime?): StatementsWithFullTableScansRecord {
        set(12, value)
        return this
    }

    override fun value14(value: String?): StatementsWithFullTableScansRecord {
        set(13, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: ULong?, value4: String?, value5: ULong?, value6: ULong?, value7: BigInteger?, value8: ULong?, value9: ULong?, value10: BigInteger?, value11: BigInteger?, value12: LocalDateTime?, value13: LocalDateTime?, value14: String?): StatementsWithFullTableScansRecord {
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
        return this
    }

    /**
     * Create a detached, initialised StatementsWithFullTableScansRecord
     */
    constructor(query: String? = null, db: String? = null, execCount: ULong? = null, totalLatency: String? = null, noIndexUsedCount: ULong? = null, noGoodIndexUsedCount: ULong? = null, noIndexUsedPct: BigInteger? = null, rowsSent: ULong? = null, rowsExamined: ULong? = null, rowsSentAvg: BigInteger? = null, rowsExaminedAvg: BigInteger? = null, firstSeen: LocalDateTime? = null, lastSeen: LocalDateTime? = null, digest: String? = null): this() {
        this.query = query
        this.db = db
        this.execCount = execCount
        this.totalLatency = totalLatency
        this.noIndexUsedCount = noIndexUsedCount
        this.noGoodIndexUsedCount = noGoodIndexUsedCount
        this.noIndexUsedPct = noIndexUsedPct
        this.rowsSent = rowsSent
        this.rowsExamined = rowsExamined
        this.rowsSentAvg = rowsSentAvg
        this.rowsExaminedAvg = rowsExaminedAvg
        this.firstSeen = firstSeen
        this.lastSeen = lastSeen
        this.digest = digest
        resetChangedOnNotNull()
    }
}