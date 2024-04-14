package com.example.hoge.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * SearchDao
 */
@Repository
public abstract class SearchDao<E extends SearchEntity, K extends SearchParams> extends Dao<E> {

    protected SearchDao(Class<E> entityClazz) {
        super(entityClazz);
        System.err.println("親コンストラクタ(SearchDao)");
    }

    public List<E> search(K params, int page) {
        System.out.println(this.entityClazz + "取得する検索処理(ページ制御あり)");
        return new ArrayList<E>();
    }
    
    public List<E> search(K params) {
        System.out.println(this.entityClazz + "取得する検索処理(ページ制御なし)");
        return new ArrayList<E>();
    }
}
