public class South extends Direction {
    public South(String directionAsString) {
        super(directionAsString);
    }

    public Direction rotateRight() {
        return west();
    }

    public Direction rotateLeft() {
        return east();
    }
}
