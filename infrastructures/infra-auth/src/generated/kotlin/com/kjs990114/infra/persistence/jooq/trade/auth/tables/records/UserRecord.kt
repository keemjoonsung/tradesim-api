/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.auth.tables.records


import com.kjs990114.infra.persistence.jooq.trade.auth.tables.User

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class UserRecord() : UpdatableRecordImpl<UserRecord>(User.USER), Record7<Long?, String?, String?, Boolean?, String?, LocalDateTime?, LocalDateTime?> {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var identifier: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var password: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var withdrawn: Boolean?
        set(value): Unit = set(3, value)
        get(): Boolean? = get(3) as Boolean?

    open var role: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var createdAt: LocalDateTime?
        set(value): Unit = set(5, value)
        get(): LocalDateTime? = get(5) as LocalDateTime?

    open var updateAt: LocalDateTime?
        set(value): Unit = set(6, value)
        get(): LocalDateTime? = get(6) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<Long?, String?, String?, Boolean?, String?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row7<Long?, String?, String?, Boolean?, String?, LocalDateTime?, LocalDateTime?>
    override fun valuesRow(): Row7<Long?, String?, String?, Boolean?, String?, LocalDateTime?, LocalDateTime?> = super.valuesRow() as Row7<Long?, String?, String?, Boolean?, String?, LocalDateTime?, LocalDateTime?>
    override fun field1(): Field<Long?> = User.USER.ID
    override fun field2(): Field<String?> = User.USER.IDENTIFIER
    override fun field3(): Field<String?> = User.USER.PASSWORD
    override fun field4(): Field<Boolean?> = User.USER.WITHDRAWN
    override fun field5(): Field<String?> = User.USER.ROLE
    override fun field6(): Field<LocalDateTime?> = User.USER.CREATED_AT
    override fun field7(): Field<LocalDateTime?> = User.USER.UPDATE_AT
    override fun component1(): Long? = id
    override fun component2(): String? = identifier
    override fun component3(): String? = password
    override fun component4(): Boolean? = withdrawn
    override fun component5(): String? = role
    override fun component6(): LocalDateTime? = createdAt
    override fun component7(): LocalDateTime? = updateAt
    override fun value1(): Long? = id
    override fun value2(): String? = identifier
    override fun value3(): String? = password
    override fun value4(): Boolean? = withdrawn
    override fun value5(): String? = role
    override fun value6(): LocalDateTime? = createdAt
    override fun value7(): LocalDateTime? = updateAt

    override fun value1(value: Long?): UserRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): UserRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): UserRecord {
        set(2, value)
        return this
    }

    override fun value4(value: Boolean?): UserRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): UserRecord {
        set(4, value)
        return this
    }

    override fun value6(value: LocalDateTime?): UserRecord {
        set(5, value)
        return this
    }

    override fun value7(value: LocalDateTime?): UserRecord {
        set(6, value)
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?, value4: Boolean?, value5: String?, value6: LocalDateTime?, value7: LocalDateTime?): UserRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        return this
    }

    /**
     * Create a detached, initialised UserRecord
     */
    constructor(id: Long? = null, identifier: String? = null, password: String? = null, withdrawn: Boolean? = null, role: String? = null, createdAt: LocalDateTime? = null, updateAt: LocalDateTime? = null): this() {
        this.id = id
        this.identifier = identifier
        this.password = password
        this.withdrawn = withdrawn
        this.role = role
        this.createdAt = createdAt
        this.updateAt = updateAt
        resetChangedOnNotNull()
    }
}
