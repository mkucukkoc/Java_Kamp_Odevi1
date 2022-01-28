package Ecommerce.business.concretes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import Ecommerce.business.abstracts.UserService;
import Ecommerce.core.GoogleService;
import Ecommerce.dataAccess.abstracts.UserDao;
import Ecommerce.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private GoogleService service;
	
	

	public UserManager(UserDao userDao, GoogleService service) {
		this.userDao = userDao;
		this.service = service;
	}

	@Override
	public void register(User user) {
		
		if(user.getPassword().length()< 6) {
			System.out.println("Parolananiz 6 karakterden oluþmalýdýr!");
		}	
		
		final String EMAIL_REGEX ="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		final Pattern pattern = Pattern.compile(EMAIL_REGEX,Pattern.CASE_INSENSITIVE);
		 Matcher matcher = pattern.matcher(user.getEmail());
		 if(!matcher.matches()) {
			 System.out.println( user.getEmail() + " Lüttfen E-posta formatýna uygun bir adres giriniz!");
		 }
		 for(User users:userDao.getAll()) {
			 if(users.getEmail().equals(user.getEmail())) {
				 System.out.println(" Bu E-mail adresi sistemde mevcut!.Lütfen baska bir Email adresi deneyiniz!.");
			 }
			 if(users.getName().length()<2 && users.getSurname().length()<2) {
				 System.out.println(" Ad ve Soyad en az 2 karakterden olusmalýdýr!.");
			 }
		 }
		 userDao.register(user);
	}

	@Override
	public void login(User user) {
		if(user.isVerify() == true) {
			userDao.login(user);
			System.out.println(" Giris Basarýlýdýr...");
			
		} else {
			System.out.println(" Giris Basarýsýzdýr!");
		}
		
	}

	@Override
	public void confirm(User user) {
		if(user.isVerify()==true) {
			userDao.confirm(user);
			System.out.println(user.getEmail() + " E-mail adresiniz dogrulandý");
			
		} else {
			System.out.println(user.getEmail() + " E-mail adresiniz dogrulanamadý.");
		}
		
	}

	@Override
	public void registerWithEmail(User user) {
		user.setVerify(true);
		this.service.register(user);
	}
	@Override
	public void loginWithEmail(User user) {
		if(user.isVerify() == true) {
			this.service.login(user);
		}
		else {
			System.out.println(" Lütfen Kayýt olunuz!.");
		}
		
	}
	

}
