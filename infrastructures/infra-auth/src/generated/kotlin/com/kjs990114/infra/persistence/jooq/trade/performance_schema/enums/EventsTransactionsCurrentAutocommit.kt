/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums


import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class EventsTransactionsCurrentAutocommit(@get:JvmName("literal") public val literal: String) : EnumType {
    YES("YES"),
    NO("NO");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String? = null
    override fun getLiteral(): String = literal
}
