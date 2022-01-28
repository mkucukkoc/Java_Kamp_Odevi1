package Ecommerce;

import Ecommerce.GoogleAccount.GoogleManager;
import Ecommerce.business.abstracts.UserService;
import Ecommerce.business.concretes.UserManager;
import Ecommerce.core.GoogleManagerAdapter;
import Ecommerce.dataAccess.concretes.HibernateUserDao;
import Ecommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter(new GoogleManager()));
        User user = new User("Mustafa","KUCUKKOC","1234567mustafa.mkk@gmail.com","198785",true);
        User user2 = new User("Mehmet","Yavuþak","mehmet.yavusak@gmail.com","253442",false);
        userService.register(user);
        userService.login(user);
        userService.confirm(user);
        userService.loginWithEmail(user);
        userService.registerWithEmail(user);
    	userService.register(user2);
		userService.login(user2);
		userService.confirm(user2);
		userService.loginWithEmail(user2);
		userService.registerWithEmail(user2);
	}

}
