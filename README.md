# spring-boot-hypermedia
Spring Boot application to configure hypermedia api and data rest to make use Hypermedia urls.

To run the application, follow below steps:
1. Open command prompt/terminal.
2. Execute the command > curl -i http://localhost:8080/ 
3. The above statement gives all the information about the list of available tables in the database.
4. Then, use > curl -i http://localhost:8080/post or http://localhost:8080/author to see the data and the hypermedia links that spring data rest provides.
5. You can also use below commands in the command line
    > curl -i localhost:8080/posts/2/author
    > curl -i localhost:8080/author/1
6. After adding search in the repository interface, we can do something like below:
    > http://localhost:8080/posts/search/findByTitleContaining?title=Angular"    


