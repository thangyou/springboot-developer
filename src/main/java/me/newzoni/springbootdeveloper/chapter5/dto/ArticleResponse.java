package me.newzoni.springbootdeveloper.chapter5.dto;

import lombok.Getter;
import me.newzoni.springbootdeveloper.chapter5.domain.Article;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }

}
