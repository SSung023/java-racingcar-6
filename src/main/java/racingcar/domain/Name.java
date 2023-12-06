package racingcar.domain;

import static racingcar.constants.ErrorCode.NAME_LENGTH_OVERFLOW;

public class Name {
    private final String value;

    private Name(String value) {
        validate(value);
        this.value = value;
    }

    public static Name create(String value) {
        return new Name(value);
    }

    private void validate(String value) {
        if (value.length() > 5) {
            throw new IllegalArgumentException(NAME_LENGTH_OVERFLOW.getMessage());
        }
    }

    public String getValue() {
        return value;
    }
}
