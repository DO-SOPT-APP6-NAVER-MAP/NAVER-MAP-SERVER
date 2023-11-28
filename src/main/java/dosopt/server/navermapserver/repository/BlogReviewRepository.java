package dosopt.server.navermapserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dosopt.server.navermapserver.domain.BlogReview;

public interface BlogReviewRepository extends JpaRepository<BlogReview, Long> {
	List<BlogReview> findByPlaceId(Long placeId);
}
