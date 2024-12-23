package com.kjs990114.application

interface Params {
    fun validate(): Boolean {
        return true
    }
}

interface UseCase<in P : Params, out R> {
    fun execute(params: P): R
}