package com.blog.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.models.WpaperInformation;

@Repository
public class WpapersInformationDaoImpl implements WpapersInformationDao {

	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	@Override
	public WpaperInformation getWpaper(Integer wpaper_id) {
		WpaperInformation wpaperInformation = (WpaperInformation)getSession().get(WpaperInformation.class, wpaper_id);
		return wpaperInformation;
	}

	@Override
	public void save(WpaperInformation wpaper) {
		getSession().save(wpaper);
		
	}

	@Override
	public List<WpaperInformation> getWpaperInformationList() {
		return getSession().createCriteria(WpaperInformation.class).list();
	}

	@Override
	public void updateWpaper(WpaperInformation wpaper) {
		getSession().update(wpaper);
		
	}

	@Override
	public void deleteWpaper(WpaperInformation wpaper) {
		getSession().delete(wpaper);
		
	}

}
