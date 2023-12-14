package com.Ytallo.UserAdm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ytallo.UserAdm.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
