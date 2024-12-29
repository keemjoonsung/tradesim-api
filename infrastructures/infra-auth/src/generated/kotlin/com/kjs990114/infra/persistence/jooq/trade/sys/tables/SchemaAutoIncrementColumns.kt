/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.records.SchemaAutoIncrementColumnsRecord

import java.math.BigDecimal
import java.util.function.Function

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row10
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.SelectField
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SchemaAutoIncrementColumns(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, SchemaAutoIncrementColumnsRecord>?,
    parentPath: InverseForeignKey<out Record, SchemaAutoIncrementColumnsRecord>?,
    aliased: Table<SchemaAutoIncrementColumnsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<SchemaAutoIncrementColumnsRecord>(
    alias,
    Sys.SYS,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view `schema_auto_increment_columns` as select `information_schema`.`columns`.`TABLE_SCHEMA` AS `TABLE_SCHEMA`,`information_schema`.`columns`.`TABLE_NAME` AS `TABLE_NAME`,`information_schema`.`columns`.`COLUMN_NAME` AS `COLUMN_NAME`,`information_schema`.`columns`.`DATA_TYPE` AS `DATA_TYPE`,`information_schema`.`columns`.`COLUMN_TYPE` AS `COLUMN_TYPE`,(locate('unsigned',`information_schema`.`columns`.`COLUMN_TYPE`) = 0) AS `is_signed`,(locate('unsigned',`information_schema`.`columns`.`COLUMN_TYPE`) > 0) AS `is_unsigned`,((case `information_schema`.`columns`.`DATA_TYPE` when 'tinyint' then 255 when 'smallint' then 65535 when 'mediumint' then 16777215 when 'int' then 4294967295 when 'bigint' then 18446744073709551615 end) >> if((locate('unsigned',`information_schema`.`columns`.`COLUMN_TYPE`) > 0),0,1)) AS `max_value`,`information_schema`.`tables`.`AUTO_INCREMENT` AS `AUTO_INCREMENT`,(`information_schema`.`tables`.`AUTO_INCREMENT` / ((case `information_schema`.`columns`.`DATA_TYPE` when 'tinyint' then 255 when 'smallint' then 65535 when 'mediumint' then 16777215 when 'int' then 4294967295 when 'bigint' then 18446744073709551615 end) >> if((locate('unsigned',`information_schema`.`columns`.`COLUMN_TYPE`) > 0),0,1))) AS `auto_increment_ratio` from (`information_schema`.`COLUMNS` join `information_schema`.`TABLES` on(((`information_schema`.`columns`.`TABLE_SCHEMA` = `information_schema`.`tables`.`TABLE_SCHEMA`) and (`information_schema`.`columns`.`TABLE_NAME` = `information_schema`.`tables`.`TABLE_NAME`)))) where ((`information_schema`.`columns`.`TABLE_SCHEMA` not in ('mysql','sys','INFORMATION_SCHEMA','performance_schema')) and (`information_schema`.`tables`.`TABLE_TYPE` = 'BASE TABLE') and (`information_schema`.`columns`.`EXTRA` = 'auto_increment')) order by (`information_schema`.`tables`.`AUTO_INCREMENT` / ((case `information_schema`.`columns`.`DATA_TYPE` when 'tinyint' then 255 when 'smallint' then 65535 when 'mediumint' then 16777215 when 'int' then 4294967295 when 'bigint' then 18446744073709551615 end) >> if((locate('unsigned',`information_schema`.`columns`.`COLUMN_TYPE`) > 0),0,1))) desc,((case `information_schema`.`columns`.`DATA_TYPE` when 'tinyint' then 255 when 'smallint' then 65535 when 'mediumint' then 16777215 when 'int' then 4294967295 when 'bigint' then 18446744073709551615 end) >> if((locate('unsigned',`information_schema`.`columns`.`COLUMN_TYPE`) > 0),0,1))"),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>sys.schema_auto_increment_columns</code>
         */
        val SCHEMA_AUTO_INCREMENT_COLUMNS: SchemaAutoIncrementColumns = SchemaAutoIncrementColumns()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SchemaAutoIncrementColumnsRecord> = SchemaAutoIncrementColumnsRecord::class.java

    /**
     * The column <code>sys.schema_auto_increment_columns.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<SchemaAutoIncrementColumnsRecord, String?> = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.schema_auto_increment_columns.table_name</code>.
     */
    val TABLE_NAME: TableField<SchemaAutoIncrementColumnsRecord, String?> = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.schema_auto_increment_columns.column_name</code>.
     */
    val COLUMN_NAME: TableField<SchemaAutoIncrementColumnsRecord, String?> = createField(DSL.name("column_name"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.schema_auto_increment_columns.data_type</code>.
     */
    val DATA_TYPE: TableField<SchemaAutoIncrementColumnsRecord, String?> = createField(DSL.name("data_type"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.schema_auto_increment_columns.column_type</code>.
     */
    val COLUMN_TYPE: TableField<SchemaAutoIncrementColumnsRecord, String?> = createField(DSL.name("column_type"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>sys.schema_auto_increment_columns.is_signed</code>.
     */
    val IS_SIGNED: TableField<SchemaAutoIncrementColumnsRecord, Int?> = createField(DSL.name("is_signed"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>sys.schema_auto_increment_columns.is_unsigned</code>.
     */
    val IS_UNSIGNED: TableField<SchemaAutoIncrementColumnsRecord, Int?> = createField(DSL.name("is_unsigned"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>sys.schema_auto_increment_columns.max_value</code>.
     */
    val MAX_VALUE: TableField<SchemaAutoIncrementColumnsRecord, ULong?> = createField(DSL.name("max_value"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.schema_auto_increment_columns.auto_increment</code>.
     */
    val AUTO_INCREMENT: TableField<SchemaAutoIncrementColumnsRecord, ULong?> = createField(DSL.name("auto_increment"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column
     * <code>sys.schema_auto_increment_columns.auto_increment_ratio</code>.
     */
    val AUTO_INCREMENT_RATIO: TableField<SchemaAutoIncrementColumnsRecord, BigDecimal?> = createField(DSL.name("auto_increment_ratio"), SQLDataType.DECIMAL(25, 4), this, "")

    private constructor(alias: Name, aliased: Table<SchemaAutoIncrementColumnsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<SchemaAutoIncrementColumnsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<SchemaAutoIncrementColumnsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sys.schema_auto_increment_columns</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.schema_auto_increment_columns</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.schema_auto_increment_columns</code> table reference
     */
    constructor(): this(DSL.name("schema_auto_increment_columns"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Sys.SYS
    override fun `as`(alias: String): SchemaAutoIncrementColumns = SchemaAutoIncrementColumns(DSL.name(alias), this)
    override fun `as`(alias: Name): SchemaAutoIncrementColumns = SchemaAutoIncrementColumns(alias, this)
    override fun `as`(alias: Table<*>): SchemaAutoIncrementColumns = SchemaAutoIncrementColumns(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SchemaAutoIncrementColumns = SchemaAutoIncrementColumns(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SchemaAutoIncrementColumns = SchemaAutoIncrementColumns(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): SchemaAutoIncrementColumns = SchemaAutoIncrementColumns(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): SchemaAutoIncrementColumns = SchemaAutoIncrementColumns(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): SchemaAutoIncrementColumns = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): SchemaAutoIncrementColumns = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): SchemaAutoIncrementColumns = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): SchemaAutoIncrementColumns = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): SchemaAutoIncrementColumns = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): SchemaAutoIncrementColumns = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): SchemaAutoIncrementColumns = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): SchemaAutoIncrementColumns = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): SchemaAutoIncrementColumns = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<String?, String?, String?, String?, String?, Int?, Int?, ULong?, ULong?, BigDecimal?> = super.fieldsRow() as Row10<String?, String?, String?, String?, String?, Int?, Int?, ULong?, ULong?, BigDecimal?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, String?, String?, Int?, Int?, ULong?, ULong?, BigDecimal?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, String?, String?, Int?, Int?, ULong?, ULong?, BigDecimal?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
