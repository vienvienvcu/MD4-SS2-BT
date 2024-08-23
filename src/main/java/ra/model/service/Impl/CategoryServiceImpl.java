package ra.model.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.entity.Category;
import ra.model.repository.ICategoryRepository;
import ra.model.service.ICategoryService;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(String categoryId) {
        return categoryRepository.findById(categoryId)
                .orElseThrow(()->new NoSuchElementException("not exist " + categoryId));
    }

    @Override
    public Category insert(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category update(String categoryId, Category category) {
        categoryRepository.findById(categoryId).orElseThrow(()->new NoSuchElementException("not exist " + categoryId));
        category.setCategoryId(categoryId);
        return categoryRepository.save(category);
    }

    @Override
    public void delete(String categoryId) {
        categoryRepository.findById(categoryId).orElseThrow(()->new NoSuchElementException("not exist " + categoryId));
        categoryRepository.deleteById(categoryId);

    }
}
