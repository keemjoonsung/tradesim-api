/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.information_schema.enums


import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class TablesRowFormat(@get:JvmName("literal") public val literal: String) : EnumType {
    Fixed("Fixed"),
    Dynamic("Dynamic"),
    Compressed("Compressed"),
    Redundant("Redundant"),
    Compact("Compact"),
    Paged("Paged");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String? = null
    override fun getLiteral(): String = literal
}
