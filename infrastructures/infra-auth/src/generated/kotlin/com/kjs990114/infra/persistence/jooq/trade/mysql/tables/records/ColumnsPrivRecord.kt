/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records


import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.ColumnsPriv

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record5
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.UpdatableRecordImpl


/**
 * Column privileges
 */
@Suppress("UNCHECKED_CAST")
open class ColumnsPrivRecord() : UpdatableRecordImpl<ColumnsPrivRecord>(ColumnsPriv.COLUMNS_PRIV), Record7<String?, String?, String?, String?, String?, LocalDateTime?, String?> {

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

    open var columnName: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var timestamp: LocalDateTime?
        set(value): Unit = set(5, value)
        get(): LocalDateTime? = get(5) as LocalDateTime?

    open var columnPriv: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record5<String?, String?, String?, String?, String?> = super.key() as Record5<String?, String?, String?, String?, String?>

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<String?, String?, String?, String?, String?, LocalDateTime?, String?> = super.fieldsRow() as Row7<String?, String?, String?, String?, String?, LocalDateTime?, String?>
    override fun valuesRow(): Row7<String?, String?, String?, String?, String?, LocalDateTime?, String?> = super.valuesRow() as Row7<String?, String?, String?, String?, String?, LocalDateTime?, String?>
    override fun field1(): Field<String?> = ColumnsPriv.COLUMNS_PRIV.HOST
    override fun field2(): Field<String?> = ColumnsPriv.COLUMNS_PRIV.DB
    override fun field3(): Field<String?> = ColumnsPriv.COLUMNS_PRIV.USER
    override fun field4(): Field<String?> = ColumnsPriv.COLUMNS_PRIV.TABLE_NAME
    override fun field5(): Field<String?> = ColumnsPriv.COLUMNS_PRIV.COLUMN_NAME
    override fun field6(): Field<LocalDateTime?> = ColumnsPriv.COLUMNS_PRIV.TIMESTAMP
    override fun field7(): Field<String?> = ColumnsPriv.COLUMNS_PRIV.COLUMN_PRIV
    override fun component1(): String? = host
    override fun component2(): String? = db
    override fun component3(): String? = user
    override fun component4(): String? = tableName
    override fun component5(): String? = columnName
    override fun component6(): LocalDateTime? = timestamp
    override fun component7(): String? = columnPriv
    override fun value1(): String? = host
    override fun value2(): String? = db
    override fun value3(): String? = user
    override fun value4(): String? = tableName
    override fun value5(): String? = columnName
    override fun value6(): LocalDateTime? = timestamp
    override fun value7(): String? = columnPriv

    override fun value1(value: String?): ColumnsPrivRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): ColumnsPrivRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): ColumnsPrivRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): ColumnsPrivRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): ColumnsPrivRecord {
        set(4, value)
        return this
    }

    override fun value6(value: LocalDateTime?): ColumnsPrivRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): ColumnsPrivRecord {
        set(6, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: LocalDateTime?, value7: String?): ColumnsPrivRecord {
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
     * Create a detached, initialised ColumnsPrivRecord
     */
    constructor(host: String? = null, db: String? = null, user: String? = null, tableName: String? = null, columnName: String? = null, timestamp: LocalDateTime? = null, columnPriv: String? = null): this() {
        this.host = host
        this.db = db
        this.user = user
        this.tableName = tableName
        this.columnName = columnName
        this.timestamp = timestamp
        this.columnPriv = columnPriv
        resetChangedOnNotNull()
    }
}
