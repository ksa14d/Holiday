package holiday.web.controllers;

import holiday.web.entities.Checkout;
import holiday.web.services.CheckoutCartService;
import holiday.web.services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by karthik on 1/22/2017.
 */

@RestController
public class CheckoutController {

    @Autowired
    private CheckoutService checkoutService;

    @Autowired
    private CheckoutCartService checkoutCartService;

    @RequestMapping("/users/{userId}/Checkouts")
    public List<Checkout> getAllCheckouts(@PathVariable Integer userId)
    {
        return checkoutService.getAllCheckout(userId);
    }

    @RequestMapping("/Checkouts/{id}")
    public Checkout getCheckout(@PathVariable Integer id)
    {
        return checkoutService.getCheckout(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/Checkouts")
    public void addCheckout(@RequestBody Checkout checkout)
    {
        Checkout savedCheckout = checkoutService.addCheckout(checkout);
        checkout.getCheckoutCart().stream().forEach(c -> {
            c.setCheckout(savedCheckout);
            checkoutCartService.addCheckoutCart(c);
        });

    }

    @RequestMapping(method = RequestMethod.PUT,value = "/Checkouts")
    public void updateCheckout(@RequestBody Checkout checkout)
    {
        checkoutService.updateCheckout(checkout);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/Checkouts")
    public void deleteCheckout(Checkout checkout)
    {
        checkoutService.deleteCheckout(checkout);
    }
}
