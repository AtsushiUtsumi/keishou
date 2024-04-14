package com.example.hoge.dao.user;

import com.example.hoge.dao.SearchParams;

import lombok.Data;

/**
 * UserSearchParams
 */
@Data
public class UserSearchParams implements SearchParams {

    private UserPK id;
    private String name;
}
