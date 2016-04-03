public class East extends Direction {
    public East(String directionAsString) {
        super(directionAsString);
    }

    public Direction rotateRight() {
        return south();
    }

    public Direction rotateLeft() {
        return north();
    }

    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(displacement, 0));
    }
}
