package dosopt.server.navermapserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dosopt.server.navermapserver.domain.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
	List<Menu> findByPlaceId(Long placeId);
}
