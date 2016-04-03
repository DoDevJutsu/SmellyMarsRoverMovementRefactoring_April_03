public class North extends Direction {
    public North(String directionAsString) {
        super(directionAsString);
    }

    public Direction rotateRight() {
        return Direction.create("E");
    }
}
