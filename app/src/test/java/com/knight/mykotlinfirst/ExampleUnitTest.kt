package com.knight.mykotlinfirst

import com.knight.mykotlinfirst.samples1.testString1
import com.knight.mykotlinfirst.samples1.testString2
import com.knight.mykotlinfirst.samples1.testString3
import com.knight.mykotlinfirst.samples11.alphabet
import com.knight.mykotlinfirst.samples11.alphabet2
import com.knight.mykotlinfirst.samples11.alphabet3
import com.knight.mykotlinfirst.samples12.alphabet5
import com.knight.mykotlinfirst.samples13.testNullType
import com.knight.mykotlinfirst.samples14.testOperator
import com.knight.mykotlinfirst.samples15.test05
import com.knight.mykotlinfirst.samples16.testStrategy
import com.knight.mykotlinfirst.samples2.curruntPiont
import com.knight.mykotlinfirst.samples2.curruntPiont2
import com.knight.mykotlinfirst.samples2.max
import com.knight.mykotlinfirst.samples2.max2
import com.knight.mykotlinfirst.samples3.printlnList
import com.knight.mykotlinfirst.samples3.printlnList2
import com.knight.mykotlinfirst.samples3.printlnList3
import com.knight.mykotlinfirst.samples4.*
import com.knight.mykotlinfirst.samples5.testLateinit
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    fun testKotlinTip1() {
        testString1()
        testString2()
        testString3()
    }

    @Test
    fun testKotlinTip2() {
        max(45, 9)
        max2(236, 756)
        curruntPiont('B')
        curruntPiont2(876)
    }

    @Test
    fun testKotlinTip3() {
        printlnList()
        printlnList2()
        printlnList3()
    }

    @Test
    fun testKotlinTips4() {
        testFunExtension()
        printlnList4()
        texstExtension()
    }

    @Test
    fun testExtenstionsAsMembers() {
        testAsMembers()
    }

    @Test
    fun testStaticallyExtension() {
        testStatically()
    }

    @Test
    fun testKotlinTip5() {
        testLateinit()
    }

    @Test
    fun testKotlinTip11() {
        println(alphabet())
        println(alphabet2())
        println(alphabet3())
        println(alphabet())
    }

    @Test
    fun testKoltinTip12() {
        println(alphabet5())
//        testApply()
    }

    @Test
    fun testKotlinTip13() {
        println(testNullType())
    }

    @Test
    fun testKotlinTip14() {
        testOperator()
    }

    @Test
    fun testKotlinTip15() {
        test05()
    }

    @Test
    fun testKotlinTip16() {
        testStrategy()
    }
}