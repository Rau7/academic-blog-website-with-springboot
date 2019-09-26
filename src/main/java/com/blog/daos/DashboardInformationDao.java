package com.blog.daos;

import com.blog.models.DashboardInformation;

public interface DashboardInformationDao {
	
	void updateDashboard(DashboardInformation dashboard);
	
	DashboardInformation getDashboard(Integer dashboard_id);

}
