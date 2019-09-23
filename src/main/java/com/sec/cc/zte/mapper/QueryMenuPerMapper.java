package com.sec.cc.zte.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sec.cc.zte.entity.AccountPassword;
import com.sec.cc.zte.entity.Result;
import com.sec.cc.zte.entity.User;

@Mapper
public interface QueryMenuPerMapper {
	public User verifiy(AccountPassword ap);
	public List<Result> queryme(AccountPassword ap);

}
