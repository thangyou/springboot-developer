package me.newzoni.springbootdeveloper.chapter7.dto;

import lombok.Getter;
import me.newzoni.springbootdeveloper.chapter5.domain.Article;

@Getter
public class ArticleListViewResponse {

    private final Long id;
    private String title;
    private String content;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }

}
