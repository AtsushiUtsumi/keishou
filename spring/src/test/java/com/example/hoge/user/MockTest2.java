package com.example.hoge.user;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.hoge.dao.user.User;
import com.example.hoge.dao.user.UserDao;

// クラスを右クリックで新規テストでなぜかうまく出来てしまったjpiterだからか?

@SpringBootTest
class MockTest2 {

	@InjectMocks
	private UserService service;

	@Mock
	private UserDao repository;

	@Test
	void テストクラスの中でAutowiredしたい() {

		var users = new ArrayList<User>();
		users.add(new User());
		users.add(new User());
		users.add(new User());
		users.add(new User());
		users.add(new User());
		Mockito.doReturn(users).when(repository).findAll();
		assertEquals(5, service.findAll().size());
	}

	@Test
	void DB起動していないとSpringが起動出来ないのでテスト出来ない説() {
		var users = new ArrayList<User>();
		users.add(new User());
		users.add(new User());
		Mockito.doReturn(users).when(repository).findAll();
		assertTrue(service.findAll().size() == 2);
	}
}
