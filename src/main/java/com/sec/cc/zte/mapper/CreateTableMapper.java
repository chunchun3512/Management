package com.sec.cc.zte.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CreateTableMapper {
	void createUserTable(@Param(value="tableName") String tablename);
	void createRoleTable(String tablename);
	void createMenuTable(String tablename);

}
