package cc.whitespace123.mapper;

import java.util.List;

import cc.whitespace123.enity.User;

public interface UserMapper {
	void insertUser(User user);

	void deleteUser(User user);

	void updateUser(User user);

	User selectUser(User user);

	List<User> selectUsers(User user);
}
