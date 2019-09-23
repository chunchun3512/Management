package com.sec.cc.zte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.cc.zte.entity.AccountPassword;
import com.sec.cc.zte.entity.Result;
import com.sec.cc.zte.entity.User;
import com.sec.cc.zte.mapper.QueryMenuPerMapper;

@Service
public class QueryMenuPerServiceImpl {
	@Autowired
	private QueryMenuPerMapper querymenupermapper;
	
	public User verification(AccountPassword ap) {
		return querymenupermapper.verifiy(ap);	
	}
	
	public List<Result> queryMenu(AccountPassword ap) {
		return querymenupermapper.queryme(ap);	
	}
}
