package dev.tamdang.runnerz.run;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.*;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RunNotFoundException extends RuntimeException {
    public RunNotFoundException(){
        super("Run Not Found");
    }
}
