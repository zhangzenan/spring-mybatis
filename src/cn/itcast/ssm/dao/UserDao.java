package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;

public interface UserDao {
	
	//����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;
	
	

}
