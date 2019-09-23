package com.sec.cc.zte.entity;

public class Role {
	private String uuid;
	private String roleNum;
	private String roleName;
	private String createTime;
	private String updateTime;
	private String creat;
	private String isdel;
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
	@Override
	public String toString() {
		return "Role [uuid=" + uuid + ", roleNum=" + roleNum + ", roleName=" + roleName + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", creat=" + creat + ", isdel=" + isdel + "]";
	}
	
	
}
