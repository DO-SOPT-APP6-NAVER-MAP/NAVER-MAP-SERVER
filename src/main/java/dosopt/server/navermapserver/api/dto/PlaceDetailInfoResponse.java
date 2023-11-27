package dosopt.server.navermapserver.api.dto;

import dosopt.server.navermapserver.domain.Place;

public record PlaceDetailInfoResponse(
	String name,
	String category,
	String description,
	String stars,
	int visitorReview,
	int blogReview,
	String detailAddress,
	String direction,
	String closeTime,
	String number,
	String characters,
	String sns,
	String detail
) {

	public static PlaceDetailInfoResponse of(Place place) {
		return new PlaceDetailInfoResponse(
			place.getName(),
			place.getCategory(),
			place.getDescription(),
			place.getStars(),
			place.getVisitorReview(),
			place.getBlogReview(),
			place.getDetailAddress(),
			place.getDirection(),
			place.getCloseTime(),
			place.getNumber(),
			place.getCharacters(),
			place.getSns(),
			place.getDetail()
		);
	}
}