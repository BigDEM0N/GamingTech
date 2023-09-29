package com.example.gamingtech.controller;

import com.example.gamingtech.entity.Article;
import com.example.gamingtech.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    @Autowired
    private ArticleMapper articleMapper;

    @GetMapping("/article")
    public String articleget(){
        return "article";
    }

    /**
     * 存储文章
     */
    @PostMapping("/post")
    public String post(Article article){
        int i = articleMapper.insert(article);
        System.out.println(article);
        if(i>0)
        {
            return "ok";
        }
        else{
            return "fault";
        }
    }

}
