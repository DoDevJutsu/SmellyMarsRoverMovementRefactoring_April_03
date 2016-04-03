public class West extends Direction {
    public West(String directionAsString) {
        super(directionAsString);
    }

    public Direction rotateRight() {
        return Direction.create("N");
    }
}
