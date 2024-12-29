/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables


import com.kjs990114.infra.persistence.jooq.trade.mysql.Mysql
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbAlterPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbAlterRoutinePriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbCreatePriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbCreateRoutinePriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbCreateTmpTablePriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbCreateViewPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbDeletePriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbDropPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbEventPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbExecutePriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbGrantPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbIndexPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbInsertPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbLockTablesPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbReferencesPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbSelectPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbShowViewPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbTriggerPriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.enums.DbUpdatePriv
import com.kjs990114.infra.persistence.jooq.trade.mysql.indexes.DB_USER
import com.kjs990114.infra.persistence.jooq.trade.mysql.keys.KEY_DB_PRIMARY
import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records.DbRecord

import java.util.function.Function

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row22
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.SelectField
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * Database privileges
 */
@Suppress("UNCHECKED_CAST")
open class Db(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, DbRecord>?,
    parentPath: InverseForeignKey<out Record, DbRecord>?,
    aliased: Table<DbRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<DbRecord>(
    alias,
    Mysql.MYSQL,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment("Database privileges"),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>mysql.db</code>
         */
        val DB: Db = Db()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<DbRecord> = DbRecord::class.java

    /**
     * The column <code>mysql.db.Host</code>.
     */
    val HOST: TableField<DbRecord, String?> = createField(DSL.name("Host"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.db.Db</code>.
     */
    val DB_: TableField<DbRecord, String?> = createField(DSL.name("Db"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.db.User</code>.
     */
    val USER: TableField<DbRecord, String?> = createField(DSL.name("User"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.db.Select_priv</code>.
     */
    val SELECT_PRIV: TableField<DbRecord, DbSelectPriv?> = createField(DSL.name("Select_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbSelectPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Insert_priv</code>.
     */
    val INSERT_PRIV: TableField<DbRecord, DbInsertPriv?> = createField(DSL.name("Insert_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbInsertPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Update_priv</code>.
     */
    val UPDATE_PRIV: TableField<DbRecord, DbUpdatePriv?> = createField(DSL.name("Update_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbUpdatePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Delete_priv</code>.
     */
    val DELETE_PRIV: TableField<DbRecord, DbDeletePriv?> = createField(DSL.name("Delete_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbDeletePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Create_priv</code>.
     */
    val CREATE_PRIV: TableField<DbRecord, DbCreatePriv?> = createField(DSL.name("Create_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbCreatePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Drop_priv</code>.
     */
    val DROP_PRIV: TableField<DbRecord, DbDropPriv?> = createField(DSL.name("Drop_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbDropPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Grant_priv</code>.
     */
    val GRANT_PRIV: TableField<DbRecord, DbGrantPriv?> = createField(DSL.name("Grant_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbGrantPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.References_priv</code>.
     */
    val REFERENCES_PRIV: TableField<DbRecord, DbReferencesPriv?> = createField(DSL.name("References_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbReferencesPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Index_priv</code>.
     */
    val INDEX_PRIV: TableField<DbRecord, DbIndexPriv?> = createField(DSL.name("Index_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbIndexPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Alter_priv</code>.
     */
    val ALTER_PRIV: TableField<DbRecord, DbAlterPriv?> = createField(DSL.name("Alter_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbAlterPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Create_tmp_table_priv</code>.
     */
    val CREATE_TMP_TABLE_PRIV: TableField<DbRecord, DbCreateTmpTablePriv?> = createField(DSL.name("Create_tmp_table_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbCreateTmpTablePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Lock_tables_priv</code>.
     */
    val LOCK_TABLES_PRIV: TableField<DbRecord, DbLockTablesPriv?> = createField(DSL.name("Lock_tables_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbLockTablesPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Create_view_priv</code>.
     */
    val CREATE_VIEW_PRIV: TableField<DbRecord, DbCreateViewPriv?> = createField(DSL.name("Create_view_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbCreateViewPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Show_view_priv</code>.
     */
    val SHOW_VIEW_PRIV: TableField<DbRecord, DbShowViewPriv?> = createField(DSL.name("Show_view_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbShowViewPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Create_routine_priv</code>.
     */
    val CREATE_ROUTINE_PRIV: TableField<DbRecord, DbCreateRoutinePriv?> = createField(DSL.name("Create_routine_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbCreateRoutinePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Alter_routine_priv</code>.
     */
    val ALTER_ROUTINE_PRIV: TableField<DbRecord, DbAlterRoutinePriv?> = createField(DSL.name("Alter_routine_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbAlterRoutinePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Execute_priv</code>.
     */
    val EXECUTE_PRIV: TableField<DbRecord, DbExecutePriv?> = createField(DSL.name("Execute_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbExecutePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Event_priv</code>.
     */
    val EVENT_PRIV: TableField<DbRecord, DbEventPriv?> = createField(DSL.name("Event_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbEventPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Trigger_priv</code>.
     */
    val TRIGGER_PRIV: TableField<DbRecord, DbTriggerPriv?> = createField(DSL.name("Trigger_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(DbTriggerPriv::class.java), this, "")

    private constructor(alias: Name, aliased: Table<DbRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<DbRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<DbRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>mysql.db</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.db</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.db</code> table reference
     */
    constructor(): this(DSL.name("db"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Mysql.MYSQL
    override fun getIndexes(): List<Index> = listOf(DB_USER)
    override fun getPrimaryKey(): UniqueKey<DbRecord> = KEY_DB_PRIMARY
    override fun `as`(alias: String): Db = Db(DSL.name(alias), this)
    override fun `as`(alias: Name): Db = Db(alias, this)
    override fun `as`(alias: Table<*>): Db = Db(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Db = Db(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Db = Db(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Db = Db(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Db = Db(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Db = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Db = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Db = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Db = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Db = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Db = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Db = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Db = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Db = where(DSL.notExists(select))

    // -------------------------------------------------------------------------
    // Row22 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row22<String?, String?, String?, DbSelectPriv?, DbInsertPriv?, DbUpdatePriv?, DbDeletePriv?, DbCreatePriv?, DbDropPriv?, DbGrantPriv?, DbReferencesPriv?, DbIndexPriv?, DbAlterPriv?, DbCreateTmpTablePriv?, DbLockTablesPriv?, DbCreateViewPriv?, DbShowViewPriv?, DbCreateRoutinePriv?, DbAlterRoutinePriv?, DbExecutePriv?, DbEventPriv?, DbTriggerPriv?> = super.fieldsRow() as Row22<String?, String?, String?, DbSelectPriv?, DbInsertPriv?, DbUpdatePriv?, DbDeletePriv?, DbCreatePriv?, DbDropPriv?, DbGrantPriv?, DbReferencesPriv?, DbIndexPriv?, DbAlterPriv?, DbCreateTmpTablePriv?, DbLockTablesPriv?, DbCreateViewPriv?, DbShowViewPriv?, DbCreateRoutinePriv?, DbAlterRoutinePriv?, DbExecutePriv?, DbEventPriv?, DbTriggerPriv?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, DbSelectPriv?, DbInsertPriv?, DbUpdatePriv?, DbDeletePriv?, DbCreatePriv?, DbDropPriv?, DbGrantPriv?, DbReferencesPriv?, DbIndexPriv?, DbAlterPriv?, DbCreateTmpTablePriv?, DbLockTablesPriv?, DbCreateViewPriv?, DbShowViewPriv?, DbCreateRoutinePriv?, DbAlterRoutinePriv?, DbExecutePriv?, DbEventPriv?, DbTriggerPriv?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, DbSelectPriv?, DbInsertPriv?, DbUpdatePriv?, DbDeletePriv?, DbCreatePriv?, DbDropPriv?, DbGrantPriv?, DbReferencesPriv?, DbIndexPriv?, DbAlterPriv?, DbCreateTmpTablePriv?, DbLockTablesPriv?, DbCreateViewPriv?, DbShowViewPriv?, DbCreateRoutinePriv?, DbAlterRoutinePriv?, DbExecutePriv?, DbEventPriv?, DbTriggerPriv?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
