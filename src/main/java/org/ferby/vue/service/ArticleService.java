package org.ferby.vue.service;

import org.ferby.vue.dao.ArticleRepository;
import org.ferby.vue.entity.Article;
import org.ferby.vue.entity.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;
    public ResultBean addArticle(Article article){
        Article save = articleRepository.save(article);
        if(save!=null){
            return new ResultBean(200,"success",save);
        }else{
            return new ResultBean(500,"error",null);
        }
    }
}
