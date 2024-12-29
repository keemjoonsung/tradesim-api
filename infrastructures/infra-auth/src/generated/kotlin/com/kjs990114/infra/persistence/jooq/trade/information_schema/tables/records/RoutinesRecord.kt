/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.enums.RoutinesRoutineType
import com.kjs990114.infra.persistence.jooq.trade.information_schema.enums.RoutinesSecurityType
import com.kjs990114.infra.persistence.jooq.trade.information_schema.enums.RoutinesSqlDataAccess
import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.Routines

import java.time.LocalDateTime

import org.jooq.impl.TableRecordImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class RoutinesRecord() : TableRecordImpl<RoutinesRecord>(Routines.ROUTINES) {

    open var specificName: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var routineCatalog: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var routineSchema: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var routineName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var routineType: RoutinesRoutineType?
        set(value): Unit = set(4, value)
        get(): RoutinesRoutineType? = get(4) as RoutinesRoutineType?

    open var dataType: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var characterMaximumLength: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    open var characterOctetLength: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var numericPrecision: UInteger?
        set(value): Unit = set(8, value)
        get(): UInteger? = get(8) as UInteger?

    open var numericScale: UInteger?
        set(value): Unit = set(9, value)
        get(): UInteger? = get(9) as UInteger?

    open var datetimePrecision: UInteger?
        set(value): Unit = set(10, value)
        get(): UInteger? = get(10) as UInteger?

    open var characterSetName: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var collationName: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var dtdIdentifier: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var routineBody: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    open var routineDefinition: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var externalName: ByteArray?
        set(value): Unit = set(16, value)
        get(): ByteArray? = get(16) as ByteArray?

    open var externalLanguage: String?
        set(value): Unit = set(17, value)
        get(): String? = get(17) as String?

    open var parameterStyle: String?
        set(value): Unit = set(18, value)
        get(): String? = get(18) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsDeterministic")
    open var isDeterministic: String?
        set(value): Unit = set(19, value)
        get(): String? = get(19) as String?

    open var sqlDataAccess: RoutinesSqlDataAccess?
        set(value): Unit = set(20, value)
        get(): RoutinesSqlDataAccess? = get(20) as RoutinesSqlDataAccess?

    open var sqlPath: ByteArray?
        set(value): Unit = set(21, value)
        get(): ByteArray? = get(21) as ByteArray?

    open var securityType: RoutinesSecurityType?
        set(value): Unit = set(22, value)
        get(): RoutinesSecurityType? = get(22) as RoutinesSecurityType?

    open var created: LocalDateTime?
        set(value): Unit = set(23, value)
        get(): LocalDateTime? = get(23) as LocalDateTime?

    open var lastAltered: LocalDateTime?
        set(value): Unit = set(24, value)
        get(): LocalDateTime? = get(24) as LocalDateTime?

    open var sqlMode: String?
        set(value): Unit = set(25, value)
        get(): String? = get(25) as String?

    open var routineComment: String?
        set(value): Unit = set(26, value)
        get(): String? = get(26) as String?

    open var definer: String?
        set(value): Unit = set(27, value)
        get(): String? = get(27) as String?

    open var characterSetClient: String?
        set(value): Unit = set(28, value)
        get(): String? = get(28) as String?

    open var collationConnection: String?
        set(value): Unit = set(29, value)
        get(): String? = get(29) as String?

    open var databaseCollation: String?
        set(value): Unit = set(30, value)
        get(): String? = get(30) as String?

    /**
     * Create a detached, initialised RoutinesRecord
     */
    constructor(specificName: String? = null, routineCatalog: String? = null, routineSchema: String? = null, routineName: String? = null, routineType: RoutinesRoutineType? = null, dataType: String? = null, characterMaximumLength: Long? = null, characterOctetLength: Long? = null, numericPrecision: UInteger? = null, numericScale: UInteger? = null, datetimePrecision: UInteger? = null, characterSetName: String? = null, collationName: String? = null, dtdIdentifier: String? = null, routineBody: String? = null, routineDefinition: String? = null, externalName: ByteArray? = null, externalLanguage: String? = null, parameterStyle: String? = null, isDeterministic: String? = null, sqlDataAccess: RoutinesSqlDataAccess? = null, sqlPath: ByteArray? = null, securityType: RoutinesSecurityType? = null, created: LocalDateTime? = null, lastAltered: LocalDateTime? = null, sqlMode: String? = null, routineComment: String? = null, definer: String? = null, characterSetClient: String? = null, collationConnection: String? = null, databaseCollation: String? = null): this() {
        this.specificName = specificName
        this.routineCatalog = routineCatalog
        this.routineSchema = routineSchema
        this.routineName = routineName
        this.routineType = routineType
        this.dataType = dataType
        this.characterMaximumLength = characterMaximumLength
        this.characterOctetLength = characterOctetLength
        this.numericPrecision = numericPrecision
        this.numericScale = numericScale
        this.datetimePrecision = datetimePrecision
        this.characterSetName = characterSetName
        this.collationName = collationName
        this.dtdIdentifier = dtdIdentifier
        this.routineBody = routineBody
        this.routineDefinition = routineDefinition
        this.externalName = externalName
        this.externalLanguage = externalLanguage
        this.parameterStyle = parameterStyle
        this.isDeterministic = isDeterministic
        this.sqlDataAccess = sqlDataAccess
        this.sqlPath = sqlPath
        this.securityType = securityType
        this.created = created
        this.lastAltered = lastAltered
        this.sqlMode = sqlMode
        this.routineComment = routineComment
        this.definer = definer
        this.characterSetClient = characterSetClient
        this.collationConnection = collationConnection
        this.databaseCollation = databaseCollation
        resetChangedOnNotNull()
    }
}