package com.example.hoge.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * CrudDao
 */
public abstract class CrudDao<E, K> extends Dao<E> {

    protected CrudDao(Class<E> entityClazz) {
        super(entityClazz);
        System.err.println("親コンストラクタ(CrudDao)");
    }

    public List<E> findAll() {
        return new ArrayList<E>();
    }
}
