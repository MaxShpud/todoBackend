package com.taskOne.fullstackbackend.repository;

import com.taskOne.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
