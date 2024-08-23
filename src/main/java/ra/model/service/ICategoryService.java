package ra.model.service;

import ra.model.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(String categoryId);
    Category insert(Category category);
    Category update(String categoryId,Category category);
    void delete(String categoryId);
}
