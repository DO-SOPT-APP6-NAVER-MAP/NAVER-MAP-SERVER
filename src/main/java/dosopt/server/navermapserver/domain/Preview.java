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
public class Preview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "preview_id")
	private Long id;

	@Column(name = "preview_img_url", nullable = false)
	private String previewImgUrl;

	@ManyToOne
	@JoinColumn(name = "place_id")
	private Place place;
}
