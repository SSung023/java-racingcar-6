package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.dto.ProgressDTO;

class RaceCarTest {

    @Test
    @DisplayName("한 라운드를 진행했을 때, 조건에 맞으면 한 칸 전진한 결과를 DTO로 반환한다")
    public void returnProgressDTO_when_codnitionMatched() {
        //given
        RaceCar car = RaceCar.create(
                new FixedAccelerator(), "racer", 0
        );

        //when
        ProgressDTO progressDTO = car.playRound();

        //then
        assertThat(progressDTO.movedDistance()).isEqualTo(1);
        assertThat(progressDTO.carName()).isEqualTo("racer");
    }
}