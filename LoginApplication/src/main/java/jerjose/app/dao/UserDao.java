package jerjose.app.dao;

import jerjose.app.model.Login;
import jerjose.app.model.User;

public interface UserDao {
	
	void register(User user);
	
	User validateUser(Login login);
}
