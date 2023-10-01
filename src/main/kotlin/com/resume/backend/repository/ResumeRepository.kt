package com.resume.backend.repository

import com.resume.backend.domain.Resume
import org.springframework.data.jpa.repository.JpaRepository

interface ResumeRepository : JpaRepository<Resume,Long> {

}