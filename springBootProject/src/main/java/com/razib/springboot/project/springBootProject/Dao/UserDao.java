package com.razib.springboot.project.springBootProject.Dao;

import com.razib.springboot.project.springBootProject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<Users,Integer> {

    @Query(value = "select * from Users ",nativeQuery = true)
    List<Users> getAllUser();

    Users getById(Integer id);

    Users getByUserName(String name);

//    List<Users> findAll();
}
