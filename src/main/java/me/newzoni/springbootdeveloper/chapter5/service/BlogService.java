package me.newzoni.springbootdeveloper.chapter5.service;

import lombok.RequiredArgsConstructor;
import me.newzoni.springbootdeveloper.chapter5.domain.Article;
import me.newzoni.springbootdeveloper.chapter5.dto.UpdateArticleRequest;
import me.newzoni.springbootdeveloper.chapter5.repository.BlogRepository;
import me.newzoni.springbootdeveloper.chapter5.dto.AddArticleRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @NotNull 이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
        // save()는 JpaRepository에서 지원하는 메서드로
        // AddArticleRequest 클래스에 저장된 값들을 article 데이터베이스에 저장
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }
}
