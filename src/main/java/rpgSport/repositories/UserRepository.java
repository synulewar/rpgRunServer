package rpgSport.repositories;

import org.springframework.data.repository.CrudRepository;
import rpgSport.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
