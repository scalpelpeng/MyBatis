package com.dcr.mybatis.dao;

import org.apache.ibatis.session.SqlSession;

import cn.dcr.mybatis.entity.User;
import cn.dcr.mybatis.util.Util;

public class UserDao {

	public User query(Long id) {
		SqlSession session = Util.getSqlSessionFactory().openSession();
		User user = null;
		try {
			user = session.selectOne(
					"cn.dcr.mybatis.entity.UserMapper.selectOne", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}

}
