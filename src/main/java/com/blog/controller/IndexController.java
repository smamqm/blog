package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.blog.entity.Article;
import com.blog.entity.Category;
import com.blog.entity.Tag;
import com.blog.service.IndexService;

@EnableWebMvc
@Controller
@RequestMapping("/api")
public class IndexController {
	
	@Autowired
	public IndexService indexService;
	
	//标签
	@RequestMapping(value = "/index/tags", method = RequestMethod.GET)
	public @ResponseBody List<Tag> getAllTags(){
		return indexService.getAllTags();
	}
	
	//category导航
	@RequestMapping(value = "/index/categorys", method = RequestMethod.GET)
	public @ResponseBody List<Category> getAllCategorys(){
		return indexService.getAllCategorys();
	}
	
	@RequestMapping(value = "/index/articles", method = RequestMethod.GET)
	public @ResponseBody List<Article> getAllArticles(){
		return indexService.getAllArticles();
	}
}
