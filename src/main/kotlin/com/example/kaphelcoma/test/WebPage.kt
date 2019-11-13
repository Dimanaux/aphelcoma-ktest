package com.example.kaphelcoma.test

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.util.concurrent.TimeUnit

open class WebPage {
    companion object {
        val driver: WebDriver = ChromeDriver()
    }

    val host = "http://aphelcoma.herokuapp.com/"

    init {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
        navigateToPage("/")
    }

    fun navigateToPage(uri: String) {
        driver.get(host + uri)
    }

    fun fillElement(selector: By): (String) -> Unit {
        val element = driver.findElement(selector)
        element.clear()
        return { element.sendKeys(it) }
    }

    fun ((String) -> Unit).with(string: String) {
        this.invoke(string)
    }

    fun click(selector: By) {
        driver.findElement(selector).click()
    }

    fun logOut() {
        click(By.linkText("Sign out"))
    }

    fun close() {
        driver.quit()
    }
}
