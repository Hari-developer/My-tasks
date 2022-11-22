package com.crud.springjdbc.dao;

import java.util.List;

import javax.swing.text.rtf.RTFEditorKit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crud.springjdbc.entity.User;

@Repository
public class UserRepoImpl implements UserRepository {
	
	private static final String INSERT_USER_QUERY="INSERT INTO HARI_CRUD_TABLE(ID,FNAME,LNAME,EMAIL) VALUES(?,?,?,?)";
	private static final String UPDATEE_USER_BY_ID_QUERY="UPDATE HARI_CRUD_TABLE SET FNAME=? WHERE ID=?";
	private static final String GET_USER_BY_ID_QUERY="SELECT * FROM HARI_CRUD_TABLE WHERE ID=?";
	private static final String DELETE_USER_BY_ID_QUERY="DELETE FROM HARI_CRUD_TABLE WHERE ID=?";
	private static final String GET_USERS="SELECT * FROM HARI_CRUD_TABLE";


    @Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User saveUser(User user) {
		jdbcTemplate.update(INSERT_USER_QUERY,user.getId(),user.getFname(),user.getLname(),user.getEmail());
		
		return user;
	}

	@Override
	public User updateUser(User user) {
		jdbcTemplate.update(UPDATEE_USER_BY_ID_QUERY,user.getFname(),user.getId());
		return user;
	}

	@Override
	public User getById(int id) {
		return jdbcTemplate.queryForObject(GET_USER_BY_ID_QUERY,(rs, rowNum) -> {
			
			return new User(rs.getInt("ID"),rs.getString("FNAME"),rs.getString("LNAME"),rs.getString("EMAIL"));
		});
			

	
		
	}

	@Override
	public String deleteById(int id) {
		jdbcTemplate.update(DELETE_USER_BY_ID_QUERY,id);
		return "User got deleted with id" +id;
	}

	@Override
	public List<User> allUser() {
	return	jdbcTemplate.query(GET_USERS, (rs, rowNum) ->
		{
			return new User(rs.getInt("ID"),rs.getString("FNAME"),rs.getString("LNAME"),rs.getString("EMAIL"));
		});
		
	}

}
