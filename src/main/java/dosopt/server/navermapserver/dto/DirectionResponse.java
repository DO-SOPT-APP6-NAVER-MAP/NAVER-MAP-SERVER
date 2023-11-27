package dosopt.server.navermapserver.dto;

import java.util.List;

public record DirectionResponse(
        List<String> directions
) {
    public static DirectionResponse of(List<String> directions) {
        return new DirectionResponse(directions);
    }
}
