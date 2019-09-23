package com.sec.cc.zte.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sec.cc.zte.entity.User;

@Mapper
public interface CrudMapper {
	public abstract int addUserforLimiteM(User user);
	//public abstract User isExitUser(User user);
	public abstract int updateUserforLimiteM(User user);
	public abstract List<User> queryUserforPageM(User user);
	public abstract int deleteUserforLimiteM(User user);
	public abstract User isExitUserOr(User user);
	
	//多种输入的更新接口扩展
	public abstract List<User> isExitUserforMoreM(User user);
	public abstract int updateUserforMoreM1(User user);
	public abstract int updateUserforMoreM2(User user);
}
