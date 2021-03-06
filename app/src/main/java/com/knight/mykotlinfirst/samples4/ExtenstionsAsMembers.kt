package com.knight.mykotlinfirst.samples4

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 16:20
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 16:20
 * version: v 1.0
 */
/**
 * https://kotlinlang.org/docs/reference/extensions.html
 */
open class D {

}

class D1 : D() {

}

open class C {
    open fun D.foo() {
        println("D.foo in C")
    }

    open fun D1.foo() {
        println("D1.foo in C")
    }

    fun caller(d: D) {
        d.foo() //call the extension function
    }
}

class C1 : C() {
    override fun D.foo() {
        println("D.foo in C1")
    }

    override fun D1.foo() {
        println("D1.foo in C1")
    }
}

fun testAsMembers() {
    C().caller(D()) //prints "D.foo in C"
    C1().caller(D()) //prints "D.foo in C1" - dispatch receiver is resolved virtually
    C().caller(D1()) // prints "D.foo in C" - dispatch receiver is resolved statically
    C1().caller(D1()) // prints "D.foo in C1"
}