package dosopt.server.navermapserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dosopt.server.navermapserver.domain.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {

}
