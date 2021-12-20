package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Phone;
import com.example.demo.beans.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
