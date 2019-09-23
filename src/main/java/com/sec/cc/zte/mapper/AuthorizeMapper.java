package com.sec.cc.zte.mapper;




import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sec.cc.zte.entity.AuthorizeRoleToMenu;
import com.sec.cc.zte.entity.AuthorizeUser2Role;
import com.sec.cc.zte.entity.Role;
import com.sec.cc.zte.entity.Role2Menu;
import com.sec.cc.zte.entity.User;
import com.sec.cc.zte.entity.User2Role;

@Mapper
public interface AuthorizeMapper {

	public List<User> isExitUser(AuthorizeUser2Role auth);
	public List<User2Role> isUser2RoleExit(AuthorizeUser2Role auth);
	public int saveUser(AuthorizeUser2Role auth);
	public int uuidUser2Role(AuthorizeUser2Role auth);
	public List<User2Role> retResult(AuthorizeUser2Role auth);
	
	
	public int saveRole(AuthorizeRoleToMenu au);
	public int uuidrole2MenuAuth(AuthorizeRoleToMenu au);
	public List<Role> isExitRole(AuthorizeRoleToMenu au);
	public List<Role2Menu> returResult(AuthorizeRoleToMenu au);
	
	public List<User2Role> isUser2RoleExitSin(User2Role auth);
	public int user2RoleAuthorizeSin(User2Role auth);
	public User2Role retResultSin(User2Role auth);
	
	public List<Role2Menu> isRole2MenuExitSin(Role2Menu au);
	public int Role2MenuAuthorizeSin(Role2Menu au);
	public Role2Menu retuResultSin(Role2Menu au);
	
}
