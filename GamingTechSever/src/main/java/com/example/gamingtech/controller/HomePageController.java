package com.example.gamingtech.controller;

import com.example.gamingtech.entity.Article;
import com.example.gamingtech.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomePageController {
    /**
     *  声明mapper接口
     */
    @Autowired
    private ArticleMapper articleMapper;
    @GetMapping("/")
    public List homepage(){
//      List<Article> list = articleMapper.findAll();
        List<Article> list = articleMapper.selectList(null);
        System.out.println(list);
        return list;
    }

}
