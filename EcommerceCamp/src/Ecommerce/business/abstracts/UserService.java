package Ecommerce.business.abstracts;

import Ecommerce.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void confirm(User user);
	void registerWithEmail(User user);
	void loginWithEmail(User user);
	

}
