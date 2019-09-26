package com.blog.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.daos.WpapersInformationDao;
import com.blog.models.WpaperInformation;

@Service
@Transactional
public class WpapersInformationServiceImpl implements WpapersInformationService {
	
	@Autowired
	private WpapersInformationDao wpaperInformation;

	@Override
	public WpaperInformation getWpaper(Integer wpaper_id) {
		// TODO Auto-generated method stub
		return wpaperInformation.getWpaper(wpaper_id);
	}

	@Override
	public void save(WpaperInformation wpaper) {
		// TODO Auto-generated method stub
		wpaperInformation.save(wpaper);
	}

	@Override
	public List<WpaperInformation> getWpaperInformationList() {
		// TODO Auto-generated method stub
		return wpaperInformation.getWpaperInformationList();
	}

	@Override
	public void updateWpaper(WpaperInformation wpaper) {
		// TODO Auto-generated method stub
		wpaperInformation.updateWpaper(wpaper);
	}

	@Override
	public void deleteWpaper(WpaperInformation wpaper) {
		// TODO Auto-generated method stub
		wpaperInformation.deleteWpaper(wpaper);
	}
	
	

}
