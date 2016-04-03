public class Direction {
    private final String directionAsString;

    public static Direction create(String directionAsString) {
        if (isNorth(directionAsString)) {
            return new North("N");
        }
        return new Direction(directionAsString);
    }

    private static boolean isNorth(String directionAsString) {
        return directionAsString.equals("N");
    }

    protected Direction(String directionAsString) {
        this.directionAsString = directionAsString;
    }

    public Direction rotateRight() {
        if (isNorth()) {
           throw new RuntimeException("Code should not get here!");
        } else if (isSouth()) {
            return Direction.create("W");
        } else if (isWest()) {
            return Direction.create("N");
        } else {
            return Direction.create("S");
        }
    }

    public boolean isWest() {
        return directionAsString.equals("W");
    }

    public boolean isSouth() {
        return directionAsString.equals("S");
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
