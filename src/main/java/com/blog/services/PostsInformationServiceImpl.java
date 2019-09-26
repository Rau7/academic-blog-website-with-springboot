package com.blog.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.daos.PostsInformationDao;
import com.blog.models.PostInformation;

@Service
@Transactional
public class PostsInformationServiceImpl implements PostsInformationService {

	@Autowired
	private PostsInformationDao postInformation;

	@Override
	public PostInformation getPost(Integer post_id) {
		// TODO Auto-generated method stub
		return postInformation.getPost(post_id);
	}

	@Override
	public void save(PostInformation post) {
		// TODO Auto-generated method stub
		postInformation.save(post);
	}

	@Override
	public List<PostInformation> getPostInformationList() {
		// TODO Auto-generated method stub
		return postInformation.getPostInformationList();
	}

	@Override
	public void updatePost(PostInformation post) {
		// TODO Auto-generated method stub
		postInformation.updatePost(post);
	}

	@Override
	public void deletePost(PostInformation post) {
		// TODO Auto-generated method stub
		postInformation.deletePost(post);
	}
	
}
