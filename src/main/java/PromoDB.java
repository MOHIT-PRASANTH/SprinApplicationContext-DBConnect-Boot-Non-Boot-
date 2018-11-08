package com.yatra.promo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PromoDB{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String SELECT_SQL = "SELECT promocode FROM promo_code where promocode is not NULL limit 1";
	
	public String getPromo() {
		return (String) jdbcTemplate.queryForObject(SELECT_SQL, new Object[] {  }, String.class);
	}

}
