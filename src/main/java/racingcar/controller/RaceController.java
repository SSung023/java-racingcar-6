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
        int tryCount = getRaceInfo();
        playWholeRace(tryCount);
        getRaceResults();
    }

    public int getRaceInfo() {
        outputView.printAskRaceCar();
        List<String> raceCarNames = inputView.getCarNames();

        raceService.initRaceCars(
                raceCarNames.stream()
                        .map(RaceCar::create)
                        .toList()
        );

        outputView.printAskTryCount();
        return inputView.getTryCount();
    }

    public void playWholeRace(int tryCount) {
        outputView.printResultHeader();

        //TODO: tryCount를 클래스로 래핑 후, 해당 클래스 내의 메서드 호출할 것
        while (tryCount-- > 0) {
            List<RoundProgress> roundProgresses = raceService.playRound();
            outputView.printRoundProgress(roundProgresses);
        }
    }

    public void getRaceResults() {
        List<String> finalWinners = raceService.getFinalWinner();
        outputView.printFinalWinner(finalWinners);
    }
}
