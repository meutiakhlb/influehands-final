package capstone.project.influehands.service;

import java.util.List;

import capstone.project.influehands.model.CategoryModel;
public interface CategoryService {
    List<CategoryModel> viewAllCategory();
    CategoryModel findById(Long id);
}