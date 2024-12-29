/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.records


import com.kjs990114.infra.persistence.jooq.trade.performance_schema.enums.EventsWaitsHistoryNestingEventType
import com.kjs990114.infra.persistence.jooq.trade.performance_schema.tables.EventsWaitsHistory

import org.jooq.Field
import org.jooq.Record19
import org.jooq.Record2
import org.jooq.Row19
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsWaitsHistoryRecord() : UpdatableRecordImpl<EventsWaitsHistoryRecord>(EventsWaitsHistory.EVENTS_WAITS_HISTORY), Record19<ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, UInteger?, String?, String?, String?, String?, ULong?, ULong?, EventsWaitsHistoryNestingEventType?, String?, Long?, UInteger?> {

    open var threadId: ULong?
        set(value): Unit = set(0, value)
        get(): ULong? = get(0) as ULong?

    open var eventId: ULong?
        set(value): Unit = set(1, value)
        get(): ULong? = get(1) as ULong?

    open var endEventId: ULong?
        set(value): Unit = set(2, value)
        get(): ULong? = get(2) as ULong?

    open var eventName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var source: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var timerStart: ULong?
        set(value): Unit = set(5, value)
        get(): ULong? = get(5) as ULong?

    open var timerEnd: ULong?
        set(value): Unit = set(6, value)
        get(): ULong? = get(6) as ULong?

    open var timerWait: ULong?
        set(value): Unit = set(7, value)
        get(): ULong? = get(7) as ULong?

    open var spins: UInteger?
        set(value): Unit = set(8, value)
        get(): UInteger? = get(8) as UInteger?

    open var objectSchema: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var objectName: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var indexName: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var objectType: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var objectInstanceBegin: ULong?
        set(value): Unit = set(13, value)
        get(): ULong? = get(13) as ULong?

    open var nestingEventId: ULong?
        set(value): Unit = set(14, value)
        get(): ULong? = get(14) as ULong?

    open var nestingEventType: EventsWaitsHistoryNestingEventType?
        set(value): Unit = set(15, value)
        get(): EventsWaitsHistoryNestingEventType? = get(15) as EventsWaitsHistoryNestingEventType?

    open var operation: String?
        set(value): Unit = set(16, value)
        get(): String? = get(16) as String?

    open var numberOfBytes: Long?
        set(value): Unit = set(17, value)
        get(): Long? = get(17) as Long?

    open var flags: UInteger?
        set(value): Unit = set(18, value)
        get(): UInteger? = get(18) as UInteger?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<ULong?, ULong?> = super.key() as Record2<ULong?, ULong?>

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row19<ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, UInteger?, String?, String?, String?, String?, ULong?, ULong?, EventsWaitsHistoryNestingEventType?, String?, Long?, UInteger?> = super.fieldsRow() as Row19<ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, UInteger?, String?, String?, String?, String?, ULong?, ULong?, EventsWaitsHistoryNestingEventType?, String?, Long?, UInteger?>
    override fun valuesRow(): Row19<ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, UInteger?, String?, String?, String?, String?, ULong?, ULong?, EventsWaitsHistoryNestingEventType?, String?, Long?, UInteger?> = super.valuesRow() as Row19<ULong?, ULong?, ULong?, String?, String?, ULong?, ULong?, ULong?, UInteger?, String?, String?, String?, String?, ULong?, ULong?, EventsWaitsHistoryNestingEventType?, String?, Long?, UInteger?>
    override fun field1(): Field<ULong?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.THREAD_ID
    override fun field2(): Field<ULong?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.EVENT_ID
    override fun field3(): Field<ULong?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.END_EVENT_ID
    override fun field4(): Field<String?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.EVENT_NAME
    override fun field5(): Field<String?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.SOURCE
    override fun field6(): Field<ULong?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.TIMER_START
    override fun field7(): Field<ULong?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.TIMER_END
    override fun field8(): Field<ULong?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.TIMER_WAIT
    override fun field9(): Field<UInteger?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.SPINS
    override fun field10(): Field<String?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.OBJECT_SCHEMA
    override fun field11(): Field<String?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.OBJECT_NAME
    override fun field12(): Field<String?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.INDEX_NAME
    override fun field13(): Field<String?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.OBJECT_TYPE
    override fun field14(): Field<ULong?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.OBJECT_INSTANCE_BEGIN
    override fun field15(): Field<ULong?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.NESTING_EVENT_ID
    override fun field16(): Field<EventsWaitsHistoryNestingEventType?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.NESTING_EVENT_TYPE
    override fun field17(): Field<String?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.OPERATION
    override fun field18(): Field<Long?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.NUMBER_OF_BYTES
    override fun field19(): Field<UInteger?> = EventsWaitsHistory.EVENTS_WAITS_HISTORY.FLAGS
    override fun component1(): ULong? = threadId
    override fun component2(): ULong? = eventId
    override fun component3(): ULong? = endEventId
    override fun component4(): String? = eventName
    override fun component5(): String? = source
    override fun component6(): ULong? = timerStart
    override fun component7(): ULong? = timerEnd
    override fun component8(): ULong? = timerWait
    override fun component9(): UInteger? = spins
    override fun component10(): String? = objectSchema
    override fun component11(): String? = objectName
    override fun component12(): String? = indexName
    override fun component13(): String? = objectType
    override fun component14(): ULong? = objectInstanceBegin
    override fun component15(): ULong? = nestingEventId
    override fun component16(): EventsWaitsHistoryNestingEventType? = nestingEventType
    override fun component17(): String? = operation
    override fun component18(): Long? = numberOfBytes
    override fun component19(): UInteger? = flags
    override fun value1(): ULong? = threadId
    override fun value2(): ULong? = eventId
    override fun value3(): ULong? = endEventId
    override fun value4(): String? = eventName
    override fun value5(): String? = source
    override fun value6(): ULong? = timerStart
    override fun value7(): ULong? = timerEnd
    override fun value8(): ULong? = timerWait
    override fun value9(): UInteger? = spins
    override fun value10(): String? = objectSchema
    override fun value11(): String? = objectName
    override fun value12(): String? = indexName
    override fun value13(): String? = objectType
    override fun value14(): ULong? = objectInstanceBegin
    override fun value15(): ULong? = nestingEventId
    override fun value16(): EventsWaitsHistoryNestingEventType? = nestingEventType
    override fun value17(): String? = operation
    override fun value18(): Long? = numberOfBytes
    override fun value19(): UInteger? = flags

    override fun value1(value: ULong?): EventsWaitsHistoryRecord {
        set(0, value)
        return this
    }

    override fun value2(value: ULong?): EventsWaitsHistoryRecord {
        set(1, value)
        return this
    }

    override fun value3(value: ULong?): EventsWaitsHistoryRecord {
        set(2, value)
        return this
    }

    override fun value4(value: String?): EventsWaitsHistoryRecord {
        set(3, value)
        return this
    }

    override fun value5(value: String?): EventsWaitsHistoryRecord {
        set(4, value)
        return this
    }

    override fun value6(value: ULong?): EventsWaitsHistoryRecord {
        set(5, value)
        return this
    }

    override fun value7(value: ULong?): EventsWaitsHistoryRecord {
        set(6, value)
        return this
    }

    override fun value8(value: ULong?): EventsWaitsHistoryRecord {
        set(7, value)
        return this
    }

    override fun value9(value: UInteger?): EventsWaitsHistoryRecord {
        set(8, value)
        return this
    }

    override fun value10(value: String?): EventsWaitsHistoryRecord {
        set(9, value)
        return this
    }

    override fun value11(value: String?): EventsWaitsHistoryRecord {
        set(10, value)
        return this
    }

    override fun value12(value: String?): EventsWaitsHistoryRecord {
        set(11, value)
        return this
    }

    override fun value13(value: String?): EventsWaitsHistoryRecord {
        set(12, value)
        return this
    }

    override fun value14(value: ULong?): EventsWaitsHistoryRecord {
        set(13, value)
        return this
    }

    override fun value15(value: ULong?): EventsWaitsHistoryRecord {
        set(14, value)
        return this
    }

    override fun value16(value: EventsWaitsHistoryNestingEventType?): EventsWaitsHistoryRecord {
        set(15, value)
        return this
    }

    override fun value17(value: String?): EventsWaitsHistoryRecord {
        set(16, value)
        return this
    }

    override fun value18(value: Long?): EventsWaitsHistoryRecord {
        set(17, value)
        return this
    }

    override fun value19(value: UInteger?): EventsWaitsHistoryRecord {
        set(18, value)
        return this
    }

    override fun values(value1: ULong?, value2: ULong?, value3: ULong?, value4: String?, value5: String?, value6: ULong?, value7: ULong?, value8: ULong?, value9: UInteger?, value10: String?, value11: String?, value12: String?, value13: String?, value14: ULong?, value15: ULong?, value16: EventsWaitsHistoryNestingEventType?, value17: String?, value18: Long?, value19: UInteger?): EventsWaitsHistoryRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        this.value10(value10)
        this.value11(value11)
        this.value12(value12)
        this.value13(value13)
        this.value14(value14)
        this.value15(value15)
        this.value16(value16)
        this.value17(value17)
        this.value18(value18)
        this.value19(value19)
        return this
    }

    /**
     * Create a detached, initialised EventsWaitsHistoryRecord
     */
    constructor(threadId: ULong? = null, eventId: ULong? = null, endEventId: ULong? = null, eventName: String? = null, source: String? = null, timerStart: ULong? = null, timerEnd: ULong? = null, timerWait: ULong? = null, spins: UInteger? = null, objectSchema: String? = null, objectName: String? = null, indexName: String? = null, objectType: String? = null, objectInstanceBegin: ULong? = null, nestingEventId: ULong? = null, nestingEventType: EventsWaitsHistoryNestingEventType? = null, operation: String? = null, numberOfBytes: Long? = null, flags: UInteger? = null): this() {
        this.threadId = threadId
        this.eventId = eventId
        this.endEventId = endEventId
        this.eventName = eventName
        this.source = source
        this.timerStart = timerStart
        this.timerEnd = timerEnd
        this.timerWait = timerWait
        this.spins = spins
        this.objectSchema = objectSchema
        this.objectName = objectName
        this.indexName = indexName
        this.objectType = objectType
        this.objectInstanceBegin = objectInstanceBegin
        this.nestingEventId = nestingEventId
        this.nestingEventType = nestingEventType
        this.operation = operation
        this.numberOfBytes = numberOfBytes
        this.flags = flags
        resetChangedOnNotNull()
    }
}
