package racingcar.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Accelerator;
import racingcar.domain.FixedAccelerator;
import racingcar.domain.RaceCar;
import racingcar.dto.RoundProgress;

class RaceServiceTest {
    private final Accelerator accelerator = new FixedAccelerator();
    private final RaceService raceService = new RaceService(accelerator);

    @Test
    @DisplayName("경주차들에 대해 시도 횟수만큼 라운드를 진행시킨 결과를 반환받을 수 있다.")
    public void playWholeRace() {
        //given
        raceService.initRaceCars(
                List.of(
                        RaceCar.create("car1", 1),
                        RaceCar.create("car2", 2),
                        RaceCar.create("car3", 3)
                )
        );

        //when
        List<RoundProgress> roundProgresses = raceService.playRound();

        //then
        assertThat(roundProgresses.get(0).movedDistance()).isEqualTo(2);
        assertThat(roundProgresses.get(1).movedDistance()).isEqualTo(3);
        assertThat(roundProgresses.get(2).movedDistance()).isEqualTo(4);
    }
}