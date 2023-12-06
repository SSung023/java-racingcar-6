package racingcar.constants;

public enum Message {
    ASK_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    ASK_TRY_COUNT("시도할 회수는 몇회인가요?"),
    RESULT_HEADER("실행 결과"),
    MOVE_PROGRESS("%s : %s%n"),
    MOVED_BAR("-"),
    FINAL_WINNER("최종 우승자 : %s");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
