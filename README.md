# spring-jdbc-example
Test application based on maven convention provided simple example an spring and jdbsTemplate

<p>1. Defining both Repository and Service through interface, becouse you are going to know that is wise.</p>
<p>2. Defining the Database Structure</p>
<p>we need define a database structure to persist our data/ and we are going to work with HSQL - it is in-memory database.</p>
<p>3. Define the infrastructure:</p>
<p>I am cover three important beans and i am going to create all our bean definitions based on XML</p>
<ul>
	<li>dataSource</li>
<li>jdbcTemplate - offere a powerfull and excelent mechanism to work with database</li>
<li>transactionManager</li>
</ul>
<p>4. PesrsonRowMapper class. This class make a mapping for a fields retrived from the person table into the <b>instance variable</b> of Person class, throuth the setters.
Something similar how ORM works. But i am going to do this munually.</p>