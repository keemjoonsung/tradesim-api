/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.routines


import com.kjs990114.infra.persistence.jooq.trade.sys.Sys

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * 
 * Description
 * -----------
 * 
 * Takes a raw file path, and attempts to extract the schema name from it.
 * 
 * Useful for when interacting with Performance Schema data 
 * concerning IO statistics, for example.
 * 
 * Currently relies on the fact that a table data file will be within a 
 * specified database directory (will not work with partitions or tables
 * that specify an individual DATA_DIRECTORY).
 * 
 * Parameters
 * -----------
 * 
 * path (VARCHAR(512)):
 *   The full file path to a data file to extract the schema name from.
 * 
 * Returns
 * -----------
 * 
 * VARCHAR(64)
 * 
 * Example
 * -----------
 * 
 * mysql&gt; SELECT
 * sys.extract_schema_from_file_name('/var/lib/mysql/employees/employee.ibd');
 * 
 * ----------------------------------------------------------------------------+
 * | sys.extract_schema_from_file_name('/var/lib/mysql/employees/employee.ibd')
 * |
 * 
 * ----------------------------------------------------------------------------+
 * | employees                                                                 
 * |
 * 
 * ----------------------------------------------------------------------------+
 * 1 row in set (0.00 sec)

 */
@Suppress("UNCHECKED_CAST")
open class ExtractSchemaFromFileName : AbstractRoutine<String>("extract_schema_from_file_name", Sys.SYS, SQLDataType.VARCHAR(64)) {
    companion object {

        /**
         * The parameter
         * <code>sys.extract_schema_from_file_name.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.VARCHAR(64), false, false)

        /**
         * The parameter <code>sys.extract_schema_from_file_name.path</code>.
         */
        val PATH: Parameter<String?> = Internal.createParameter("path", SQLDataType.VARCHAR(512), false, false)
    }

    init {
        returnParameter = ExtractSchemaFromFileName.RETURN_VALUE
        addInParameter(ExtractSchemaFromFileName.PATH)
    }

    /**
     * Set the <code>path</code> parameter IN value to the routine
     */
    fun setPath(value: String?): Unit = setValue(ExtractSchemaFromFileName.PATH, value)

    /**
     * Set the <code>path</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setPath(field: Field<String?>): ExtractSchemaFromFileName {
        setField(ExtractSchemaFromFileName.PATH, field)
        return this
    }
}
