package dosopt.server.navermapserver.api.dto;

import java.util.List;

public record DirectionResponse(
	Long directionId,
	String route
) {
}
