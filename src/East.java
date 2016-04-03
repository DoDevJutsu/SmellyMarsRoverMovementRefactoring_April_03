public class East extends Direction {
    public East(String directionAsString) {
        super(directionAsString);
    }

    public Direction rotateRight() {
        return south();
    }
}
