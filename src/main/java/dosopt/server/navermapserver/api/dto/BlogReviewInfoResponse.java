package dosopt.server.navermapserver.api.dto;

public record BlogReviewInfoResponse(
	Long visitorReviewId,
	String visitorReviewAuthor,
	String visitorReviewTitle,
	String visitorReviewContent,
	String visitorReviewAuthorThumbnail,
	String visitorReviewImgUrl
) {
}
