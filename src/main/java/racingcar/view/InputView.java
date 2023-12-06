package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.validator.InputValidator;

public class InputView {
    private final InputValidator inputValidator;

    public InputView(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public List<String> getCarNames() {
        return List.of(readLine().split(","));
    }

    public int getTryCount() {
        String input = readLine();
        inputValidator.validateIsInteger(input);
        return Integer.parseInt(input);
    }

    private String readLine() {
        return Console.readLine().trim();
    }


}
