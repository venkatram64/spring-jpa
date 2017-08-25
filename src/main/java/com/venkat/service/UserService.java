package com.venkat.service;

import com.venkat.model.Bank;
import com.venkat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User getUserById(Integer id){
        return userRepository.getOne(id);
    }
    public boolean deleteUserById(Integer id){
        userRepository.delete(id);
        return true;
    }
}
