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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction = (Direction) o;

        return directionAsString != null ? directionAsString.equals(direction.directionAsString) : direction.directionAsString == null;

    }
}
