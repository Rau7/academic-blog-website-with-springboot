package com.blog.services;

import java.util.List;

import com.blog.models.GalleryInformation;

public interface GalleryInformationService {

	GalleryInformation getGallery(Integer gallery_id);

	void save(GalleryInformation gallery);

	List<GalleryInformation> getGalleryInformationList();

	void updateGallery(GalleryInformation gallery);

	void deleteGallery(GalleryInformation gallery);
}
