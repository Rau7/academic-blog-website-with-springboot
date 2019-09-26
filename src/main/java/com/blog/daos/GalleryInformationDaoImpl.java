package com.blog.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.models.GalleryInformation;

@Repository
public class GalleryInformationDaoImpl implements GalleryInformationDao {

	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	@Override
	public GalleryInformation getGallery(Integer gallery_id) {
		GalleryInformation galleryInformation = (GalleryInformation)getSession().get(GalleryInformation.class, gallery_id);
		return galleryInformation;
	}

	@Override
	public void save(GalleryInformation gallery) {
		getSession().save(gallery);
		
	}

	@Override
	public List<GalleryInformation> getGalleryInformationList() {
		return getSession().createCriteria(GalleryInformation.class).list();
	}

	@Override
	public void updateGallery(GalleryInformation gallery) {
		getSession().update(gallery);
		
	}

	@Override
	public void deleteGallery(GalleryInformation post) {
		getSession().delete(post);
		
	}

}
