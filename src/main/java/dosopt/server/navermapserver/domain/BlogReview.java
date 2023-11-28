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
public class BlogReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "blog_review_id")
	private Long id;

	@Column(name = "blog_review_author", nullable = false, length = 20)
	private String blogReviewAuthor;

	@Column(name = "blog_review_title", nullable = false, length = 200)
	private String blogReviewTitle;

	@Column(name = "blog_review_content", nullable = false, length = 200)
	private String blogReviewContent;

	@Column(name = "blog_review_author_thumbnail", nullable = false)
	private String blogReviewAuthorThumbnail;

	@Column(name = "blog_review_img_url", nullable = false)
	private String blogReviewImgUrl;

	@ManyToOne
	@JoinColumn(name = "place_id")
	private Place place;
}
