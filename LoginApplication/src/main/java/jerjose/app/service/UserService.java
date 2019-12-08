package jerjose.app.service;

import jerjose.app.model.Login;
import jerjose.app.model.User;

public interface UserService {
	void register(User user);
	
	User validateUser(Login login);
}
