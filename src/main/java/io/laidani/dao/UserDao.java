package io.laidani.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.laidani.entities.User;
import io.laidani.repos.UserRepo;

@Service
public class UserDao implements IUserDao {

	@Autowired
	UserRepo userRepo;

	@Override
	public List<User> findAllUsers() {
		return userRepo.findAll();
	}
}
