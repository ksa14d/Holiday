package holiday.web.services;

import holiday.web.entities.Checkout;
import holiday.web.repositories.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by karthik on 1/22/2017.
 */

@Service
public class CheckoutService {

    @Autowired
    private CheckoutRepository checkoutRepository;

    public List<Checkout> getAllCheckout(Integer userId)
    {
        return StreamSupport.stream(checkoutRepository.findByUserId(userId).spliterator(),false).collect(Collectors.toList());
    }

    public Checkout getCheckout(Integer id)
    {
        return checkoutRepository.findOne(id);
    }

    public Checkout addCheckout(Checkout checkout)
    {
        return checkoutRepository.save(checkout);
    }

    public Checkout updateCheckout(Checkout checkout)
    {
        return checkoutRepository.save(checkout);
    }

    public void deleteCheckout(Checkout checkout)
    {
        checkoutRepository.delete(checkout.getId());
    }
}
