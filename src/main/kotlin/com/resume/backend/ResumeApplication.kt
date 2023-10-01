package com.resume.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing(modifyOnCreate = true) // Jpa Auditing 실행
@SpringBootApplication
@ConfigurationPropertiesScan
class ResumeApplication

fun main(args: Array<String>) {
    runApplication<ResumeApplication>(*args)
}
