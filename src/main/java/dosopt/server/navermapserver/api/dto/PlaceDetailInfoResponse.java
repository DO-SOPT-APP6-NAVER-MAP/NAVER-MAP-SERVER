package dosopt.server.navermapserver.api.dto;

import java.util.List;
import java.util.stream.Collectors;

import dosopt.server.navermapserver.domain.Menu;
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
	String detail,
	List<MenuInfoResponse> menuInfos
) {

	public static PlaceDetailInfoResponse of(Place place, List<Menu> menus) {
		List<MenuInfoResponse> menuInfos = menus.stream()
			.map(menu -> new MenuInfoResponse(menu.getId(), menu.getMenuName(), menu.getMenuImgUrl()))
			.collect(Collectors.toList());

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
			place.getDetail(),
			menuInfos
		);
	}
}