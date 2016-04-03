public class West extends Direction {
    public West(String directionAsString) {
        super(directionAsString);
    }

    public Direction rotateRight() {
        return north();
    }

    public Direction rotateLeft() {
        return south();
    }
}
