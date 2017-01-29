package holiday.web.controllers;

import holiday.web.entities.User;
import holiday.web.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by karthik on 1/22/2017.
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable Integer id)
    {
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/users")
    public void addUser(@RequestBody User user)
    {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/users")
    public void updateUser(@RequestBody User user)
    {
        userService.updateUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/users")
    public void deleteUser(User user)
    {
        userService.deleteUser(user);
    }
}
