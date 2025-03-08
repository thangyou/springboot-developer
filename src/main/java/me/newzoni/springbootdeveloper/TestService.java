package me.newzoni.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
//    final  // Bean 주입
    MemberRepository memberRepository;

//    public TestService(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
