package com.blog.daos;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.models.AboutInformation;

@Repository
public class AboutInformationDaoImpl implements AboutInformationDao {
	
	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }

	@Override
	public void updateAbout(AboutInformation about) {
		getSession().update(about);
		
	}

	@Override
	public AboutInformation getAbout(Integer about_id) {
		AboutInformation aboutInformation = (AboutInformation)getSession().get(AboutInformation.class, about_id);
		return aboutInformation;
	}

}
