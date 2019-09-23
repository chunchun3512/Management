package com.sec.cc.zte.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.sec.cc.zte.entity.AuthorizeUser2Role;

public class TransJson {
	public void  array2Json() {
		Init init =new Init();
		AuthorizeUser2Role authU2R= init.initAuthorizeUser2Role();
		 try
	        {
	            JSONArray jsonArray=new JSONArray();
	            jsonArray.add(authU2R);
	            System.out.println(jsonArray.toString());
	        } catch (JSONException e)
	        {
	            e.printStackTrace();
	        }
		
	}

}
