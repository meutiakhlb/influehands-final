package capstone.project.influehands.repository;

import capstone.project.influehands.model.InfluencerTiktokModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfluencerTiktokDb extends JpaRepository<InfluencerTiktokModel,Long>{
}
