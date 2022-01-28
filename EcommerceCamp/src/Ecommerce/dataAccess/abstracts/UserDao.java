package Ecommerce.dataAccess.abstracts;

import java.util.List;

import Ecommerce.entities.concretes.User;


public interface UserDao {
	void deleteUser(User user);
	void UpdateUser(User user);
	void register(User user);
	void confirm(User user);
	void login(User user);
	List<User> getAll();
}
