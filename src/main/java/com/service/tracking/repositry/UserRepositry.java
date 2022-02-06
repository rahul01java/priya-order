package com.service.tracking.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.tracking.entity.UserEntity;

@Repository
public interface UserRepositry extends JpaRepository<UserEntity, Integer>{

	UserEntity findByMobileno(String mobileNo);
}
