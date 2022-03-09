package edu.school.belejnik.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import edu.school.belejnik.models.Subject;
import edu.school.belejnik.models.User;

@Repository("jdbcUserRepository")
public class UserRepository implements IRepository{

	@Autowired
	private JdbcTemplate connection;
	
	@Override
	public List<?> getAll() {
		List <User> result = connection.query("select * from Subjects", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User(
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phone"),
						rs.getString("address"),
						rs.getString("password"),
						rs.getInt("role");
				);
				u.setId(rs.getLong("id"));
				return u;
			}
			
		});
		return result;
	}

	@Override
	public Object getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Object o) {
		// TODO Auto-generated method stub
		
	}

}
