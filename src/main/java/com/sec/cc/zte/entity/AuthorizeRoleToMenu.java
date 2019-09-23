package com.sec.cc.zte.entity;

import java.util.Arrays;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="菜单授权类型",description="菜单传入授权类型")
public class AuthorizeRoleToMenu {
	private String uuid;
	@ApiModelProperty(example="6")
	private String roleNum;
	@ApiModelProperty(example="auxiliary")
	private String roleName;
	@ApiModelProperty(example="2019/08/14")
	private String createTime;
	@ApiModelProperty(example="2019/08/14")
	private String updateTime;
	@ApiModelProperty(example="cc")
	private String creat;
	@ApiModelProperty(example="no")
	private String isdel;
	@ApiModelProperty(example="["+"id:1 nenu_name:top "
			+ "id:2 menu_name:mid "
			+ "id:3 menu_name:button "
			+ "id:4 menu_name:gungle"+"]")
	private String[] ids;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getRoleNum() {
		return roleNum;
	}
	public void setRoleNum(String roleNum) {
		this.roleNum = roleNum;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
		return "AuthorizeRoleToMenu [uuid=" + uuid + ", roleNum=" + roleNum + ", roleName=" + roleName + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", creat=" + creat + ", isdel=" + isdel + ", ids="
				+ Arrays.toString(ids) + "]";
	}
	
	
	
	
	
}
