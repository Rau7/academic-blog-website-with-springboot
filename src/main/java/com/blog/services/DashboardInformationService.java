package com.blog.services;

import com.blog.models.DashboardInformation;

public interface DashboardInformationService {

void updateDashboard(DashboardInformation dashboard);
	
	DashboardInformation getDashboard(Integer dashboard_id);
}
