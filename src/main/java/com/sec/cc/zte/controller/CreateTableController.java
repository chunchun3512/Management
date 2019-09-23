package com.sec.cc.zte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.cc.zte.service.CreateTableServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "CreateTableController", description = "公司管理系统接口")
public class CreateTableController {
	@Autowired
	private CreateTableServiceImpl createtableservice;

	@ApiOperation(value="创建用户表",httpMethod="GET")
	@RequestMapping(value="toCreateUsertable")
	@ApiImplicitParam(name = "tablename", value = "tablename", required = true, dataType = "String", paramType = "query")
	public void toCreateUsertable(String tablename) {
		createtableservice.createusertable(tablename);	
	}
	
	@ApiOperation(value="创建角色表",httpMethod="GET")
	@RequestMapping(value="toCreateRoletable")
	@ApiImplicitParam(name = "tablename", value = "tablename", required = true, dataType = "String", paramType = "query")
	public void createRoletable(String tablename) {
		createtableservice.createroletable(tablename);	
	}
	@ApiOperation(value="创建菜单表",httpMethod="GET")
	@RequestMapping(value="toCreateMenutable")
	@ApiImplicitParam(name = "tablename", value = "tablename", required = true, dataType = "String", paramType = "query")
	public void createMenutable(String tablename) {
		createtableservice.createmenutable(tablename);	
	}
}
