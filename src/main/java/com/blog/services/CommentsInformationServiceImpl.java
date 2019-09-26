package com.blog.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.daos.CommentsInformationDao;
import com.blog.models.CommentInformation;

@Service
@Transactional
public class CommentsInformationServiceImpl implements CommentsInformationService {

	@Autowired
	private CommentsInformationDao commentInformation;

	@Override
	public CommentInformation getComment(Integer comment_id) {
		// TODO Auto-generated method stub
		return commentInformation.getComment(comment_id);
	}

	@Override
	public void save(CommentInformation comment) {
		// TODO Auto-generated method stub
		commentInformation.save(comment);
	}

	@Override
	public List<CommentInformation> getCommentInformationList() {
		// TODO Auto-generated method stub
		return commentInformation.getCommentInformationList();
	}

	@Override
	public void updateComment(CommentInformation comment) {
		// TODO Auto-generated method stub
		commentInformation.updateComment(comment);
	}

	@Override
	public void deleteComment(CommentInformation comment) {
		// TODO Auto-generated method stub
		commentInformation.deleteComment(comment);
	}
	
}
