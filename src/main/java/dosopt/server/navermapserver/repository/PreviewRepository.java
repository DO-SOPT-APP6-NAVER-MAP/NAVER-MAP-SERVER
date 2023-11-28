package dosopt.server.navermapserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dosopt.server.navermapserver.domain.Preview;

public interface PreviewRepository extends JpaRepository<Preview, Long> {
	List<Preview> findByPlaceId(Long placeId);
}
