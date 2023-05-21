package com.sustech.main_service.mapper;

import com.sustech.main_service.entity.Article;
import com.sustech.main_service.entity.Topic;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Insert("insert into t_article values(#{id},#{title},#{content},#{user_id},#{tags},#{likes},#{cover},#{is_anonymous},#{gmt_create},#{gmt_modified})")
    int addArticle(Article article);

    @Select("select * from t_article where id=#{id}")
    Article selectById(String id);

    @Select("SELECT * FROM t_article LIMIT (#{lastIndex}-#{firstIndex}) OFFSET #{firstIndex}")
    List<Article> getArticlePage(int firstIndex, int lastIndex);

    @Select("SELECT * FROM t_article")
    List<Article> getAllArticle();

    @Insert("insert into t_article_comment(content,article_id,path,user_id,is_anonymous,gmt_create) values(#{})")
    int addComment(String user_id,String article_id,String content,String path,boolean is_anonymous,String gmt_create);

}
