package com.example.kaphelcoma.test

import org.junit.After
import org.junit.Before
import org.junit.Test

class LogInTest {
    private lateinit var loginPage: LoginPage
    private lateinit var credentials: AccountData

    @Before
    fun initialize() {
        loginPage = LoginPage()
        credentials = AccountData("aivvent@yandex.ru", "123456")
    }

    @Test
    fun testLogIn() {
        loginPage.open()
        loginPage.logIn(credentials)
    }

    @After
    fun logOut() {
        loginPage.logOut()
        loginPage.close()
    }
}
