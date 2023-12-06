package racingcar.constants;

public enum Message {
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
