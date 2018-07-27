package rpgSport.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Long score;
    private Double runDistance;
    private Double bikeDistance;
    private Double walkDistance;

    public User() {}

    public User(String name) {
        this.name = name;
        this.score = 0L;
        this.runDistance = 0.0;
        this.bikeDistance = 0.0;
        this.walkDistance = 0.0;
    }

    public void update(Long score, Double runDistance, Double bikeDistance, Double walkDistance) {
        updateScore(score);
        updateRunDistance(runDistance);
        updateBikeDistance(bikeDistance);
        updateWalkDistance(walkDistance);
    }

    public void updateScore(Long score) {
        this.score = score;
    }

    public void updateRunDistance(Double distance) {
        this.runDistance = distance;
    }

    public void updateBikeDistance(Double distance) {
        this.bikeDistance = distance;
    }

    public void updateWalkDistance(Double distance) {
        this.walkDistance = distance;
    }
}
