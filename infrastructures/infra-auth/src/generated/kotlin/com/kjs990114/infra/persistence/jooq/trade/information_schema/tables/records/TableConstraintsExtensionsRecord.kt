/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.information_schema.tables.TableConstraintsExtensions

import org.jooq.Field
import org.jooq.JSON
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TableConstraintsExtensionsRecord() : TableRecordImpl<TableConstraintsExtensionsRecord>(TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS), Record6<String?, String?, String?, String?, JSON?, JSON?> {

    open var constraintCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var constraintSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var constraintName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var tableName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var engineAttribute: JSON?
        set(value): Unit = set(4, value)
        get(): JSON? = get(4) as JSON?

    open var secondaryEngineAttribute: JSON?
        set(value): Unit = set(5, value)
        get(): JSON? = get(5) as JSON?

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<String?, String?, String?, String?, JSON?, JSON?> = super.fieldsRow() as Row6<String?, String?, String?, String?, JSON?, JSON?>
    override fun valuesRow(): Row6<String?, String?, String?, String?, JSON?, JSON?> = super.valuesRow() as Row6<String?, String?, String?, String?, JSON?, JSON?>
    override fun field1(): Field<String?> = TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_CATALOG
    override fun field2(): Field<String?> = TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_SCHEMA
    override fun field3(): Field<String?> = TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_NAME
    override fun field4(): Field<String?> = TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.TABLE_NAME
    override fun field5(): Field<JSON?> = TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.ENGINE_ATTRIBUTE
    override fun field6(): Field<JSON?> = TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE
    override fun component1(): String? = constraintCatalog
    override fun component2(): String? = constraintSchema
    override fun component3(): String? = constraintName
    override fun component4(): String? = tableName
    override fun component5(): JSON? = engineAttribute
    override fun component6(): JSON? = secondaryEngineAttribute
    override fun value1(): String? = constraintCatalog
    override fun value2(): String? = constraintSchema
    override fun value3(): String? = constraintName
    override fun value4(): String? = tableName
    override fun value5(): JSON? = engineAttribute
    override fun value6(): JSON? = secondaryEngineAttribute

    override fun value1(value: String?): TableConstraintsExtensionsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): TableConstraintsExtensionsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): TableConstraintsExtensionsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): TableConstraintsExtensionsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: JSON?): TableConstraintsExtensionsRecord {
        set(4, value)
        return this
    }

    override fun value6(value: JSON?): TableConstraintsExtensionsRecord {
        set(5, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: String?, value5: JSON?, value6: JSON?): TableConstraintsExtensionsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised TableConstraintsExtensionsRecord
     */
    constructor(constraintCatalog: String? = null, constraintSchema: String? = null, constraintName: String? = null, tableName: String? = null, engineAttribute: JSON? = null, secondaryEngineAttribute: JSON? = null): this() {
        this.constraintCatalog = constraintCatalog
        this.constraintSchema = constraintSchema
        this.constraintName = constraintName
        this.tableName = tableName
        this.engineAttribute = engineAttribute
        this.secondaryEngineAttribute = secondaryEngineAttribute
        resetChangedOnNotNull()
    }
}
