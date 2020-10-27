package com.chen.dao;

import com.chen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    // 新增
    int addBook(Books book);

    // 删除
    int deleteBookById(@Param("bookID") int id);

    // 更新
    int updateBook(Books books);

    // 查询
    Books queryBookById(@Param("bookID")int id);

    // 列表
    List<Books> queryAllBook();
}
