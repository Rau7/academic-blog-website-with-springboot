package com.blog.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.models.UserInformation;

@Repository
public class UsersInformationDaoImpl implements UsersInformationDao {

	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	@Override
	public UserInformation getUser(Integer user_id) {
		UserInformation userInformation = (UserInformation)getSession().get(UserInformation.class, user_id);
		return userInformation;
	}

	@Override
	public void save(UserInformation user) {
		getSession().save(user);
		
	}

	@Override
	public List<UserInformation> getUserInformationList() {
		return getSession().createCriteria(UserInformation.class).list();
	}

	@Override
	public void updateUser(UserInformation user) {
		getSession().update(user);
		
	}

	@Override
	public void deleteUser(UserInformation user) {
		getSession().delete(user);
		
	}

}
