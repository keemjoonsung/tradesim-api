/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records


import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.ReplicationGroupConfigurationVersion

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.ULong


/**
 * The group configuration version.
 */
@Suppress("UNCHECKED_CAST")
open class ReplicationGroupConfigurationVersionRecord() : UpdatableRecordImpl<ReplicationGroupConfigurationVersionRecord>(ReplicationGroupConfigurationVersion.REPLICATION_GROUP_CONFIGURATION_VERSION), Record2<String?, ULong?> {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var version: ULong?
        set(value): Unit = set(1, value)
        get(): ULong? = get(1) as ULong?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<String?, ULong?> = super.fieldsRow() as Row2<String?, ULong?>
    override fun valuesRow(): Row2<String?, ULong?> = super.valuesRow() as Row2<String?, ULong?>
    override fun field1(): Field<String?> = ReplicationGroupConfigurationVersion.REPLICATION_GROUP_CONFIGURATION_VERSION.NAME
    override fun field2(): Field<ULong?> = ReplicationGroupConfigurationVersion.REPLICATION_GROUP_CONFIGURATION_VERSION.VERSION
    override fun component1(): String? = name
    override fun component2(): ULong? = version
    override fun value1(): String? = name
    override fun value2(): ULong? = version

    override fun value1(value: String?): ReplicationGroupConfigurationVersionRecord {
        set(0, value)
        return this
    }

    override fun value2(value: ULong?): ReplicationGroupConfigurationVersionRecord {
        set(1, value)
        return this
    }

    override fun values(value1: String?, value2: ULong?): ReplicationGroupConfigurationVersionRecord {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised ReplicationGroupConfigurationVersionRecord
     */
    constructor(name: String? = null, version: ULong? = null): this() {
        this.name = name
        this.version = version
        resetChangedOnNotNull()
    }
}