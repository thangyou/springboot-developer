package me.newzoni.springbootdeveloper.chapter8.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Builder
    public User(String email, String password, String auth) {
        this.email = email;
        this.password = password;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { // 권한 반환
        return List.of(new SimpleGrantedAuthority("user"));
    }

    @Override
    public String getPassword() { // 사용자 password 반환
        return password;
    }

    @Override
    public String getUsername() { // 사용자 id(고유값) 반환
        return email; // unique = true 속성인 email 반환
    }

    @Override
    public boolean isAccountNonExpired() { // 계정 만료 여부 반환
        // 만료 확인 로직
        return true; // true -> 만료 X
    }

    @Override
    public boolean isAccountNonLocked() { // 계정 잠금 여부 반환
        // 계정 잠금 확인 로직
        return true; // true -> 잠금 X
    }

    @Override
    public boolean isCredentialsNonExpired() { // 패스워드 만료 여부 반환
        // 패스워드 만료 확인 로직
        return true; // true -> 만료 X
    }

    @Override
    public boolean isEnabled() { // 계정 사용 가능 여부 반환
        // 계쩡 사용 가능 확인 로직
        return true; // true -> 사용 가능
    }
}
