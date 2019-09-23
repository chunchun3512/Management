package com.sec.cc.zte.entity;

import io.swagger.annotations.ApiModelProperty;

public class User2Role {
	private String id;
	@ApiModelProperty(example="e46a3b5d50ed4a09b33d7681abc277a8")
	private String userId;
	@ApiModelProperty(example="8a45e3cd404a4142b06802a07173040d")
	private String roleId;
	@ApiModelProperty(example="2019/08/14")
	private String createTime;
	@ApiModelProperty(example="2019/08/14")
	private String updateTime;
	@ApiModelProperty(example="cc")
	private String creat;
	@ApiModelProperty(example="no")
	private String isdel;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
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
	public void setIsdel(String isDel) {
		this.isdel = isDel;
	}
	@Override
	public String toString() {
		return "User2Role [id=" + id + ", userId=" + userId + ", roleId=" +roleId + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", creat=" + creat + ", isDel=" + isdel + "]";
	}
	

}
