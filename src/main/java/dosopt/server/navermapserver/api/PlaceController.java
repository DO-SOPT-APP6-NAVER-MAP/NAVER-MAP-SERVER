package dosopt.server.navermapserver.api;

import dosopt.server.navermapserver.api.dto.DirectionResponse;
import dosopt.server.navermapserver.global.common.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import dosopt.server.navermapserver.api.dto.PlaceDetailInfoResponse;
import dosopt.server.navermapserver.api.dto.PlaceInfoResponse;
import dosopt.server.navermapserver.service.PlaceService;
import lombok.RequiredArgsConstructor;

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

	@GetMapping(value = "/place/{placeId}", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ApiResponse<PlaceInfoResponse> findPlaceInfo(@PathVariable Long placeId) {
		return ApiResponse.success(HttpStatus.OK, "장소의 검색 간단 조회 결과!", placeService.getPlaceInfo(placeId));
	}

	@GetMapping(value = "/place/{placeId}/detail", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ApiResponse<PlaceDetailInfoResponse> findPlaceDetailInfo(@PathVariable Long placeId) {
		return ApiResponse.success(HttpStatus.OK, "장소의 검색 상세 조회 결과!", placeService.getPlaceDetailInfo(placeId));
	}
}
