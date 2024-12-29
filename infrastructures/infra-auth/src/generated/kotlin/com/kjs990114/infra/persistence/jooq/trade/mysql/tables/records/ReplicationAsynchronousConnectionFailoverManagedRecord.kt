/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records


import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.ReplicationAsynchronousConnectionFailoverManaged

import org.jooq.Field
import org.jooq.JSON
import org.jooq.Record2
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.UpdatableRecordImpl


/**
 * The managed source configuration details
 */
@Suppress("UNCHECKED_CAST")
open class ReplicationAsynchronousConnectionFailoverManagedRecord() : UpdatableRecordImpl<ReplicationAsynchronousConnectionFailoverManagedRecord>(ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED), Record4<String?, String?, String?, JSON?> {

    open var channelName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var managedName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var managedType: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var configuration: JSON?
        set(value): Unit = set(3, value)
        get(): JSON? = get(3) as JSON?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<String?, String?> = super.key() as Record2<String?, String?>

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<String?, String?, String?, JSON?> = super.fieldsRow() as Row4<String?, String?, String?, JSON?>
    override fun valuesRow(): Row4<String?, String?, String?, JSON?> = super.valuesRow() as Row4<String?, String?, String?, JSON?>
    override fun field1(): Field<String?> = ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.CHANNEL_NAME
    override fun field2(): Field<String?> = ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.MANAGED_NAME
    override fun field3(): Field<String?> = ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.MANAGED_TYPE
    override fun field4(): Field<JSON?> = ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.CONFIGURATION
    override fun component1(): String? = channelName
    override fun component2(): String? = managedName
    override fun component3(): String? = managedType
    override fun component4(): JSON? = configuration
    override fun value1(): String? = channelName
    override fun value2(): String? = managedName
    override fun value3(): String? = managedType
    override fun value4(): JSON? = configuration

    override fun value1(value: String?): ReplicationAsynchronousConnectionFailoverManagedRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): ReplicationAsynchronousConnectionFailoverManagedRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): ReplicationAsynchronousConnectionFailoverManagedRecord {
        set(2, value)
        return this
    }

    override fun value4(value: JSON?): ReplicationAsynchronousConnectionFailoverManagedRecord {
        set(3, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: JSON?): ReplicationAsynchronousConnectionFailoverManagedRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised
     * ReplicationAsynchronousConnectionFailoverManagedRecord
     */
    constructor(channelName: String? = null, managedName: String? = null, managedType: String? = null, configuration: JSON? = null): this() {
        this.channelName = channelName
        this.managedName = managedName
        this.managedType = managedType
        this.configuration = configuration
        resetChangedOnNotNull()
    }
}