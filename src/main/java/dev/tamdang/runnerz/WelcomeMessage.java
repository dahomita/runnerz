package dev.tamdang.runnerz;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class WelcomeMessage {

    public String getWelcomeMessage(){
        return "Welcome to the Spring Boot Application";
    }
}
