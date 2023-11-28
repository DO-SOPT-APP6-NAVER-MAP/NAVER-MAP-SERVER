package dosopt.server.navermapserver.api.dto;

import java.util.List;

import dosopt.server.navermapserver.domain.Direction;

public record DirectionsResponse(
	List<DirectionResponse> directionLists
) {

	public static DirectionsResponse of(List<Direction> directions) {
		List<DirectionResponse> directionLists = directions.stream()
			.map(direction -> new DirectionResponse(direction.getId(), direction.getRoute()))
			.toList();

		return new DirectionsResponse(directionLists);
	}
}
