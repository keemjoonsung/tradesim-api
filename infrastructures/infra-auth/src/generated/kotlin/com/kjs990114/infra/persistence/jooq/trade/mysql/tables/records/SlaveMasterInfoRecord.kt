/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records


import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.SlaveMasterInfo

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * Master Information
 */
@Suppress("UNCHECKED_CAST")
open class SlaveMasterInfoRecord() : UpdatableRecordImpl<SlaveMasterInfoRecord>(SlaveMasterInfo.SLAVE_MASTER_INFO) {

    open var numberOfLines: UInteger?
        set(value): Unit = set(0, value)
        get(): UInteger? = get(0) as UInteger?

    open var masterLogName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var masterLogPos: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    open var host: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var userName: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var userPassword: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var port: UInteger?
        set(value): Unit = set(6, value)
        get(): UInteger? = get(6) as UInteger?

    open var connectRetry: UInteger?
        set(value): Unit = set(7, value)
        get(): UInteger? = get(7) as UInteger?

    open var enabledSsl: Boolean?
        set(value): Unit = set(8, value)
        get(): Boolean? = get(8) as Boolean?

    open var sslCa: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var sslCapath: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var sslCert: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var sslCipher: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var sslKey: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var sslVerifyServerCert: Boolean?
        set(value): Unit = set(14, value)
        get(): Boolean? = get(14) as Boolean?

    open var heartbeat: Double?
        set(value): Unit = set(15, value)
        get(): Double? = get(15) as Double?

    open var bind: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    open var ignoredServerIds: String?
        set(value): Unit = set(17, value)
        get(): String? = get(17) as String?

    open var uuid: String?
        set(value): Unit = set(18, value)
        get(): String? = get(18) as String?

    open var retryCount: ULong?
        set(value): Unit = set(19, value)
        get(): ULong? = get(19) as ULong?

    open var sslCrl: String?
        set(value): Unit = set(20, value)
        get(): String? = get(20) as String?

    open var sslCrlpath: String?
        set(value): Unit = set(21, value)
        get(): String? = get(21) as String?

    open var enabledAutoPosition: Boolean?
        set(value): Unit = set(22, value)
        get(): Boolean? = get(22) as Boolean?

    open var channelName: String?
        set(value): Unit = set(23, value)
        get(): String? = get(23) as String?

    open var tlsVersion: String?
        set(value): Unit = set(24, value)
        get(): String? = get(24) as String?

    open var publicKeyPath: String?
        set(value): Unit = set(25, value)
        get(): String? = get(25) as String?

    open var getPublicKey: Boolean?
        set(value): Unit = set(26, value)
        get(): Boolean? = get(26) as Boolean?

    open var networkNamespace: String?
        set(value): Unit = set(27, value)
        get(): String? = get(27) as String?

    open var masterCompressionAlgorithm: String?
        set(value): Unit = set(28, value)
        get(): String? = get(28) as String?

    open var masterZstdCompressionLevel: UInteger?
        set(value): Unit = set(29, value)
        get(): UInteger? = get(29) as UInteger?

    open var tlsCiphersuites: String?
        set(value): Unit = set(30, value)
        get(): String? = get(30) as String?

    open var sourceConnectionAutoFailover: Boolean?
        set(value): Unit = set(31, value)
        get(): Boolean? = get(31) as Boolean?

    open var gtidOnly: Boolean?
        set(value): Unit = set(32, value)
        get(): Boolean? = get(32) as Boolean?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    /**
     * Create a detached, initialised SlaveMasterInfoRecord
     */
    constructor(numberOfLines: UInteger? = null, masterLogName: String? = null, masterLogPos: ULong? = null, host: String? = null, userName: String? = null, userPassword: String? = null, port: UInteger? = null, connectRetry: UInteger? = null, enabledSsl: Boolean? = null, sslCa: String? = null, sslCapath: String? = null, sslCert: String? = null, sslCipher: String? = null, sslKey: String? = null, sslVerifyServerCert: Boolean? = null, heartbeat: Double? = null, bind: String? = null, ignoredServerIds: String? = null, uuid: String? = null, retryCount: ULong? = null, sslCrl: String? = null, sslCrlpath: String? = null, enabledAutoPosition: Boolean? = null, channelName: String? = null, tlsVersion: String? = null, publicKeyPath: String? = null, getPublicKey: Boolean? = null, networkNamespace: String? = null, masterCompressionAlgorithm: String? = null, masterZstdCompressionLevel: UInteger? = null, tlsCiphersuites: String? = null, sourceConnectionAutoFailover: Boolean? = null, gtidOnly: Boolean? = null): this() {
        this.numberOfLines = numberOfLines
        this.masterLogName = masterLogName
        this.masterLogPos = masterLogPos
        this.host = host
        this.userName = userName
        this.userPassword = userPassword
        this.port = port
        this.connectRetry = connectRetry
        this.enabledSsl = enabledSsl
        this.sslCa = sslCa
        this.sslCapath = sslCapath
        this.sslCert = sslCert
        this.sslCipher = sslCipher
        this.sslKey = sslKey
        this.sslVerifyServerCert = sslVerifyServerCert
        this.heartbeat = heartbeat
        this.bind = bind
        this.ignoredServerIds = ignoredServerIds
        this.uuid = uuid
        this.retryCount = retryCount
        this.sslCrl = sslCrl
        this.sslCrlpath = sslCrlpath
        this.enabledAutoPosition = enabledAutoPosition
        this.channelName = channelName
        this.tlsVersion = tlsVersion
        this.publicKeyPath = publicKeyPath
        this.getPublicKey = getPublicKey
        this.networkNamespace = networkNamespace
        this.masterCompressionAlgorithm = masterCompressionAlgorithm
        this.masterZstdCompressionLevel = masterZstdCompressionLevel
        this.tlsCiphersuites = tlsCiphersuites
        this.sourceConnectionAutoFailover = sourceConnectionAutoFailover
        this.gtidOnly = gtidOnly
        resetChangedOnNotNull()
    }
}
