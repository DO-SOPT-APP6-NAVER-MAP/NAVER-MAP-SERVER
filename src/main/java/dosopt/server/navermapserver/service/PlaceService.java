package dosopt.server.navermapserver.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dosopt.server.navermapserver.api.dto.PlaceDetailInfoResponse;
import dosopt.server.navermapserver.api.dto.PlaceInfoResponse;
import dosopt.server.navermapserver.domain.Place;
import dosopt.server.navermapserver.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class PlaceService {
	private final PlaceRepository placeRepository;

	public PlaceInfoResponse getPlaceInfo(Long placeId) {
		Place place = placeRepository.findByIdOrThrow(placeId);
		return PlaceInfoResponse.of(place);
	}

	public PlaceDetailInfoResponse getPlaceDetailInfo(Long placeId) {
		Place place = placeRepository.findByIdOrThrow(placeId);
		return PlaceDetailInfoResponse.of(place);
	}
}
