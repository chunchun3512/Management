package com.sec.cc.zte.entity;



import java.util.Arrays;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="角色授权类型",description="角色授权类型")
public class AuthorizeUser2Role {
	private String uuid;
	@ApiModelProperty(example="201900017")
	private String jobnum;
	@ApiModelProperty(example="lubanqihao")
	private String username;
	@ApiModelProperty(example="male")
	private String sex;
	@ApiModelProperty(example="10")
	private int age;
	@ApiModelProperty(example="123")
	private String pasword;
	@ApiModelProperty(example="2019/08/14")
	private String createTime;
	@ApiModelProperty(example="2019/08/14")
	private String updateTime;
	@ApiModelProperty(example="cc")
	private String creat;
	@ApiModelProperty(example="no")
	private String isdel;
	@ApiModelProperty(example="["+"id:fc431566310141fdbbb346eaf500f6e8 role_num:1  role_name:warrior "
			+ "id:91a792edc29244f0a74211aabed5c594 role_num:2 role_name:shooter "
			+ "id:8a45e3cd404a4142b06802a07173040d role_num:3 role_name:jungle "
			+ "id:196aff275e434ac2b639e8574e5864eb role_num:4 role_name:master "
			+ "id:d756dfea680f4fa9aeafc6213eabb282 role_num:5 role_name:tank"+"]")
	private String[] ids;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getJobnum() {
		return jobnum;
	}
	public void setJobnum(String jobnum) {
		this.jobnum = jobnum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getCreat() {
		return creat;
	}
	public void setCreat(String creat) {
		this.creat = creat;
	}
	public String getIsdel() {
		return isdel;
	}
	public void setIsdel(String isdel) {
		this.isdel = isdel;
	}
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}
	@Override
	public String toString() {
		return "AuthorizeUser2Role [uuid=" + uuid + ", jobnum=" + jobnum + ", username=" + username + ", sex=" + sex
				+ ", age=" + age + ", pasword=" + pasword + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", creat=" + creat + ", isdel=" + isdel + ", ids=" + Arrays.toString(ids) + "]";
	}
	
	
}
