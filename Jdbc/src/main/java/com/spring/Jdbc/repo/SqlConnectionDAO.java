package com.spring.Jdbc.repo;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.Jdbc.model.Customer;



@Repository
public class SqlConnectionDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	static final String SQL = "SELECT * FROM HARI_JDBC_TABLE";

	public List<Customer> Read() {

		List<Customer> customers = new ArrayList<Customer>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

		for (Map<String, Object> row : rows) {
			Customer customer = new Customer();

			customer.setCustNo((int) row.get("CUSTOMERID"));
			customer.setCustName((String) row.get("CUSTOMERNAME"));
			customer.setAge((int) row.get("CUSTOMERAGE"));

			customers.add(customer);
		}

		return customers;

	}

}