package holiday.web.services;

import holiday.web.entities.User;
import holiday.web.repositories.UserRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by karthik on 1/22/2017.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User>  getAllUsers()
    {
        return StreamSupport.stream(userRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }

    public User getUser(Integer id)
    {
        return userRepository.findOne(id);
    }

    public User addUser(User user)
    {
        return userRepository.save(user);
    }

    public User updateUser(User user)
    {
        return userRepository.save(user);
    }

    public void deleteUser(User user)
    {
        userRepository.delete(user.getId());
    }

}
