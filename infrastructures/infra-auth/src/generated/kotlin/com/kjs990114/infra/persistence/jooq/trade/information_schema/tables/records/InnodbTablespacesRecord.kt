/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.InnodbTablespaces

import org.jooq.Field
import org.jooq.Record15
import org.jooq.Row15
import org.jooq.impl.TableRecordImpl
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbTablespacesRecord() : TableRecordImpl<InnodbTablespacesRecord>(InnodbTablespaces.INNODB_TABLESPACES), Record15<UInteger?, String?, UInteger?, String?, UInteger?, UInteger?, String?, UInteger?, ULong?, ULong?, ULong?, String?, UInteger?, String?, String?> {

    open var space: UInteger?
        set(value): Unit = set(0, value)
        get(): UInteger? = get(0) as UInteger?

    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var flag: UInteger?
        set(value): Unit = set(2, value)
        get(): UInteger? = get(2) as UInteger?

    open var rowFormat: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var pageSize: UInteger?
        set(value): Unit = set(4, value)
        get(): UInteger? = get(4) as UInteger?

    open var zipPageSize: UInteger?
        set(value): Unit = set(5, value)
        get(): UInteger? = get(5) as UInteger?

    open var spaceType: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var fsBlockSize: UInteger?
        set(value): Unit = set(7, value)
        get(): UInteger? = get(7) as UInteger?

    open var fileSize: ULong?
        set(value): Unit = set(8, value)
        get(): ULong? = get(8) as ULong?

    open var allocatedSize: ULong?
        set(value): Unit = set(9, value)
        get(): ULong? = get(9) as ULong?

    open var autoextendSize: ULong?
        set(value): Unit = set(10, value)
        get(): ULong? = get(10) as ULong?

    open var serverVersion: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var spaceVersion: UInteger?
        set(value): Unit = set(12, value)
        get(): UInteger? = get(12) as UInteger?

    open var encryption: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var state: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row15<UInteger?, String?, UInteger?, String?, UInteger?, UInteger?, String?, UInteger?, ULong?, ULong?, ULong?, String?, UInteger?, String?, String?> = super.fieldsRow() as Row15<UInteger?, String?, UInteger?, String?, UInteger?, UInteger?, String?, UInteger?, ULong?, ULong?, ULong?, String?, UInteger?, String?, String?>
    override fun valuesRow(): Row15<UInteger?, String?, UInteger?, String?, UInteger?, UInteger?, String?, UInteger?, ULong?, ULong?, ULong?, String?, UInteger?, String?, String?> = super.valuesRow() as Row15<UInteger?, String?, UInteger?, String?, UInteger?, UInteger?, String?, UInteger?, ULong?, ULong?, ULong?, String?, UInteger?, String?, String?>
    override fun field1(): Field<UInteger?> = InnodbTablespaces.INNODB_TABLESPACES.SPACE
    override fun field2(): Field<String?> = InnodbTablespaces.INNODB_TABLESPACES.NAME
    override fun field3(): Field<UInteger?> = InnodbTablespaces.INNODB_TABLESPACES.FLAG
    override fun field4(): Field<String?> = InnodbTablespaces.INNODB_TABLESPACES.ROW_FORMAT
    override fun field5(): Field<UInteger?> = InnodbTablespaces.INNODB_TABLESPACES.PAGE_SIZE
    override fun field6(): Field<UInteger?> = InnodbTablespaces.INNODB_TABLESPACES.ZIP_PAGE_SIZE
    override fun field7(): Field<String?> = InnodbTablespaces.INNODB_TABLESPACES.SPACE_TYPE
    override fun field8(): Field<UInteger?> = InnodbTablespaces.INNODB_TABLESPACES.FS_BLOCK_SIZE
    override fun field9(): Field<ULong?> = InnodbTablespaces.INNODB_TABLESPACES.FILE_SIZE
    override fun field10(): Field<ULong?> = InnodbTablespaces.INNODB_TABLESPACES.ALLOCATED_SIZE
    override fun field11(): Field<ULong?> = InnodbTablespaces.INNODB_TABLESPACES.AUTOEXTEND_SIZE
    override fun field12(): Field<String?> = InnodbTablespaces.INNODB_TABLESPACES.SERVER_VERSION
    override fun field13(): Field<UInteger?> = InnodbTablespaces.INNODB_TABLESPACES.SPACE_VERSION
    override fun field14(): Field<String?> = InnodbTablespaces.INNODB_TABLESPACES.ENCRYPTION
    override fun field15(): Field<String?> = InnodbTablespaces.INNODB_TABLESPACES.STATE
    override fun component1(): UInteger? = space
    override fun component2(): String? = name
    override fun component3(): UInteger? = flag
    override fun component4(): String? = rowFormat
    override fun component5(): UInteger? = pageSize
    override fun component6(): UInteger? = zipPageSize
    override fun component7(): String? = spaceType
    override fun component8(): UInteger? = fsBlockSize
    override fun component9(): ULong? = fileSize
    override fun component10(): ULong? = allocatedSize
    override fun component11(): ULong? = autoextendSize
    override fun component12(): String? = serverVersion
    override fun component13(): UInteger? = spaceVersion
    override fun component14(): String? = encryption
    override fun component15(): String? = state
    override fun value1(): UInteger? = space
    override fun value2(): String? = name
    override fun value3(): UInteger? = flag
    override fun value4(): String? = rowFormat
    override fun value5(): UInteger? = pageSize
    override fun value6(): UInteger? = zipPageSize
    override fun value7(): String? = spaceType
    override fun value8(): UInteger? = fsBlockSize
    override fun value9(): ULong? = fileSize
    override fun value10(): ULong? = allocatedSize
    override fun value11(): ULong? = autoextendSize
    override fun value12(): String? = serverVersion
    override fun value13(): UInteger? = spaceVersion
    override fun value14(): String? = encryption
    override fun value15(): String? = state

    override fun value1(value: UInteger?): InnodbTablespacesRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): InnodbTablespacesRecord {
        set(1, value)
        return this
    }

    override fun value3(value: UInteger?): InnodbTablespacesRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): InnodbTablespacesRecord {
        set(3, value)
        return this
    }

    override fun value5(value: UInteger?): InnodbTablespacesRecord {
        set(4, value)
        return this
    }

    override fun value6(value: UInteger?): InnodbTablespacesRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): InnodbTablespacesRecord {
        set(6, value)
        return this
    }

    override fun value8(value: UInteger?): InnodbTablespacesRecord {
        set(7, value)
        return this
    }

    override fun value9(value: ULong?): InnodbTablespacesRecord {
        set(8, value)
        return this
    }

    override fun value10(value: ULong?): InnodbTablespacesRecord {
        set(9, value)
        return this
    }

    override fun value11(value: ULong?): InnodbTablespacesRecord {
        set(10, value)
        return this
    }

    override fun value12(value: String?): InnodbTablespacesRecord {
        set(11, value)
        return this
    }

    override fun value13(value: UInteger?): InnodbTablespacesRecord {
        set(12, value)
        return this
    }

    override fun value14(value: String?): InnodbTablespacesRecord {
        set(13, value)
        return this
    }

    override fun value15(value: String?): InnodbTablespacesRecord {
        set(14, value)
        return this
    }

    override fun values(value1: UInteger?, value2: String?, value3: UInteger?, value4: String?, value5: UInteger?, value6: UInteger?, value7: String?, value8: UInteger?, value9: ULong?, value10: ULong?, value11: ULong?, value12: String?, value13: UInteger?, value14: String?, value15: String?): InnodbTablespacesRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        this.value10(value10)
        this.value11(value11)
        this.value12(value12)
        this.value13(value13)
        this.value14(value14)
        this.value15(value15)
        return this
    }

    /**
     * Create a detached, initialised InnodbTablespacesRecord
     */
    constructor(space: UInteger? = null, name: String? = null, flag: UInteger? = null, rowFormat: String? = null, pageSize: UInteger? = null, zipPageSize: UInteger? = null, spaceType: String? = null, fsBlockSize: UInteger? = null, fileSize: ULong? = null, allocatedSize: ULong? = null, autoextendSize: ULong? = null, serverVersion: String? = null, spaceVersion: UInteger? = null, encryption: String? = null, state: String? = null): this() {
        this.space = space
        this.name = name
        this.flag = flag
        this.rowFormat = rowFormat
        this.pageSize = pageSize
        this.zipPageSize = zipPageSize
        this.spaceType = spaceType
        this.fsBlockSize = fsBlockSize
        this.fileSize = fileSize
        this.allocatedSize = allocatedSize
        this.autoextendSize = autoextendSize
        this.serverVersion = serverVersion
        this.spaceVersion = spaceVersion
        this.encryption = encryption
        this.state = state
        resetChangedOnNotNull()
    }
}