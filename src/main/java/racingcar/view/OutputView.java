package racingcar.view;

import static racingcar.constants.Message.FINAL_WINNER;
import static racingcar.constants.Message.MOVED_BAR;
import static racingcar.constants.Message.MOVE_PROGRESS;
import static racingcar.constants.Message.RESULT_HEADER;

import java.util.List;
import racingcar.dto.RoundProgress;

public class OutputView {


    public void printRoundProgress(List<RoundProgress> roundProgresses) {
        StringBuilder stringBuilder = new StringBuilder();
        roundProgresses
                .forEach(
                        progressDTO -> {
                            String moveBar = getMoveBar(progressDTO.movedDistance());
                            String formatted = String.format(
                                    MOVE_PROGRESS.getMessage(), progressDTO.carName(), moveBar
                            );
                            stringBuilder.append(formatted);
                        }
                );
        System.out.println(stringBuilder);
    }


    private String getMoveBar(int movedDistance) {
        return MOVED_BAR.getMessage().repeat(movedDistance);
    }

    public void printResultHeader() {
        System.out.println(RESULT_HEADER.getMessage());
    }

    public void printFinalWinner(List<String> finalWinners) {
        String winners = String.join(", ", finalWinners);
        System.out.printf(FINAL_WINNER.getMessage(), winners);
    }
}
