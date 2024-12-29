/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.SetupThreadsEnabled
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.SetupThreadsHistory
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.SetupThreads

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SetupThreadsRecord() : UpdatableRecordImpl<SetupThreadsRecord>(SetupThreads.SETUP_THREADS), Record6<String?, SetupThreadsEnabled?, SetupThreadsHistory?, String?, Int?, String?> {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var enabled: SetupThreadsEnabled?
        set(value): Unit = set(1, value)
        get(): SetupThreadsEnabled? = get(1) as SetupThreadsEnabled?

    open var history: SetupThreadsHistory?
        set(value): Unit = set(2, value)
        get(): SetupThreadsHistory? = get(2) as SetupThreadsHistory?

    open var properties: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var volatility: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var documentation: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<String?, SetupThreadsEnabled?, SetupThreadsHistory?, String?, Int?, String?> = super.fieldsRow() as Row6<String?, SetupThreadsEnabled?, SetupThreadsHistory?, String?, Int?, String?>
    override fun valuesRow(): Row6<String?, SetupThreadsEnabled?, SetupThreadsHistory?, String?, Int?, String?> = super.valuesRow() as Row6<String?, SetupThreadsEnabled?, SetupThreadsHistory?, String?, Int?, String?>
    override fun field1(): Field<String?> = SetupThreads.SETUP_THREADS.NAME
    override fun field2(): Field<SetupThreadsEnabled?> = SetupThreads.SETUP_THREADS.ENABLED
    override fun field3(): Field<SetupThreadsHistory?> = SetupThreads.SETUP_THREADS.HISTORY
    override fun field4(): Field<String?> = SetupThreads.SETUP_THREADS.PROPERTIES
    override fun field5(): Field<Int?> = SetupThreads.SETUP_THREADS.VOLATILITY
    override fun field6(): Field<String?> = SetupThreads.SETUP_THREADS.DOCUMENTATION
    override fun component1(): String? = name
    override fun component2(): SetupThreadsEnabled? = enabled
    override fun component3(): SetupThreadsHistory? = history
    override fun component4(): String? = properties
    override fun component5(): Int? = volatility
    override fun component6(): String? = documentation
    override fun value1(): String? = name
    override fun value2(): SetupThreadsEnabled? = enabled
    override fun value3(): SetupThreadsHistory? = history
    override fun value4(): String? = properties
    override fun value5(): Int? = volatility
    override fun value6(): String? = documentation

    override fun value1(value: String?): SetupThreadsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: SetupThreadsEnabled?): SetupThreadsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: SetupThreadsHistory?): SetupThreadsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): SetupThreadsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: Int?): SetupThreadsRecord {
        set(4, value)
        return this
    }

    override fun value6(value: String?): SetupThreadsRecord {
        set(5, value)
        return this
    }

    override fun values(value1: String?, value2: SetupThreadsEnabled?, value3: SetupThreadsHistory?, value4: String?, value5: Int?, value6: String?): SetupThreadsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised SetupThreadsRecord
     */
    constructor(name: String? = null, enabled: SetupThreadsEnabled? = null, history: SetupThreadsHistory? = null, properties: String? = null, volatility: Int? = null, documentation: String? = null): this() {
        this.name = name
        this.enabled = enabled
        this.history = history
        this.properties = properties
        this.volatility = volatility
        this.documentation = documentation
        resetChangedOnNotNull()
    }
}
