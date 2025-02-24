package dev.tamdang.runnerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import dev.tamdang.runnerz.run.Location;
import dev.tamdang.runnerz.run.Run;
import dev.tamdang.runnerz.run.JdbcClientRunRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableJpaRepositories("dev.tamdang.runnerz.run")
public class RunnerzApplication {
	private static final Logger log = LoggerFactory.getLogger(RunnerzApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);
		}
	
	

}
