package racingcar.domain;

import racingcar.dto.RoundProgress;

public class RaceCar implements Comparable<RaceCar> {
    private Name name;
    private MovedDistance movedDistance;

    public RaceCar(String name) {
        this.name = Name.create(name);
        this.movedDistance = new MovedDistance();
    }

    public static RaceCar create(String name) {
        return new RaceCar(name);
    }

    public RoundProgress playRound(Accelerator accelerator) {
        if (accelerator.canMoveForward()) {
            movedDistance.moveForward();
        }
        return new RoundProgress(name.getValue(), movedDistance.getValue());
    }

    public boolean isMovedDistanceSame(int distance) {
        return movedDistance.getValue() == distance;
    }

    public String getName() {
        return name.getValue();
    }

    public int getMovedDistance() {
        return movedDistance.getValue();
    }

    @Override
    public int compareTo(RaceCar other) {
        return Integer.compare(this.movedDistance.getValue(), other.movedDistance.getValue());
    }
}
