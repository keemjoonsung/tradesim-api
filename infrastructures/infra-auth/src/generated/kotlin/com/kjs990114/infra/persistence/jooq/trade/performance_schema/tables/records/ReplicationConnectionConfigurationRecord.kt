/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationConnectionConfigurationAutoPosition
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationConnectionConfigurationGetPublicKey
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationConnectionConfigurationGtidOnly
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationConnectionConfigurationSourceConnectionAutoFailover
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationConnectionConfigurationSslAllowed
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.ReplicationConnectionConfigurationSslVerifyServerCertificate
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.ReplicationConnectionConfiguration

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ReplicationConnectionConfigurationRecord() : UpdatableRecordImpl<ReplicationConnectionConfigurationRecord>(ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION) {

    open var channelName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var host: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var port: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var user: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var networkInterface: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var autoPosition: ReplicationConnectionConfigurationAutoPosition?
        set(value): Unit = set(5, value)
        get(): ReplicationConnectionConfigurationAutoPosition? = get(5) as ReplicationConnectionConfigurationAutoPosition?

    open var sslAllowed: ReplicationConnectionConfigurationSslAllowed?
        set(value): Unit = set(6, value)
        get(): ReplicationConnectionConfigurationSslAllowed? = get(6) as ReplicationConnectionConfigurationSslAllowed?

    open var sslCaFile: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var sslCaPath: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var sslCertificate: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var sslCipher: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var sslKey: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var sslVerifyServerCertificate: ReplicationConnectionConfigurationSslVerifyServerCertificate?
        set(value): Unit = set(12, value)
        get(): ReplicationConnectionConfigurationSslVerifyServerCertificate? = get(12) as ReplicationConnectionConfigurationSslVerifyServerCertificate?

    open var sslCrlFile: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var sslCrlPath: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    open var connectionRetryInterval: Int?
        set(value): Unit = set(15, value)
        get(): Int? = get(15) as Int?

    open var connectionRetryCount: ULong?
        set(value): Unit = set(16, value)
        get(): ULong? = get(16) as ULong?

    open var heartbeatInterval: Double?
        set(value): Unit = set(17, value)
        get(): Double? = get(17) as Double?

    open var tlsVersion: String?
        set(value): Unit = set(18, value)
        get(): String? = get(18) as String?

    open var publicKeyPath: String?
        set(value): Unit = set(19, value)
        get(): String? = get(19) as String?

    open var getPublicKey: ReplicationConnectionConfigurationGetPublicKey?
        set(value): Unit = set(20, value)
        get(): ReplicationConnectionConfigurationGetPublicKey? = get(20) as ReplicationConnectionConfigurationGetPublicKey?

    open var networkNamespace: String?
        set(value): Unit = set(21, value)
        get(): String? = get(21) as String?

    open var compressionAlgorithm: String?
        set(value): Unit = set(22, value)
        get(): String? = get(22) as String?

    open var zstdCompressionLevel: Int?
        set(value): Unit = set(23, value)
        get(): Int? = get(23) as Int?

    open var tlsCiphersuites: String?
        set(value): Unit = set(24, value)
        get(): String? = get(24) as String?

    open var sourceConnectionAutoFailover: ReplicationConnectionConfigurationSourceConnectionAutoFailover?
        set(value): Unit = set(25, value)
        get(): ReplicationConnectionConfigurationSourceConnectionAutoFailover? = get(25) as ReplicationConnectionConfigurationSourceConnectionAutoFailover?

    open var gtidOnly: ReplicationConnectionConfigurationGtidOnly?
        set(value): Unit = set(26, value)
        get(): ReplicationConnectionConfigurationGtidOnly? = get(26) as ReplicationConnectionConfigurationGtidOnly?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    /**
     * Create a detached, initialised ReplicationConnectionConfigurationRecord
     */
    constructor(channelName: String? = null, host: String? = null, port: Int? = null, user: String? = null, networkInterface: String? = null, autoPosition: ReplicationConnectionConfigurationAutoPosition? = null, sslAllowed: ReplicationConnectionConfigurationSslAllowed? = null, sslCaFile: String? = null, sslCaPath: String? = null, sslCertificate: String? = null, sslCipher: String? = null, sslKey: String? = null, sslVerifyServerCertificate: ReplicationConnectionConfigurationSslVerifyServerCertificate? = null, sslCrlFile: String? = null, sslCrlPath: String? = null, connectionRetryInterval: Int? = null, connectionRetryCount: ULong? = null, heartbeatInterval: Double? = null, tlsVersion: String? = null, publicKeyPath: String? = null, getPublicKey: ReplicationConnectionConfigurationGetPublicKey? = null, networkNamespace: String? = null, compressionAlgorithm: String? = null, zstdCompressionLevel: Int? = null, tlsCiphersuites: String? = null, sourceConnectionAutoFailover: ReplicationConnectionConfigurationSourceConnectionAutoFailover? = null, gtidOnly: ReplicationConnectionConfigurationGtidOnly? = null): this() {
        this.channelName = channelName
        this.host = host
        this.port = port
        this.user = user
        this.networkInterface = networkInterface
        this.autoPosition = autoPosition
        this.sslAllowed = sslAllowed
        this.sslCaFile = sslCaFile
        this.sslCaPath = sslCaPath
        this.sslCertificate = sslCertificate
        this.sslCipher = sslCipher
        this.sslKey = sslKey
        this.sslVerifyServerCertificate = sslVerifyServerCertificate
        this.sslCrlFile = sslCrlFile
        this.sslCrlPath = sslCrlPath
        this.connectionRetryInterval = connectionRetryInterval
        this.connectionRetryCount = connectionRetryCount
        this.heartbeatInterval = heartbeatInterval
        this.tlsVersion = tlsVersion
        this.publicKeyPath = publicKeyPath
        this.getPublicKey = getPublicKey
        this.networkNamespace = networkNamespace
        this.compressionAlgorithm = compressionAlgorithm
        this.zstdCompressionLevel = zstdCompressionLevel
        this.tlsCiphersuites = tlsCiphersuites
        this.sourceConnectionAutoFailover = sourceConnectionAutoFailover
        this.gtidOnly = gtidOnly
        resetChangedOnNotNull()
    }
}
