/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.auth.indexes


import com.kjs990114.infra.persistence.jooq.trade.auth.tables.UserToken

import org.jooq.Index
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// INDEX definitions
// -------------------------------------------------------------------------

val USER_TOKEN_IDX_USER_TOKEN_001: Index = Internal.createIndex(DSL.name("IDX_user_token_001"), UserToken.USER_TOKEN, arrayOf(UserToken.USER_TOKEN.USER_ID), false)
