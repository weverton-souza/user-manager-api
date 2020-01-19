package com.caltech.software.solutions.user.manager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserManagerApiApplication

fun main(args: Array<String>) {
    runApplication<UserManagerApiApplication>(*args)
}
