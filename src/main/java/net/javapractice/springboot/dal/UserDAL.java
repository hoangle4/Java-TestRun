package net.javapractice.springboot.dal;

import java.util.List;

import net.javapractice.spingboot.model.User;

public interface UserDAL {
	List<User> getAllUsers();

	User getUserById(String userId);

	User addNewUser(User user);

	Object getAllUserSettings(String userId);

	String getUserSetting(String userId, String key);

	String addUserSetting(String userId, String key, String value);
}
