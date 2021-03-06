package cn.haiyang.service.user;

import cn.haiyang.domain.user.UserModel;

public interface IUserService {
	public UserModel findByUsername(String username);

	public UserModel findByPhone(String phone);

	public boolean addUser(UserModel user);

	public UserModel login(String username,String password);

	UserModel findById(int userId);

	void updatePhoneStatus(String phone,int userId);

	void updateRealName(String userName,String identity,int id);

	void addEmail(String email,int id);

	void updateEmailStatus(int id);
}
