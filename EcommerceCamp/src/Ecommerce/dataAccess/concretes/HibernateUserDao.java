package Ecommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Ecommerce.dataAccess.abstracts.UserDao;
import Ecommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void deleteUser(User user) {
        System.out.println(user.getName() + user.getSurname() + " isimli kullanýc basarýlý bir þekilde silindi!");		
	}

	@Override
	public void UpdateUser(User user) {
        System.out.println(user.getName() + user.getSurname() + " isimli kullanýc basarýlý bir þekilde güncellendi!");		
		
	}

	@Override
	public void register(User user) {
        System.out.println(user.getName() + user.getSurname() + " isimli kullanýc basarýlý bir þekilde kayýt oldu!");		
		
	}

	@Override
	public void confirm(User user) {
        System.out.println(user.getName() + user.getSurname() + " isimli kullanýcý basarýlý bir þekilde onaylandý!");		
		
	}

	@Override
	public void login(User user) {
        System.out.println(user.getName() + user.getSurname() + " isimli kullanýc basarýlý bir þekilde giriþ yaptý!");		
		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	
	
}
