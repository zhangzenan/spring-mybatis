package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.User;

public interface UserMapper {
	
	//����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;
	
	
}
