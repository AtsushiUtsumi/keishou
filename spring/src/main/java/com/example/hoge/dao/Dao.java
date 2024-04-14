package com.example.hoge.dao;

/**
 * Dao
 */
abstract class Dao<E> {

    final protected Class<E> entityClazz;

    protected Dao(Class<E> entityClazz) {
        System.err.println("親コンストラクタ(Dao):エンティティクラス -> " + entityClazz);
        this.entityClazz = entityClazz;
    }
}
