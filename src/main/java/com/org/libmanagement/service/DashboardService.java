package com.org.libmanagement.service;

import com.org.libmanagement.dao.DashboardDao;
import com.org.libmanagement.model.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    private static final String CLASS_NAME = "com.org.libmanagement.controller.DashboardService";

    private DashboardDao dashboardDao;

    @Autowired
    public DashboardService(DashboardDao dashboardDao){
        this.dashboardDao = dashboardDao;
    }

    public List<String> getDashboardLabel(int dashboardId){
        try{
            return dashboardDao.getDashboardLabel(dashboardId);
        }catch (Exception ex){
            System.out.println("Exception occurred at-> " + CLASS_NAME + " in getDashboardLabel method -> " +  ex.getMessage());
            return null;
        }
    }

    public List<Object> getDashboardData(int dashboardId){
        try{
            return dashboardDao.getDashboardData(dashboardId);
        }catch (Exception ex){
            System.out.println("Exception occurred at-> " + CLASS_NAME + " in getDashboardData method -> " +  ex.getMessage());
            return null;
        }
    }

    public Dashboard getSingleDashboard(int dashboardId){
        try{
            return dashboardDao.getSingleDashboard(dashboardId);
        }catch (Exception ex){
            System.out.println("Exception occurred at-> " + CLASS_NAME + " in getSingleDashboard method -> " +  ex.getMessage());
            return null;
        }
    }

}
