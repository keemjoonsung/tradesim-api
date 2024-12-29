/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys.tables.records


import java.math.BigDecimal
import java.math.BigInteger

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class `X$psDigest_95thPercentileByAvgUsRecord`() : TableRecordImpl<`X$psDigest_95thPercentileByAvgUsRecord`>(com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psDigest_95thPercentileByAvgUs`.`X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US`), Record2<BigInteger?, BigDecimal?> {

    open var avgUs: BigInteger?
        set(value): Unit = set(0, value)
        get(): BigInteger? = get(0) as BigInteger?

    open var percentile: BigDecimal?
        set(value): Unit = set(1, value)
        get(): BigDecimal? = get(1) as BigDecimal?

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<BigInteger?, BigDecimal?> = super.fieldsRow() as Row2<BigInteger?, BigDecimal?>
    override fun valuesRow(): Row2<BigInteger?, BigDecimal?> = super.valuesRow() as Row2<BigInteger?, BigDecimal?>
    override fun field1(): Field<BigInteger?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psDigest_95thPercentileByAvgUs`.`X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US`.AVG_US
    override fun field2(): Field<BigDecimal?> = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psDigest_95thPercentileByAvgUs`.`X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US`.PERCENTILE
    override fun component1(): BigInteger? = avgUs
    override fun component2(): BigDecimal? = percentile
    override fun value1(): BigInteger? = avgUs
    override fun value2(): BigDecimal? = percentile

    override fun value1(value: BigInteger?): `X$psDigest_95thPercentileByAvgUsRecord` {
        set(0, value)
        return this
    }

    override fun value2(value: BigDecimal?): `X$psDigest_95thPercentileByAvgUsRecord` {
        set(1, value)
        return this
    }

    override fun values(value1: BigInteger?, value2: BigDecimal?): `X$psDigest_95thPercentileByAvgUsRecord` {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised `X$psDigest_95thPercentileByAvgUsRecord`
     */
    constructor(avgUs: BigInteger? = null, percentile: BigDecimal? = null): this() {
        this.avgUs = avgUs
        this.percentile = percentile
        resetChangedOnNotNull()
    }
}
