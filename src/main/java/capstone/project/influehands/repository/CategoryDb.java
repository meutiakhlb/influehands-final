package capstone.project.influehands.repository;

import capstone.project.influehands.model.CategoryModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDb extends JpaRepository<CategoryModel, Long> {
    Optional<CategoryModel> findById(Long id);
}
