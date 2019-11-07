package com.example.kaphelcoma.test

import org.openqa.selenium.By

class LoginPage : WebPage() {
    fun open() {
        click(By.linkText("Log in"))
    }

    fun logIn(credentials: AccountData) {
        fillElement(By.id("user_email")).with(credentials.email)
        fillElement(By.id("user_password")).with(credentials.password)
        click(By.name("commit"))
    }
}
