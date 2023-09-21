package me.newzoni.springbootdeveloper.chapter8.repository;

import me.newzoni.springbootdeveloper.chapter8.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email); // email로 사용자 정보 가져옴
    /* findByEmail Query문
    FROM users
    WHERE email = #{email}
     */
}
