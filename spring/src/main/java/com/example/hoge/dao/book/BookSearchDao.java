package com.example.hoge.dao.book;

import org.springframework.stereotype.Repository;

import com.example.hoge.dao.SearchDao;

/**
 * BookSearchDao
 */
@Repository
public class BookSearchDao extends SearchDao<BookSearchEntity, BookSearchParams> {

    public BookSearchDao() {
        super(BookSearchEntity.class);
    }
}
