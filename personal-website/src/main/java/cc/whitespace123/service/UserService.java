package cc.whitespace123.service;

import java.util.List;

import cc.whitespace123.enity.User;

public interface UserService {
	void saveUser(User user);

	void removeUser(User user);

	void modifyUser(User user);

	User findUser(User user);

	List<User> findUsers(User user);
}
