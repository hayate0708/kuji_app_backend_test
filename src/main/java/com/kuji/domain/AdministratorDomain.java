package com.kuji.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuji.dao.AdministratorDao;

@Service
public class AdministratorDomain {

    @Autowired
    private AdministratorDao dao;

    public String getAdministrator(String id, String password) throws Exception {
        String response = dao.getAdministrator(id, password);
        return response;
    }

}