package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.dto.RoundProgress;

class RaceCarTest {
    private final Accelerator accelerator = new FixedAccelerator();

    @Test
    @DisplayName("한 라운드를 진행했을 때, 조건에 맞으면 한 칸 전진한 결과를 DTO로 반환한다")
    public void returnProgressDTO_when_codnitionMatched() {
        //given
        RaceCar car = RaceCar.create("racer");

        //when
        RoundProgress roundProgress = car.playRound(accelerator);

        //then
        assertThat(roundProgress.movedDistance()).isEqualTo(1);
        assertThat(roundProgress.carName()).isEqualTo("racer");
    }
}