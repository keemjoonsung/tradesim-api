/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums


import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * Indicates what is the channel policy regarding tables without primary keys on
 * create and alter table queries
 */
@Suppress("UNCHECKED_CAST")
enum class ReplicationApplierConfigurationRequireTablePrimaryKeyCheck(@get:JvmName("literal") public val literal: String) : EnumType {
    STREAM("STREAM"),
    ON("ON"),
    OFF("OFF"),
    GENERATE("GENERATE");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String? = null
    override fun getLiteral(): String = literal
}