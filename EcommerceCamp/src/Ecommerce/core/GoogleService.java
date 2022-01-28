package Ecommerce.core;

import Ecommerce.entities.concretes.User;

public interface GoogleService {
	void register(User user);
	void login(User user);
}
