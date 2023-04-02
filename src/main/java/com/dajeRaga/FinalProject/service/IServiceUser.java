package com.dajeRaga.FinalProject.service;

import java.util.List;

import com.dajeRaga.FinalProject.entity.User;

public interface IServiceUser {
	public List<User> findAll();
	public User save(User user);
	
	
}
