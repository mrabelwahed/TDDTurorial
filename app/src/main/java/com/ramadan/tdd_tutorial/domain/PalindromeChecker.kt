package com.ramadan.tdd_tutorial.domain

class PalindromeChecker {

    fun isValid(str: String): Boolean {
        val arr = str.trim().lowercase().toCharArray()
        var st = 0
        var en = arr.size - 1
        while (st < en) {
            if (arr[st++] != arr[en--])
                return false
        }
        return true
    }
}