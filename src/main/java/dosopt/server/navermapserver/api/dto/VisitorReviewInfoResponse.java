package dosopt.server.navermapserver.api.dto;

public record VisitorReviewInfoResponse(
	Long visitorReviewId,
	String visitorReviewAuthor,
	String visitorReviewContent,
	String visitorReviewAuthorThumbnail,
	String visitorReviewImgUrl
) {
}
