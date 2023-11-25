package dosopt.server.navermapserver.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dosopt.server.navermapserver.service.PlaceService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PlaceController {
	private final PlaceService placeService;
}
