/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.routines


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys

import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * 
 * Description
 * -----------
 * 
 * Resets the Performance Schema setup to the default settings.
 * 
 * Parameters
 * -----------
 * 
 * in_verbose (BOOLEAN):
 *   Whether to print each setup stage (including the SQL) whilst running.
 * 
 * Example
 * -----------
 * 
 * mysql&gt; CALL sys.ps_setup_reset_to_default(true)\G
 * *************************** 1. row ***************************
 * status: Resetting: setup_actors
 * DELETE
 * FROM performance_schema.setup_actors
 *  WHERE NOT (HOST = '%' AND USER = '%' AND `ROLE` = '%')
 * 1 row in set (0.00 sec)
 * 
 * *************************** 1. row ***************************
 * status: Resetting: setup_actors
 * INSERT IGNORE INTO performance_schema.setup_actors
 * VALUES ('%', '%', '%')
 * 1 row in set (0.00 sec)
 * ...
 * 
 * mysql&gt; CALL sys.ps_setup_reset_to_default(false)\G
 * Query OK, 0 rows affected (0.00 sec)

 */
@Suppress("UNCHECKED_CAST")
open class PsSetupResetToDefault : AbstractRoutine<java.lang.Void>("ps_setup_reset_to_default", Sys.SYS) {
    companion object {

        /**
         * The parameter <code>sys.ps_setup_reset_to_default.in_verbose</code>.
         */
        val IN_VERBOSE: Parameter<Byte?> = Internal.createParameter("in_verbose", SQLDataType.TINYINT, false, false)
    }

    init {
        addInParameter(PsSetupResetToDefault.IN_VERBOSE)
    }

    /**
     * Set the <code>in_verbose</code> parameter IN value to the routine
     */
    fun setInVerbose(value: Byte?): Unit = setValue(PsSetupResetToDefault.IN_VERBOSE, value)
}
