package com.sec.cc.zte.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.sec.cc.zte.entity.AuthorizeRoleToMenu;
import com.sec.cc.zte.entity.AuthorizeUser2Role;
import com.sec.cc.zte.entity.Role2Menu;
import com.sec.cc.zte.entity.User;
import com.sec.cc.zte.entity.User2Role;

public class SettingTime {
	public void settingOne(AuthorizeUser2Role auth) {
		String uuid =UUID.randomUUID().toString().replace("-", "");
//		String user2roleuuid =UUID.randomUUID().toString().replace("-", "");
		auth.setUuid(uuid);
//		auth.setUser2roleuuid(user2roleuuid);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		auth.setCreateTime(df.format(new Date()));
		auth.setUpdateTime(df.format(new Date()));
		auth.setCreat("cc");
		auth.setIsdel("no");
	}
	public void settingTwo(AuthorizeRoleToMenu au) {
		String uuid =UUID.randomUUID().toString().replace("-", "");
//		String role2menuuuid =UUID.randomUUID().toString().replace("-", "");
		au.setUuid(uuid);
//		au.setRole2menuuuid(role2menuuuid);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		au.setCreateTime(df.format(new Date()));
		au.setUpdateTime(df.format(new Date()));
		au.setCreat("cc");
		au.setIsdel("no");
	}
	
	public void settingSingle(User2Role auth) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		auth.setCreateTime(df.format(new Date()));
		auth.setUpdateTime(df.format(new Date()));
		auth.setCreat("cc");
		auth.setIsdel("no");
	}
	public void settingSing(Role2Menu au) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		au.setCreateTime(df.format(new Date()));
		au.setUpdateTime(df.format(new Date()));
		au.setCreat("cc");
		au.setIsdel("no");
	}
	public void settingThree(User user) {
		String uuid =UUID.randomUUID().toString().replace("-", "");
		user.setUuid(uuid);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		user.setCreateTime(df.format(new Date()));
		user.setUpdateTime(df.format(new Date()));
		user.setCreat("cc");
		user.setIsdel("no");
	}
	public void settingFour(User user) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		user.setUpdateTime(df.format(new Date()));
		user.setCreat("cc");
		user.setIsdel("no");
	}

}
