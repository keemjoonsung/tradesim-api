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
enum class VariablesInfoVariableSource(@get:JvmName("literal") public val literal: String) : EnumType {
    COMPILED("COMPILED"),
    GLOBAL("GLOBAL"),
    SERVER("SERVER"),
    EXPLICIT("EXPLICIT"),
    EXTRA("EXTRA"),
    USER("USER"),
    LOGIN("LOGIN"),
    COMMAND_LINE("COMMAND_LINE"),
    PERSISTED("PERSISTED"),
    DYNAMIC("DYNAMIC");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String? = null
    override fun getLiteral(): String = literal
}
