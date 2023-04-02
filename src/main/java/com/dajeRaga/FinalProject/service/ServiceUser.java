package com.dajeRaga.FinalProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dajeRaga.FinalProject.entity.User;
import com.dajeRaga.FinalProject.repository.UserRepository;

import jakarta.transaction.Transactional;

@Transactional 
@Service
public class ServiceUser implements IServiceUser{

	@Autowired  
		// va a richiamare userRepository (per fare dep injection)
	private UserRepository userRepository;
	
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
		
	}

	
}
