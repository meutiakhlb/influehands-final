package capstone.project.influehands.service;

import java.util.List;

import capstone.project.influehands.model.CategoryModel;
import capstone.project.influehands.repository.CategoryDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDb categoryDb;

    @Override
    public List<CategoryModel> viewAllCategory(){
        return categoryDb.findAll();
    }

    @Override
    public CategoryModel findById(Long id) {
        Optional<CategoryModel> category = categoryDb.findById(id);
        if(category.isPresent()){
            return category.get();
        } else {
            return null;
        }
    }
}