package Ecommerce.core;

import Ecommerce.GoogleAccount.GoogleManager;
import Ecommerce.entities.concretes.User;

public class GoogleManagerAdapter implements GoogleService {
	private GoogleManager googleManager;

	public GoogleManagerAdapter(GoogleManager googleManager) {
		this.googleManager = googleManager;
	}

	@Override
	public void register(User user) {
		googleManager.register(user);
		
	}

	@Override
	public void login(User user) {
		googleManager.login(user);
		
	}

	


	

}
