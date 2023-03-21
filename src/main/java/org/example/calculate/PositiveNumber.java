package org.example.calculate;

public class PositiveNumber { // Value Object
    private final int value;

    public PositiveNumber(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if (isNagativeNumber(value)) {
            throw new IllegalArgumentException("0 또는 음수를 전달할 수 없습니다.");
        }
    }

    private boolean isNagativeNumber(int value) {
        return value <= 0;
    }

    public int toInt() {
        return value;
    }
}
