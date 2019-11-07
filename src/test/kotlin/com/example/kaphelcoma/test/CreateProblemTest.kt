package com.example.kaphelcoma.test

import org.junit.After
import org.junit.Before
import org.junit.Test

class CreateProblemTest {
    private val problemPage: CreateProblemPage = CreateProblemPage()
    private val problemData: ProblemData = ProblemData(
        "Reverse a number",
        """
            Given a number `x1 x2 ... xn`,
            return number `xn xn-1 ... x2 x1`.
            
            **Trail leading zeroes!**
            """.trimIndent()
    )

    @Before
    fun logIn() {
        val credentials = AccountData("aivvent@yandex.ru", "123456")
        val logInPage = LoginPage()
        logInPage.open()
        logInPage.logIn(credentials)
    }

    @Test
    fun testCreation() {
        problemPage.open()
        problemPage.fillProblemFields(problemData)
        problemPage.submit()
    }

    @After
    fun logOut() {
        problemPage.close()
    }
}