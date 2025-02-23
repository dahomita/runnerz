package dev.tamdang.runnerz.run;

import java.util.*;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll(){
        return runs;
    }
    Optional<Run> findById(Integer id){
        return runs.stream().filter(run -> run.id() == id).findFirst();
    }
    @PostConstruct
    private void init(){
        runs.add(new Run(1,"Monday Morning Run", LocalDateTime.now(), LocalDateTime.now().plus(30,ChronoUnit.MINUTES),3,Location.INDOOR));
        runs.add(new Run(2,"Wednesday Evening Run", LocalDateTime.now(), LocalDateTime.now().plus(60,ChronoUnit.MINUTES),6,Location.INDOOR));
    }
}
