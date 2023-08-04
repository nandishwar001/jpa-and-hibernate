package com.learn.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {

		// Spring JDBC

		/*
		 * repository.insert(new Course(1, "Learn SpringBoot", "in28minutes"));
		 * repository.insert(new Course(3, "Learn NoSQL", "in28minutes"));
		 * repository.deleteById(1);
		 */

		// JPA
		/*
		 * repository.insert(new Course(1, "Learn Java", "JPA")); //
		 * repository.insert(new Course(2, "Learn SpingBoot", "JPA")); //
		 * repository.insert(new Course(3, "Learn NoSQL", "JPA"));
		 * repository.deleteById(1); System.out.println(repository.findById(1));
		 * System.out.println(repository.findById(3));
		 */

		// Spring Data JPA

		repository.save(new Course(1, "Learn Java", "Spring Data JPA"));
		repository.save(new Course(2, "Learn SpingBoot", "Spring Data JPA"));
		repository.save(new Course(3, "Learn NoSQL", "Spring Data JPA"));
		repository.save(new Course(4, "Learn AWS", "Stephane Marrek"));
		repository.deleteById(1l);
		System.out.println(repository.findById(1l)); // Optional.empty
		System.out.println(repository.findById(3l));
		System.out.println(repository.findAll());
		System.out.println(repository.count()); // 3

		System.out.println(repository.findByAuthor("Spring Data JPA"));
		System.out.println(repository.findByAuthor("")); // []

		System.out.println(repository.findByName("Learn AWS"));
	}
}
