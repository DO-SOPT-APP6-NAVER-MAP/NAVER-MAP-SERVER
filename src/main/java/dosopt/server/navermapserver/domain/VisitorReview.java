package dosopt.server.navermapserver.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class VisitorReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "visitor_review_id")
	private Long id;

	@Column(name = "visitor_review_author", nullable = false, length = 20)
	private String visitorReviewAuthor;

	@Column(name = "visitor_review_content", nullable = false, length = 200)
	private String visitorReviewContent;

	@Column(name = "visitor_review_author_thumbnail", nullable = false)
	private String visitorReviewAuthorThumbnail;

	@Column(name = "visitor_review_img_url", nullable = false)
	private String visitorReviewImgUrl;

	@ManyToOne
	@JoinColumn(name = "place_id")
	private Place place;
}
