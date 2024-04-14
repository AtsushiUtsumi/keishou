package com.example.hoge.service;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hoge.dao.SearchDao;
import com.example.hoge.dao.SearchEntity;
import com.example.hoge.dao.SearchParams;

/**
 * SearchDao
 */
public abstract class SearchService<D extends SearchDao<E, P>, E extends SearchEntity, P extends SearchParams> {

    @Autowired
    private D dao;

    public List<E> search(P params) {
        System.err.println(params.toString() + "を使って検索(無)");
        return this.dao.search(params);
    }

    public List<E> search(P params, int page) {
        System.err.println(params.toString() + "を使って検索(有)" + page + "ページ");
        return this.dao.search(params, page);
    }

    public Path createCsv(P params) {
        System.err.println(params.toString() + "を使ってファイル作成(CSV)");
        File file = new File("");
        return file.toPath();
    }

    public Path createExcel(P params) {
        System.err.println(params.toString() + "を使ってファイル作成(EXCEL)");
        File file = new File("");
        return file.toPath();
    }
}
