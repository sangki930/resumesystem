package com.resume.backend.domain;


import com.resume.backend.commons.CommonEntity;
import com.resume.backend.domain.Resume;
import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmDefaultWithCompatibility;
import lombok.*;
import org.hibernate.annotations.Type;

import java.util.Collection;
import java.util.Map;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Member extends CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;
    private String name;


    @OneToMany(mappedBy = "member")
    private Collection<Resume> resumes;

}