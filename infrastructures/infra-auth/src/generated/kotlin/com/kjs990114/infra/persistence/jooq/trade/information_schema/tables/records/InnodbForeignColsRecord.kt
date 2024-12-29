/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.InnodbForeignCols

import org.jooq.Field
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.TableRecordImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbForeignColsRecord() : TableRecordImpl<InnodbForeignColsRecord>(InnodbForeignCols.INNODB_FOREIGN_COLS), Record4<String?, String?, String?, UInteger?> {

    open var id: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var forColName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var refColName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var pos: UInteger?
        set(value): Unit = set(3, value)
        get(): UInteger? = get(3) as UInteger?

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<String?, String?, String?, UInteger?> = super.fieldsRow() as Row4<String?, String?, String?, UInteger?>
    override fun valuesRow(): Row4<String?, String?, String?, UInteger?> = super.valuesRow() as Row4<String?, String?, String?, UInteger?>
    override fun field1(): Field<String?> = InnodbForeignCols.INNODB_FOREIGN_COLS.ID
    override fun field2(): Field<String?> = InnodbForeignCols.INNODB_FOREIGN_COLS.FOR_COL_NAME
    override fun field3(): Field<String?> = InnodbForeignCols.INNODB_FOREIGN_COLS.REF_COL_NAME
    override fun field4(): Field<UInteger?> = InnodbForeignCols.INNODB_FOREIGN_COLS.POS
    override fun component1(): String? = id
    override fun component2(): String? = forColName
    override fun component3(): String? = refColName
    override fun component4(): UInteger? = pos
    override fun value1(): String? = id
    override fun value2(): String? = forColName
    override fun value3(): String? = refColName
    override fun value4(): UInteger? = pos

    override fun value1(value: String?): InnodbForeignColsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): InnodbForeignColsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): InnodbForeignColsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: UInteger?): InnodbForeignColsRecord {
        set(3, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: UInteger?): InnodbForeignColsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised InnodbForeignColsRecord
     */
    constructor(id: String? = null, forColName: String? = null, refColName: String? = null, pos: UInteger? = null): this() {
        this.id = id
        this.forColName = forColName
        this.refColName = refColName
        this.pos = pos
        resetChangedOnNotNull()
    }
}