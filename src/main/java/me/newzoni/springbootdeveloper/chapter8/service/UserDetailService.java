package me.newzoni.springbootdeveloper.chapter8.service;

import lombok.RequiredArgsConstructor;
import me.newzoni.springbootdeveloper.chapter8.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {
    // UserDetailsService : 스프링 시큐리티에서 사용자 정보를 가져오는 인터페이스
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException(email));
    }
}
