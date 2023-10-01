package com.resume.backend.service

import com.resume.backend.domain.Member
import com.resume.backend.domain.Resume
import com.resume.backend.repository.MemberRepository
import com.resume.backend.repository.ResumeRepository
import org.springframework.stereotype.Service

@Service
class ResumeService (
    val memberRepository : MemberRepository,
    val resumeRepository : ResumeRepository
){
    // 모든 이력서 목록 부르기
    fun getResumeList(): MutableList<Resume?> {
        return resumeRepository.findAll()
    }

    // 이력서 불러오기
    fun getResume(id:Long?=null) : Resume? {
        return resumeRepository.findById(id!!).orElseThrow{throw NoSuchElementException("해당 이력서가 없습니다.")}
    }

    // 이력서 추가
    fun addResume(resume: Resume?): Resume? {

        // !! : Null이 아님을 명시
        return resumeRepository.save(resume!!)
    }

    // 이력서 수정
    fun updateResume(resume: Resume?): Resume? {

        return resumeRepository.save(resume!!)
    }

}