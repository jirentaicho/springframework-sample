package com.volkruss.testspringf;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class WebApplicationXmlConfig extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext ctx = new XmlWebApplicationContext();
		ctx.setConfigLocation("classpath:/META-INF/spring/beans-webmvc.xml");
		return ctx;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		XmlWebApplicationContext ctx = new XmlWebApplicationContext();
		ctx.setConfigLocations(
				"classpath:/META-INF/spring/beans-context.xml",
				"classpath:/META-INF/spring/database-beans-context.xml");
		return ctx;
	}
	
	// 必須のメソッド
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
	}

}