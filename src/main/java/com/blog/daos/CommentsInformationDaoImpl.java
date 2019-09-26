package com.blog.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.models.CommentInformation;

@Repository
public class CommentsInformationDaoImpl implements CommentsInformationDao {

	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	@Override
	public CommentInformation getComment(Integer comment_id) {
		CommentInformation commentInformation = (CommentInformation)getSession().get(CommentInformation.class, comment_id);
		return commentInformation;
	}

	@Override
	public void save(CommentInformation comment) {
		getSession().save(comment);
		
	}

	@Override
	public List<CommentInformation> getCommentInformationList() {
		return getSession().createCriteria(CommentInformation.class).list();
	}

	@Override
	public void updateComment(CommentInformation comment) {
		getSession().update(comment);
		
	}

	@Override
	public void deleteComment(CommentInformation comment) {
		getSession().delete(comment);
		
	}

}
