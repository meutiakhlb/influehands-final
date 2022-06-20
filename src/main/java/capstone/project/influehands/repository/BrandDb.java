package capstone.project.influehands.repository;

import capstone.project.influehands.model.BrandModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandDb extends JpaRepository<BrandModel, Long> {
}
