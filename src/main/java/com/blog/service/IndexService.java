package com.blog.service;

import java.util.List;

import com.blog.entity.Article;
import com.blog.entity.Category;
import com.blog.entity.Tag;
import com.blog.entity.User;

public interface IndexService {

	List<Tag> getAllTags();

	List<Category> getAllCategorys();

	List<Article> getAllArticles();

	

}
