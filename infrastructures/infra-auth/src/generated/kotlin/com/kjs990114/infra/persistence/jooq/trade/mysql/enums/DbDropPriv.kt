/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.mysql.enums


import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class DbDropPriv(@get:JvmName("literal") public val literal: String) : EnumType {
    N("N"),
    Y("Y");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String? = null
    override fun getLiteral(): String = literal
}
