# Spring Boot: 
## Dependencies:
  + Spring Web
  + Spring Boot Devtools
## Use start.spring.io -> h2 database + jdbc to collects dependencies:
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-jdbc</artifactId>
    </dependency>

    <dependency>
      <groupId>com.h2database</groupId>
      <artifactId>h2</artifactId>
      <scope>runtime</scope>
    </dependency>

# Manage Database
## Install Docker and use PostgreSQL
```
docker run --name postgres-db -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=admin -e POSTGRES_DB=runnerz -p 5432:5432 -d postgres
```
```
docker exec -it runnerz-postgres-1 psql -U tam -d runnerz
runnerz=#
  \dt
  \d run
  SELECT * FROM run;
```
