/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaIndexStatistics

import org.jooq.Field
import org.jooq.Record11
import org.jooq.Row11
import org.jooq.impl.TableRecordImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SchemaIndexStatisticsRecord() : TableRecordImpl<SchemaIndexStatisticsRecord>(SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS), Record11<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?> {

    open var tableSchema: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var tableName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var indexName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var rowsSelected: ULong?
        set(value): Unit = set(3, value)
        get(): ULong? = get(3) as ULong?

    open var selectLatency: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var rowsInserted: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var insertLatency: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var rowsUpdated: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    open var updateLatency: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var rowsDeleted: ULong?
        set(value): Unit = set(9, value)
        get(): ULong? = get(9) as ULong?

    open var deleteLatency: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row11<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?> = super.fieldsRow() as Row11<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?>
    override fun valuesRow(): Row11<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?> = super.valuesRow() as Row11<String?, String?, String?, ULong?, String?, ULong?, String?, ULong?, String?, ULong?, String?>
    override fun field1(): Field<String?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.TABLE_SCHEMA
    override fun field2(): Field<String?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.TABLE_NAME
    override fun field3(): Field<String?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.INDEX_NAME
    override fun field4(): Field<ULong?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.ROWS_SELECTED
    override fun field5(): Field<String?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.SELECT_LATENCY
    override fun field6(): Field<ULong?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.ROWS_INSERTED
    override fun field7(): Field<String?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.INSERT_LATENCY
    override fun field8(): Field<ULong?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.ROWS_UPDATED
    override fun field9(): Field<String?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.UPDATE_LATENCY
    override fun field10(): Field<ULong?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.ROWS_DELETED
    override fun field11(): Field<String?> = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.DELETE_LATENCY
    override fun component1(): String? = tableSchema
    override fun component2(): String? = tableName
    override fun component3(): String? = indexName
    override fun component4(): ULong? = rowsSelected
    override fun component5(): String? = selectLatency
    override fun component6(): ULong? = rowsInserted
    override fun component7(): String? = insertLatency
    override fun component8(): ULong? = rowsUpdated
    override fun component9(): String? = updateLatency
    override fun component10(): ULong? = rowsDeleted
    override fun component11(): String? = deleteLatency
    override fun value1(): String? = tableSchema
    override fun value2(): String? = tableName
    override fun value3(): String? = indexName
    override fun value4(): ULong? = rowsSelected
    override fun value5(): String? = selectLatency
    override fun value6(): ULong? = rowsInserted
    override fun value7(): String? = insertLatency
    override fun value8(): ULong? = rowsUpdated
    override fun value9(): String? = updateLatency
    override fun value10(): ULong? = rowsDeleted
    override fun value11(): String? = deleteLatency

    override fun value1(value: String?): SchemaIndexStatisticsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): SchemaIndexStatisticsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): SchemaIndexStatisticsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: ULong?): SchemaIndexStatisticsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): SchemaIndexStatisticsRecord {
        set(4, value)
        return this
    }

    override fun value6(value: ULong?): SchemaIndexStatisticsRecord {
        set(5, value)
        return this
    }

    override fun value7(value: String?): SchemaIndexStatisticsRecord {
        set(6, value)
        return this
    }

    override fun value8(value: ULong?): SchemaIndexStatisticsRecord {
        set(7, value)
        return this
    }

    override fun value9(value: String?): SchemaIndexStatisticsRecord {
        set(8, value)
        return this
    }

    override fun value10(value: ULong?): SchemaIndexStatisticsRecord {
        set(9, value)
        return this
    }

    override fun value11(value: String?): SchemaIndexStatisticsRecord {
        set(10, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: ULong?, value5: String?, value6: ULong?, value7: String?, value8: ULong?, value9: String?, value10: ULong?, value11: String?): SchemaIndexStatisticsRecord {
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
        return this
    }

    /**
     * Create a detached, initialised SchemaIndexStatisticsRecord
     */
    constructor(tableSchema: String? = null, tableName: String? = null, indexName: String? = null, rowsSelected: ULong? = null, selectLatency: String? = null, rowsInserted: ULong? = null, insertLatency: String? = null, rowsUpdated: ULong? = null, updateLatency: String? = null, rowsDeleted: ULong? = null, deleteLatency: String? = null): this() {
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.indexName = indexName
        this.rowsSelected = rowsSelected
        this.selectLatency = selectLatency
        this.rowsInserted = rowsInserted
        this.insertLatency = insertLatency
        this.rowsUpdated = rowsUpdated
        this.updateLatency = updateLatency
        this.rowsDeleted = rowsDeleted
        this.deleteLatency = deleteLatency
        resetChangedOnNotNull()
    }
}
