package domain;

public class Car {

    private final String name;
    private int moveCount;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.moveCount = 0;
    }

    public void move() {
        moveCount++;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public boolean canMove(int generatedNumber, int minMoveNumber) {
        return generatedNumber >= minMoveNumber;
    }

    public boolean isWinner(int maxMoveCount) {
        return moveCount == maxMoveCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(moveCount);
    }

    private static void validate(String name) {
        CarValidator.validateCarName(name);
    }
}
