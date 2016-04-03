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
        return new East("E");
    }

    protected static Direction west() {
        return new West("W");
    }

    protected static Direction south() {
        return new South("S");
    }

    protected static Direction north() {
        return new North("N");
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

    public Direction rotateRight() {
        throw new RuntimeException("Code should not get to Direction's rotateRight!");
    }

    public Direction rotateLeft() {
        if (isNorth()) {
            return west();
        } else if (isSouth()) {
            return east();
        } else if (isWest()) {
            return south();
        } else {
            return north();
        }
    }

    public boolean isWest() {
        return isWest(directionAsString);
    }

    public boolean isSouth() {
        return isSouth(directionAsString);
    }

    public boolean isNorth() {
        return isNorth(directionAsString);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction = (Direction) o;

        return directionAsString != null ? directionAsString.equals(direction.directionAsString) : direction.directionAsString == null;

    }
}
