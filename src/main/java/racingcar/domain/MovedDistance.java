package racingcar.domain;

public class MovedDistance {
    private int value;

    public MovedDistance() {
        this.value = 0;
    }

    public void moveForward() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
