package racingcar.domain;

import racingcar.dto.ProgressDTO;

public class RaceCar {
    private final Accelerator accelerator;
    private String carName; //TODO: 클래스로 래핑
    private int movedDistance; // TODO: 클래스로 래핑

    public RaceCar(Accelerator accelerator, String carName, int movedDistance) {
        this.accelerator = accelerator;
        this.carName = carName;
        this.movedDistance = movedDistance;
    }

    public static RaceCar create(Accelerator accelerator, String carName, int movedDistance) {
        return new RaceCar(accelerator, carName, movedDistance);
    }

    public ProgressDTO playRound() {
        if (accelerator.canMoveForward()) {
            movedDistance++;
        }
        return new ProgressDTO(carName, movedDistance);
    }
}
