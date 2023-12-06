package racingcar.domain;

import java.util.Comparator;
import racingcar.dto.RoundProgress;

public class RaceCar implements Comparator<RaceCar> {
    private String carName; //TODO: 클래스로 래핑
    private int movedDistance; // TODO: 클래스로 래핑

    public RaceCar(String carName, int movedDistance) {
        this.carName = carName;
        this.movedDistance = movedDistance;
    }

    public static RaceCar create(String carName, int movedDistance) {
        return new RaceCar(carName, movedDistance);
    }

    public RoundProgress playRound(Accelerator accelerator) {
        if (accelerator.canMoveForward()) {
            movedDistance++;
        }
        return new RoundProgress(carName, movedDistance);
    }

    public String getCarName() {
        return carName;
    }

    public int getMovedDistance() {
        return movedDistance;
    }

    @Override
    public int compare(RaceCar car1, RaceCar car2) {
        return Integer.compare(car1.movedDistance, car2.movedDistance);
    }
}
