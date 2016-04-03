public class Rover {
    private Direction direction;
    private Coordinates coordinates;

    public Rover(int x, int y, String directionAsString) {
        this.direction = Direction.create(directionAsString);
        this.coordinates = new Coordinates(x, y);
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
        direction = direction.rotateLeft();
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
            this.coordinates = coordinates.add(new Coordinates(0, displacement));
        } else if (isFacingSouth()) {
            this.coordinates = coordinates.add(new Coordinates(0, -displacement));
        } else if (isFacingWest()) {
            this.coordinates = coordinates.add(new Coordinates(-displacement, 0));
        } else {
            this.coordinates = coordinates.add(new Coordinates(displacement, 0));
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

        if (direction != null ? !direction.equals(rover.direction) : rover.direction != null) return false;
        return coordinates != null ? coordinates.equals(rover.coordinates) : rover.coordinates == null;

    }
}
