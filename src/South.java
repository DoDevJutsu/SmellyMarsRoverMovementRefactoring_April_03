public class South extends Direction {
    public South(String directionAsString) {
        super(directionAsString);
    }

    public Direction rotateRight() {
        return Direction.create("W");
    }
}
