package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomAccelerator implements Accelerator {
    @Override
    public boolean canMoveForward() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        return randomNumber >= 4;
    }
}
