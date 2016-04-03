public class Direction {
    private final String directionAsString;

    public static Direction create(String directionAsString) {
        return new Direction(directionAsString);
    }

    protected Direction(String directionAsString) {
        this.directionAsString = directionAsString;
    }

    public Direction rotateRight() {
        if (isNorth()) {
            return Direction.create("E");
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
        return directionAsString.equals("N");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction = (Direction) o;

        return directionAsString != null ? directionAsString.equals(direction.directionAsString) : direction.directionAsString == null;

    }
}
