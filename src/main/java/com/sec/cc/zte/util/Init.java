package com.sec.cc.zte.util;

import com.sec.cc.zte.entity.AuthorizeUser2Role;

public class Init {
	public AuthorizeUser2Role initAuthorizeUser2Role() {
		String[] id = {"1","2","3"};
		AuthorizeUser2Role authU2R = new AuthorizeUser2Role();
		authU2R.setAge(22);
		authU2R.setCreat("cc");
		authU2R.setCreateTime("2019/08/16");
		authU2R.setIds(id);
		authU2R.setIsdel("no");
		authU2R.setJobnum("201900015");
		authU2R.setPasword("123");
		authU2R.setSex("famale");
		authU2R.setUpdateTime("2019/08/16");
		authU2R.setUsername("milaidi");
		return authU2R;
	}

}
