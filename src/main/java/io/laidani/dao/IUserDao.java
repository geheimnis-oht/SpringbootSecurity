package io.laidani.dao;

import java.util.List;
import io.laidani.entities.User;

public interface IUserDao {

	List<User> findAllUsers();

}
