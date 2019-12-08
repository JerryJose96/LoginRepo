package jerjose.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import jerjose.app.dao.UserDao;
import jerjose.app.model.Login;
import jerjose.app.model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userdao;
	
	public void register(User user) {
		userdao.register(user);
	}

	public User validateUser(Login login) {
		return userdao.validateUser(login);
	}

}
