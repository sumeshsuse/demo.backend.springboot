package com.example.demo.repository;

import com.example.demo.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

    @Query("SELECT u FROM Login u WHERE u.username = ?1 and u.password = ?2")
    List<Login> findUsernamePassword(String username, String password);
}
