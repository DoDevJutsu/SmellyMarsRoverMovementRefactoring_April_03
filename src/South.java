public class South extends Direction {
    public Direction rotateRight() {
        return west();
    }

    public Direction rotateLeft() {
        return east();
    }

    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(0, -displacement));
    }
}
