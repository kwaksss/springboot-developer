package me.kwakinsung.springbootdeveloper.repository;

import me.kwakinsung.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article,Long> {
    //Article형,Long형
}
