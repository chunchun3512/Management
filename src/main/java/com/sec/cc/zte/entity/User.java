package com.sec.cc.zte.entity;

import io.swagger.annotations.ApiModelProperty;

public class User {
	private String uuid;
	@ApiModelProperty(example="201900030")
	private String jobnum;
	@ApiModelProperty(example="zhangliang")
	private String username;
	@ApiModelProperty(example="famale")
	private String sex;
	@ApiModelProperty(example="29")
	private int age;
	@ApiModelProperty(example="@zte123456")
	private String pasword;
	@ApiModelProperty(example="2019/08/14")
	private String createTime;
	@ApiModelProperty(example="2019/08/14")
	private String updateTime;
	@ApiModelProperty(example="cc")
	private String creat;
	@ApiModelProperty(example="no")
	private String isdel;
	private int currentPage;
	private int limit;
	
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
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "User [uuid=" + uuid + ", jobnum=" + jobnum + ", username=" + username + ", sex=" + sex + ", age=" + age
				+ ", pasword=" + pasword + ", createTime=" + createTime + ", updateTime=" + updateTime + ", creat="
				+ creat + ", isdel=" + isdel + "]";
	}
	
	
	
	

}
