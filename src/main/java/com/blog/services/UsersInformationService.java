package com.blog.services;

import java.util.List;

import com.blog.models.UserInformation;

public interface UsersInformationService {

	UserInformation getUser(Integer user_id);

	void save(UserInformation user);

	List<UserInformation> getUserInformationList();

	void updateUser(UserInformation user);

	void deleteUser(UserInformation user);
}
