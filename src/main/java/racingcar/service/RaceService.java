package racingcar.service;

import java.util.Collections;
import java.util.List;
import racingcar.domain.Accelerator;
import racingcar.domain.RaceCar;
import racingcar.dto.RoundProgress;

public class RaceService {
    private final Accelerator accelerator;
    private List<RaceCar> raceCars;

    public RaceService(Accelerator accelerator) {
        this.accelerator = accelerator;
    }

    public void initRaceCars(List<RaceCar> raceCars) {
        this.raceCars = raceCars;
    }

    public List<RoundProgress> playRound() {
        return raceCars.stream()
                .map(raceCar -> raceCar.playRound(accelerator))
                .toList();
    }

    public List<String> getFinalWinner() {
        int maxMovedDistance = getMaxMovedDistance();

        return raceCars.stream()
                .filter(raceCar -> raceCar.isMovedDistanceSame(maxMovedDistance))
                .map(RaceCar::getName)
                .toList();
    }

    private int getMaxMovedDistance() {
        return Collections.max(raceCars).getMovedDistance();
    }
}
