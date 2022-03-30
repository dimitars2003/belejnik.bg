package edu.school.belejnik.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import edu.school.belejnik.models.User;

public class UserRepo implements IRepository{
	@Autowired
	private JdbcTemplate connection;
	
	@Override
	public List<?> getAll() {
		List <User> result = connection.query("select * from Users", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User(
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phone"),
						rs.getString("address"),
						rs.getString("password"),
						rs.getInt("role")
				);
				u.setId(rs.getLong("id"));
				return u;
			}
			
		});
		return result;
	}

	@Override
	public Object getById(Long id) {
		User u = connection.query("select * from Users Where id=? ", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User(
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phone"),
						rs.getString("address"),
						rs.getString("password"),
						rs.getInt("role")
				);
				u.setId(rs.getLong("id"));
				return u;
			}
			
		},id);
		return null;
	}

	@Override
	public void create(Object o) {
		// TODO Auto-generated method stub
		
	}
}
