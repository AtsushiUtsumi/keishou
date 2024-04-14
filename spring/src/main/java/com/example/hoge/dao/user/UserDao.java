package com.example.hoge.dao.user;

import org.springframework.stereotype.Repository;

import com.example.hoge.dao.CrudDao;

/**
 * UserCrudDao
 */
@Repository
public class UserDao extends CrudDao<User, UserPK> {

    public UserDao() {
        super(User.class);
        System.err.println("子コンストラクタ(UserDao)");
    }
}
