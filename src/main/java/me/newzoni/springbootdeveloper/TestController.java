package me.newzoni.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {

    @Autowired
//    final // TestService Bean 주입
    TestService testService;

//    public TestController(TestService testService) {
//        this.testService = testService;
//    }

    @GetMapping("/test")
//    public  String test() {
//        return "Hello, World !";
//    }
    public List<Member> getAllMembers() {
        return testService.getAllMembers();
    }

}
