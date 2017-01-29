package holiday.web.controllers;

import holiday.web.entities.CheckoutCart;
import holiday.web.services.CheckoutCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by karthik on 1/22/2017.
 */

@RestController
public class CheckoutCartController {

    @Autowired
    private CheckoutCartService checkoutCartService;

    @RequestMapping("/checkouts/{checkoutId}/checkoutcarts")
    public List<CheckoutCart> getAllCheckoutCart(@PathVariable Integer checkoutId)
    {
        return checkoutCartService.getAllCheckoutCarts(checkoutId);
    }

    @RequestMapping("/checkoutcarts/{id}")
    public CheckoutCart getCheckoutCart(@PathVariable Integer id)
    {
        return checkoutCartService.getCheckoutCart(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/checkoutcarts")
    public void addCheckoutCart(@RequestBody CheckoutCart checkoutCart)
    {
        checkoutCartService.addCheckoutCart(checkoutCart);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/checkoutcarts")
    public void updateCheckoutCart(@RequestBody CheckoutCart checkoutCart)
    {
        checkoutCartService.updateCheckoutCart(checkoutCart);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/checkoutcarts")
    public void deleteCheckoutCart(CheckoutCart checkoutCart)
    {
        checkoutCartService.deleteCheckoutCart(checkoutCart);
    }
}
