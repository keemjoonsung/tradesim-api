/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.InnodbFields

import org.jooq.Field
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbFieldsRecord() : TableRecordImpl<InnodbFieldsRecord>(InnodbFields.INNODB_FIELDS), Record3<ByteArray?, String?, ULong?> {

    open var indexId: ByteArray?
        set(value): Unit = set(0, value)
        get(): ByteArray? = get(0) as ByteArray?

    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var pos: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<ByteArray?, String?, ULong?> = super.fieldsRow() as Row3<ByteArray?, String?, ULong?>
    override fun valuesRow(): Row3<ByteArray?, String?, ULong?> = super.valuesRow() as Row3<ByteArray?, String?, ULong?>
    override fun field1(): Field<ByteArray?> = InnodbFields.INNODB_FIELDS.INDEX_ID
    override fun field2(): Field<String?> = InnodbFields.INNODB_FIELDS.NAME
    override fun field3(): Field<ULong?> = InnodbFields.INNODB_FIELDS.POS
    override fun component1(): ByteArray? = indexId
    override fun component2(): String? = name
    override fun component3(): ULong? = pos
    override fun value1(): ByteArray? = indexId
    override fun value2(): String? = name
    override fun value3(): ULong? = pos

    override fun value1(value: ByteArray?): InnodbFieldsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): InnodbFieldsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: ULong?): InnodbFieldsRecord {
        set(2, value)
        return this
    }

    override fun values(value1: ByteArray?, value2: String?, value3: ULong?): InnodbFieldsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised InnodbFieldsRecord
     */
    constructor(indexId: ByteArray? = null, name: String? = null, pos: ULong? = null): this() {
        this.indexId = indexId
        this.name = name
        this.pos = pos
        resetChangedOnNotNull()
    }
}