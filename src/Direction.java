public class Direction {
    private final String directionAsString;

    public static Direction create(String directionAsString) {
        if (isNorth(directionAsString)) {
            return new North(directionAsString);
        } else if (isSouth(directionAsString)) {
            return new South(directionAsString);
        } else if (isWest(directionAsString)) {
            return new West(directionAsString);
        }
        return new East(directionAsString);
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
