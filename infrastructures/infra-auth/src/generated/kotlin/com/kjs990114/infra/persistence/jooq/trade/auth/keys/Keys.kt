/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.auth.keys


import com.kjs990114.infra.persistence.jooq.trade.auth.tables.User
import com.kjs990114.infra.persistence.jooq.trade.auth.tables.UserToken
import com.kjs990114.infra.persistence.jooq.trade.auth.tables.records.UserRecord
import com.kjs990114.infra.persistence.jooq.trade.auth.tables.records.UserTokenRecord

import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val KEY_USER_PRIMARY: UniqueKey<UserRecord> = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_PRIMARY"), arrayOf(User.USER.ID), true)
val KEY_USER_TOKEN_PRIMARY: UniqueKey<UserTokenRecord> = Internal.createUniqueKey(UserToken.USER_TOKEN, DSL.name("KEY_user_token_PRIMARY"), arrayOf(UserToken.USER_TOKEN.ID), true)