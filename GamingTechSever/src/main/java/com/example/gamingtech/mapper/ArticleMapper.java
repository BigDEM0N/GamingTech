package com.example.gamingtech.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gamingtech.entity.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
/**
 * 此为mybatis的内容
 * public interface ArticleMapper {
 *     @Select("Select * from article")
 *     public List<Article> findAll();/
 *     @Insert("insert into article(title,description,postdate) values(#{title},#{description},#{postdate})")
 *     public int insert(Article article);
 * }
 */
public interface ArticleMapper extends BaseMapper<Article> {
}

