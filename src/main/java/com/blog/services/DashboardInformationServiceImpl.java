package com.blog.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.blog.daos.DashboardInformationDao;
import com.blog.models.DashboardInformation;

@Service
@Transactional
public class DashboardInformationServiceImpl implements DashboardInformationService {

	@Autowired
	private DashboardInformationDao dashboardDao;
	
	@Override
	public void updateDashboard(DashboardInformation dashboard) {
		
		dashboardDao.updateDashboard(dashboard);
	}

	@Override
	public DashboardInformation getDashboard(Integer dashboard_id) {
		// TODO Auto-generated method stub
		return dashboardDao.getDashboard(dashboard_id);
	}

}
