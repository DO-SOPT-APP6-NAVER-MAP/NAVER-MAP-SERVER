package dosopt.server.navermapserver.service;

import dosopt.server.navermapserver.domain.Direction;
import dosopt.server.navermapserver.domain.Place;
import dosopt.server.navermapserver.repository.DirectionRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dosopt.server.navermapserver.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Transactional
public class PlaceService {
	private final PlaceRepository placeRepository;
	private final DirectionRepository directionRepository;
	public List<String> getDirectionImageList(Long id) {
		List<String> result = new ArrayList<>();
		List<Direction> directions = directionRepository.findAllByPlaceId(id);
		for(Direction direction : directions) {
			result.add(direction.getRoute());
		}
		return result;
	}
}
