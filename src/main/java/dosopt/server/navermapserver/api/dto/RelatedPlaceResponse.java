package dosopt.server.navermapserver.api.dto;

import dosopt.server.navermapserver.domain.Place;

import java.util.List;

public record RelatedPlaceResponse(

        Long placeId,
        String name,
        String category,
        String detailAddress,
        String distance,
        int visitorReview
) {
    public static RelatedPlaceResponse of(Place place) {
        return new RelatedPlaceResponse(
                place.getId(),
                place.getName(),
                place.getCategory(),
                place.getDetailAddress(),
                place.getDistance(),
                place.getVisitorReview()
        );
    }
}