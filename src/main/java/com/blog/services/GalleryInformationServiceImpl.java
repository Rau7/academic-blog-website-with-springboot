package com.blog.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.daos.GalleryInformationDao;
import com.blog.models.GalleryInformation;

@Service
@Transactional
public class GalleryInformationServiceImpl implements GalleryInformationService {

	@Autowired
	private GalleryInformationDao galleryInformation;

	@Override
	public GalleryInformation getGallery(Integer gallery_id) {
		// TODO Auto-generated method stub
		return galleryInformation.getGallery(gallery_id);
	}

	@Override
	public void save(GalleryInformation gallery) {
		// TODO Auto-generated method stub
		galleryInformation.save(gallery);
	}

	@Override
	public List<GalleryInformation> getGalleryInformationList() {
		// TODO Auto-generated method stub
		return galleryInformation.getGalleryInformationList();
	}

	@Override
	public void updateGallery(GalleryInformation gallery) {
		// TODO Auto-generated method stub
		galleryInformation.updateGallery(gallery);
	}

	@Override
	public void deleteGallery(GalleryInformation gallery) {
		// TODO Auto-generated method stub
		galleryInformation.deleteGallery(gallery);
	}
	
}
