package com.baizhi.dao;

import com.baizhi.entity.Category;

public interface CategoryDao {
    Category login(String name);

    void delete(String id);
}
