package com.dxc.usersvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.usersvc.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
