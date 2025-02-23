Spring Boot: 
- Dependencies:
  + Spring Web
  + Spring Boot Devtools
- Use start.spring.io -> h2 database + jdbc to collects dependencies:
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-jdbc</artifactId>
    </dependency>

    <dependency>
      <groupId>com.h2database</groupId>
      <artifactId>h2</artifactId>
      <scope>runtime</scope>
    </dependency>
