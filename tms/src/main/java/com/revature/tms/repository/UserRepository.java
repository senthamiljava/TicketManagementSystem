package com.revature.tms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.tms.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByEmailIdAndPassword(String email, String password);

	public User findByEmailId(String emailId);
}
