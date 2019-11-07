package com.example.kaphelcoma.test

import org.openqa.selenium.By

class CreateProblemPage : WebPage() {
    fun open() {
        click(By.linkText("Aphelcoma"))
        click(By.linkText("New Problem"))
    }

    fun fillProblemFields(problem: ProblemData) {
        fillElement(By.id("problem_title")).with(problem.title)
        fillElement(By.id("problem_description")).with(problem.description)
    }

    fun submit() {
        click(By.name("commit"))
    }
}
