package dev.tamdang.runnerz.run;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RunRepository extends ListCrudRepository<Run , Integer> {
    
}
