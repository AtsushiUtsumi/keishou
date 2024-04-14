package com.example.hoge.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hoge.dao.user.User;
import com.example.hoge.dao.user.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao repository;// てかここで具象クラスをAutowiredしても意味なくね?

	/**
	 * ユーザー検索処理
	 * 
	 * @return
	 */
	public List<User> findAll() {
		return repository.findAll();
	}
}
