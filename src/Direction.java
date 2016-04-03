public class Direction {
    private final String directionAsString;

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

    protected Direction(String directionAsString) {
        this.directionAsString = directionAsString;
    }

    protected Direction() {
        this.directionAsString = "not used";
    }

    public Direction rotateRight() {
        throw new RuntimeException("Code should not get to Direction's rotateRight!");
    }

    public Direction rotateLeft() {
        throw new RuntimeException("Code should not get to Direction's rotateLeft!");
    }

    public Coordinates displace(Coordinates coordinates, int displacement) {
        throw new RuntimeException("Code should not get to Direction's displace!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        return getClass() == o.getClass();
    }
}
