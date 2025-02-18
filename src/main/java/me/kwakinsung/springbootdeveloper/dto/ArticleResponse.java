package me.kwakinsung.springbootdeveloper.dto;

import lombok.Getter;
import me.kwakinsung.springbootdeveloper.domain.Article;

@Getter
public class ArticleResponse {
    //전체 글 목록을 조회하고 응답하는 역할

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
