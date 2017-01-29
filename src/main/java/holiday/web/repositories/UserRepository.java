package holiday.web.repositories;

import holiday.web.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by karthik on 1/22/2017.
 */
public interface UserRepository extends CrudRepository<User,Integer>{
}
