package dosopt.server.navermapserver.api.dto;

import dosopt.server.navermapserver.domain.Place;

public record PlaceInfoResponse(
	String name,
	String category,
	String description,
	String distance,
	String address,
	String stars,
	int visitorReview,
	int blogReview
) {

	public static PlaceInfoResponse of(Place place) {
		return new PlaceInfoResponse(
			place.getName(),
			place.getCategory(),
			place.getDescription(),
			place.getDistance(),
			place.getAddress(),
			place.getStars(),
			place.getVisitorReview(),
			place.getBlogReview()
		);
	}
}
