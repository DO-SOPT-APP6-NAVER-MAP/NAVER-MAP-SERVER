package dosopt.server.navermapserver.api;

import dosopt.server.navermapserver.dto.DirectionResponse;
import dosopt.server.navermapserver.global.common.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dosopt.server.navermapserver.service.PlaceService;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PlaceController {
	private final PlaceService placeService;

	@GetMapping("/place/{placeId}/route")
	public ApiResponse<DirectionResponse> getDirections(@PathVariable("placeId") Long id) {
		return ApiResponse.success(
				HttpStatus.OK,
				"특정 장소의 길찾기 방법 조회에 성공했습니다.",
				DirectionResponse.of(placeService.getDirectionImageList(id))
		);
	}
}
