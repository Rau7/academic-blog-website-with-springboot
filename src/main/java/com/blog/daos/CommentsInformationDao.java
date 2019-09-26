package com.blog.daos;

import java.util.List;

import com.blog.models.CommentInformation;

public interface CommentsInformationDao {
	
	CommentInformation getComment(Integer comment_id);

	void save(CommentInformation comment);

	List<CommentInformation> getCommentInformationList();

	void updateComment(CommentInformation comment);

	void deleteComment(CommentInformation comment);
}
