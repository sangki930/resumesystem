package com.resume.backend.commons

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.hibernate.annotations.CreationTimestamp
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
open class CommonEntity {
    @Column(updatable = false)
    @CreationTimestamp
    private val created_at: LocalDateTime? = null

    @LastModifiedDate
    private val updated_at: LocalDateTime? = null
    private val deleted = false
}
