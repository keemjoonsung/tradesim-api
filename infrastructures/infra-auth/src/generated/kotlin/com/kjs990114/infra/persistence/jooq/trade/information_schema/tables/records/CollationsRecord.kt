/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.enums.CollationsPadAttribute
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.Collations

import org.jooq.Field
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.TableRecordImpl
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CollationsRecord() : TableRecordImpl<CollationsRecord>(Collations.COLLATIONS), Record7<String?, String?, ULong?, String?, String?, UInteger?, CollationsPadAttribute?> {

    open var collationName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var characterSetName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var id: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsDefault")
    open var isDefault: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsCompiled")
    open var isCompiled: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var sortlen: UInteger?
        set(value): Unit = set(5, value)
        get(): UInteger? = get(5) as UInteger?

    open var padAttribute: CollationsPadAttribute?
        set(value): Unit = set(6, value)
        get(): CollationsPadAttribute? = get(6) as CollationsPadAttribute?

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<String?, String?, ULong?, String?, String?, UInteger?, CollationsPadAttribute?> = super.fieldsRow() as Row7<String?, String?, ULong?, String?, String?, UInteger?, CollationsPadAttribute?>
    override fun valuesRow(): Row7<String?, String?, ULong?, String?, String?, UInteger?, CollationsPadAttribute?> = super.valuesRow() as Row7<String?, String?, ULong?, String?, String?, UInteger?, CollationsPadAttribute?>
    override fun field1(): Field<String?> = Collations.COLLATIONS.COLLATION_NAME
    override fun field2(): Field<String?> = Collations.COLLATIONS.CHARACTER_SET_NAME
    override fun field3(): Field<ULong?> = Collations.COLLATIONS.ID
    override fun field4(): Field<String?> = Collations.COLLATIONS.IS_DEFAULT
    override fun field5(): Field<String?> = Collations.COLLATIONS.IS_COMPILED
    override fun field6(): Field<UInteger?> = Collations.COLLATIONS.SORTLEN
    override fun field7(): Field<CollationsPadAttribute?> = Collations.COLLATIONS.PAD_ATTRIBUTE
    override fun component1(): String? = collationName
    override fun component2(): String? = characterSetName
    override fun component3(): ULong? = id
    override fun component4(): String? = isDefault
    override fun component5(): String? = isCompiled
    override fun component6(): UInteger? = sortlen
    override fun component7(): CollationsPadAttribute? = padAttribute
    override fun value1(): String? = collationName
    override fun value2(): String? = characterSetName
    override fun value3(): ULong? = id
    override fun value4(): String? = isDefault
    override fun value5(): String? = isCompiled
    override fun value6(): UInteger? = sortlen
    override fun value7(): CollationsPadAttribute? = padAttribute

    override fun value1(value: String?): CollationsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): CollationsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: ULong?): CollationsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): CollationsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): CollationsRecord {
        set(4, value)
        return this
    }

    override fun value6(value: UInteger?): CollationsRecord {
        set(5, value)
        return this
    }

    override fun value7(value: CollationsPadAttribute?): CollationsRecord {
        set(6, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: ULong?, value4: String?, value5: String?, value6: UInteger?, value7: CollationsPadAttribute?): CollationsRecord {
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
     * Create a detached, initialised CollationsRecord
     */
    constructor(collationName: String? = null, characterSetName: String? = null, id: ULong? = null, isDefault: String? = null, isCompiled: String? = null, sortlen: UInteger? = null, padAttribute: CollationsPadAttribute? = null): this() {
        this.collationName = collationName
        this.characterSetName = characterSetName
        this.id = id
        this.isDefault = isDefault
        this.isCompiled = isCompiled
        this.sortlen = sortlen
        this.padAttribute = padAttribute
        resetChangedOnNotNull()
    }
}
