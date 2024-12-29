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
 * Takes an unquoted identifier (schema name, table name, etc.) and
 * returns the identifier quoted with backticks.
 * 
 * Parameters
 * -----------
 * 
 * in_identifier (TEXT):
 *   The identifier to quote.
 * 
 * Returns
 * -----------
 * 
 * TEXT CHARSET UTF8MB4
 * 
 * Example
 * -----------
 * 
 * mysql&gt; SELECT sys.quote_identifier('my_identifier') AS Identifier;
 * +-----------------+
 * | Identifier      |
 * +-----------------+
 * | `my_identifier` |
 * +-----------------+
 * 1 row in set (0.00 sec)
 * 
 * mysql&gt; SELECT sys.quote_identifier('my`idenfier') AS Identifier;
 * +----------------+
 * | Identifier     |
 * +----------------+
 * | `my``idenfier` |
 * +----------------+
 * 1 row in set (0.00 sec)

 */
@Suppress("UNCHECKED_CAST")
open class QuoteIdentifier : AbstractRoutine<String>("quote_identifier", Sys.SYS, SQLDataType.CLOB) {
    companion object {

        /**
         * The parameter <code>sys.quote_identifier.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false)

        /**
         * The parameter <code>sys.quote_identifier.in_identifier</code>.
         */
        val IN_IDENTIFIER: Parameter<String?> = Internal.createParameter("in_identifier", SQLDataType.CLOB, false, false)
    }

    init {
        returnParameter = QuoteIdentifier.RETURN_VALUE
        addInParameter(QuoteIdentifier.IN_IDENTIFIER)
    }

    /**
     * Set the <code>in_identifier</code> parameter IN value to the routine
     */
    fun setInIdentifier(value: String?): Unit = setValue(QuoteIdentifier.IN_IDENTIFIER, value)

    /**
     * Set the <code>in_identifier</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    fun setInIdentifier(field: Field<String?>): QuoteIdentifier {
        setField(QuoteIdentifier.IN_IDENTIFIER, field)
        return this
    }
}