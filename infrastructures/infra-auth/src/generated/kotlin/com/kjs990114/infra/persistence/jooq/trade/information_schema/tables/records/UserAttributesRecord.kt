/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.UserAttributes

import org.jooq.Field
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class UserAttributesRecord() : TableRecordImpl<UserAttributesRecord>(UserAttributes.USER_ATTRIBUTES), Record3<String?, String?, String?> {

    open var user: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var host: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var attribute: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<String?, String?, String?> = super.fieldsRow() as Row3<String?, String?, String?>
    override fun valuesRow(): Row3<String?, String?, String?> = super.valuesRow() as Row3<String?, String?, String?>
    override fun field1(): Field<String?> = UserAttributes.USER_ATTRIBUTES.USER
    override fun field2(): Field<String?> = UserAttributes.USER_ATTRIBUTES.HOST
    override fun field3(): Field<String?> = UserAttributes.USER_ATTRIBUTES.ATTRIBUTE
    override fun component1(): String? = user
    override fun component2(): String? = host
    override fun component3(): String? = attribute
    override fun value1(): String? = user
    override fun value2(): String? = host
    override fun value3(): String? = attribute

    override fun value1(value: String?): UserAttributesRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): UserAttributesRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): UserAttributesRecord {
        set(2, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?): UserAttributesRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised UserAttributesRecord
     */
    constructor(user: String? = null, host: String? = null, attribute: String? = null): this() {
        this.user = user
        this.host = host
        this.attribute = attribute
        resetChangedOnNotNull()
    }
}
