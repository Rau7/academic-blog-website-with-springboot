package com.blog.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.daos.ArticlesInformationDao;
import com.blog.models.ArticleInformation;

@Service
@Transactional
public class ArticlesInformationServiceImpl implements ArticlesInformationService {
	
	@Autowired
	private ArticlesInformationDao articleDao;

	@Override
	public ArticleInformation getArticle(Integer article_id) {
		// TODO Auto-generated method stub
		return articleDao.getArticle(article_id);
	}

	@Override
	public void save(ArticleInformation article) {
		
		articleDao.save(article);
	}

	@Override
	public List<ArticleInformation> getArticleInformationList() {
		// TODO Auto-generated method stub
		return articleDao.getArticleInformationList();
	}

	@Override
	public void updateArticle(ArticleInformation article) {
		// TODO Auto-generated method stub
		articleDao.updateArticle(article);
	}

	@Override
	public void deleteArticle(ArticleInformation article) {
		// TODO Auto-generated method stub
		articleDao.deleteArticle(article);
		
	}

}
