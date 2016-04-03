abstract public class Direction {
    abstract public Direction rotateRight();
    abstract public Direction rotateLeft();
    abstract public Coordinates displace(Coordinates coordinates, int displacement);

    public static Direction create(String directionAsString) {
        if (isNorth(directionAsString)) {
            return north();
        } else if (isSouth(directionAsString)) {
            return south();
        } else if (isWest(directionAsString)) {
            return west();
        }
        return east();
    }

    protected static Direction east() {
        return new East();
    }

    protected static Direction west() {
        return new West();
    }

    protected static Direction south() {
        return new South();
    }

    protected static Direction north() {
        return new North();
    }

    private static boolean isWest(String directionAsString) {
        return directionAsString.equals("W");
    }

    private static boolean isSouth(String directionAsString) {
        return directionAsString.equals("S");
    }

    private static boolean isNorth(String directionAsString) {
        return directionAsString.equals("N");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        return getClass() == o.getClass();
    }
}
