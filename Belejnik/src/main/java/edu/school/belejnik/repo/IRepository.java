package edu.school.belejnik.repo;

import java.util.List;

public interface IRepository {
	public List<?> getAll();
	public Object getById(Long id);
	public void create(Object o);
}
