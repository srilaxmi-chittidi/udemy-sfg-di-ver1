package com.sfg.sfg_di.repository;

public class FakeDataSource {

	private String userName;
	private String password;
	private String datasourceUrl;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDatasourceUrl() {
		return datasourceUrl;
	}
	public void setDatasourceUrl(String datasourceUrl) {
		this.datasourceUrl = datasourceUrl;
	}
	
}
