package com.blog.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.models.ArticleInformation;

@Repository
public class ArticlesInformationDaoImpl implements ArticlesInformationDao {

	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	@Override
	public ArticleInformation getArticle(Integer article_id) {
		ArticleInformation articleInformation = (ArticleInformation)getSession().get(ArticleInformation.class, article_id);
		return articleInformation;
	}

	@Override
	public void save(ArticleInformation article) {
		getSession().save(article);
		
	}

	@Override
	public List<ArticleInformation> getArticleInformationList() {
		return getSession().createCriteria(ArticleInformation.class).list();
	}

	@Override
	public void updateArticle(ArticleInformation article) {
		getSession().update(article);
		
	}

	@Override
	public void deleteArticle(ArticleInformation article) {
		getSession().delete(article);
		
	}

}
