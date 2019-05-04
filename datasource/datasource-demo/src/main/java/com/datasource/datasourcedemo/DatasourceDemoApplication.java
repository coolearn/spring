package com.datasource.datasourcedemo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j //lombok
public class DatasourceDemoApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource; //自动配置
	// http://127.0.0.1:8080/actuator/beans 
	// 不起作用，，，

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DatasourceDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		showConnection(); // 打印数据源信息
	}

	private void showConnection() throws SQLException {
		log.info(dataSource.toString());
		Connection conn = dataSource.getConnection();
		log.info(conn.toString());
		conn.close();
		showData();
	}
	private void showData() {
		jdbcTemplate.queryForList("SELECT * FROM FOO")
				.forEach(row -> log.info(row.toString()));
	}

}
