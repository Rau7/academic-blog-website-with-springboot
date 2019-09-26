package com.blog.services;

import java.util.List;

import com.blog.models.CommentInformation;

public interface CommentsInformationService {

	CommentInformation getComment(Integer comment_id);

	void save(CommentInformation comment);

	List<CommentInformation> getCommentInformationList();

	void updateComment(CommentInformation comment);

	void deleteComment(CommentInformation comment);
}
