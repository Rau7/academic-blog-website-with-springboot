package com.blog.daos;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.models.DashboardInformation;

@Repository
public class DashboardInformationDaoImpl implements DashboardInformationDao {

	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }

	@Override
	public void updateDashboard(DashboardInformation dashboard) {
		getSession().update(dashboard);
		
	}

	@Override
	public DashboardInformation getDashboard(Integer dashboard_id) {
		DashboardInformation aboutInformation = (DashboardInformation)getSession().get(DashboardInformation.class, dashboard_id);
		return aboutInformation;
	}
}
