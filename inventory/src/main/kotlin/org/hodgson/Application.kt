package org.hodgson

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("org.hodgson")
                .mainClass(Application.javaClass)
                .start()
    }
}