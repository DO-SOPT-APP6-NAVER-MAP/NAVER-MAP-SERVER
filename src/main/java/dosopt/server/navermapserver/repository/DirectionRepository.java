package dosopt.server.navermapserver.repository;

import dosopt.server.navermapserver.domain.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DirectionRepository extends JpaRepository<Direction, Long> {
    List<Direction> findAllByPlaceId(Long placeId);
}
