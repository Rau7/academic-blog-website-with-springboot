package com.blog.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.daos.UsersInformationDao;
import com.blog.models.UserInformation;

@Service
@Transactional
public class UsersInformationServiceImpl implements UsersInformationService {
	
	@Autowired
	private UsersInformationDao userInformation;

	@Override
	public UserInformation getUser(Integer user_id) {
		// TODO Auto-generated method stub
		return userInformation.getUser(user_id);
	}

	@Override
	public void save(UserInformation user) {
		// TODO Auto-generated method stub
		userInformation.save(user);
	}

	@Override
	public List<UserInformation> getUserInformationList() {
		// TODO Auto-generated method stub
		return userInformation.getUserInformationList();
	}

	@Override
	public void updateUser(UserInformation user) {
		// TODO Auto-generated method stub
		userInformation.updateUser(user);
	}

	@Override
	public void deleteUser(UserInformation user) {
		// TODO Auto-generated method stub
		userInformation.deleteUser(user);
	}

}
