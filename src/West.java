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

    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(-displacement, 0));
    }
}
