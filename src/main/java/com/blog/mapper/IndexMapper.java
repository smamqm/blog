package com.blog.mapper;

import java.util.List;

import com.blog.entity.Article;
import com.blog.entity.ArticleTagMap;
import com.blog.entity.Category;
import com.blog.entity.Tag;

public interface IndexMapper {
	List<Tag> getAllTags(List<Integer> tagIds);

	List<Category> getAllCategorys(List<Integer> categoryIds);

	List<Article> getAllArticles();

	List<ArticleTagMap> getAllArticleTagMaps(List<Integer> articleIds);
}
