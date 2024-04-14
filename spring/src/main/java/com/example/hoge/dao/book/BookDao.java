package com.example.hoge.dao.book;

import org.springframework.stereotype.Repository;

import com.example.hoge.dao.CrudDao;

/**
 * BookCrudDao
 */
@Repository
public class BookDao extends CrudDao<Book, BookPK> {

    public BookDao() {
        super(Book.class);
        System.err.println("子コンストラクタ(BookDao)");
    }
}
