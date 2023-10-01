package com.resume.backend.controller;

import com.resume.backend.controller.dto.ErrorMessage;
import com.resume.backend.controller.dto.MemberDTO;
import com.resume.backend.domain.Member;
import com.resume.backend.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private MemberService memberService;
    
    // 회원정보 얻기
    @GetMapping("/getMember/{username}")
    public ResponseEntity<Member> getMember(@PathVariable String username){
        return new ResponseEntity<>(new Member(), HttpStatus.OK);
    }

    @PostMapping("/addMember")
    public ResponseEntity<?> addMember(MemberDTO memberDTO){
        Member member = new Member();
        member.setUsername(memberDTO.username());
        member.setPassword(memberDTO.password());
        member.setName(memberDTO.name());
        try {
            member = memberService.addMember(member);
        }catch (Exception exception){
                return new ResponseEntity<>(
                        new ErrorMessage("알 수 없는 에러가 발생하였습니다.",exception.getLocalizedMessage())
                        ,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @PutMapping("/updateMember")
    public ResponseEntity<?> updateMember(MemberDTO memberDTO){
        Member member = new Member();
        member.setUsername(memberDTO.username());
        member.setPassword(memberDTO.password());
        member.setName(memberDTO.name());
        try{
            member = memberService.updateMember(member);
        }catch (Exception exception){
            return new ResponseEntity<>(
                    new ErrorMessage("알 수 없는 에러가 발생하였습니다.",exception.getLocalizedMessage())
                    ,HttpStatus.INTERNAL_SERVER_ERROR);        }
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    // 물리적 삭제
    @DeleteMapping("/deleteMember")
    public ResponseEntity<?> deleteMember(String username){
        return new ResponseEntity<>("정상적으로 제거되었습니다.",HttpStatus.OK);
    }

}




