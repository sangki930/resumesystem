package com.resume.backend.repository;

import com.resume.backend.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Member findByUsername(String username);

    int deleteMemberByUsername(String username);
}
