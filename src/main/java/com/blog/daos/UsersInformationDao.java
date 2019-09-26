package com.blog.daos;

import java.util.List;

import com.blog.models.UserInformation;

public interface UsersInformationDao {
	
	UserInformation getUser(Integer user_id);

	void save(UserInformation user);

	List<UserInformation> getUserInformationList();

	void updateUser(UserInformation user);

	void deleteUser(UserInformation user);
}
