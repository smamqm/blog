package com.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.entity.Article;
import com.blog.entity.ArticleTagMap;
import com.blog.entity.Category;
import com.blog.entity.Tag;
import com.blog.mapper.IndexMapper;
import com.blog.service.IndexService;

@Service
public class IndexServiceImpl implements IndexService {
	
	@Resource
	private IndexMapper indexMapper;
	
	

	public List<Tag> getAllTags() {
		return indexMapper.getAllTags(null);
	}

	public List<Category> getAllCategorys() {
		return indexMapper.getAllCategorys(null);
	}

	public List<Article> getAllArticles() {
		List<Article> articles = new ArrayList<Article>();
		articles = indexMapper.getAllArticles();
		List<Integer> categoryIds = new ArrayList<Integer>();
		for(int i = 0; i < articles.size(); i++){
			categoryIds.add(articles.get(i).getCid());
		}
		List<Category> categorys = indexMapper.getAllCategorys(categoryIds); 
		for(int i = 0; i < categorys.size(); i++){
			for(int j = 0; j < articles.size(); j++){
				if(categorys.get(i).getId() == articles.get(j).getCid()){
					articles.get(j).setCategory(categorys.get(i));
				}
			}
		}
		
		
		List<Integer> articleIds = new ArrayList<Integer>();
		for(int i = 0; i < articles.size(); i++){
			articleIds.add(articles.get(i).getId());
		}
		List<ArticleTagMap> ats = indexMapper.getAllArticleTagMaps(articleIds);
		if(ats != null && ats.size() > 0){
			ats = this.iniArticleTagMap(articles, ats);
		}
		for(int i = 0; i < ats.size(); i++){
			for(int j =0; j < articles.size(); j++){
				if(ats.get(i).getArticle().getId() == articles.get(j).getId()){
					articles.get(j).getTags().add(ats.get(i).getTag());
				}
			}
		}
		return articles;
	}
	
	private List<ArticleTagMap> iniArticleTagMap(List<Article> articles, List<ArticleTagMap> atMaps){
		for(int i = 0; i < atMaps.size(); i++){
			Tag t = new Tag();
			t.setId(atMaps.get(i).getTid());
			t.setName(atMaps.get(i).getTname());
			atMaps.get(i).setTag(t);
			for(int j =0 ; j < articles.size(); j++){
				if(articles.get(j).getId() == atMaps.get(i).getAid()){
					atMaps.get(i).setArticle(articles.get(j));
				}
			}
		}
		return atMaps;
	}

}
