/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.AdministrableRoleAuthorizations

import org.jooq.Field
import org.jooq.Record9
import org.jooq.Row9
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class AdministrableRoleAuthorizationsRecord() : TableRecordImpl<AdministrableRoleAuthorizationsRecord>(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS), Record9<String?, String?, String?, String?, String?, String?, String?, String?, String?> {

    open var user: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var host: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var grantee: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var granteeHost: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var roleName: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var roleHost: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsGrantable")
    open var isGrantable: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsDefault")
    open var isDefault: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsMandatory")
    open var isMandatory: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row9<String?, String?, String?, String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row9<String?, String?, String?, String?, String?, String?, String?, String?, String?>
    override fun valuesRow(): Row9<String?, String?, String?, String?, String?, String?, String?, String?, String?> = super.valuesRow() as Row9<String?, String?, String?, String?, String?, String?, String?, String?, String?>
    override fun field1(): Field<String?> = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.USER
    override fun field2(): Field<String?> = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.HOST
    override fun field3(): Field<String?> = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE
    override fun field4(): Field<String?> = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE_HOST
    override fun field5(): Field<String?> = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_NAME
    override fun field6(): Field<String?> = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_HOST
    override fun field7(): Field<String?> = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_GRANTABLE
    override fun field8(): Field<String?> = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_DEFAULT
    override fun field9(): Field<String?> = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_MANDATORY
    override fun component1(): String? = user
    override fun component2(): String? = host
    override fun component3(): String? = grantee
    override fun component4(): String? = granteeHost
    override fun component5(): String? = roleName
    override fun component6(): String? = roleHost
    override fun component7(): String? = isGrantable
    override fun component8(): String? = isDefault
    override fun component9(): String? = isMandatory
    override fun value1(): String? = user
    override fun value2(): String? = host
    override fun value3(): String? = grantee
    override fun value4(): String? = granteeHost
    override fun value5(): String? = roleName
    override fun value6(): String? = roleHost
    override fun value7(): String? = isGrantable
    override fun value8(): String? = isDefault
    override fun value9(): String? = isMandatory

    override fun value1(value: String?): AdministrableRoleAuthorizationsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): AdministrableRoleAuthorizationsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): AdministrableRoleAuthorizationsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): AdministrableRoleAuthorizationsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): AdministrableRoleAuthorizationsRecord {
        set(4, value)
        return this
    }

    override fun value6(value: String?): AdministrableRoleAuthorizationsRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): AdministrableRoleAuthorizationsRecord {
        set(6, value)
        return this
    }

    override fun value8(value: String?): AdministrableRoleAuthorizationsRecord {
        set(7, value)
        return this
    }

    override fun value9(value: String?): AdministrableRoleAuthorizationsRecord {
        set(8, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: String?, value6: String?, value7: String?, value8: String?, value9: String?): AdministrableRoleAuthorizationsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        return this
    }

    /**
     * Create a detached, initialised AdministrableRoleAuthorizationsRecord
     */
    constructor(user: String? = null, host: String? = null, grantee: String? = null, granteeHost: String? = null, roleName: String? = null, roleHost: String? = null, isGrantable: String? = null, isDefault: String? = null, isMandatory: String? = null): this() {
        this.user = user
        this.host = host
        this.grantee = grantee
        this.granteeHost = granteeHost
        this.roleName = roleName
        this.roleHost = roleHost
        this.isGrantable = isGrantable
        this.isDefault = isDefault
        this.isMandatory = isMandatory
        resetChangedOnNotNull()
    }
}
