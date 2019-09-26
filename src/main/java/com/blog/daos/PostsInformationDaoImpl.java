package com.blog.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.models.PostInformation;

@Repository
public class PostsInformationDaoImpl implements PostsInformationDao {

	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	@Override
	public PostInformation getPost(Integer post_id) {
		PostInformation postInformation = (PostInformation)getSession().get(PostInformation.class, post_id);
		return postInformation;
	}

	@Override
	public void save(PostInformation post) {
		getSession().save(post);
		
	}

	@Override
	public List<PostInformation> getPostInformationList() {
		return getSession().createCriteria(PostInformation.class).list();
	}

	@Override
	public void updatePost(PostInformation post) {
		getSession().update(post);
		
	}

	@Override
	public void deletePost(PostInformation post) {
		getSession().delete(post);
		
	}

}
