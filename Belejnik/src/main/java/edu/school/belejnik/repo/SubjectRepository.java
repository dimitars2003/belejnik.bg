package edu.school.belejnik.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import edu.school.belejnik.models.Subject;

@Repository("jdbcSubjectRepository")
public class SubjectRepository implements IRepository{

	@Autowired
	private JdbcTemplate connection;
	
	@Override
	public List<?> getAll() {
		List <Subject> result = connection.query("select * from Subjects", new RowMapper<Subject>() {

			@Override
			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject s = new Subject(
						rs.getString("name"));
				s.setId(rs.getLong("id"));
				return s;
			}
			
		});
		return result;
	}

	@Override
	public Object getById(Long id) {
		// TODO Auto-generated method stub
		Subject s = connection.queryForObject("select * from Subjects where id = ? ", new RowMapper<Subject>() {

			@Override
			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject s = new Subject(
						rs.getString("name"));
				s.setId(rs.getLong("id"));
				return s;
				
			}
			
		}, id);
		return s;
	}

	@Override
	public void create(Object o) {
		// TODO Auto-generated method stub
		
	}
	
	public List<?> getUsersBySubject(){
		return null;
		
	}

}
