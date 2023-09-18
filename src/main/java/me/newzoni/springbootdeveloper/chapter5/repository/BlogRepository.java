package me.newzoni.springbootdeveloper.chapter5.repository;

import me.newzoni.springbootdeveloper.chapter5.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Article, Long> {
}
