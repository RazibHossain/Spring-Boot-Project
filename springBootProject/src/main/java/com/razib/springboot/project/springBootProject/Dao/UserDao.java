package com.razib.springboot.project.springBootProject.Dao;

import com.razib.springboot.project.springBootProject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Users,Integer> {
}
