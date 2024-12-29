/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records


import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.ProxiesPriv

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record4
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.UpdatableRecordImpl


/**
 * User proxy privileges
 */
@Suppress("UNCHECKED_CAST")
open class ProxiesPrivRecord() : UpdatableRecordImpl<ProxiesPrivRecord>(ProxiesPriv.PROXIES_PRIV), Record7<String?, String?, String?, String?, Boolean?, String?, LocalDateTime?> {

    open var host: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var user: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var proxiedHost: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var proxiedUser: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var withGrant: Boolean?
        set(value): Unit = set(4, value)
        get(): Boolean? = get(4) as Boolean?

    open var grantor: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var timestamp: LocalDateTime?
        set(value): Unit = set(6, value)
        get(): LocalDateTime? = get(6) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record4<String?, String?, String?, String?> = super.key() as Record4<String?, String?, String?, String?>

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<String?, String?, String?, String?, Boolean?, String?, LocalDateTime?> = super.fieldsRow() as Row7<String?, String?, String?, String?, Boolean?, String?, LocalDateTime?>
    override fun valuesRow(): Row7<String?, String?, String?, String?, Boolean?, String?, LocalDateTime?> = super.valuesRow() as Row7<String?, String?, String?, String?, Boolean?, String?, LocalDateTime?>
    override fun field1(): Field<String?> = ProxiesPriv.PROXIES_PRIV.HOST
    override fun field2(): Field<String?> = ProxiesPriv.PROXIES_PRIV.USER
    override fun field3(): Field<String?> = ProxiesPriv.PROXIES_PRIV.PROXIED_HOST
    override fun field4(): Field<String?> = ProxiesPriv.PROXIES_PRIV.PROXIED_USER
    override fun field5(): Field<Boolean?> = ProxiesPriv.PROXIES_PRIV.WITH_GRANT
    override fun field6(): Field<String?> = ProxiesPriv.PROXIES_PRIV.GRANTOR
    override fun field7(): Field<LocalDateTime?> = ProxiesPriv.PROXIES_PRIV.TIMESTAMP
    override fun component1(): String? = host
    override fun component2(): String? = user
    override fun component3(): String? = proxiedHost
    override fun component4(): String? = proxiedUser
    override fun component5(): Boolean? = withGrant
    override fun component6(): String? = grantor
    override fun component7(): LocalDateTime? = timestamp
    override fun value1(): String? = host
    override fun value2(): String? = user
    override fun value3(): String? = proxiedHost
    override fun value4(): String? = proxiedUser
    override fun value5(): Boolean? = withGrant
    override fun value6(): String? = grantor
    override fun value7(): LocalDateTime? = timestamp

    override fun value1(value: String?): ProxiesPrivRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): ProxiesPrivRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): ProxiesPrivRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): ProxiesPrivRecord {
        set(3, value)
        return this
    }

    override fun value5(value: Boolean?): ProxiesPrivRecord {
        set(4, value)
        return this
    }

    override fun value6(value: String?): ProxiesPrivRecord {
        set(5, value)
        return this
    }

    override fun value7(value: LocalDateTime?): ProxiesPrivRecord {
        set(6, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: Boolean?, value6: String?, value7: LocalDateTime?): ProxiesPrivRecord {
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
     * Create a detached, initialised ProxiesPrivRecord
     */
    constructor(host: String? = null, user: String? = null, proxiedHost: String? = null, proxiedUser: String? = null, withGrant: Boolean? = null, grantor: String? = null, timestamp: LocalDateTime? = null): this() {
        this.host = host
        this.user = user
        this.proxiedHost = proxiedHost
        this.proxiedUser = proxiedUser
        this.withGrant = withGrant
        this.grantor = grantor
        this.timestamp = timestamp
        resetChangedOnNotNull()
    }
}
