public class North extends Direction {
    public North(String directionAsString) {
        super(directionAsString);
    }

    public Direction rotateRight() {
        return east();
    }

    public Direction rotateLeft() {
        return west();
    }
}
