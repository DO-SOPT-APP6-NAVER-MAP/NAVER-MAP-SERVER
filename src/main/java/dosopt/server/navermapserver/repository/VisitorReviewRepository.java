package dosopt.server.navermapserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dosopt.server.navermapserver.domain.Preview;
import dosopt.server.navermapserver.domain.VisitorReview;

public interface VisitorReviewRepository extends JpaRepository<VisitorReview, Long> {
	List<VisitorReview> findByPlaceId(Long placeId);
}
