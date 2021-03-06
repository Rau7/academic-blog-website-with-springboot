package com.blog.services;

import java.util.List;

import com.blog.models.PostInformation;

public interface PostsInformationService {

	PostInformation getPost(Integer post_id);

	void save(PostInformation post);

	List<PostInformation> getPostInformationList();

	void updatePost(PostInformation post);

	void deletePost(PostInformation post);
}
