package com.resume.backend.domain

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.resume.backend.commons.CommonEntity
import io.hypersistence.utils.hibernate.type.json.JsonType
import jakarta.persistence.*
import org.hibernate.annotations.Type
import kotlin.reflect.typeOf

@Entity
open class Resume() : CommonEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null // 이력서 ID
    private val title: String? = null // 자기소개서 제목
    private val companyName: String? = null // 회사명

    @Type(value = JsonType::class)
    @Column(columnDefinition = "json")
    private val essay: Map<String,String>? =null // 자기소개서 질문과답

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private var member: Member?=null
}
