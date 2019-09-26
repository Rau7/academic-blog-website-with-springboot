package com.blog.daos;

import java.util.List;

import com.blog.models.ArticleInformation;

public interface ArticlesInformationDao {
	
	ArticleInformation getArticle(Integer article_id);

	void save(ArticleInformation article);

	List<ArticleInformation> getArticleInformationList();

	void updateArticle(ArticleInformation article);

	void deleteArticle(ArticleInformation article);
}
