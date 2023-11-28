package dosopt.server.navermapserver.api.dto;

import java.util.List;
import java.util.stream.Collectors;

import dosopt.server.navermapserver.domain.Place;
import dosopt.server.navermapserver.domain.Preview;

public record PlaceInfoResponse(
	String name,
	String category,
	String description,
	String distance,
	String address,
	String stars,
	int visitorReview,
	int blogReview,
	List<PreviewResponse> previewImgs
) {

	public static PlaceInfoResponse of(Place place, List<Preview> previews) {
		List<PreviewResponse> previewResponses = previews.stream()
			.map(preview -> new PreviewResponse(preview.getId(), preview.getPreviewImgUrl()))
			.collect(Collectors.toList());

		return new PlaceInfoResponse(
			place.getName(),
			place.getCategory(),
			place.getDescription(),
			place.getDistance(),
			place.getAddress(),
			place.getStars(),
			place.getVisitorReview(),
			place.getBlogReview(),
			previewResponses
		);
	}
}
