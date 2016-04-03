public class Rover {
    private int y;
    private int x;
    private Direction direction;

    public Rover(int x, int y, String directionAsString) {
        this.y = y;
        this.x = x;
        this.direction = Direction.create(directionAsString);
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);
            applyCommand(command);
        }
    }

    private void applyCommand(String command) {
        if (shouldRotateLeft(command)) {
            rotateLeft();
        } else if (shouldRotateRight(command)) {
            rotateRight();
        } else {
            displace(command);
        }
    }

    private void rotateRight() {
        direction = direction.rotateRight();
    }

    private void rotateLeft() {
        if (isFacingNorth()) {
            direction = Direction.create("W");
        } else if (isFacingSouth()) {
            direction = Direction.create("E");
        } else if (isFacingWest()) {
            direction = Direction.create("S");
        } else {
            direction = Direction.create("N");
        }
    }

    private void displace(String command) {
        int displacement = computeDisplacement(command);
        applyDisplacement(displacement);
    }

    private int computeDisplacement(String command) {
        final int LENGTH = 1;
        if (shouldMoveForwards(command)) {
            return LENGTH;
        }
        return -LENGTH;
    }

    private void applyDisplacement(int displacement) {
        if (isFacingNorth()) {
            y += displacement;
        } else if (isFacingSouth()) {
            y -= displacement;
        } else if (isFacingWest()) {
            x -= displacement;
        } else {
            x += displacement;
        }
    }

    private boolean shouldRotateLeft(String command) {
        return command.equals("l");
    }

    private boolean shouldRotateRight(String command) {
        return command.equals("r");
    }

    private boolean shouldMoveForwards(String command) {
        return command.equals("f");
    }

    private boolean isFacingWest() {
        return direction.isWest();
    }

    private boolean isFacingSouth() {
        return direction.isSouth();
    }

    private boolean isFacingNorth() {
        return direction.isNorth();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (y != rover.y) return false;
        if (x != rover.x) return false;
        return direction != null ? direction.equals(rover.direction) : rover.direction == null;

    }
}
