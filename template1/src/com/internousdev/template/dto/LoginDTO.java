package com.internous.template.dto;

public class LoginDTO {

	private String loginId;
	private String loginPassword;
	private String userName;
	private boolean loginFlg = false;
	
	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	
	public String getLoginPassword(){
		return loginPassword ;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	
	public String getUserName(){
		this.userName = userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public boolean getLoginFlg() {
		return loginFlg();
	}
	public void setLoginFlg(boolean loginFlg){
		 this.loginFlg = loginFlg;
	}
	}

