package com.gat.book.dao;

import com.gat.book.model.UserInfo;

public interface UserDao {
	UserInfo findUserById(Integer id);
	UserInfo findUserByEmail(String email);
}
