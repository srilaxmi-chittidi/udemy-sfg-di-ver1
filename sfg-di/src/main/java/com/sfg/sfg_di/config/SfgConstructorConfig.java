package com.sfg.sfg_di.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@ConfigurationProperties("db")
public class SfgConstructorConfig {

	private final String userName;
	private final String password;
	private final String datasourceUrl;
	public SfgConstructorConfig(String userName, String password, String datasourceUrl) {
		super();
		this.userName = userName;
		this.password = password;
		this.datasourceUrl = datasourceUrl;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getDatasourceUrl() {
		return datasourceUrl;
	}
	
	
}
