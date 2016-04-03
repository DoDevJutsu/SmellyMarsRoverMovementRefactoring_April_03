public class Direction {
    private final String directionAsString;

    public Direction(String directionAsString) {
        this.directionAsString = directionAsString;
    }

    public boolean isWest() {
        return directionAsString.equals("W");
    }

    public boolean isSouth() {
        return directionAsString.equals("S");
    }

    public boolean isNorth() {
        return directionAsString.equals("N");
    }
}
