/*
 * This file is generated by jOOQ.
 */
package com.kjs990114.infra.persistence.jooq.trade.sys


import com.kjs990114.infra.persistence.jooq.trade.DefaultCatalog
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.HostSummary
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.HostSummaryByFileIo
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.HostSummaryByFileIoType
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.HostSummaryByStages
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.HostSummaryByStatementLatency
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.HostSummaryByStatementType
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.InnodbBufferStatsBySchema
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.InnodbBufferStatsByTable
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.InnodbLockWaits
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.IoByThreadByLatency
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.IoGlobalByFileByBytes
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.IoGlobalByFileByLatency
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.IoGlobalByWaitByBytes
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.IoGlobalByWaitByLatency
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.LatestFileIo
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.MemoryByHostByCurrentBytes
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.MemoryByThreadByCurrentBytes
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.MemoryByUserByCurrentBytes
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.MemoryGlobalByCurrentBytes
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.MemoryGlobalTotal
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.Metrics
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.Processlist
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.PsCheckLostInstrumentation
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaAutoIncrementColumns
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaIndexStatistics
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaObjectOverview
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaRedundantIndexes
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaTableLockWaits
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaTableStatistics
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaTableStatisticsWithBuffer
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaTablesWithFullTableScans
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SchemaUnusedIndexes
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.Session
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SessionSslStatus
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.StatementAnalysis
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.StatementsWithErrorsOrWarnings
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.StatementsWithFullTableScans
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.StatementsWithRuntimesIn_95thPercentile
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.StatementsWithSorting
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.StatementsWithTempTables
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.SysConfig
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.UserSummary
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.UserSummaryByFileIo
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.UserSummaryByFileIoType
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.UserSummaryByStages
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.UserSummaryByStatementLatency
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.UserSummaryByStatementType
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.Version
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.WaitClassesGlobalByAvgLatency
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.WaitClassesGlobalByLatency
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.WaitsByHostByLatency
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.WaitsByUserByLatency
import com.kjs990114.infra.persistence.jooq.trade.sys.tables.WaitsGlobalByLatency

import kotlin.collections.List

import org.jooq.Catalog
import org.jooq.Table
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Sys : SchemaImpl("sys", DefaultCatalog.DEFAULT_CATALOG) {
    companion object {

        /**
         * The reference instance of <code>sys</code>
         */
        val SYS: Sys = Sys()
    }

    /**
     * The table <code>sys.host_summary</code>.
     */
    val HOST_SUMMARY: HostSummary get() = HostSummary.HOST_SUMMARY

    /**
     * The table <code>sys.host_summary_by_file_io</code>.
     */
    val HOST_SUMMARY_BY_FILE_IO: HostSummaryByFileIo get() = HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO

    /**
     * The table <code>sys.host_summary_by_file_io_type</code>.
     */
    val HOST_SUMMARY_BY_FILE_IO_TYPE: HostSummaryByFileIoType get() = HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE

    /**
     * The table <code>sys.host_summary_by_stages</code>.
     */
    val HOST_SUMMARY_BY_STAGES: HostSummaryByStages get() = HostSummaryByStages.HOST_SUMMARY_BY_STAGES

    /**
     * The table <code>sys.host_summary_by_statement_latency</code>.
     */
    val HOST_SUMMARY_BY_STATEMENT_LATENCY: HostSummaryByStatementLatency get() = HostSummaryByStatementLatency.HOST_SUMMARY_BY_STATEMENT_LATENCY

    /**
     * The table <code>sys.host_summary_by_statement_type</code>.
     */
    val HOST_SUMMARY_BY_STATEMENT_TYPE: HostSummaryByStatementType get() = HostSummaryByStatementType.HOST_SUMMARY_BY_STATEMENT_TYPE

    /**
     * The table <code>sys.innodb_buffer_stats_by_schema</code>.
     */
    val INNODB_BUFFER_STATS_BY_SCHEMA: InnodbBufferStatsBySchema get() = InnodbBufferStatsBySchema.INNODB_BUFFER_STATS_BY_SCHEMA

    /**
     * The table <code>sys.innodb_buffer_stats_by_table</code>.
     */
    val INNODB_BUFFER_STATS_BY_TABLE: InnodbBufferStatsByTable get() = InnodbBufferStatsByTable.INNODB_BUFFER_STATS_BY_TABLE

    /**
     * The table <code>sys.innodb_lock_waits</code>.
     */
    val INNODB_LOCK_WAITS: InnodbLockWaits get() = InnodbLockWaits.INNODB_LOCK_WAITS

    /**
     * The table <code>sys.io_by_thread_by_latency</code>.
     */
    val IO_BY_THREAD_BY_LATENCY: IoByThreadByLatency get() = IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY

    /**
     * The table <code>sys.io_global_by_file_by_bytes</code>.
     */
    val IO_GLOBAL_BY_FILE_BY_BYTES: IoGlobalByFileByBytes get() = IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES

    /**
     * The table <code>sys.io_global_by_file_by_latency</code>.
     */
    val IO_GLOBAL_BY_FILE_BY_LATENCY: IoGlobalByFileByLatency get() = IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY

    /**
     * The table <code>sys.io_global_by_wait_by_bytes</code>.
     */
    val IO_GLOBAL_BY_WAIT_BY_BYTES: IoGlobalByWaitByBytes get() = IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES

    /**
     * The table <code>sys.io_global_by_wait_by_latency</code>.
     */
    val IO_GLOBAL_BY_WAIT_BY_LATENCY: IoGlobalByWaitByLatency get() = IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY

    /**
     * The table <code>sys.latest_file_io</code>.
     */
    val LATEST_FILE_IO: LatestFileIo get() = LatestFileIo.LATEST_FILE_IO

    /**
     * The table <code>sys.memory_by_host_by_current_bytes</code>.
     */
    val MEMORY_BY_HOST_BY_CURRENT_BYTES: MemoryByHostByCurrentBytes get() = MemoryByHostByCurrentBytes.MEMORY_BY_HOST_BY_CURRENT_BYTES

    /**
     * The table <code>sys.memory_by_thread_by_current_bytes</code>.
     */
    val MEMORY_BY_THREAD_BY_CURRENT_BYTES: MemoryByThreadByCurrentBytes get() = MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES

    /**
     * The table <code>sys.memory_by_user_by_current_bytes</code>.
     */
    val MEMORY_BY_USER_BY_CURRENT_BYTES: MemoryByUserByCurrentBytes get() = MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES

    /**
     * The table <code>sys.memory_global_by_current_bytes</code>.
     */
    val MEMORY_GLOBAL_BY_CURRENT_BYTES: MemoryGlobalByCurrentBytes get() = MemoryGlobalByCurrentBytes.MEMORY_GLOBAL_BY_CURRENT_BYTES

    /**
     * The table <code>sys.memory_global_total</code>.
     */
    val MEMORY_GLOBAL_TOTAL: MemoryGlobalTotal get() = MemoryGlobalTotal.MEMORY_GLOBAL_TOTAL

    /**
     * The table <code>sys.metrics</code>.
     */
    val METRICS: Metrics get() = Metrics.METRICS

    /**
     * The table <code>sys.processlist</code>.
     */
    val PROCESSLIST: Processlist get() = Processlist.PROCESSLIST

    /**
     * The table <code>sys.ps_check_lost_instrumentation</code>.
     */
    val PS_CHECK_LOST_INSTRUMENTATION: PsCheckLostInstrumentation get() = PsCheckLostInstrumentation.PS_CHECK_LOST_INSTRUMENTATION

    /**
     * The table <code>sys.schema_auto_increment_columns</code>.
     */
    val SCHEMA_AUTO_INCREMENT_COLUMNS: SchemaAutoIncrementColumns get() = SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS

    /**
     * The table <code>sys.schema_index_statistics</code>.
     */
    val SCHEMA_INDEX_STATISTICS: SchemaIndexStatistics get() = SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS

    /**
     * The table <code>sys.schema_object_overview</code>.
     */
    val SCHEMA_OBJECT_OVERVIEW: SchemaObjectOverview get() = SchemaObjectOverview.SCHEMA_OBJECT_OVERVIEW

    /**
     * The table <code>sys.schema_redundant_indexes</code>.
     */
    val SCHEMA_REDUNDANT_INDEXES: SchemaRedundantIndexes get() = SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES

    /**
     * The table <code>sys.schema_table_lock_waits</code>.
     */
    val SCHEMA_TABLE_LOCK_WAITS: SchemaTableLockWaits get() = SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS

    /**
     * The table <code>sys.schema_table_statistics</code>.
     */
    val SCHEMA_TABLE_STATISTICS: SchemaTableStatistics get() = SchemaTableStatistics.SCHEMA_TABLE_STATISTICS

    /**
     * The table <code>sys.schema_table_statistics_with_buffer</code>.
     */
    val SCHEMA_TABLE_STATISTICS_WITH_BUFFER: SchemaTableStatisticsWithBuffer get() = SchemaTableStatisticsWithBuffer.SCHEMA_TABLE_STATISTICS_WITH_BUFFER

    /**
     * The table <code>sys.schema_tables_with_full_table_scans</code>.
     */
    val SCHEMA_TABLES_WITH_FULL_TABLE_SCANS: SchemaTablesWithFullTableScans get() = SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS

    /**
     * The table <code>sys.schema_unused_indexes</code>.
     */
    val SCHEMA_UNUSED_INDEXES: SchemaUnusedIndexes get() = SchemaUnusedIndexes.SCHEMA_UNUSED_INDEXES

    /**
     * The table <code>sys.session</code>.
     */
    val SESSION: Session get() = Session.SESSION

    /**
     * The table <code>sys.session_ssl_status</code>.
     */
    val SESSION_SSL_STATUS: SessionSslStatus get() = SessionSslStatus.SESSION_SSL_STATUS

    /**
     * The table <code>sys.statement_analysis</code>.
     */
    val STATEMENT_ANALYSIS: StatementAnalysis get() = StatementAnalysis.STATEMENT_ANALYSIS

    /**
     * The table <code>sys.statements_with_errors_or_warnings</code>.
     */
    val STATEMENTS_WITH_ERRORS_OR_WARNINGS: StatementsWithErrorsOrWarnings get() = StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS

    /**
     * The table <code>sys.statements_with_full_table_scans</code>.
     */
    val STATEMENTS_WITH_FULL_TABLE_SCANS: StatementsWithFullTableScans get() = StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS

    /**
     * The table <code>sys.statements_with_runtimes_in_95th_percentile</code>.
     */
    val STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE: StatementsWithRuntimesIn_95thPercentile get() = StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE

    /**
     * The table <code>sys.statements_with_sorting</code>.
     */
    val STATEMENTS_WITH_SORTING: StatementsWithSorting get() = StatementsWithSorting.STATEMENTS_WITH_SORTING

    /**
     * The table <code>sys.statements_with_temp_tables</code>.
     */
    val STATEMENTS_WITH_TEMP_TABLES: StatementsWithTempTables get() = StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES

    /**
     * The table <code>sys.sys_config</code>.
     */
    val SYS_CONFIG: SysConfig get() = SysConfig.SYS_CONFIG

    /**
     * The table <code>sys.user_summary</code>.
     */
    val USER_SUMMARY: UserSummary get() = UserSummary.USER_SUMMARY

    /**
     * The table <code>sys.user_summary_by_file_io</code>.
     */
    val USER_SUMMARY_BY_FILE_IO: UserSummaryByFileIo get() = UserSummaryByFileIo.USER_SUMMARY_BY_FILE_IO

    /**
     * The table <code>sys.user_summary_by_file_io_type</code>.
     */
    val USER_SUMMARY_BY_FILE_IO_TYPE: UserSummaryByFileIoType get() = UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE

    /**
     * The table <code>sys.user_summary_by_stages</code>.
     */
    val USER_SUMMARY_BY_STAGES: UserSummaryByStages get() = UserSummaryByStages.USER_SUMMARY_BY_STAGES

    /**
     * The table <code>sys.user_summary_by_statement_latency</code>.
     */
    val USER_SUMMARY_BY_STATEMENT_LATENCY: UserSummaryByStatementLatency get() = UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY

    /**
     * The table <code>sys.user_summary_by_statement_type</code>.
     */
    val USER_SUMMARY_BY_STATEMENT_TYPE: UserSummaryByStatementType get() = UserSummaryByStatementType.USER_SUMMARY_BY_STATEMENT_TYPE

    /**
     * The table <code>sys.version</code>.
     */
    val VERSION: Version get() = Version.VERSION

    /**
     * The table <code>sys.wait_classes_global_by_avg_latency</code>.
     */
    val WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY: WaitClassesGlobalByAvgLatency get() = WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY

    /**
     * The table <code>sys.wait_classes_global_by_latency</code>.
     */
    val WAIT_CLASSES_GLOBAL_BY_LATENCY: WaitClassesGlobalByLatency get() = WaitClassesGlobalByLatency.WAIT_CLASSES_GLOBAL_BY_LATENCY

    /**
     * The table <code>sys.waits_by_host_by_latency</code>.
     */
    val WAITS_BY_HOST_BY_LATENCY: WaitsByHostByLatency get() = WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY

    /**
     * The table <code>sys.waits_by_user_by_latency</code>.
     */
    val WAITS_BY_USER_BY_LATENCY: WaitsByUserByLatency get() = WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY

    /**
     * The table <code>sys.waits_global_by_latency</code>.
     */
    val WAITS_GLOBAL_BY_LATENCY: WaitsGlobalByLatency get() = WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY

    /**
     * The table <code>sys.x$host_summary</code>.
     */
    val `X$HOST_SUMMARY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`

    /**
     * The table <code>sys.x$host_summary_by_file_io</code>.
     */
    val `X$HOST_SUMMARY_BY_FILE_IO` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByFileIo` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByFileIo`.`X$HOST_SUMMARY_BY_FILE_IO`

    /**
     * The table <code>sys.x$host_summary_by_file_io_type</code>.
     */
    val `X$HOST_SUMMARY_BY_FILE_IO_TYPE` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByFileIoType` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByFileIoType`.`X$HOST_SUMMARY_BY_FILE_IO_TYPE`

    /**
     * The table <code>sys.x$host_summary_by_stages</code>.
     */
    val `X$HOST_SUMMARY_BY_STAGES` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByStages` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByStages`.`X$HOST_SUMMARY_BY_STAGES`

    /**
     * The table <code>sys.x$host_summary_by_statement_latency</code>.
     */
    val `X$HOST_SUMMARY_BY_STATEMENT_LATENCY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByStatementLatency` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByStatementLatency`.`X$HOST_SUMMARY_BY_STATEMENT_LATENCY`

    /**
     * The table <code>sys.x$host_summary_by_statement_type</code>.
     */
    val `X$HOST_SUMMARY_BY_STATEMENT_TYPE` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByStatementType` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByStatementType`.`X$HOST_SUMMARY_BY_STATEMENT_TYPE`

    /**
     * The table <code>sys.x$innodb_buffer_stats_by_schema</code>.
     */
    val `X$INNODB_BUFFER_STATS_BY_SCHEMA` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$innodbBufferStatsBySchema` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$innodbBufferStatsBySchema`.`X$INNODB_BUFFER_STATS_BY_SCHEMA`

    /**
     * The table <code>sys.x$innodb_buffer_stats_by_table</code>.
     */
    val `X$INNODB_BUFFER_STATS_BY_TABLE` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$innodbBufferStatsByTable` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$innodbBufferStatsByTable`.`X$INNODB_BUFFER_STATS_BY_TABLE`

    /**
     * The table <code>sys.x$innodb_lock_waits</code>.
     */
    val `X$INNODB_LOCK_WAITS` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$innodbLockWaits` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$innodbLockWaits`.`X$INNODB_LOCK_WAITS`

    /**
     * The table <code>sys.x$io_by_thread_by_latency</code>.
     */
    val `X$IO_BY_THREAD_BY_LATENCY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioByThreadByLatency` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioByThreadByLatency`.`X$IO_BY_THREAD_BY_LATENCY`

    /**
     * The table <code>sys.x$io_global_by_file_by_bytes</code>.
     */
    val `X$IO_GLOBAL_BY_FILE_BY_BYTES` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByFileByBytes` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByFileByBytes`.`X$IO_GLOBAL_BY_FILE_BY_BYTES`

    /**
     * The table <code>sys.x$io_global_by_file_by_latency</code>.
     */
    val `X$IO_GLOBAL_BY_FILE_BY_LATENCY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByFileByLatency` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByFileByLatency`.`X$IO_GLOBAL_BY_FILE_BY_LATENCY`

    /**
     * The table <code>sys.x$io_global_by_wait_by_bytes</code>.
     */
    val `X$IO_GLOBAL_BY_WAIT_BY_BYTES` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByWaitByBytes` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByWaitByBytes`.`X$IO_GLOBAL_BY_WAIT_BY_BYTES`

    /**
     * The table <code>sys.x$io_global_by_wait_by_latency</code>.
     */
    val `X$IO_GLOBAL_BY_WAIT_BY_LATENCY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByWaitByLatency` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByWaitByLatency`.`X$IO_GLOBAL_BY_WAIT_BY_LATENCY`

    /**
     * The table <code>sys.x$latest_file_io</code>.
     */
    val `X$LATEST_FILE_IO` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$latestFileIo` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$latestFileIo`.`X$LATEST_FILE_IO`

    /**
     * The table <code>sys.x$memory_by_host_by_current_bytes</code>.
     */
    val `X$MEMORY_BY_HOST_BY_CURRENT_BYTES` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByHostByCurrentBytes` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByHostByCurrentBytes`.`X$MEMORY_BY_HOST_BY_CURRENT_BYTES`

    /**
     * The table <code>sys.x$memory_by_thread_by_current_bytes</code>.
     */
    val `X$MEMORY_BY_THREAD_BY_CURRENT_BYTES` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByThreadByCurrentBytes` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByThreadByCurrentBytes`.`X$MEMORY_BY_THREAD_BY_CURRENT_BYTES`

    /**
     * The table <code>sys.x$memory_by_user_by_current_bytes</code>.
     */
    val `X$MEMORY_BY_USER_BY_CURRENT_BYTES` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByUserByCurrentBytes` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByUserByCurrentBytes`.`X$MEMORY_BY_USER_BY_CURRENT_BYTES`

    /**
     * The table <code>sys.x$memory_global_by_current_bytes</code>.
     */
    val `X$MEMORY_GLOBAL_BY_CURRENT_BYTES` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes`.`X$MEMORY_GLOBAL_BY_CURRENT_BYTES`

    /**
     * The table <code>sys.x$memory_global_total</code>.
     */
    val `X$MEMORY_GLOBAL_TOTAL` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalTotal` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalTotal`.`X$MEMORY_GLOBAL_TOTAL`

    /**
     * The table <code>sys.x$processlist</code>.
     */
    val `X$PROCESSLIST` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$processlist` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$processlist`.`X$PROCESSLIST`

    /**
     * The table <code>sys.x$ps_digest_95th_percentile_by_avg_us</code>.
     */
    val `X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psDigest_95thPercentileByAvgUs` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psDigest_95thPercentileByAvgUs`.`X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US`

    /**
     * The table <code>sys.x$ps_digest_avg_latency_distribution</code>.
     */
    val `X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psDigestAvgLatencyDistribution` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psDigestAvgLatencyDistribution`.`X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION`

    /**
     * The table <code>sys.x$ps_schema_table_statistics_io</code>.
     */
    val `X$PS_SCHEMA_TABLE_STATISTICS_IO` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psSchemaTableStatisticsIo` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psSchemaTableStatisticsIo`.`X$PS_SCHEMA_TABLE_STATISTICS_IO`

    /**
     * The table <code>sys.x$schema_flattened_keys</code>.
     */
    val `X$SCHEMA_FLATTENED_KEYS` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaFlattenedKeys` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaFlattenedKeys`.`X$SCHEMA_FLATTENED_KEYS`

    /**
     * The table <code>sys.x$schema_index_statistics</code>.
     */
    val `X$SCHEMA_INDEX_STATISTICS` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaIndexStatistics` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaIndexStatistics`.`X$SCHEMA_INDEX_STATISTICS`

    /**
     * The table <code>sys.x$schema_table_lock_waits</code>.
     */
    val `X$SCHEMA_TABLE_LOCK_WAITS` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTableLockWaits` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTableLockWaits`.`X$SCHEMA_TABLE_LOCK_WAITS`

    /**
     * The table <code>sys.x$schema_table_statistics</code>.
     */
    val `X$SCHEMA_TABLE_STATISTICS` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTableStatistics` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTableStatistics`.`X$SCHEMA_TABLE_STATISTICS`

    /**
     * The table <code>sys.x$schema_table_statistics_with_buffer</code>.
     */
    val `X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTableStatisticsWithBuffer` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTableStatisticsWithBuffer`.`X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER`

    /**
     * The table <code>sys.x$schema_tables_with_full_table_scans</code>.
     */
    val `X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTablesWithFullTableScans` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTablesWithFullTableScans`.`X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS`

    /**
     * The table <code>sys.x$session</code>.
     */
    val `X$SESSION` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$session` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$session`.`X$SESSION`

    /**
     * The table <code>sys.x$statement_analysis</code>.
     */
    val `X$STATEMENT_ANALYSIS` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementAnalysis` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementAnalysis`.`X$STATEMENT_ANALYSIS`

    /**
     * The table <code>sys.x$statements_with_errors_or_warnings</code>.
     */
    val `X$STATEMENTS_WITH_ERRORS_OR_WARNINGS` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithErrorsOrWarnings` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithErrorsOrWarnings`.`X$STATEMENTS_WITH_ERRORS_OR_WARNINGS`

    /**
     * The table <code>sys.x$statements_with_full_table_scans</code>.
     */
    val `X$STATEMENTS_WITH_FULL_TABLE_SCANS` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithFullTableScans` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithFullTableScans`.`X$STATEMENTS_WITH_FULL_TABLE_SCANS`

    /**
     * The table <code>sys.x$statements_with_runtimes_in_95th_percentile</code>.
     */
    val `X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithRuntimesIn_95thPercentile` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithRuntimesIn_95thPercentile`.`X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE`

    /**
     * The table <code>sys.x$statements_with_sorting</code>.
     */
    val `X$STATEMENTS_WITH_SORTING` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithSorting` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithSorting`.`X$STATEMENTS_WITH_SORTING`

    /**
     * The table <code>sys.x$statements_with_temp_tables</code>.
     */
    val `X$STATEMENTS_WITH_TEMP_TABLES` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithTempTables` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithTempTables`.`X$STATEMENTS_WITH_TEMP_TABLES`

    /**
     * The table <code>sys.x$user_summary</code>.
     */
    val `X$USER_SUMMARY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummary` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummary`.`X$USER_SUMMARY`

    /**
     * The table <code>sys.x$user_summary_by_file_io</code>.
     */
    val `X$USER_SUMMARY_BY_FILE_IO` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByFileIo` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByFileIo`.`X$USER_SUMMARY_BY_FILE_IO`

    /**
     * The table <code>sys.x$user_summary_by_file_io_type</code>.
     */
    val `X$USER_SUMMARY_BY_FILE_IO_TYPE` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByFileIoType` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByFileIoType`.`X$USER_SUMMARY_BY_FILE_IO_TYPE`

    /**
     * The table <code>sys.x$user_summary_by_stages</code>.
     */
    val `X$USER_SUMMARY_BY_STAGES` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByStages` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByStages`.`X$USER_SUMMARY_BY_STAGES`

    /**
     * The table <code>sys.x$user_summary_by_statement_latency</code>.
     */
    val `X$USER_SUMMARY_BY_STATEMENT_LATENCY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByStatementLatency` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByStatementLatency`.`X$USER_SUMMARY_BY_STATEMENT_LATENCY`

    /**
     * The table <code>sys.x$user_summary_by_statement_type</code>.
     */
    val `X$USER_SUMMARY_BY_STATEMENT_TYPE` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByStatementType` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByStatementType`.`X$USER_SUMMARY_BY_STATEMENT_TYPE`

    /**
     * The table <code>sys.x$wait_classes_global_by_avg_latency</code>.
     */
    val `X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByAvgLatency` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByAvgLatency`.`X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY`

    /**
     * The table <code>sys.x$wait_classes_global_by_latency</code>.
     */
    val `X$WAIT_CLASSES_GLOBAL_BY_LATENCY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByLatency` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByLatency`.`X$WAIT_CLASSES_GLOBAL_BY_LATENCY`

    /**
     * The table <code>sys.x$waits_by_host_by_latency</code>.
     */
    val `X$WAITS_BY_HOST_BY_LATENCY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitsByHostByLatency` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitsByHostByLatency`.`X$WAITS_BY_HOST_BY_LATENCY`

    /**
     * The table <code>sys.x$waits_by_user_by_latency</code>.
     */
    val `X$WAITS_BY_USER_BY_LATENCY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitsByUserByLatency` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitsByUserByLatency`.`X$WAITS_BY_USER_BY_LATENCY`

    /**
     * The table <code>sys.x$waits_global_by_latency</code>.
     */
    val `X$WAITS_GLOBAL_BY_LATENCY` : com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitsGlobalByLatency` get() = com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitsGlobalByLatency`.`X$WAITS_GLOBAL_BY_LATENCY`

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getTables(): List<Table<*>> = listOf(
        HostSummary.HOST_SUMMARY,
        HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO,
        HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE,
        HostSummaryByStages.HOST_SUMMARY_BY_STAGES,
        HostSummaryByStatementLatency.HOST_SUMMARY_BY_STATEMENT_LATENCY,
        HostSummaryByStatementType.HOST_SUMMARY_BY_STATEMENT_TYPE,
        InnodbBufferStatsBySchema.INNODB_BUFFER_STATS_BY_SCHEMA,
        InnodbBufferStatsByTable.INNODB_BUFFER_STATS_BY_TABLE,
        InnodbLockWaits.INNODB_LOCK_WAITS,
        IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY,
        IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES,
        IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY,
        IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES,
        IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY,
        LatestFileIo.LATEST_FILE_IO,
        MemoryByHostByCurrentBytes.MEMORY_BY_HOST_BY_CURRENT_BYTES,
        MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES,
        MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES,
        MemoryGlobalByCurrentBytes.MEMORY_GLOBAL_BY_CURRENT_BYTES,
        MemoryGlobalTotal.MEMORY_GLOBAL_TOTAL,
        Metrics.METRICS,
        Processlist.PROCESSLIST,
        PsCheckLostInstrumentation.PS_CHECK_LOST_INSTRUMENTATION,
        SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS,
        SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS,
        SchemaObjectOverview.SCHEMA_OBJECT_OVERVIEW,
        SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES,
        SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS,
        SchemaTableStatistics.SCHEMA_TABLE_STATISTICS,
        SchemaTableStatisticsWithBuffer.SCHEMA_TABLE_STATISTICS_WITH_BUFFER,
        SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS,
        SchemaUnusedIndexes.SCHEMA_UNUSED_INDEXES,
        Session.SESSION,
        SessionSslStatus.SESSION_SSL_STATUS,
        StatementAnalysis.STATEMENT_ANALYSIS,
        StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS,
        StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS,
        StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE,
        StatementsWithSorting.STATEMENTS_WITH_SORTING,
        StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES,
        SysConfig.SYS_CONFIG,
        UserSummary.USER_SUMMARY,
        UserSummaryByFileIo.USER_SUMMARY_BY_FILE_IO,
        UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE,
        UserSummaryByStages.USER_SUMMARY_BY_STAGES,
        UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY,
        UserSummaryByStatementType.USER_SUMMARY_BY_STATEMENT_TYPE,
        Version.VERSION,
        WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY,
        WaitClassesGlobalByLatency.WAIT_CLASSES_GLOBAL_BY_LATENCY,
        WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY,
        WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY,
        WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummary`.`X$HOST_SUMMARY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByFileIo`.`X$HOST_SUMMARY_BY_FILE_IO`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByFileIoType`.`X$HOST_SUMMARY_BY_FILE_IO_TYPE`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByStages`.`X$HOST_SUMMARY_BY_STAGES`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByStatementLatency`.`X$HOST_SUMMARY_BY_STATEMENT_LATENCY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$hostSummaryByStatementType`.`X$HOST_SUMMARY_BY_STATEMENT_TYPE`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$innodbBufferStatsBySchema`.`X$INNODB_BUFFER_STATS_BY_SCHEMA`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$innodbBufferStatsByTable`.`X$INNODB_BUFFER_STATS_BY_TABLE`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$innodbLockWaits`.`X$INNODB_LOCK_WAITS`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioByThreadByLatency`.`X$IO_BY_THREAD_BY_LATENCY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByFileByBytes`.`X$IO_GLOBAL_BY_FILE_BY_BYTES`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByFileByLatency`.`X$IO_GLOBAL_BY_FILE_BY_LATENCY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByWaitByBytes`.`X$IO_GLOBAL_BY_WAIT_BY_BYTES`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$ioGlobalByWaitByLatency`.`X$IO_GLOBAL_BY_WAIT_BY_LATENCY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$latestFileIo`.`X$LATEST_FILE_IO`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByHostByCurrentBytes`.`X$MEMORY_BY_HOST_BY_CURRENT_BYTES`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByThreadByCurrentBytes`.`X$MEMORY_BY_THREAD_BY_CURRENT_BYTES`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryByUserByCurrentBytes`.`X$MEMORY_BY_USER_BY_CURRENT_BYTES`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalByCurrentBytes`.`X$MEMORY_GLOBAL_BY_CURRENT_BYTES`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$memoryGlobalTotal`.`X$MEMORY_GLOBAL_TOTAL`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$processlist`.`X$PROCESSLIST`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psDigest_95thPercentileByAvgUs`.`X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psDigestAvgLatencyDistribution`.`X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$psSchemaTableStatisticsIo`.`X$PS_SCHEMA_TABLE_STATISTICS_IO`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaFlattenedKeys`.`X$SCHEMA_FLATTENED_KEYS`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaIndexStatistics`.`X$SCHEMA_INDEX_STATISTICS`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTableLockWaits`.`X$SCHEMA_TABLE_LOCK_WAITS`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTableStatistics`.`X$SCHEMA_TABLE_STATISTICS`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTableStatisticsWithBuffer`.`X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$schemaTablesWithFullTableScans`.`X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$session`.`X$SESSION`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementAnalysis`.`X$STATEMENT_ANALYSIS`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithErrorsOrWarnings`.`X$STATEMENTS_WITH_ERRORS_OR_WARNINGS`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithFullTableScans`.`X$STATEMENTS_WITH_FULL_TABLE_SCANS`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithRuntimesIn_95thPercentile`.`X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithSorting`.`X$STATEMENTS_WITH_SORTING`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$statementsWithTempTables`.`X$STATEMENTS_WITH_TEMP_TABLES`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummary`.`X$USER_SUMMARY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByFileIo`.`X$USER_SUMMARY_BY_FILE_IO`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByFileIoType`.`X$USER_SUMMARY_BY_FILE_IO_TYPE`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByStages`.`X$USER_SUMMARY_BY_STAGES`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByStatementLatency`.`X$USER_SUMMARY_BY_STATEMENT_LATENCY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$userSummaryByStatementType`.`X$USER_SUMMARY_BY_STATEMENT_TYPE`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByAvgLatency`.`X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitClassesGlobalByLatency`.`X$WAIT_CLASSES_GLOBAL_BY_LATENCY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitsByHostByLatency`.`X$WAITS_BY_HOST_BY_LATENCY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitsByUserByLatency`.`X$WAITS_BY_USER_BY_LATENCY`,
        com.kjs990114.infra.persistence.jooq.trade.sys.tables.`X$waitsGlobalByLatency`.`X$WAITS_GLOBAL_BY_LATENCY`
    )
}