package holiday.web.repositories;

import holiday.web.entities.CheckoutCart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by karthik on 1/22/2017.
 */
public interface CheckoutCartRepository extends CrudRepository<CheckoutCart,Integer>{
     public List<CheckoutCart> findByCheckoutId(Integer id);
}
