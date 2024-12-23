package com.kjs990114.data

interface Entity {
    val pk: PK
}

interface Auditable {
    val audit: Audit
}

interface AuditableEntity: Auditable, Entity