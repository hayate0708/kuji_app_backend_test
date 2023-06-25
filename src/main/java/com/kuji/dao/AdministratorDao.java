package com.kuji.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kuji.dao.mapper.administrator.AdministratorMapper;

@Repository
public class AdministratorDao {

	@Autowired
	AdministratorMapper mapper;

	public String getAdministrator(String id, String password) throws Exception {
		return mapper.getAdministrator(id, password);
	}

}
