# graphql-java-example

An example of using graphql-java in a Spring Boot application with mongo db.


#### Before you start
 - Install Docker and Docker Compose.
 - Make sure to build the project: `./gradlew build`
 - Run `docker-compose up`
 
 #### Graphql endpoint 
 - http://localhost:3000/graphiql
 
 #### Some example graphql queries might be
 
 Save user
 ```
 mutation {
   saveUser(name: "Petr", lastName: "Petrov", middleName: "Petr") {
     id,
     name,
     lastname,
     middlename
   }
 }
 ```
 Get info about all users
 ```
 query{
   getAllUsers{
     id,
     name,
     lastname,
     middlename
   }
 }
 ```