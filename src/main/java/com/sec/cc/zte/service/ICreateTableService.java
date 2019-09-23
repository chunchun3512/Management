package com.sec.cc.zte.service;

import org.springframework.stereotype.Service;

@Service
public interface ICreateTableService {
	void createusertable(String tablename);
	void createroletable(String tablename);
	void createmenutable(String tablename);

}
