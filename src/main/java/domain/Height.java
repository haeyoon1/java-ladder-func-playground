package domain;

public class Height {

    private final int value;

    public Height(int value) {
        if (value < 1) {
            throw new IllegalArgumentException("사다리의 높이는 1이상입니다.");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}