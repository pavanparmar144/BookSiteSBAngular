package com.book.management;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.management.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
