# jpa-and-hibernate
Spring JDBC, JPA and Spring Data JPA.

JPA(Java Persistence API) vs Hibernate 
---------------------------------------
1. JPA is responsible for managing relational databases in Java applications.
   Hibernate is an ORM tool used for saving the state of the Java object in the database.
2. JPA is defined under the javax.persistence package.
   Hibernate is defined under org.hibernate package.
3. JPA is the Java specification and not the implementation.
   Hibernate is an implementation of JPA and uses common standards of Java Persistence API.
4. JPA is the standard API that allows developers to perform database operations smoothly.
   Hibernate is used to map Java data types with database tables and SQL data types.
5. JPA uses the EntityManagerFactory interface to interact with the entity manager factory for the persistence unit.
   Hibernate uses the SessionFactory interface for creating Session instances.
6. JPA uses the EntityManager interface to create, read, and delete operations for instances of mapped entity classes. This interface interacts with the persistence context.	 
   Hibernate uses a Session interface to create, read, and delete operations for instances of mapped entity classes. It behaves as a runtime interface between a Java application and Hibernates.
7. JPA uses Java Persistence Query Language (JPQL) is an object-oriented query language to perform database operations.
   Hibernate uses Hibernate Query Language (HQL) is an object-oriented query language to perform database operations.
