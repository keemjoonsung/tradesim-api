/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.InnodbSessionTempTablespaces

import org.jooq.Field
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.impl.TableRecordImpl
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbSessionTempTablespacesRecord() : TableRecordImpl<InnodbSessionTempTablespacesRecord>(InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES), Record6<UInteger?, UInteger?, String?, ULong?, String?, String?> {

    open var id: UInteger?
        set(value): Unit = set(0, value)
        get(): UInteger? = get(0) as UInteger?

    open var space: UInteger?
        set(value): Unit = set(1, value)
        get(): UInteger? = get(1) as UInteger?

    open var path: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var size: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var state: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var purpose: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<UInteger?, UInteger?, String?, ULong?, String?, String?> = super.fieldsRow() as Row6<UInteger?, UInteger?, String?, ULong?, String?, String?>
    override fun valuesRow(): Row6<UInteger?, UInteger?, String?, ULong?, String?, String?> = super.valuesRow() as Row6<UInteger?, UInteger?, String?, ULong?, String?, String?>
    override fun field1(): Field<UInteger?> = InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES.ID
    override fun field2(): Field<UInteger?> = InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES.SPACE
    override fun field3(): Field<String?> = InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES.PATH
    override fun field4(): Field<ULong?> = InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES.SIZE
    override fun field5(): Field<String?> = InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES.STATE
    override fun field6(): Field<String?> = InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES.PURPOSE
    override fun component1(): UInteger? = id
    override fun component2(): UInteger? = space
    override fun component3(): String? = path
    override fun component4(): ULong? = size
    override fun component5(): String? = state
    override fun component6(): String? = purpose
    override fun value1(): UInteger? = id
    override fun value2(): UInteger? = space
    override fun value3(): String? = path
    override fun value4(): ULong? = size
    override fun value5(): String? = state
    override fun value6(): String? = purpose

    override fun value1(value: UInteger?): InnodbSessionTempTablespacesRecord {
        set(0, value)
        return this
    }

    override fun value2(value: UInteger?): InnodbSessionTempTablespacesRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): InnodbSessionTempTablespacesRecord {
        set(2, value)
        return this
    }

    override fun value4(value: ULong?): InnodbSessionTempTablespacesRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): InnodbSessionTempTablespacesRecord {
        set(4, value)
        return this
    }

    override fun value6(value: String?): InnodbSessionTempTablespacesRecord {
        set(5, value)
        return this
    }

    override fun values(value1: UInteger?, value2: UInteger?, value3: String?, value4: ULong?, value5: String?, value6: String?): InnodbSessionTempTablespacesRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised InnodbSessionTempTablespacesRecord
     */
    constructor(id: UInteger? = null, space: UInteger? = null, path: String? = null, size: ULong? = null, state: String? = null, purpose: String? = null): this() {
        this.id = id
        this.space = space
        this.path = path
        this.size = size
        this.state = state
        this.purpose = purpose
        resetChangedOnNotNull()
    }
}
