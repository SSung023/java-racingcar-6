package racingcar.service;

import java.util.List;
import racingcar.domain.Accelerator;
import racingcar.domain.RaceCar;
import racingcar.dto.ProgressDTO;

public class RaceService {
    private final Accelerator accelerator;
    private List<RaceCar> raceCars;

    public RaceService(Accelerator accelerator) {
        this.accelerator = accelerator;
    }

    //TODO: 매개변수로 이름만 들어올 수도 있음 or 일급컬렉션
    public void initRaceCars(List<RaceCar> raceCars) {
        this.raceCars = raceCars;
    }

    //TODO: tryCount도 클래스로 래핑
    public List<ProgressDTO> playWholeRace(int tryCount) {
        return raceCars.stream()
                .map(raceCar -> raceCar.playRound(accelerator))
                .toList();
    }
}
