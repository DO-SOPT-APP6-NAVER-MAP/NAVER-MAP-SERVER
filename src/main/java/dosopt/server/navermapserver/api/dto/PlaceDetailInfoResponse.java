package dosopt.server.navermapserver.api.dto;

import java.util.List;
import java.util.stream.Collectors;

import dosopt.server.navermapserver.domain.BlogReview;
import dosopt.server.navermapserver.domain.Menu;
import dosopt.server.navermapserver.domain.Place;
import dosopt.server.navermapserver.domain.VisitorReview;

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
	List<MenuInfoResponse> menuInfos,
	List<VisitorReviewInfoResponse> visitorReviewInfos,

	List<BlogReviewInfoResponse> blogReviewInfos
) {

	public static PlaceDetailInfoResponse of(Place place, List<Menu> menus,
		List<VisitorReview> visitorReviews, List<BlogReview> blogReviews) {
		List<MenuInfoResponse> menuInfos = menus.stream()
			.map(menu -> new MenuInfoResponse(menu.getId(), menu.getMenuName(),
				menu.getMenuPrice(), menu.getMenuImgUrl()))
			.collect(Collectors.toList());

		List<VisitorReviewInfoResponse> visitorReviewInfos = visitorReviews.stream()
			.map(visitorReview -> new VisitorReviewInfoResponse(visitorReview.getId(),
				visitorReview.getVisitorReviewAuthor(), visitorReview.getVisitorReviewContent(),
				visitorReview.getVisitorReviewAuthorThumbnail(), visitorReview.getVisitorReviewImgUrl()))
			.collect(Collectors.toList());

		List<BlogReviewInfoResponse> blogReviewInfos = blogReviews.stream()
			.map(blogReview -> new BlogReviewInfoResponse(blogReview.getId(), blogReview.getBlogReviewAuthor(),
				blogReview.getBlogReviewTitle(), blogReview.getBlogReviewContent(),
				blogReview.getBlogReviewAuthorThumbnail(), blogReview.getBlogReviewImgUrl()))
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
			menuInfos,
			visitorReviewInfos,
			blogReviewInfos
		);
	}
}