/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.UserDefinedFunctions

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class UserDefinedFunctionsRecord() : UpdatableRecordImpl<UserDefinedFunctionsRecord>(UserDefinedFunctions.USER_DEFINED_FUNCTIONS), Record5<String?, String?, String?, String?, Long?> {

    open var udfName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var udfReturnType: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var udfType: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var udfLibrary: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var udfUsageCount: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row5<String?, String?, String?, String?, Long?> = super.fieldsRow() as Row5<String?, String?, String?, String?, Long?>
    override fun valuesRow(): Row5<String?, String?, String?, String?, Long?> = super.valuesRow() as Row5<String?, String?, String?, String?, Long?>
    override fun field1(): Field<String?> = UserDefinedFunctions.USER_DEFINED_FUNCTIONS.UDF_NAME
    override fun field2(): Field<String?> = UserDefinedFunctions.USER_DEFINED_FUNCTIONS.UDF_RETURN_TYPE
    override fun field3(): Field<String?> = UserDefinedFunctions.USER_DEFINED_FUNCTIONS.UDF_TYPE
    override fun field4(): Field<String?> = UserDefinedFunctions.USER_DEFINED_FUNCTIONS.UDF_LIBRARY
    override fun field5(): Field<Long?> = UserDefinedFunctions.USER_DEFINED_FUNCTIONS.UDF_USAGE_COUNT
    override fun component1(): String? = udfName
    override fun component2(): String? = udfReturnType
    override fun component3(): String? = udfType
    override fun component4(): String? = udfLibrary
    override fun component5(): Long? = udfUsageCount
    override fun value1(): String? = udfName
    override fun value2(): String? = udfReturnType
    override fun value3(): String? = udfType
    override fun value4(): String? = udfLibrary
    override fun value5(): Long? = udfUsageCount

    override fun value1(value: String?): UserDefinedFunctionsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): UserDefinedFunctionsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): UserDefinedFunctionsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): UserDefinedFunctionsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: Long?): UserDefinedFunctionsRecord {
        set(4, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: Long?): UserDefinedFunctionsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        return this
    }

    /**
     * Create a detached, initialised UserDefinedFunctionsRecord
     */
    constructor(udfName: String? = null, udfReturnType: String? = null, udfType: String? = null, udfLibrary: String? = null, udfUsageCount: Long? = null): this() {
        this.udfName = udfName
        this.udfReturnType = udfReturnType
        this.udfType = udfType
        this.udfLibrary = udfLibrary
        this.udfUsageCount = udfUsageCount
        resetChangedOnNotNull()
    }
}