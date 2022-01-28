package Ecommerce.GoogleAccount;

import Ecommerce.entities.concretes.User;

public class GoogleManager {
	public void register(User user) {
		System.out.println(user.getName()+" "+user.getSurname()+" siteye kaydoldunuz.");
	}
	public void login(User user) {
		System.out.println(user.getName()+" "+user.getSurname()+" siteye giriþ yaptýnýz...");
	}
}
