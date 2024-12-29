/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.RoleColumnGrants

import org.jooq.Field
import org.jooq.Record10
import org.jooq.Row10
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class RoleColumnGrantsRecord() : TableRecordImpl<RoleColumnGrantsRecord>(RoleColumnGrants.ROLE_COLUMN_GRANTS), Record10<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?> {

    open var grantor: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var grantorHost: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var grantee: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var granteeHost: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var tableCatalog: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var tableSchema: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var tableName: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var columnName: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var privilegeType: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsGrantable")
    open var isGrantable: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?>
    override fun valuesRow(): Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?> = super.valuesRow() as Row10<String?, String?, String?, String?, String?, String?, String?, String?, String?, String?>
    override fun field1(): Field<String?> = RoleColumnGrants.ROLE_COLUMN_GRANTS.GRANTOR
    override fun field2(): Field<String?> = RoleColumnGrants.ROLE_COLUMN_GRANTS.GRANTOR_HOST
    override fun field3(): Field<String?> = RoleColumnGrants.ROLE_COLUMN_GRANTS.GRANTEE
    override fun field4(): Field<String?> = RoleColumnGrants.ROLE_COLUMN_GRANTS.GRANTEE_HOST
    override fun field5(): Field<String?> = RoleColumnGrants.ROLE_COLUMN_GRANTS.TABLE_CATALOG
    override fun field6(): Field<String?> = RoleColumnGrants.ROLE_COLUMN_GRANTS.TABLE_SCHEMA
    override fun field7(): Field<String?> = RoleColumnGrants.ROLE_COLUMN_GRANTS.TABLE_NAME
    override fun field8(): Field<String?> = RoleColumnGrants.ROLE_COLUMN_GRANTS.COLUMN_NAME
    override fun field9(): Field<String?> = RoleColumnGrants.ROLE_COLUMN_GRANTS.PRIVILEGE_TYPE
    override fun field10(): Field<String?> = RoleColumnGrants.ROLE_COLUMN_GRANTS.IS_GRANTABLE
    override fun component1(): String? = grantor
    override fun component2(): String? = grantorHost
    override fun component3(): String? = grantee
    override fun component4(): String? = granteeHost
    override fun component5(): String? = tableCatalog
    override fun component6(): String? = tableSchema
    override fun component7(): String? = tableName
    override fun component8(): String? = columnName
    override fun component9(): String? = privilegeType
    override fun component10(): String? = isGrantable
    override fun value1(): String? = grantor
    override fun value2(): String? = grantorHost
    override fun value3(): String? = grantee
    override fun value4(): String? = granteeHost
    override fun value5(): String? = tableCatalog
    override fun value6(): String? = tableSchema
    override fun value7(): String? = tableName
    override fun value8(): String? = columnName
    override fun value9(): String? = privilegeType
    override fun value10(): String? = isGrantable

    override fun value1(value: String?): RoleColumnGrantsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): RoleColumnGrantsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): RoleColumnGrantsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): RoleColumnGrantsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): RoleColumnGrantsRecord {
        set(4, value)
        return this
    }

    override fun value6(value: String?): RoleColumnGrantsRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): RoleColumnGrantsRecord {
        set(6, value)
        return this
    }

    override fun value8(value: String?): RoleColumnGrantsRecord {
        set(7, value)
        return this
    }

    override fun value9(value: String?): RoleColumnGrantsRecord {
        set(8, value)
        return this
    }

    override fun value10(value: String?): RoleColumnGrantsRecord {
        set(9, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: String?, value7: String?, value8: String?, value9: String?, value10: String?): RoleColumnGrantsRecord {
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
        return this
    }

    /**
     * Create a detached, initialised RoleColumnGrantsRecord
     */
    constructor(grantor: String? = null, grantorHost: String? = null, grantee: String? = null, granteeHost: String? = null, tableCatalog: String? = null, tableSchema: String? = null, tableName: String? = null, columnName: String? = null, privilegeType: String? = null, isGrantable: String? = null): this() {
        this.grantor = grantor
        this.grantorHost = grantorHost
        this.grantee = grantee
        this.granteeHost = granteeHost
        this.tableCatalog = tableCatalog
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.columnName = columnName
        this.privilegeType = privilegeType
        this.isGrantable = isGrantable
        resetChangedOnNotNull()
    }
}
