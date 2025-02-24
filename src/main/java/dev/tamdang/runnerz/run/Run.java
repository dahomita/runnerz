package dev.tamdang.runnerz.run;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import jakarta.persistence.*;

// validate constraint
@Entity
@Table(name = "run")
public record Run(
    @Id
    Integer id,
    @NotEmpty
    String title, 
    LocalDateTime startedOn,
    LocalDateTime completedOn, 
    @Positive
    Integer miles, 
    Location location,
    @Version
    Integer Version
) {
    public Run {
        if (!completedOn.isAfter(startedOn)){
            throw new IllegalArgumentException("Completed On must be after Started On");
        }
    }
    
}
