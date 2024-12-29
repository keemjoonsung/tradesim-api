/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.SetupMetersEnabled
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.SetupMeters

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SetupMetersRecord() : UpdatableRecordImpl<SetupMetersRecord>(SetupMeters.SETUP_METERS), Record4<String?, UInteger?, SetupMetersEnabled?, String?> {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var frequency: UInteger?
        set(value): Unit = set(1, value)
        get(): UInteger? = get(1) as UInteger?

    open var enabled: SetupMetersEnabled?
        set(value): Unit = set(2, value)
        get(): SetupMetersEnabled? = get(2) as SetupMetersEnabled?

    open var description: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<String?, UInteger?, SetupMetersEnabled?, String?> = super.fieldsRow() as Row4<String?, UInteger?, SetupMetersEnabled?, String?>
    override fun valuesRow(): Row4<String?, UInteger?, SetupMetersEnabled?, String?> = super.valuesRow() as Row4<String?, UInteger?, SetupMetersEnabled?, String?>
    override fun field1(): Field<String?> = SetupMeters.SETUP_METERS.NAME
    override fun field2(): Field<UInteger?> = SetupMeters.SETUP_METERS.FREQUENCY
    override fun field3(): Field<SetupMetersEnabled?> = SetupMeters.SETUP_METERS.ENABLED
    override fun field4(): Field<String?> = SetupMeters.SETUP_METERS.DESCRIPTION
    override fun component1(): String? = name
    override fun component2(): UInteger? = frequency
    override fun component3(): SetupMetersEnabled? = enabled
    override fun component4(): String? = description
    override fun value1(): String? = name
    override fun value2(): UInteger? = frequency
    override fun value3(): SetupMetersEnabled? = enabled
    override fun value4(): String? = description

    override fun value1(value: String?): SetupMetersRecord {
        set(0, value)
        return this
    }

    override fun value2(value: UInteger?): SetupMetersRecord {
        set(1, value)
        return this
    }

    override fun value3(value: SetupMetersEnabled?): SetupMetersRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): SetupMetersRecord {
        set(3, value)
        return this
    }

    override fun values(value1: String?, value2: UInteger?, value3: SetupMetersEnabled?, value4: String?): SetupMetersRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised SetupMetersRecord
     */
    constructor(name: String? = null, frequency: UInteger? = null, enabled: SetupMetersEnabled? = null, description: String? = null): this() {
        this.name = name
        this.frequency = frequency
        this.enabled = enabled
        this.description = description
        resetChangedOnNotNull()
    }
}