package com.printpass.user.repository;

import com.printpass.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository ke andar save(), findAll(), findById() pehle se mojood hote hain!
}