package com.kuji.dao.mapper.administrator;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdministratorMapper {

        String getAdministrator(
                        @Param("user_id") String id,
                        @Param("password") String password);
}
