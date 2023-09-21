package me.newzoni.springbootdeveloper.chapter8.service;

import lombok.RequiredArgsConstructor;
import me.newzoni.springbootdeveloper.chapter8.domain.User;
import me.newzoni.springbootdeveloper.chapter8.dto.AddUserRequest;
import me.newzoni.springbootdeveloper.chapter8.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
// final 변수, Notnull 표시가 된 변수처럼 필수적인 정보를 세팅하는 생성자 생성
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public  Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                // 패스워드 암호화
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }

}
