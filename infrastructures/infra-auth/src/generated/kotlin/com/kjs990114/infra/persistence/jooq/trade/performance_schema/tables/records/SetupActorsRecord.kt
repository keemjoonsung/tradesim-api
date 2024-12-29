/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.SetupActorsEnabled
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.SetupActorsHistory
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.SetupActors

import org.jooq.Field
import org.jooq.Record3
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SetupActorsRecord() : UpdatableRecordImpl<SetupActorsRecord>(SetupActors.SETUP_ACTORS), Record5<String?, String?, String?, SetupActorsEnabled?, SetupActorsHistory?> {

    open var host: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var user: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var role: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var enabled: SetupActorsEnabled?
        set(value): Unit = set(3, value)
        get(): SetupActorsEnabled? = get(3) as SetupActorsEnabled?

    open var history: SetupActorsHistory?
        set(value): Unit = set(4, value)
        get(): SetupActorsHistory? = get(4) as SetupActorsHistory?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record3<String?, String?, String?> = super.key() as Record3<String?, String?, String?>

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row5<String?, String?, String?, SetupActorsEnabled?, SetupActorsHistory?> = super.fieldsRow() as Row5<String?, String?, String?, SetupActorsEnabled?, SetupActorsHistory?>
    override fun valuesRow(): Row5<String?, String?, String?, SetupActorsEnabled?, SetupActorsHistory?> = super.valuesRow() as Row5<String?, String?, String?, SetupActorsEnabled?, SetupActorsHistory?>
    override fun field1(): Field<String?> = SetupActors.SETUP_ACTORS.HOST
    override fun field2(): Field<String?> = SetupActors.SETUP_ACTORS.USER
    override fun field3(): Field<String?> = SetupActors.SETUP_ACTORS.ROLE
    override fun field4(): Field<SetupActorsEnabled?> = SetupActors.SETUP_ACTORS.ENABLED
    override fun field5(): Field<SetupActorsHistory?> = SetupActors.SETUP_ACTORS.HISTORY
    override fun component1(): String? = host
    override fun component2(): String? = user
    override fun component3(): String? = role
    override fun component4(): SetupActorsEnabled? = enabled
    override fun component5(): SetupActorsHistory? = history
    override fun value1(): String? = host
    override fun value2(): String? = user
    override fun value3(): String? = role
    override fun value4(): SetupActorsEnabled? = enabled
    override fun value5(): SetupActorsHistory? = history

    override fun value1(value: String?): SetupActorsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): SetupActorsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): SetupActorsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: SetupActorsEnabled?): SetupActorsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: SetupActorsHistory?): SetupActorsRecord {
        set(4, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: SetupActorsEnabled?, value5: SetupActorsHistory?): SetupActorsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        return this
    }

    /**
     * Create a detached, initialised SetupActorsRecord
     */
    constructor(host: String? = null, user: String? = null, role: String? = null, enabled: SetupActorsEnabled? = null, history: SetupActorsHistory? = null): this() {
        this.host = host
        this.user = user
        this.role = role
        this.enabled = enabled
        this.history = history
        resetChangedOnNotNull()
    }
}
