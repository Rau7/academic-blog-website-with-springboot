package com.blog.services;

import com.blog.models.AboutInformation;

public interface AboutInformationService {

	void updateAbout(AboutInformation about);
	
	AboutInformation getAbout(Integer about_id);
}
