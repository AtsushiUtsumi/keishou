package com.example.hoge.dao.book;

import com.example.hoge.dao.SearchParams;

import lombok.Data;

/**
 * BookSearchParams
 */
@Data
public class BookSearchParams implements SearchParams {

    private BookPK id;
    private String name;
}
