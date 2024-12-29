/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records


import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.ServerCost

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ServerCostRecord() : UpdatableRecordImpl<ServerCostRecord>(ServerCost.SERVER_COST), Record5<String?, Double?, LocalDateTime?, String?, Double?> {

    open var costName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var costValue: Double?
        set(value): Unit = set(1, value)
        get(): Double? = get(1) as Double?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(2, value)
        get(): LocalDateTime? = get(2) as LocalDateTime?

    open var comment: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var defaultValue: Double?
        set(value): Unit = set(4, value)
        get(): Double? = get(4) as Double?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row5<String?, Double?, LocalDateTime?, String?, Double?> = super.fieldsRow() as Row5<String?, Double?, LocalDateTime?, String?, Double?>
    override fun valuesRow(): Row5<String?, Double?, LocalDateTime?, String?, Double?> = super.valuesRow() as Row5<String?, Double?, LocalDateTime?, String?, Double?>
    override fun field1(): Field<String?> = ServerCost.SERVER_COST.COST_NAME
    override fun field2(): Field<Double?> = ServerCost.SERVER_COST.COST_VALUE
    override fun field3(): Field<LocalDateTime?> = ServerCost.SERVER_COST.LAST_UPDATE
    override fun field4(): Field<String?> = ServerCost.SERVER_COST.COMMENT
    override fun field5(): Field<Double?> = ServerCost.SERVER_COST.DEFAULT_VALUE
    override fun component1(): String? = costName
    override fun component2(): Double? = costValue
    override fun component3(): LocalDateTime? = lastUpdate
    override fun component4(): String? = comment
    override fun component5(): Double? = defaultValue
    override fun value1(): String? = costName
    override fun value2(): Double? = costValue
    override fun value3(): LocalDateTime? = lastUpdate
    override fun value4(): String? = comment
    override fun value5(): Double? = defaultValue

    override fun value1(value: String?): ServerCostRecord {
        set(0, value)
        return this
    }

    override fun value2(value: Double?): ServerCostRecord {
        set(1, value)
        return this
    }

    override fun value3(value: LocalDateTime?): ServerCostRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): ServerCostRecord {
        set(3, value)
        return this
    }

    override fun value5(value: Double?): ServerCostRecord {
        set(4, value)
        return this
    }

    override fun values(value1: String?, value2: Double?, value3: LocalDateTime?, value4: String?, value5: Double?): ServerCostRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        return this
    }

    /**
     * Create a detached, initialised ServerCostRecord
     */
    constructor(costName: String? = null, costValue: Double? = null, lastUpdate: LocalDateTime? = null, comment: String? = null, defaultValue: Double? = null): this() {
        this.costName = costName
        this.costValue = costValue
        this.lastUpdate = lastUpdate
        this.comment = comment
        this.defaultValue = defaultValue
        resetChangedOnNotNull()
    }
}