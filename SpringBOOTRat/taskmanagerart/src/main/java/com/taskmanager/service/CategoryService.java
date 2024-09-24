package com.taskmanager.service;

import com.taskmanager.model.Category;
import com.taskmanager.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    public Optional<Category> getCategoryById(Long id){
        return categoryRepository.findById(id);
    }
}
