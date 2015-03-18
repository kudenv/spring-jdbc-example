# spring-jdbc-example
Test application based on maven convention provided simple example an spring and jdbsTemplate

1.Defining both Repository and Service through interface, becouse you are going to know that is wise.

2. Defining the Database Structure
-we need define a database structure to persist our data/ and we are going to work with HSQL - it is in-memory database.
3. Define the infrastructure
- i am cover three important beans and i am going to create all our bean definitions based on XML
-dataSource
-jdbcTemplate - offere a powerfull and excelent mechanism to work with database
-transactionManager
4. PesrsonRowMapper class. This class make a mapping for a fields retrived from the person table into the <b>instance variable</b> of Person class, throuth the setters.
Something similar how ORM works. But i am going to do this munually.