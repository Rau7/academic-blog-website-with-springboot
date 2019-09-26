package com.blog.daos;

import com.blog.models.AboutInformation;

public interface AboutInformationDao {

	void updateAbout(AboutInformation about);
	
	AboutInformation getAbout(Integer about_id);
	
	
}
