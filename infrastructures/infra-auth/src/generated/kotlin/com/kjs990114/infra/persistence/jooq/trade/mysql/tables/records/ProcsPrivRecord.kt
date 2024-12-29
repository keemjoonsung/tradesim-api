/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records


import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.ProcsPrivRoutineType
import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.ProcsPriv

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record5
import org.jooq.Record8
import org.jooq.Row8
import org.jooq.impl.UpdatableRecordImpl


/**
 * Procedure privileges
 */
@Suppress("UNCHECKED_CAST")
open class ProcsPrivRecord() : UpdatableRecordImpl<ProcsPrivRecord>(ProcsPriv.PROCS_PRIV), Record8<String?, String?, String?, String?, ProcsPrivRoutineType?, String?, String?, LocalDateTime?> {

    open var host: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var db: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var user: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var routineName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var routineType: ProcsPrivRoutineType?
        set(value): Unit = set(4, value)
        get(): ProcsPrivRoutineType? = get(4) as ProcsPrivRoutineType?

    open var grantor: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var procPriv: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var timestamp: LocalDateTime?
        set(value): Unit = set(7, value)
        get(): LocalDateTime? = get(7) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record5<String?, String?, String?, String?, ProcsPrivRoutineType?> = super.key() as Record5<String?, String?, String?, String?, ProcsPrivRoutineType?>

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<String?, String?, String?, String?, ProcsPrivRoutineType?, String?, String?, LocalDateTime?> = super.fieldsRow() as Row8<String?, String?, String?, String?, ProcsPrivRoutineType?, String?, String?, LocalDateTime?>
    override fun valuesRow(): Row8<String?, String?, String?, String?, ProcsPrivRoutineType?, String?, String?, LocalDateTime?> = super.valuesRow() as Row8<String?, String?, String?, String?, ProcsPrivRoutineType?, String?, String?, LocalDateTime?>
    override fun field1(): Field<String?> = ProcsPriv.PROCS_PRIV.HOST
    override fun field2(): Field<String?> = ProcsPriv.PROCS_PRIV.DB
    override fun field3(): Field<String?> = ProcsPriv.PROCS_PRIV.USER
    override fun field4(): Field<String?> = ProcsPriv.PROCS_PRIV.ROUTINE_NAME
    override fun field5(): Field<ProcsPrivRoutineType?> = ProcsPriv.PROCS_PRIV.ROUTINE_TYPE
    override fun field6(): Field<String?> = ProcsPriv.PROCS_PRIV.GRANTOR
    override fun field7(): Field<String?> = ProcsPriv.PROCS_PRIV.PROC_PRIV
    override fun field8(): Field<LocalDateTime?> = ProcsPriv.PROCS_PRIV.TIMESTAMP
    override fun component1(): String? = host
    override fun component2(): String? = db
    override fun component3(): String? = user
    override fun component4(): String? = routineName
    override fun component5(): ProcsPrivRoutineType? = routineType
    override fun component6(): String? = grantor
    override fun component7(): String? = procPriv
    override fun component8(): LocalDateTime? = timestamp
    override fun value1(): String? = host
    override fun value2(): String? = db
    override fun value3(): String? = user
    override fun value4(): String? = routineName
    override fun value5(): ProcsPrivRoutineType? = routineType
    override fun value6(): String? = grantor
    override fun value7(): String? = procPriv
    override fun value8(): LocalDateTime? = timestamp

    override fun value1(value: String?): ProcsPrivRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): ProcsPrivRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): ProcsPrivRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): ProcsPrivRecord {
        set(3, value)
        return this
    }

    override fun value5(value: ProcsPrivRoutineType?): ProcsPrivRecord {
        set(4, value)
        return this
    }

    override fun value6(value: String?): ProcsPrivRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): ProcsPrivRecord {
        set(6, value)
        return this
    }

    override fun value8(value: LocalDateTime?): ProcsPrivRecord {
        set(7, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: ProcsPrivRoutineType?, value6: String?, value7: String?, value8: LocalDateTime?): ProcsPrivRecord {
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
     * Create a detached, initialised ProcsPrivRecord
     */
    constructor(host: String? = null, db: String? = null, user: String? = null, routineName: String? = null, routineType: ProcsPrivRoutineType? = null, grantor: String? = null, procPriv: String? = null, timestamp: LocalDateTime? = null): this() {
        this.host = host
        this.db = db
        this.user = user
        this.routineName = routineName
        this.routineType = routineType
        this.grantor = grantor
        this.procPriv = procPriv
        this.timestamp = timestamp
        resetChangedOnNotNull()
    }
}
