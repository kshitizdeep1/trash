package com.spring.jdbc1;

import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createTable() {
		String createTable = "Create Table Train(id int,name varchar(25))";
		jdbcTemplate.execute(createTable);
	}
}
