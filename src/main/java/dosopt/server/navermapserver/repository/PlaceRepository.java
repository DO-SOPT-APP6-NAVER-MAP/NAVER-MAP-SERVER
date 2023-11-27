package dosopt.server.navermapserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dosopt.server.navermapserver.domain.Place;
import jakarta.persistence.EntityNotFoundException;

public interface PlaceRepository extends JpaRepository<Place, Long> {
	default Place findByIdOrThrow(Long id) {
		return findById(id).orElseThrow(
			() -> new EntityNotFoundException("존재하지 않는 장소입니다."));
	}
}
