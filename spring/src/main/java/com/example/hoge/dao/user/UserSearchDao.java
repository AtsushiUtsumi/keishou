package com.example.hoge.dao.user;

import org.springframework.stereotype.Repository;

import com.example.hoge.dao.SearchDao;

/**
 * UserSearchDao
 */
@Repository
public class UserSearchDao extends SearchDao<UserSearchEntity, UserSearchParams> {

    public UserSearchDao() {
        super(UserSearchEntity.class);
    }
}
