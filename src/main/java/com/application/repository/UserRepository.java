package com.application.repository;

import com.application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vuhien96 on 16/12/2020 22:19
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
