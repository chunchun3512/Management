package com.sec.cc.zte.entity;

import io.swagger.annotations.ApiModelProperty;

public class Role2Menu {
	private String id;
	@ApiModelProperty(example="4357dcb387ec462fa25b287368d8282f")
	private String roleId;
	@ApiModelProperty(example="2")
	private String menuId;
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
	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
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
	@Override
	public String toString() {
		return "Role2Menu [id=" + id + ", roleId=" + roleId + ", menuId=" + menuId + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", creat=" + creat + ", isdel=" + isdel + "]";
	}
	
}
