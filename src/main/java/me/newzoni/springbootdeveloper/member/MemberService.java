//package me.newzoni.springbootdeveloper.member;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class MemberService {
//
//    @Autowired
//    MemberRepository memberRepository;
//
//    public void test() {
//        // 1. Create
//        memberRepository.save(new Member(1L, "A"));
//        // save()로 데이터 객체를 저장
//        // 전달 인수로 Entity Member를 넘기면, 저장한 Entity return 받음
//
//        // 2. Read
//        Optional<Member> member = memberRepository.findById(1L);
//        List<Member> allMembers = memberRepository.findAll();
//
//        // 3. Delete
//        memberRepository.deleteById(1L);
//    }
//
//}
