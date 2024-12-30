package com.kjs990114.application.error

interface InvalidParamErrorInfo: ApplicationErrorInfo {
    val field: String
    override fun message() = "${super.message()} ($field)"

    override fun toException(cause: Throwable?) = InvalidParamException(this, cause)
    override fun toException() = toException(null)
}

class InvalidParamException(
    override val errors: List<InvalidParamErrorInfo>,
    cause: Throwable?
): ApplicationException(errors, cause){
    constructor(error: InvalidParamErrorInfo, cause: Throwable? = null): this(listOf(error), cause)
}