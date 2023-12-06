package racingcar.controller;

import java.util.List;
import racingcar.domain.RaceCar;
import racingcar.dto.RoundProgress;
import racingcar.service.RaceService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RaceController {
    private final RaceService raceService;
    private final OutputView outputView;
    private final InputView inputView;


    public RaceController(RaceService raceService, OutputView outputView, InputView inputView) {
        this.raceService = raceService;
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void run() {
        getRaceInfo();
        playWholeRace(2);
        getRaceResults();
    }

    public void getRaceInfo() {
        //TODO: 경주차 이름 입력받는 메시지 출력

        //TODO: 사용자로부터 경주차 이름 입력

        //TODO: 시도 횟수를 물어보는 메시지 출력

        //TODO: 사용자로부터 시도 횟수 입력

    }

    public void playWholeRace(int tryCount) {
        outputView.printResultHeader();

        //TODO: temp 코드이므로 제거 필요
        raceService.initRaceCars(
                List.of(
                        RaceCar.create("car1", 1),
                        RaceCar.create("car2", 3),
                        RaceCar.create("car3", 3)
                )
        );

        //TODO: tryCount를 클래스로 래핑 후, 해당 클래스 내의 메서드 호출할 것
        while (tryCount-- > 0) {
            List<RoundProgress> roundProgresses = raceService.playRound();
            outputView.printRoundProgress(roundProgresses);
        }
    }

    public void getRaceResults() {
        //TODO: RaceService로부터 최종 우승자 전달
        List<String> finalWinners = raceService.getFinalWinner();

        //TODO: OutputView를 통해 우승자 정보 출력
        outputView.printFinalWinner(finalWinners);
    }
}
