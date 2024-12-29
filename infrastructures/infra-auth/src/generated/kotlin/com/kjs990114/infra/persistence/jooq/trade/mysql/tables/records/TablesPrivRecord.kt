/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records


import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.TablesPriv

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record4
import org.jooq.Record8
import org.jooq.Row8
import org.jooq.impl.UpdatableRecordImpl


/**
 * Table privileges
 */
@Suppress("UNCHECKED_CAST")
open class TablesPrivRecord() : UpdatableRecordImpl<TablesPrivRecord>(TablesPriv.TABLES_PRIV), Record8<String?, String?, String?, String?, String?, LocalDateTime?, String?, String?> {

    open var host: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var db: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var user: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var tableName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var grantor: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var timestamp: LocalDateTime?
        set(value): Unit = set(5, value)
        get(): LocalDateTime? = get(5) as LocalDateTime?

    open var tablePriv: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var columnPriv: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record4<String?, String?, String?, String?> = super.key() as Record4<String?, String?, String?, String?>

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<String?, String?, String?, String?, String?, LocalDateTime?, String?, String?> = super.fieldsRow() as Row8<String?, String?, String?, String?, String?, LocalDateTime?, String?, String?>
    override fun valuesRow(): Row8<String?, String?, String?, String?, String?, LocalDateTime?, String?, String?> = super.valuesRow() as Row8<String?, String?, String?, String?, String?, LocalDateTime?, String?, String?>
    override fun field1(): Field<String?> = TablesPriv.TABLES_PRIV.HOST
    override fun field2(): Field<String?> = TablesPriv.TABLES_PRIV.DB
    override fun field3(): Field<String?> = TablesPriv.TABLES_PRIV.USER
    override fun field4(): Field<String?> = TablesPriv.TABLES_PRIV.TABLE_NAME
    override fun field5(): Field<String?> = TablesPriv.TABLES_PRIV.GRANTOR
    override fun field6(): Field<LocalDateTime?> = TablesPriv.TABLES_PRIV.TIMESTAMP
    override fun field7(): Field<String?> = TablesPriv.TABLES_PRIV.TABLE_PRIV
    override fun field8(): Field<String?> = TablesPriv.TABLES_PRIV.COLUMN_PRIV
    override fun component1(): String? = host
    override fun component2(): String? = db
    override fun component3(): String? = user
    override fun component4(): String? = tableName
    override fun component5(): String? = grantor
    override fun component6(): LocalDateTime? = timestamp
    override fun component7(): String? = tablePriv
    override fun component8(): String? = columnPriv
    override fun value1(): String? = host
    override fun value2(): String? = db
    override fun value3(): String? = user
    override fun value4(): String? = tableName
    override fun value5(): String? = grantor
    override fun value6(): LocalDateTime? = timestamp
    override fun value7(): String? = tablePriv
    override fun value8(): String? = columnPriv

    override fun value1(value: String?): TablesPrivRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): TablesPrivRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): TablesPrivRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): TablesPrivRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): TablesPrivRecord {
        set(4, value)
        return this
    }

    override fun value6(value: LocalDateTime?): TablesPrivRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): TablesPrivRecord {
        set(6, value)
        return this
    }

    override fun value8(value: String?): TablesPrivRecord {
        set(7, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: LocalDateTime?, value7: String?, value8: String?): TablesPrivRecord {
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
     * Create a detached, initialised TablesPrivRecord
     */
    constructor(host: String? = null, db: String? = null, user: String? = null, tableName: String? = null, grantor: String? = null, timestamp: LocalDateTime? = null, tablePriv: String? = null, columnPriv: String? = null): this() {
        this.host = host
        this.db = db
        this.user = user
        this.tableName = tableName
        this.grantor = grantor
        this.timestamp = timestamp
        this.tablePriv = tablePriv
        this.columnPriv = columnPriv
        resetChangedOnNotNull()
    }
}
