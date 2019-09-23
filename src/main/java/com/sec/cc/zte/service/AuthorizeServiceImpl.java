package com.sec.cc.zte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.cc.zte.entity.AuthorizeRoleToMenu;
import com.sec.cc.zte.entity.AuthorizeUser2Role;
import com.sec.cc.zte.entity.Role;
import com.sec.cc.zte.entity.Role2Menu;
import com.sec.cc.zte.entity.User;
import com.sec.cc.zte.entity.User2Role;
import com.sec.cc.zte.mapper.AuthorizeMapper;

@Service
public class AuthorizeServiceImpl {
	@Autowired
	private AuthorizeMapper authorizemapper;
	//新增用户的用户到角色映射	
	public List<User> isExitUser(AuthorizeUser2Role auth) {
		List<User> results=authorizemapper.isExitUser(auth);
		return results;
	}
	public List<User2Role> isUser2RoleExit(AuthorizeUser2Role auth) {
		List<User2Role> ru=authorizemapper.isUser2RoleExit(auth);
		return ru;
	}
	public int user2RoleAuthorize(AuthorizeUser2Role auth) {
		int r1=authorizemapper.saveUser(auth);
		int r2=authorizemapper.uuidUser2Role(auth);
		System.out.println(r2);
		return r1;
	}
	public List<User2Role> returnResult(AuthorizeUser2Role auth){
		List<User2Role> ur = authorizemapper.retResult(auth);
		return ur;
	}
	
	
	//新增角色的角色到菜单映射
	public List<Role> isExitRole(AuthorizeRoleToMenu au) {
		List<Role> resultr=authorizemapper.isExitRole(au);
		return resultr;
	}
	public int RoleToMenuAuthorize(AuthorizeRoleToMenu au) {
		int r3 = authorizemapper.saveRole(au);
		int r4 = authorizemapper.uuidrole2MenuAuth(au);
		System.out.println(r4);
		return r3;
	}
	public List<Role2Menu> retuResult(AuthorizeRoleToMenu au){
		List<Role2Menu> rm = authorizemapper.returResult(au);
		return rm;
	}
	
	
	
	//已有用户的用户到角色映射
	public List<User2Role> isUser2RoleExitSingle(User2Role auth) {
		List<User2Role> lur=authorizemapper.isUser2RoleExitSin(auth);
		return lur;
	}
	public int user2RoleAuthorizeSingle(User2Role auth) {
		System.out.println("传入数据进入授权服务层");
		int rt = authorizemapper.user2RoleAuthorizeSin(auth);
		return rt;
	}
	public User2Role returnResultSingle(User2Role auth) {
		System.out.println("返回数据进入服务层");
		User2Role u2r = authorizemapper.retResultSin(auth);
		return u2r;
	}
	
	
	//已有角色的角色到菜单映射
	public List<Role2Menu> isRole2MenuExitSingle(Role2Menu au) {
		List<Role2Menu> lrm=authorizemapper.isRole2MenuExitSin(au);
		return lrm;
	}
	public int Role2MenuAuthorizeSingle(Role2Menu au) {
		int rr = authorizemapper.Role2MenuAuthorizeSin(au);
		return rr;
	}
	public Role2Menu retuResultSingle(Role2Menu au) {
		Role2Menu r2m = authorizemapper.retuResultSin(au);
		return r2m;
	}
}
