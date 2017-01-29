package holiday.web.services;

import holiday.web.entities.CheckoutCart;
import holiday.web.repositories.CheckoutCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by karthik on 1/22/2017.
 */

@Service
public class CheckoutCartService {

    @Autowired
    private CheckoutCartRepository checkoutCartRepository;

    public List<CheckoutCart> getAllCheckoutCarts(Integer checkoutId)
    {
        return StreamSupport.stream(checkoutCartRepository.findByCheckoutId(checkoutId).spliterator(),false).collect(Collectors.toList());
    }

    public CheckoutCart getCheckoutCart(Integer itemId)
    {
        return checkoutCartRepository.findOne(itemId);
    }

    public void addCheckoutCart(CheckoutCart checkoutCart)
    {
        checkoutCartRepository.save(checkoutCart);
    }

    public void updateCheckoutCart(CheckoutCart checkoutCart)
    {
        checkoutCartRepository.save(checkoutCart);
    }

    public void deleteCheckoutCart(CheckoutCart checkoutCart)
    {
        checkoutCartRepository.delete(checkoutCart.getItemID());
    }
}
