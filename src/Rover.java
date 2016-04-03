public class Rover {
    private String direction;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        this.direction = direction;
        this.y = y;
        this.x = x;
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);

            if (shouldRotateLeft(command) || shouldRotateRight(command)) {
                // Rotate Rover
                if (isFacingNorth()) {
                    if (shouldRotateRight(command)) {
                        direction = "E";
                    } else {
                        direction = "W";
                    }
                } else if (isFacingSouth()) {
                    if (shouldRotateRight(command)) {
                        direction = "W";
                    } else {
                        direction = "E";
                    }
                } else if (isFacingWest()) {
                    if (shouldRotateRight(command)) {
                        direction = "N";
                    } else {
                        direction = "S";
                    }
                } else {
                    if (shouldRotateRight(command)) {
                        direction = "S";
                    } else {
                        direction = "N";
                    }
                }
            } else {
                displace(command);
            }
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
        return direction.equals("W");
    }

    private boolean isFacingSouth() {
        return direction.equals("S");
    }

    private boolean isFacingNorth() {
        return direction.equals("N");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Rover other = (Rover) obj;

        if (direction == null) {
            if (other.direction != null)
                return false;
        } else if (!direction.equals(other.direction))
            return false;

        if (x != other.x)
            return false;

        if (y != other.y)
            return false;

        return true;
    }
}
