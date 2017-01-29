package holiday.web.repositories;

import holiday.web.entities.Checkout;
import holiday.web.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by karthik on 1/22/2017.
 */
public interface CheckoutRepository extends CrudRepository<Checkout,Integer>{
    public List<Checkout> findByUserId(Integer id);
}
