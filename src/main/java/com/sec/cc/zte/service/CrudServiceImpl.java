package com.sec.cc.zte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sec.cc.zte.entity.ResponseModel;
import com.sec.cc.zte.entity.User;
import com.sec.cc.zte.mapper.CrudMapper;
import com.sec.cc.zte.util.SettingTime;

@Service
public class CrudServiceImpl {
	@Autowired
	private CrudMapper crudmapper;
	private SettingTime settingtime;
	private static final String PW_PATTERN = "^(?![A-z0-9]+$)(?![A-z\\W]+$)(?![0-9\\W]+$)[A-z0-9\\W]{8,}$";	
	public int addUserforLimiteS(User user) {
		settingtime = new SettingTime();
		settingtime.settingThree(user);
		System.out.println("Add属性值传入sevice层");
		try {
			if(user.getJobnum() !=null &&user.getJobnum().length() !=0 &&user.getPasword().matches(PW_PATTERN)) {
				int result = crudmapper.addUserforLimiteM(user);
				return result;
			}else {
				System.out.println("检测Add属性值是否jobnum为空或者密码是否包含字母数字字符以及长度大于8位！");
				int result = 0;
				return result;
			}
		}catch(Exception e) {
			System.out.println("检测Add的jobnum是否重复！");
			e.printStackTrace();
			return -1;
		}
	}
	public int updateUserforLimiteS(User user) {
		settingtime = new SettingTime();
		settingtime.settingFour(user);
		System.out.println("Update属性值传入sevice层");
		try {
			if(user.getJobnum()!=null &&user.getJobnum().length() !=0) {
				/*User u=crudmapper.isExitUser(user);
				System.out.println(u.toString());
				if(u !=null) {*/
					int result = crudmapper.updateUserforLimiteM(user);
					return result;
				//}
			}
		}catch(Exception e) {
			System.out.println("检测Update属性名是否不正确或者后台sql语句不正确！");
			e.printStackTrace();
			return -1;
		}
		System.out.println("检测用户id是否为空!");
		return 0;
	}
	public ResponseModel queryUserforPageS(User user) {
		ResponseModel responseModel = new ResponseModel();
		try {
			System.out.println("Query属性值传入sevice层"); 
			Page<Object> p=PageHelper.startPage(user.getCurrentPage(), user.getLimit());
			List<User> users = crudmapper.queryUserforPageM(user);
			long total=p.getTotal();
			responseModel.setUsers(users);
			responseModel.setTotal(total);
			responseModel.setFlag("sucess");
			return responseModel;
		}catch(Exception e) {
			System.out.println("检测Query属性名是否不正确或者后台sql语句不正确！");
			e.printStackTrace();
			responseModel.setFlag("failed");
			return responseModel;
		}
		
	}
	public int deleteUserforLimiteS(User user) {
		System.out.println("Delete属性值传入sevice层"); 		
		try {
			int result = crudmapper.deleteUserforLimiteM(user);
			return result;				
		}catch(Exception e) {
			System.out.println("检测Delete属性名是否不正确或者后台sql语句不正确！");
			e.printStackTrace();
			return -1;
		}
	}
	
	//多种输入的更新接口扩展
	
	public int updateUserforMoreS(User user) { 
		settingtime = new SettingTime();
		settingtime.settingFour(user); 
		System.out.println(user.toString()); 
		try {
			List<User> u=crudmapper.isExitUserforMoreM(user); 
			System.out.println(u.toString()); 
			switch(u.size()) {
				case 0:   //表示没有传uuid和jobnum值或者uuid和jobnum在数据库中不存在
					return 0;
				case 1: //表示传入的uuid和jobnum在数据库中存在     或者只传了uuid或者只传了jobmum   或者uuid和jobnum只有一个在数据库中存在
					if(user.getUuid() !=null &&user.getJobnum() !=null) {
						if(u.get(0).getUuid().equals(user.getUuid()) && u.get(0).getJobnum().equals(user.getJobnum()))  {
							int result = crudmapper.updateUserforMoreM1(user);
							return result;
						}else {
							return -1;
						}
					}else {
						if(user.getUuid() !=null) {
							int result = crudmapper.updateUserforMoreM1(user);
							return result;
						}else {
							int result = crudmapper.updateUserforMoreM2(user);
							return result;
						}
					}
				case 2: //表示uuid和jobnum在同一个数据库中存在，但是两个字段不是指定同一个行数据
					return -1;
			}
		}catch(Exception e) { 
			e.printStackTrace(); 
			return -1; 
		}
		return 0; 
	}
	 
}
