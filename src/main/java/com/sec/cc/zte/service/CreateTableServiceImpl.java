package com.sec.cc.zte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.cc.zte.mapper.CreateTableMapper;

@Service
public class CreateTableServiceImpl implements ICreateTableService{
	@Autowired
	private CreateTableMapper createtablemapper;
	public void createusertable(String tablename) {
		createtablemapper.createUserTable(tablename);
	}
	@Override
	public void createroletable(String tablename) {
		// TODO Auto-generated method stub
		createtablemapper.createRoleTable(tablename);
	}
	@Override
	public void createmenutable(String tablename) {
		// TODO Auto-generated method stub
		createtablemapper.createMenuTable(tablename);
	}

}
