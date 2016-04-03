public class Direction {
    private final String directionAsString;

    public static Direction create(String directionAsString) {
        if (isNorth(directionAsString)) {
            return new North("N");
        } else if (isSouth(directionAsString)) {
            return new South("S");
        } else if(isWest(directionAsString)) {
            return new West("W");
        }
        return new Direction(directionAsString);
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
        if (isNorth()) {
            throw new RuntimeException("Code should not get here!");
        } else if (isSouth()) {
            throw new RuntimeException("Code should not get here!");
        } else if (isWest()) {
            throw new RuntimeException("Code should not get here!");
        } else {
            return Direction.create("S");
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
