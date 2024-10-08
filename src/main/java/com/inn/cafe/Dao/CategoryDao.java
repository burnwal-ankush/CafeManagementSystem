package com.inn.cafe.Dao;

import com.inn.cafe.Pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao extends JpaRepository<Category,Integer> {
    public List<Category> getAllCategory();
    boolean existsByName(String name);
}
