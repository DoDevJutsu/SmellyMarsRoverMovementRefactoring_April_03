import java.util.ArrayList;
import java.util.List;

public class Commands {
    private List<Command> commands;

    private Commands(List<Command> commands) {
        this.commands = commands;
    }

    public Vector apply(Vector vector) {
        for(Command command : commands) {
            vector = command.apply(vector);
        }
        return vector;
    }

    public static Commands createCommandsFrom(String commandsSequence) {
        List<Command> commands = new ArrayList<>();

        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);
            if (shouldRotateLeft(command)) {
                commands.add(new LeftRotation());
            } else if (shouldRotateRight(command)) {
                commands.add(new RightRotation());
            } else {
                int displacement = computeDisplacement(command);
                commands.add(new Displacement(displacement));
            }
        }
        return new Commands(commands);
    }

    private static int computeDisplacement(String command) {
        final int LENGTH = 1;
        if (shouldMoveForwards(command)) {
            return LENGTH;
        }
        return -LENGTH;
    }

    private static boolean shouldRotateLeft(String command) {
        return command.equals("l");
    }

    private static boolean shouldRotateRight(String command) {
        return command.equals("r");
    }

    private static boolean shouldMoveForwards(String command) {
        return command.equals("f");
    }
}
