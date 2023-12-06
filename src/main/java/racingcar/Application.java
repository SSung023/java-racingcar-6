package racingcar;

import racingcar.controller.RaceController;
import racingcar.domain.RandomAccelerator;
import racingcar.service.RaceService;
import racingcar.validator.InputValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        RaceController raceController = new RaceController(
                new RaceService(new RandomAccelerator()),
                new OutputView(), new InputView(new InputValidator())
        );
        raceController.run();
    }
}
