/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.Processlist

import org.jooq.Field
import org.jooq.Record8
import org.jooq.Row8
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ProcesslistRecord() : TableRecordImpl<ProcesslistRecord>(Processlist.PROCESSLIST), Record8<ULong?, String?, String?, String?, String?, Int?, String?, String?> {

    open var id: ULong?
        set(value): Unit = set(0, value)
        get(): ULong? = get(0) as ULong?

    open var user: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var host: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var db: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var command: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var time: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    open var state: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var info: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<ULong?, String?, String?, String?, String?, Int?, String?, String?> = super.fieldsRow() as Row8<ULong?, String?, String?, String?, String?, Int?, String?, String?>
    override fun valuesRow(): Row8<ULong?, String?, String?, String?, String?, Int?, String?, String?> = super.valuesRow() as Row8<ULong?, String?, String?, String?, String?, Int?, String?, String?>
    override fun field1(): Field<ULong?> = Processlist.PROCESSLIST.ID
    override fun field2(): Field<String?> = Processlist.PROCESSLIST.USER
    override fun field3(): Field<String?> = Processlist.PROCESSLIST.HOST
    override fun field4(): Field<String?> = Processlist.PROCESSLIST.DB
    override fun field5(): Field<String?> = Processlist.PROCESSLIST.COMMAND
    override fun field6(): Field<Int?> = Processlist.PROCESSLIST.TIME
    override fun field7(): Field<String?> = Processlist.PROCESSLIST.STATE
    override fun field8(): Field<String?> = Processlist.PROCESSLIST.INFO
    override fun component1(): ULong? = id
    override fun component2(): String? = user
    override fun component3(): String? = host
    override fun component4(): String? = db
    override fun component5(): String? = command
    override fun component6(): Int? = time
    override fun component7(): String? = state
    override fun component8(): String? = info
    override fun value1(): ULong? = id
    override fun value2(): String? = user
    override fun value3(): String? = host
    override fun value4(): String? = db
    override fun value5(): String? = command
    override fun value6(): Int? = time
    override fun value7(): String? = state
    override fun value8(): String? = info

    override fun value1(value: ULong?): ProcesslistRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): ProcesslistRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): ProcesslistRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): ProcesslistRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): ProcesslistRecord {
        set(4, value)
        return this
    }

    override fun value6(value: Int?): ProcesslistRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): ProcesslistRecord {
        set(6, value)
        return this
    }

    override fun value8(value: String?): ProcesslistRecord {
        set(7, value)
        return this
    }

    override fun values(value1: ULong?, value2: String?, value3: String?, value4: String?, value5: String?, value6: Int?, value7: String?, value8: String?): ProcesslistRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        return this
    }

    /**
     * Create a detached, initialised ProcesslistRecord
     */
    constructor(id: ULong? = null, user: String? = null, host: String? = null, db: String? = null, command: String? = null, time: Int? = null, state: String? = null, info: String? = null): this() {
        this.id = id
        this.user = user
        this.host = host
        this.db = db
        this.command = command
        this.time = time
        this.state = state
        this.info = info
        resetChangedOnNotNull()
    }
}
