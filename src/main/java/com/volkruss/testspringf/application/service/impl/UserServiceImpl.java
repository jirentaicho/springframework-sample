package com.volkruss.testspringf.application.service.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.volkruss.testspringf.application.service.UserService;

public class UserServiceImpl implements UserService{
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public String findUser() {
		// SQLを発行
		String result = this.jdbcTemplate.queryForObject("select name from characters where id = 6", String.class);
		return result;
	}
	
	// インジェクション用のメソッド
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
