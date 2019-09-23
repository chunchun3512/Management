package com.sec.cc.zte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.cc.zte.entity.AccountPassword;
import com.sec.cc.zte.entity.Result;
import com.sec.cc.zte.entity.User;
import com.sec.cc.zte.service.QueryMenuPerServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(tags = "QueryMenuPerController ", description = "公司管理系统接口")
public class QueryMenuPerController {
	
	@Autowired
	private QueryMenuPerServiceImpl querymenuperservice;

	@ApiOperation(value="查询菜单权限",httpMethod="POST")
	@RequestMapping(value="toQueryMenu")
	//@ApiImplicitParam(name = "jobnum", value = "jobnum", required = true, dataType = "String", paramType = "query")
	public List<Result> toQueryMenu(@ApiParam(name="AccountPassword",value="查询",required=true) @RequestBody AccountPassword ap) {
		User user =querymenuperservice.verification(ap);
		if(user!=null && ap.getPasword().equals("123")) {
			System.out.println("111111111");
			System.out.println(ap.toString());
			List<Result> returnValue = querymenuperservice.queryMenu(ap);
			return returnValue;
		}else {
			return null;
		}
	}
}
