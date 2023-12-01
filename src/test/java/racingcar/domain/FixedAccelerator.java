package racingcar.domain;

public class FixedAccelerator implements Accelerator {
    @Override
    public boolean canMoveForward() {
        return true;
    }
}
