package com.blog.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.daos.AboutInformationDao;
import com.blog.models.AboutInformation;

@Service
@Transactional
public class AboutInformationServiceImpl implements AboutInformationService {

	@Autowired
	private AboutInformationDao aboutDao;
	
	@Override
	public void updateAbout(AboutInformation about) {
		
		aboutDao.updateAbout(about);
		
	}

	@Override
	public AboutInformation getAbout(Integer about_id) {
		
		return aboutDao.getAbout(about_id);
		
	}

}
