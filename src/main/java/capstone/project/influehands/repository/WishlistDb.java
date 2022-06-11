package capstone.project.influehands.repository;

import capstone.project.influehands.model.InfluencerTiktokModel;
import capstone.project.influehands.model.WishlistModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WishlistDb extends JpaRepository<WishlistModel,Long>{
    Optional<WishlistModel> findById(Long id);

}
