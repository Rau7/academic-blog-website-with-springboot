package com.blog.services;

import java.util.List;

import com.blog.models.WpaperInformation;

public interface WpapersInformationService {
	
	WpaperInformation getWpaper(Integer wpaper_id);

	void save(WpaperInformation wpaper);

	List<WpaperInformation> getWpaperInformationList();

	void updateWpaper(WpaperInformation wpaper);

	void deleteWpaper(WpaperInformation wpaper);
}
