package com.sec.cc.zte.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.cc.zte.entity.ResponseModel;
import com.sec.cc.zte.entity.User;
import com.sec.cc.zte.service.CrudServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(tags = "CrudController", description = "公司管理系统接口")
public class CrudController {
	@Autowired
	private CrudServiceImpl Crudservice;
	@ApiOperation(value="新增一个用户",httpMethod="POST")
	@RequestMapping(value="addUserforLimiteC")
	public int addUserforLimiteC(@ApiParam(name="User",value="增加",required=true) @RequestBody User user) {
		System.out.println("接收Add接口的属性值：");
		System.out.println(user.toString());
		int result = Crudservice.addUserforLimiteS(user);
		return result;
	}
	@ApiOperation(value="修改一个用户",httpMethod="POST")
	@RequestMapping(value="updateUserforLimiteC")
	public int updateUserforLimiteC(@ApiParam(name="User",value="修改",required=true) @RequestBody User user) {
		System.out.println("接收Update接口的属性值：");
		System.out.println(user.toString());
		int result = Crudservice.updateUserforLimiteS(user);
		return result;
	} 
	@ApiOperation(value="查询一个或多个用户",httpMethod="POST")
	@RequestMapping(value="queryUserforPageC")
	public ResponseModel queryUserforPageC(@ApiParam(name="User",value="查询",required=true) @RequestBody User user) {
		System.out.println("接收Query接口的属性值：");
		System.out.println(user.toString());
		ResponseModel responseModel = Crudservice.queryUserforPageS(user);
		return responseModel;
	}
	@ApiOperation(value="删除一个用户",httpMethod="POST")
	@RequestMapping(value="deleteUserforLimiteC")
	public int deleteUserforLimiteC(@ApiParam(name="User",value="删除",required=true) @RequestBody User user) {
		System.out.println("接收Delete接口的属性值：");
		System.out.println(user.toString());
		int result = Crudservice.deleteUserforLimiteS(user);
		return result;
	}
	
	 //多种输入的更新接口扩展
	@ApiOperation(value="修改一个用户",httpMethod="POST")
	@RequestMapping(value="updateUserforMoreC") 
	public int updateUserforMoreC(@ApiParam(name="User",value="修改",required=true) @RequestBody User user) { 
		int result =Crudservice.updateUserforMoreS(user); 
		return result;
	}
	
	
}
