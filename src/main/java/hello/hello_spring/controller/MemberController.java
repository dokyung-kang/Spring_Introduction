package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;
    // 필드 주입
//    @Autowired private MemberService memberService;

    // setter  주입
    // 단점 - 퍼블릭으로 노출되어 수정될 수도 있음 - 근데 보통 변경되지 않는 애임
//    @Autowired
//    public void setMemberService(MemberService memberService){
//        this.memberService = memberService;
//    }

    // 생성자 주입
    // 얘를 추천
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
