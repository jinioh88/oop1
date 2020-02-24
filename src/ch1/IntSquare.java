package ch1;

public class IntSquare {
    private int squareValue;

    // 공개 인터페이스
    public int getSquareValue(int value) {
        squareValue = calculateSquare(value);
        return squareValue;
    }

    // 비공개 구현
    private int calculateSquare(int value) {
        return value*value;
    }
}
