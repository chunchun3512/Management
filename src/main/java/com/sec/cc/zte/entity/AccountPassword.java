package com.sec.cc.zte.entity;

public class AccountPassword {
	private String jobnum;
	private String pasword;
	public String getJobnum() {
		return jobnum;
	}
	public void setJobnum(String jobnum) {
		this.jobnum = jobnum;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	@Override
	public String toString() {
		return "AccountPassword [jobnum=" + jobnum + ", pasword=" + pasword + "]";
	}
	
	

}
