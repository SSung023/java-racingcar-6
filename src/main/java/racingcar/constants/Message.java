package racingcar.constants;

public enum Message {
    MOVE_PROGRESS("%s : %s%n"),
    MOVED_BAR("-");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
