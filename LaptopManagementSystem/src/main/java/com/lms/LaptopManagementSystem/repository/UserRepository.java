package com.lms.LaptopManagementSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lms.LaptopManagementSystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "SELECT * FROM USER u WHERE u.user_email = ?1",nativeQuery = true  )
	public Optional<User> findByuserEmail(String email);
}