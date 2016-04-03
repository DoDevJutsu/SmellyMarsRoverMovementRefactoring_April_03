public class Rover {
    private Vector vector;

    public Rover(int x, int y, String directionAsString) {
        this.vector = new Vector(new Coordinates(x, y), Direction.create(directionAsString));
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);
            if (shouldRotateLeft(command)) {
                vector = new LeftRotation().apply(vector);
            } else if (shouldRotateRight(command)) {
                vector = new RightRotation().apply(vector);
            } else {
                int displacement = computeDisplacement(command);
                vector = new Displacement(displacement).apply(vector);
            }
        }
    }

    private int computeDisplacement(String command) {
        final int LENGTH = 1;
        if (shouldMoveForwards(command)) {
            return LENGTH;
        }
        return -LENGTH;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        return vector != null ? vector.equals(rover.vector) : rover.vector == null;

    }
}
