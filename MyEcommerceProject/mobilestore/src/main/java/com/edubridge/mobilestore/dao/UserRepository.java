package com.edubridge.mobilestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.mobilestore.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
