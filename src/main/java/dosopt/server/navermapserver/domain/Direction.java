package dosopt.server.navermapserver.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "direction_id")
    private Long id;

    @Column(name = "place_id")
    private Long placeId;

    @Column(name = "route", nullable = false, length = 100)
    private String route;
}
