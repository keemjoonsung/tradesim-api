/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.InnodbCmpPerIndexReset

import org.jooq.Field
import org.jooq.Record8
import org.jooq.Row8
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbCmpPerIndexResetRecord() : TableRecordImpl<InnodbCmpPerIndexResetRecord>(InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET), Record8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?> {

    open var databaseName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var tableName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var indexName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var compressOps: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var compressOpsOk: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var compressTime: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    open var uncompressOps: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    open var uncompressTime: Int?
        set(value): Unit = set(7, value)
        get(): Int? = get(7) as Int?

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?> = super.fieldsRow() as Row8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?>
    override fun valuesRow(): Row8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?> = super.valuesRow() as Row8<String?, String?, String?, Int?, Int?, Int?, Int?, Int?>
    override fun field1(): Field<String?> = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.DATABASE_NAME
    override fun field2(): Field<String?> = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.TABLE_NAME
    override fun field3(): Field<String?> = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.INDEX_NAME
    override fun field4(): Field<Int?> = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.COMPRESS_OPS
    override fun field5(): Field<Int?> = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.COMPRESS_OPS_OK
    override fun field6(): Field<Int?> = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.COMPRESS_TIME
    override fun field7(): Field<Int?> = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.UNCOMPRESS_OPS
    override fun field8(): Field<Int?> = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.UNCOMPRESS_TIME
    override fun component1(): String? = databaseName
    override fun component2(): String? = tableName
    override fun component3(): String? = indexName
    override fun component4(): Int? = compressOps
    override fun component5(): Int? = compressOpsOk
    override fun component6(): Int? = compressTime
    override fun component7(): Int? = uncompressOps
    override fun component8(): Int? = uncompressTime
    override fun value1(): String? = databaseName
    override fun value2(): String? = tableName
    override fun value3(): String? = indexName
    override fun value4(): Int? = compressOps
    override fun value5(): Int? = compressOpsOk
    override fun value6(): Int? = compressTime
    override fun value7(): Int? = uncompressOps
    override fun value8(): Int? = uncompressTime

    override fun value1(value: String?): InnodbCmpPerIndexResetRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): InnodbCmpPerIndexResetRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): InnodbCmpPerIndexResetRecord {
        set(2, value)
        return this
    }

    override fun value4(value: Int?): InnodbCmpPerIndexResetRecord {
        set(3, value)
        return this
    }

    override fun value5(value: Int?): InnodbCmpPerIndexResetRecord {
        set(4, value)
        return this
    }

    override fun value6(value: Int?): InnodbCmpPerIndexResetRecord {
        set(5, value)
        return this
    }

    override fun value7(value: Int?): InnodbCmpPerIndexResetRecord {
        set(6, value)
        return this
    }

    override fun value8(value: Int?): InnodbCmpPerIndexResetRecord {
        set(7, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: Int?, value5: Int?, value6: Int?, value7: Int?, value8: Int?): InnodbCmpPerIndexResetRecord {
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
     * Create a detached, initialised InnodbCmpPerIndexResetRecord
     */
    constructor(databaseName: String? = null, tableName: String? = null, indexName: String? = null, compressOps: Int? = null, compressOpsOk: Int? = null, compressTime: Int? = null, uncompressOps: Int? = null, uncompressTime: Int? = null): this() {
        this.databaseName = databaseName
        this.tableName = tableName
        this.indexName = indexName
        this.compressOps = compressOps
        this.compressOpsOk = compressOpsOk
        this.compressTime = compressTime
        this.uncompressOps = uncompressOps
        this.uncompressTime = uncompressTime
        resetChangedOnNotNull()
    }
}