package com.learn.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learn.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

//	private static String INSERT_QUERY = """
//			insert into course(id, name, author) values(2, 'Learn SpringBoot', 'in28minutes')
//			""";

	private static String INSERT_QUERY = """
			insert into course(id, name, author) values(?, ?, ?)
			""";

	private static String DELETE_QUERY = """
			delete from course where id = ?
			""";

	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteById(long id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}
}
