package dosopt.server.navermapserver.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dosopt.server.navermapserver.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class PlaceService {
	private final PlaceRepository placeRepository;
}
