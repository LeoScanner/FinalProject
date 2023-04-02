package com.dajeRaga.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dajeRaga.FinalProject.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
