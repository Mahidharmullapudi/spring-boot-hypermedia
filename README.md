# spring-boot-hypermedia
Spring Boot application to configure hypermedia api and data rest to make use Hypermedia urls.
This application makes use of varous Spring core, web, data, io, and ops dependencies. Configured in memory database using H2 support. 

To run the application, follow below steps:
1. Open command prompt/terminal.
2. Execute the command 
    > curl -i http://localhost:8080/ 
3. The above statement gives all the information about the list of available tables in the database.
4. To see the data and the hypermedia links that spring data rest provides, use
    > curl -i http://localhost:8080/post or http://localhost:8080/author
5. You can also use below commands in the command line
    > curl -i http://localhost:8080/posts/2/author
    > curl -i http://localhost:8080/author/1
6. After adding custom query support in the repository interface, we can search for entries like below:
    > curl -i http://localhost:8080/posts/search/findByTitleContaining?title=Angular"    
7. To use projections you can play with commands like below:
    > curl -i http://localhost:8080/posts/2?projection=title


You can also check all the rest endpoints using hal browser using the dependency spring-data-rest-hal-browser
and you can access hal browser on the browser at http://localhost:8080/
