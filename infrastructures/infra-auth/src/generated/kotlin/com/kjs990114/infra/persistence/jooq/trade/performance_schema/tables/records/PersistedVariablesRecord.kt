/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.PersistedVariables

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PersistedVariablesRecord() : UpdatableRecordImpl<PersistedVariablesRecord>(PersistedVariables.PERSISTED_VARIABLES), Record2<String?, String?> {

    open var variableName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var variableValue: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<String?, String?> = super.fieldsRow() as Row2<String?, String?>
    override fun valuesRow(): Row2<String?, String?> = super.valuesRow() as Row2<String?, String?>
    override fun field1(): Field<String?> = PersistedVariables.PERSISTED_VARIABLES.VARIABLE_NAME
    override fun field2(): Field<String?> = PersistedVariables.PERSISTED_VARIABLES.VARIABLE_VALUE
    override fun component1(): String? = variableName
    override fun component2(): String? = variableValue
    override fun value1(): String? = variableName
    override fun value2(): String? = variableValue

    override fun value1(value: String?): PersistedVariablesRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): PersistedVariablesRecord {
        set(1, value)
        return this
    }

    override fun values(value1: String?, value2: String?): PersistedVariablesRecord {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised PersistedVariablesRecord
     */
    constructor(variableName: String? = null, variableValue: String? = null): this() {
        this.variableName = variableName
        this.variableValue = variableValue
        resetChangedOnNotNull()
    }
}
