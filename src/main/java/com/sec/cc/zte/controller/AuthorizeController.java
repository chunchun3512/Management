package com.sec.cc.zte.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.cc.zte.entity.AuthorizeRoleToMenu;
import com.sec.cc.zte.entity.AuthorizeUser2Role;
import com.sec.cc.zte.entity.Role;
import com.sec.cc.zte.entity.Role2Menu;
import com.sec.cc.zte.entity.User;
import com.sec.cc.zte.entity.User2Role;
import com.sec.cc.zte.service.AuthorizeServiceImpl;
import com.sec.cc.zte.util.SettingTime;
import com.sec.cc.zte.util.TransJson;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(tags = "AuthorizeController", description = "公司管理系统接口")
public class AuthorizeController {
	@Autowired
	private AuthorizeServiceImpl Authorizeservice;
	private SettingTime settingtime;
	private List<User2Role> reResult;
	private List<Role2Menu> rResult;

	@ApiOperation(value = "新增用户授权一个或多个角色", httpMethod = "POST")
	@RequestMapping(value = "User2RoleAuthorize")
	public List<User2Role> User2RoleAuthorize(@ApiParam(name = "AuthorizeUser2Role", value = "授权", required = true) @RequestBody AuthorizeUser2Role auth) {
		settingtime = new SettingTime();
		settingtime.settingOne(auth);
		System.out.println("接收User2RoleAuthorize接口的属性值：");
		System.out.println(auth.toString());
		List<User> rs = Authorizeservice.isExitUser(auth);
		if (rs.size() == 0) {
			System.out.println("数据库中不存在该用户");
			List<User2Role> ru = Authorizeservice.isUser2RoleExit(auth);
			if (ru.size() == 0) {
				System.out.println("映射表不存在该映射");
				int returnValue = Authorizeservice.user2RoleAuthorize(auth);
				if (returnValue != 0) {
					System.out.println("已将插入该映射表了");
					List<User2Role> reResult = Authorizeservice.returnResult(auth);
					return reResult;
				} else {
					System.out.println("没有插入映射表");
					return null;
				}
			} else {
				System.out.println("映射表中存在该映射表");
				return null;
			}
		} else {
			System.out.println("数据库已经存在该用户");
			return null;
		}
	}

	@ApiOperation(value = "新增角色授权一个或多个菜单", httpMethod = "POST")
	@RequestMapping(value = "RoleToMenuAuthorize")
	public List<Role2Menu> RoleToMenuAuthorize(@ApiParam(name = "AuthorizeRoleToMenu", value = "授权", required = true) @RequestBody AuthorizeRoleToMenu au) {
		settingtime = new SettingTime();
		settingtime.settingTwo(au);
		System.out.println("接收RoleToMenuAuthorize接口的属性值：");
		System.out.println(au.toString());
		List<Role> rr = Authorizeservice.isExitRole(au);
		if (rr.size() == 0) {
			System.out.println("数据库中不存在该角色");
			int returnValue = Authorizeservice.RoleToMenuAuthorize(au);
			if (returnValue != 0) {
				System.out.println("映射表不存在该映射");
				List<Role2Menu> reResult = Authorizeservice.retuResult(au);
				return reResult;
			} else {
				System.out.println("没有插入映射表");
				return null;
			}
		} else {
			System.out.println("数据库已经存在该角色");
			return null;
		}
	}

	@ApiOperation(value = "获取json文本", httpMethod = "GET")
	@RequestMapping(value = "getJson")
	@ApiImplicitParam(name = "start", value = "start", required = true, dataType = "String", paramType = "query")
	public void getJson(String start) {
		TransJson transjson = new TransJson();
		transjson.array2Json();
	}

	@ApiOperation(value="已有用户授权一个或多个角色",httpMethod="POST")
	@RequestMapping(value="AuthUser2Role")
	public List<User2Role> AuthUser2Role(@ApiParam(name="AuthUser2Role",value="授权",required=true) @RequestBody List<User2Role> auths) {
		System.out.println("接收AuthUser2Role接口的属性值：");
		System.out.println(auths.toString()); 
		reResult = new ArrayList<User2Role>();
		settingtime = new SettingTime(); 
		//for(int i=0;i<auths.size();i++) {
		for(User2Role u :auths) { 
			settingtime.settingSingle(u); 
			List<User2Role> ru = Authorizeservice.isUser2RoleExitSingle(u);		 		 
			if(ru.size() == 0) { 
				int returnValue = Authorizeservice.user2RoleAuthorizeSingle(u);
				if(returnValue !=0){ 
					reResult.add(Authorizeservice.returnResultSingle(u)); 
				}else {
					System.out.println("授权不成功"); 
				} 
			}else { 
				System.out.println("映射表已存在该映射"); 
			}
		} 
		return reResult;
	}

	@ApiOperation(value = "已有角色授权一个或多个菜单", httpMethod = "POST")
	@RequestMapping(value = "AuthRole2Menu")
	public List<Role2Menu> AuthRole2Menu(@ApiParam(name = "AuthUser2Role", value = "授权", required = true) @RequestBody List<Role2Menu> aus) {
		rResult = new ArrayList<Role2Menu>();
		settingtime = new SettingTime();
		for (int i = 0; i < aus.size(); i++) {
			settingtime.settingSing(aus.get(i));
			List<Role2Menu> ru = Authorizeservice.isRole2MenuExitSingle(aus.get(i));
			if (ru.size() == 0) {
				int returnValue = Authorizeservice.Role2MenuAuthorizeSingle(aus.get(i));
				if (returnValue != 0) {
					rResult.add(Authorizeservice.retuResultSingle(aus.get(i)));
				} else {
					System.out.println("授权不成功" + i);

				}
			} else {
				System.out.println("映射表已存在该映射" + i);
			}
		}
		return rResult;
	}
}
