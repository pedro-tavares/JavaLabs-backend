package com.javalabs.services.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByuserName(String userName);
}
