package com.rinfotek.usercurdoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rinfotek.usercurdoperation.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
