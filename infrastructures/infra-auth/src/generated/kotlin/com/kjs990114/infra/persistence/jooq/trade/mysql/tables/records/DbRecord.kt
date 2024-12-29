/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.tables.records


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
import com.kjs990114.infra.persistence.jooq.trade.mysql.tables.Db

import org.jooq.Field
import org.jooq.Record22
import org.jooq.Record3
import org.jooq.Row22
import org.jooq.impl.UpdatableRecordImpl


/**
 * Database privileges
 */
@Suppress("UNCHECKED_CAST")
open class DbRecord() : UpdatableRecordImpl<DbRecord>(Db.DB), Record22<String?, String?, String?, DbSelectPriv?, DbInsertPriv?, DbUpdatePriv?, DbDeletePriv?, DbCreatePriv?, DbDropPriv?, DbGrantPriv?, DbReferencesPriv?, DbIndexPriv?, DbAlterPriv?, DbCreateTmpTablePriv?, DbLockTablesPriv?, DbCreateViewPriv?, DbShowViewPriv?, DbCreateRoutinePriv?, DbAlterRoutinePriv?, DbExecutePriv?, DbEventPriv?, DbTriggerPriv?> {

    open var host: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var db: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var user: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var selectPriv: DbSelectPriv?
        set(value): Unit = set(3, value)
        get(): DbSelectPriv? = get(3) as DbSelectPriv?

    open var insertPriv: DbInsertPriv?
        set(value): Unit = set(4, value)
        get(): DbInsertPriv? = get(4) as DbInsertPriv?

    open var updatePriv: DbUpdatePriv?
        set(value): Unit = set(5, value)
        get(): DbUpdatePriv? = get(5) as DbUpdatePriv?

    open var deletePriv: DbDeletePriv?
        set(value): Unit = set(6, value)
        get(): DbDeletePriv? = get(6) as DbDeletePriv?

    open var createPriv: DbCreatePriv?
        set(value): Unit = set(7, value)
        get(): DbCreatePriv? = get(7) as DbCreatePriv?

    open var dropPriv: DbDropPriv?
        set(value): Unit = set(8, value)
        get(): DbDropPriv? = get(8) as DbDropPriv?

    open var grantPriv: DbGrantPriv?
        set(value): Unit = set(9, value)
        get(): DbGrantPriv? = get(9) as DbGrantPriv?

    open var referencesPriv: DbReferencesPriv?
        set(value): Unit = set(10, value)
        get(): DbReferencesPriv? = get(10) as DbReferencesPriv?

    open var indexPriv: DbIndexPriv?
        set(value): Unit = set(11, value)
        get(): DbIndexPriv? = get(11) as DbIndexPriv?

    open var alterPriv: DbAlterPriv?
        set(value): Unit = set(12, value)
        get(): DbAlterPriv? = get(12) as DbAlterPriv?

    open var createTmpTablePriv: DbCreateTmpTablePriv?
        set(value): Unit = set(13, value)
        get(): DbCreateTmpTablePriv? = get(13) as DbCreateTmpTablePriv?

    open var lockTablesPriv: DbLockTablesPriv?
        set(value): Unit = set(14, value)
        get(): DbLockTablesPriv? = get(14) as DbLockTablesPriv?

    open var createViewPriv: DbCreateViewPriv?
        set(value): Unit = set(15, value)
        get(): DbCreateViewPriv? = get(15) as DbCreateViewPriv?

    open var showViewPriv: DbShowViewPriv?
        set(value): Unit = set(16, value)
        get(): DbShowViewPriv? = get(16) as DbShowViewPriv?

    open var createRoutinePriv: DbCreateRoutinePriv?
        set(value): Unit = set(17, value)
        get(): DbCreateRoutinePriv? = get(17) as DbCreateRoutinePriv?

    open var alterRoutinePriv: DbAlterRoutinePriv?
        set(value): Unit = set(18, value)
        get(): DbAlterRoutinePriv? = get(18) as DbAlterRoutinePriv?

    open var executePriv: DbExecutePriv?
        set(value): Unit = set(19, value)
        get(): DbExecutePriv? = get(19) as DbExecutePriv?

    open var eventPriv: DbEventPriv?
        set(value): Unit = set(20, value)
        get(): DbEventPriv? = get(20) as DbEventPriv?

    open var triggerPriv: DbTriggerPriv?
        set(value): Unit = set(21, value)
        get(): DbTriggerPriv? = get(21) as DbTriggerPriv?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record3<String?, String?, String?> = super.key() as Record3<String?, String?, String?>

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row22<String?, String?, String?, DbSelectPriv?, DbInsertPriv?, DbUpdatePriv?, DbDeletePriv?, DbCreatePriv?, DbDropPriv?, DbGrantPriv?, DbReferencesPriv?, DbIndexPriv?, DbAlterPriv?, DbCreateTmpTablePriv?, DbLockTablesPriv?, DbCreateViewPriv?, DbShowViewPriv?, DbCreateRoutinePriv?, DbAlterRoutinePriv?, DbExecutePriv?, DbEventPriv?, DbTriggerPriv?> = super.fieldsRow() as Row22<String?, String?, String?, DbSelectPriv?, DbInsertPriv?, DbUpdatePriv?, DbDeletePriv?, DbCreatePriv?, DbDropPriv?, DbGrantPriv?, DbReferencesPriv?, DbIndexPriv?, DbAlterPriv?, DbCreateTmpTablePriv?, DbLockTablesPriv?, DbCreateViewPriv?, DbShowViewPriv?, DbCreateRoutinePriv?, DbAlterRoutinePriv?, DbExecutePriv?, DbEventPriv?, DbTriggerPriv?>
    override fun valuesRow(): Row22<String?, String?, String?, DbSelectPriv?, DbInsertPriv?, DbUpdatePriv?, DbDeletePriv?, DbCreatePriv?, DbDropPriv?, DbGrantPriv?, DbReferencesPriv?, DbIndexPriv?, DbAlterPriv?, DbCreateTmpTablePriv?, DbLockTablesPriv?, DbCreateViewPriv?, DbShowViewPriv?, DbCreateRoutinePriv?, DbAlterRoutinePriv?, DbExecutePriv?, DbEventPriv?, DbTriggerPriv?> = super.valuesRow() as Row22<String?, String?, String?, DbSelectPriv?, DbInsertPriv?, DbUpdatePriv?, DbDeletePriv?, DbCreatePriv?, DbDropPriv?, DbGrantPriv?, DbReferencesPriv?, DbIndexPriv?, DbAlterPriv?, DbCreateTmpTablePriv?, DbLockTablesPriv?, DbCreateViewPriv?, DbShowViewPriv?, DbCreateRoutinePriv?, DbAlterRoutinePriv?, DbExecutePriv?, DbEventPriv?, DbTriggerPriv?>
    override fun field1(): Field<String?> = Db.DB.HOST
    override fun field2(): Field<String?> = Db.DB.DB_
    override fun field3(): Field<String?> = Db.DB.USER
    override fun field4(): Field<DbSelectPriv?> = Db.DB.SELECT_PRIV
    override fun field5(): Field<DbInsertPriv?> = Db.DB.INSERT_PRIV
    override fun field6(): Field<DbUpdatePriv?> = Db.DB.UPDATE_PRIV
    override fun field7(): Field<DbDeletePriv?> = Db.DB.DELETE_PRIV
    override fun field8(): Field<DbCreatePriv?> = Db.DB.CREATE_PRIV
    override fun field9(): Field<DbDropPriv?> = Db.DB.DROP_PRIV
    override fun field10(): Field<DbGrantPriv?> = Db.DB.GRANT_PRIV
    override fun field11(): Field<DbReferencesPriv?> = Db.DB.REFERENCES_PRIV
    override fun field12(): Field<DbIndexPriv?> = Db.DB.INDEX_PRIV
    override fun field13(): Field<DbAlterPriv?> = Db.DB.ALTER_PRIV
    override fun field14(): Field<DbCreateTmpTablePriv?> = Db.DB.CREATE_TMP_TABLE_PRIV
    override fun field15(): Field<DbLockTablesPriv?> = Db.DB.LOCK_TABLES_PRIV
    override fun field16(): Field<DbCreateViewPriv?> = Db.DB.CREATE_VIEW_PRIV
    override fun field17(): Field<DbShowViewPriv?> = Db.DB.SHOW_VIEW_PRIV
    override fun field18(): Field<DbCreateRoutinePriv?> = Db.DB.CREATE_ROUTINE_PRIV
    override fun field19(): Field<DbAlterRoutinePriv?> = Db.DB.ALTER_ROUTINE_PRIV
    override fun field20(): Field<DbExecutePriv?> = Db.DB.EXECUTE_PRIV
    override fun field21(): Field<DbEventPriv?> = Db.DB.EVENT_PRIV
    override fun field22(): Field<DbTriggerPriv?> = Db.DB.TRIGGER_PRIV
    override fun component1(): String? = host
    override fun component2(): String? = db
    override fun component3(): String? = user
    override fun component4(): DbSelectPriv? = selectPriv
    override fun component5(): DbInsertPriv? = insertPriv
    override fun component6(): DbUpdatePriv? = updatePriv
    override fun component7(): DbDeletePriv? = deletePriv
    override fun component8(): DbCreatePriv? = createPriv
    override fun component9(): DbDropPriv? = dropPriv
    override fun component10(): DbGrantPriv? = grantPriv
    override fun component11(): DbReferencesPriv? = referencesPriv
    override fun component12(): DbIndexPriv? = indexPriv
    override fun component13(): DbAlterPriv? = alterPriv
    override fun component14(): DbCreateTmpTablePriv? = createTmpTablePriv
    override fun component15(): DbLockTablesPriv? = lockTablesPriv
    override fun component16(): DbCreateViewPriv? = createViewPriv
    override fun component17(): DbShowViewPriv? = showViewPriv
    override fun component18(): DbCreateRoutinePriv? = createRoutinePriv
    override fun component19(): DbAlterRoutinePriv? = alterRoutinePriv
    override fun component20(): DbExecutePriv? = executePriv
    override fun component21(): DbEventPriv? = eventPriv
    override fun component22(): DbTriggerPriv? = triggerPriv
    override fun value1(): String? = host
    override fun value2(): String? = db
    override fun value3(): String? = user
    override fun value4(): DbSelectPriv? = selectPriv
    override fun value5(): DbInsertPriv? = insertPriv
    override fun value6(): DbUpdatePriv? = updatePriv
    override fun value7(): DbDeletePriv? = deletePriv
    override fun value8(): DbCreatePriv? = createPriv
    override fun value9(): DbDropPriv? = dropPriv
    override fun value10(): DbGrantPriv? = grantPriv
    override fun value11(): DbReferencesPriv? = referencesPriv
    override fun value12(): DbIndexPriv? = indexPriv
    override fun value13(): DbAlterPriv? = alterPriv
    override fun value14(): DbCreateTmpTablePriv? = createTmpTablePriv
    override fun value15(): DbLockTablesPriv? = lockTablesPriv
    override fun value16(): DbCreateViewPriv? = createViewPriv
    override fun value17(): DbShowViewPriv? = showViewPriv
    override fun value18(): DbCreateRoutinePriv? = createRoutinePriv
    override fun value19(): DbAlterRoutinePriv? = alterRoutinePriv
    override fun value20(): DbExecutePriv? = executePriv
    override fun value21(): DbEventPriv? = eventPriv
    override fun value22(): DbTriggerPriv? = triggerPriv

    override fun value1(value: String?): DbRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): DbRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): DbRecord {
        set(2, value)
        return this
    }

    override fun value4(value: DbSelectPriv?): DbRecord {
        set(3, value)
        return this
    }

    override fun value5(value: DbInsertPriv?): DbRecord {
        set(4, value)
        return this
    }

    override fun value6(value: DbUpdatePriv?): DbRecord {
        set(5, value)
        return this
    }

    override fun value7(value: DbDeletePriv?): DbRecord {
        set(6, value)
        return this
    }

    override fun value8(value: DbCreatePriv?): DbRecord {
        set(7, value)
        return this
    }

    override fun value9(value: DbDropPriv?): DbRecord {
        set(8, value)
        return this
    }

    override fun value10(value: DbGrantPriv?): DbRecord {
        set(9, value)
        return this
    }

    override fun value11(value: DbReferencesPriv?): DbRecord {
        set(10, value)
        return this
    }

    override fun value12(value: DbIndexPriv?): DbRecord {
        set(11, value)
        return this
    }

    override fun value13(value: DbAlterPriv?): DbRecord {
        set(12, value)
        return this
    }

    override fun value14(value: DbCreateTmpTablePriv?): DbRecord {
        set(13, value)
        return this
    }

    override fun value15(value: DbLockTablesPriv?): DbRecord {
        set(14, value)
        return this
    }

    override fun value16(value: DbCreateViewPriv?): DbRecord {
        set(15, value)
        return this
    }

    override fun value17(value: DbShowViewPriv?): DbRecord {
        set(16, value)
        return this
    }

    override fun value18(value: DbCreateRoutinePriv?): DbRecord {
        set(17, value)
        return this
    }

    override fun value19(value: DbAlterRoutinePriv?): DbRecord {
        set(18, value)
        return this
    }

    override fun value20(value: DbExecutePriv?): DbRecord {
        set(19, value)
        return this
    }

    override fun value21(value: DbEventPriv?): DbRecord {
        set(20, value)
        return this
    }

    override fun value22(value: DbTriggerPriv?): DbRecord {
        set(21, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: DbSelectPriv?, value5: DbInsertPriv?, value6: DbUpdatePriv?, value7: DbDeletePriv?, value8: DbCreatePriv?, value9: DbDropPriv?, value10: DbGrantPriv?, value11: DbReferencesPriv?, value12: DbIndexPriv?, value13: DbAlterPriv?, value14: DbCreateTmpTablePriv?, value15: DbLockTablesPriv?, value16: DbCreateViewPriv?, value17: DbShowViewPriv?, value18: DbCreateRoutinePriv?, value19: DbAlterRoutinePriv?, value20: DbExecutePriv?, value21: DbEventPriv?, value22: DbTriggerPriv?): DbRecord {
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
        this.value12(value12)
        this.value13(value13)
        this.value14(value14)
        this.value15(value15)
        this.value16(value16)
        this.value17(value17)
        this.value18(value18)
        this.value19(value19)
        this.value20(value20)
        this.value21(value21)
        this.value22(value22)
        return this
    }

    /**
     * Create a detached, initialised DbRecord
     */
    constructor(host: String? = null, db: String? = null, user: String? = null, selectPriv: DbSelectPriv? = null, insertPriv: DbInsertPriv? = null, updatePriv: DbUpdatePriv? = null, deletePriv: DbDeletePriv? = null, createPriv: DbCreatePriv? = null, dropPriv: DbDropPriv? = null, grantPriv: DbGrantPriv? = null, referencesPriv: DbReferencesPriv? = null, indexPriv: DbIndexPriv? = null, alterPriv: DbAlterPriv? = null, createTmpTablePriv: DbCreateTmpTablePriv? = null, lockTablesPriv: DbLockTablesPriv? = null, createViewPriv: DbCreateViewPriv? = null, showViewPriv: DbShowViewPriv? = null, createRoutinePriv: DbCreateRoutinePriv? = null, alterRoutinePriv: DbAlterRoutinePriv? = null, executePriv: DbExecutePriv? = null, eventPriv: DbEventPriv? = null, triggerPriv: DbTriggerPriv? = null): this() {
        this.host = host
        this.db = db
        this.user = user
        this.selectPriv = selectPriv
        this.insertPriv = insertPriv
        this.updatePriv = updatePriv
        this.deletePriv = deletePriv
        this.createPriv = createPriv
        this.dropPriv = dropPriv
        this.grantPriv = grantPriv
        this.referencesPriv = referencesPriv
        this.indexPriv = indexPriv
        this.alterPriv = alterPriv
        this.createTmpTablePriv = createTmpTablePriv
        this.lockTablesPriv = lockTablesPriv
        this.createViewPriv = createViewPriv
        this.showViewPriv = showViewPriv
        this.createRoutinePriv = createRoutinePriv
        this.alterRoutinePriv = alterRoutinePriv
        this.executePriv = executePriv
        this.eventPriv = eventPriv
        this.triggerPriv = triggerPriv
        resetChangedOnNotNull()
    }
}
