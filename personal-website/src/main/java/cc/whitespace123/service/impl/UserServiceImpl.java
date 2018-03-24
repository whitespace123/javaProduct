package cc.whitespace123.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cc.whitespace123.enity.User;
import cc.whitespace123.mapper.UserMapper;
import cc.whitespace123.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier(value = "userMapper")
	private UserMapper userMapper;

	@Override
	public void saveUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public void removeUser(User user) {
		userMapper.deleteUser(user);
	}

	@Override
	public void modifyUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public User findUser(User user) {
		User target = userMapper.selectUser(user);
		return target;
	}

	@Override
	public List<User> findUsers(User user) {
		List<User> users = userMapper.selectUsers(user);
		return users;
	}

}
