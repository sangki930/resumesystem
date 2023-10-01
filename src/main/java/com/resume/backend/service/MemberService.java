package com.resume.backend.service;

import com.resume.backend.domain.Member;
import com.resume.backend.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member getMemberById(Long id){
        return memberRepository.findById(id).orElseThrow(()->new NoSuchElementException("존재하는 회원이 아닙니다."));
    }

    public Member getMemberByUsername(String username){
        return memberRepository.findByUsername(username);
    }

    // 회원 추가
    public Member addMember(Member member){
        return memberRepository.save(member);
    }

    // 회원 수정
    public Member updateMember(Member member){
        return memberRepository.save(member);
    }

    // 회원 삭제(물리적)
    public void deleteMember(Member member){
         memberRepository.delete(member);
    }

    // 계정명으로 회원 삭제(물리적)
    public void deleteMemberByUsername(String username){
        memberRepository.deleteMemberByUsername(username);
    }
}
