package com.cx.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "file:${user.dir}/config/datasource.properties"})
public class ActivitiConfig {
	
	@Value("${jdbc.driver}")
	private String jdbcDriver;
	
	@Value("${jdbc.url}")
	private String jdbcURL;
	
	@Value("${jdbc.user}")
	private String jdbcUser;
	
	@Value("${jdbc.pass}")
	private String jdbcPass;
	
	private ProcessEngineConfiguration processEngineConfiguration;

	private ProcessEngine processEngine;
	
	public ProcessEngine getProcessEngine() {
		if(processEngine == null) {
			processEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
			processEngineConfiguration.setJdbcDriver(jdbcDriver);
			processEngineConfiguration.setJdbcUrl(jdbcURL);
			processEngineConfiguration.setJdbcUsername(jdbcUser);
			processEngineConfiguration.setJdbcPassword(jdbcPass);
			processEngine = processEngineConfiguration.buildProcessEngine();
		}
		return processEngine;
	}
}