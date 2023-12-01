package racingcar.domain;

import racingcar.dto.RoundProgress;

public class RaceCar {
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
}
