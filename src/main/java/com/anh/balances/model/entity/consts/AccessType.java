package com.anh.balances.model.entity.consts;

public enum AccessType {
	 Login,Logout,SignUp{
		  @Override
		public String getDisplayName() {
			// TODO Auto-generated method stub
			return "Sign Up";
		}
	 },TimeOut;
 
	 public String getDisplayName() {
		  return this.name();
	 }
	 
	 
}
