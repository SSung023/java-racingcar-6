package racingcar.constants;

public enum ErrorCode {
    NOT_INTEGER("입력한 값은 숫자여야 합니다.");

    private final String PREFIX = "[ERROR] ";
    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + this.message;
    }
}
