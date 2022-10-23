package com.ramadan.tdd_tutorial

import com.ramadan.tdd_tutorial.domain.PalindromeChecker
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class PalindromeCheckerTest {
    lateinit var pc: PalindromeChecker

    @Before
    fun init() {
        pc = PalindromeChecker()
    }

    @Test
    fun `Given PalindromeChecker has mon as input , when I call isValid method , I should expect true result`() {
        val actual = pc.isValid("mom")
        assertTrue(actual)
    }

    @Test
    fun `Given PalindromeChecker has bill as input , when I call isValid method , I should expect false result`() {
        val actual = pc.isValid("bill")
        assertFalse(actual)
    }

    @Test
    fun `Given PalindromeChecker has dad as input , when I call isValid method , I should expect true result`() {
        val actual = pc.isValid("dad")
        assertTrue(actual)
    }

    @Test
    fun `Given PalindromeChecker has Mon as input , when I call isValid method , I should expect true result`() {
        val actual = pc.isValid("Mom")
        assertTrue(actual)
    }


    @Test
    fun `Given PalindromeChecker has Mon with suffix spaces as input , when I call isValid method , I should expect true result`() {
        val actual = pc.isValid("Mom     ")
        assertTrue(actual)
    }

}