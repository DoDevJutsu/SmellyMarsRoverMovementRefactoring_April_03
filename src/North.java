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

    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(0, displacement));
    }
}
