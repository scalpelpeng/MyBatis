package cn.dcr.mybatis.test;

import cn.dcr.mybatis.entity.User;

import com.dcr.mybatis.dao.UserDao;

public class UserTest {

	public static void main(String[] args){
		UserDao userDao = new UserDao();
		User user = userDao.query(1L);
		
		System.out.println(user.getId());
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
	}
	
}
