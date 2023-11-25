package dosopt.server.navermapserver.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Place {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "place_id")
	private Long id;

	@Column(name = "name", nullable = false, length = 30)
	private String name;
	@Column(name = "category", nullable = false, length = 30)
	private String category;
	@Column(name = "detail_address", nullable = false, length = 50)
	private String detailAddress;
	@Column(name = "distance", nullable = false, length = 10)
	private String distance;
	@Column(name = "description", nullable = false, length = 50)
	private String description;
	@Column(name = "address", nullable = false, length = 10)
	private String address;
	@Column(name = "stars", nullable = false, length = 5)
	private String stars;

	@Column(name = "visitor_review", nullable = false)
	private int visitorReview;

	@Column(name = "blog_review", nullable = false)
	private int blogReview;

	@Column(name = "direction", nullable = false, length = 30)
	private String direction;

	@Column(name = "close_time", nullable = false)
	private int closeTime;

	@Column(name = "number", nullable = false, length = 20)
	private String number;
	@Column(name = "character", nullable = false, length = 30)
	private String character;
	@Column(name = "sns", nullable = false, length = 50)
	private String sns;

	@Column(name = "detail", nullable = false)
	private String detail;
}
