package io.tjohander.searchlight.repository;

import io.tjohander.searchlight.model.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository<T extends Activity> extends CrudRepository<T, Long> {

}
