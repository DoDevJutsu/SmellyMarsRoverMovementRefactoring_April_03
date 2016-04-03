public class Direction {
    private final String directionAsString;

    public static Direction create(String directionAsString) {
        return new Direction(directionAsString);
    }

    public Direction(String directionAsString) {
        this.directionAsString = directionAsString;
    }

    public Direction rotateRight() {
        if (isNorth()) {
            return new Direction("E");
        } else if (isSouth()) {
            return new Direction("W");
        } else if (isWest()) {
            return new Direction("N");
        } else {
            return new Direction("S");
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
