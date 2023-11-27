package dosopt.server.navermapserver.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dosopt.server.navermapserver.api.dto.DirectionResponse;
import dosopt.server.navermapserver.api.dto.PlaceDetailInfoResponse;
import dosopt.server.navermapserver.api.dto.PlaceInfoResponse;
import dosopt.server.navermapserver.api.dto.RelatedPlaceResponse;
import dosopt.server.navermapserver.global.common.response.ApiResponse;
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
			HttpStatus.OK, "특정 장소의 길찾기 방법 조회에 성공했습니다.", DirectionResponse.of(placeService.getDirectionImageList(id)));
	}

	@GetMapping(value = "/place/{placeId}")
	@ResponseStatus(HttpStatus.OK)
	public ApiResponse<PlaceInfoResponse> findPlaceInfo(@PathVariable Long placeId) {
		return ApiResponse.success(HttpStatus.OK, "장소의 검색 간단 조회 결과!", placeService.getPlaceInfo(placeId));
	}

	@GetMapping(value = "/place/{placeId}/detail")
	@ResponseStatus(HttpStatus.OK)
	public ApiResponse<PlaceDetailInfoResponse> findPlaceDetailInfo(@PathVariable Long placeId) {
		return ApiResponse.success(HttpStatus.OK, "장소의 검색 상세 조회 결과!", placeService.getPlaceDetailInfo(placeId));
	}

	@GetMapping(value = "/place")
	public ApiResponse<List<RelatedPlaceResponse>> findRelatedPlace(@RequestParam(value = "name") String name) {
		return ApiResponse.success(HttpStatus.OK, "", placeService.getAllPlace());
	}
}
