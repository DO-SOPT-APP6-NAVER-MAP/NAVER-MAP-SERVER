package dosopt.server.navermapserver.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dosopt.server.navermapserver.api.dto.PlaceDetailInfoResponse;
import dosopt.server.navermapserver.api.dto.PlaceInfoResponse;
import dosopt.server.navermapserver.api.dto.RelatedPlaceResponse;
import dosopt.server.navermapserver.domain.Direction;
import dosopt.server.navermapserver.domain.Menu;
import dosopt.server.navermapserver.domain.Place;
import dosopt.server.navermapserver.domain.Preview;
import dosopt.server.navermapserver.repository.DirectionRepository;
import dosopt.server.navermapserver.repository.MenuRepository;
import dosopt.server.navermapserver.repository.PlaceRepository;
import dosopt.server.navermapserver.repository.PreviewRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class PlaceService {
	private final PlaceRepository placeRepository;
	private final DirectionRepository directionRepository;
	private final PreviewRepository previewRepository;
	private final MenuRepository menuRepository;

	public List<String> getDirectionImageList(Long id) {
		List<String> result = new ArrayList<>();
		List<Direction> directions = directionRepository.findAllByPlaceId(id);
		for (Direction direction : directions) {
			result.add(direction.getRoute());
		}
		return result;
	}

	public PlaceInfoResponse getPlaceInfo(Long placeId) {
		Place place = placeRepository.findByIdOrThrow(placeId);
		List<Preview> previews = previewRepository.findByPlaceId(placeId);
		return PlaceInfoResponse.of(place, previews);
	}

	public PlaceDetailInfoResponse getPlaceDetailInfo(Long placeId) {
		Place place = placeRepository.findByIdOrThrow(placeId);
		List<Menu> menus = menuRepository.findByPlaceId(placeId);
		return PlaceDetailInfoResponse.of(place, menus);
	}

	public List<RelatedPlaceResponse> getAllPlace() {
		return placeRepository.findAll().stream()
			.map(place -> RelatedPlaceResponse.of(place))
			.collect(Collectors.toList());
	}

}
