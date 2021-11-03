package com.razib.springboot.project.springBootProject.Service;

import com.razib.springboot.project.springBootProject.Dao.UserDao;
import com.razib.springboot.project.springBootProject.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    PasswordEncoder passwordEncoder;

    public void saveUser(Users user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDao.save(user);

    }
}
