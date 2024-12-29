/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import org.jooq.Field
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class `X$schemaFlattenedKeysRecord`() : TableRecordImpl<`X$schemaFlattenedKeysRecord`>(com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaFlattenedKeys`.`X$SCHEMA_FLATTENED_KEYS`), Record6<String?, String?, String?, Int?, Long?, String?> {

    open var tableSchema: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var tableName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var indexName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var nonUnique: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var subpartExists: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var indexColumns: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<String?, String?, String?, Int?, Long?, String?> = super.fieldsRow() as Row6<String?, String?, String?, Int?, Long?, String?>
    override fun valuesRow(): Row6<String?, String?, String?, Int?, Long?, String?> = super.valuesRow() as Row6<String?, String?, String?, Int?, Long?, String?>
    override fun field1(): Field<String?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaFlattenedKeys`.`X$SCHEMA_FLATTENED_KEYS`.TABLE_SCHEMA
    override fun field2(): Field<String?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaFlattenedKeys`.`X$SCHEMA_FLATTENED_KEYS`.TABLE_NAME
    override fun field3(): Field<String?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaFlattenedKeys`.`X$SCHEMA_FLATTENED_KEYS`.INDEX_NAME
    override fun field4(): Field<Int?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaFlattenedKeys`.`X$SCHEMA_FLATTENED_KEYS`.NON_UNIQUE
    override fun field5(): Field<Long?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaFlattenedKeys`.`X$SCHEMA_FLATTENED_KEYS`.SUBPART_EXISTS
    override fun field6(): Field<String?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaFlattenedKeys`.`X$SCHEMA_FLATTENED_KEYS`.INDEX_COLUMNS
    override fun component1(): String? = tableSchema
    override fun component2(): String? = tableName
    override fun component3(): String? = indexName
    override fun component4(): Int? = nonUnique
    override fun component5(): Long? = subpartExists
    override fun component6(): String? = indexColumns
    override fun value1(): String? = tableSchema
    override fun value2(): String? = tableName
    override fun value3(): String? = indexName
    override fun value4(): Int? = nonUnique
    override fun value5(): Long? = subpartExists
    override fun value6(): String? = indexColumns

    override fun value1(value: String?): `X$schemaFlattenedKeysRecord` {
        set(0, value)
        return this
    }

    override fun value2(value: String?): `X$schemaFlattenedKeysRecord` {
        set(1, value)
        return this
    }

    override fun value3(value: String?): `X$schemaFlattenedKeysRecord` {
        set(2, value)
        return this
    }

    override fun value4(value: Int?): `X$schemaFlattenedKeysRecord` {
        set(3, value)
        return this
    }

    override fun value5(value: Long?): `X$schemaFlattenedKeysRecord` {
        set(4, value)
        return this
    }

    override fun value6(value: String?): `X$schemaFlattenedKeysRecord` {
        set(5, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: Int?, value5: Long?, value6: String?): `X$schemaFlattenedKeysRecord` {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised `X$schemaFlattenedKeysRecord`
     */
    constructor(tableSchema: String? = null, tableName: String? = null, indexName: String? = null, nonUnique: Int? = null, subpartExists: Long? = null, indexColumns: String? = null): this() {
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.indexName = indexName
        this.nonUnique = nonUnique
        this.subpartExists = subpartExists
        this.indexColumns = indexColumns
        resetChangedOnNotNull()
    }
}