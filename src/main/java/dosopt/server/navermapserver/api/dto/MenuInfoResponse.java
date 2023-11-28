package dosopt.server.navermapserver.api.dto;

public record MenuInfoResponse(
	Long menuId,
	String menuName,
	Integer menuPrice,
	String menuImgUrl
) {
}
