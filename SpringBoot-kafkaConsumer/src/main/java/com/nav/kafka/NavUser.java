package com.nav.kafka;

public class NavUser {
	
	 private String userName;
	    private String action;
	    
	    public NavUser() {
	    	
	    }
	    
		public NavUser(String userName, String action) {
			super();
			this.userName = userName;
			this.action = action;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getAction() {
			return action;
		}
		public void setAction(String action) {
			this.action = action;
		}

}
