package org.ferby.vue.controller;

import org.ferby.vue.entity.Article;
import org.ferby.vue.entity.ResultBean;
import org.ferby.vue.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @PostMapping("/article")
    public ResultBean addArticle(Article article){
        return articleService.addArticle(article);
    }
}
