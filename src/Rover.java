public class Rover {
    private Vector vector;

    public Rover(int x, int y, String directionAsString) {
        this.vector = new Vector(new Coordinates(x, y), Direction.create(directionAsString));
    }

    public void receive(String commandsSequence) {
        apply(commandsFrom(commandsSequence));
    }

    private void apply(Commands commands) {
        vector =  commands.apply(vector);
    }

    private Commands commandsFrom(String commandsSequence) {
        return Commands.createFrom(commandsSequence);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        return vector != null ? vector.equals(rover.vector) : rover.vector == null;

    }
}
