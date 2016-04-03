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

    public static Commands createCommandsFrom(String sequence) {
        List<Command> commands = new ArrayList<>();
        for (int i = 0; i < sequence.length(); ++i) {
            String representation = sequence.substring(i, i + 1);
            commands.add(createCommand(representation));
        }
        return new Commands(commands);
    }

    private static Command createCommand(String representation) {
        if (isLeftRotation(representation)) {
            return new LeftRotation();
        } else if (isRightRotation(representation)) {
            return new RightRotation();
        } else {
            return new Displacement(getLength(representation));
        }
    }

    private static int getLength(String command) {
        final int LENGTH = 1;
        if (shouldMoveForwards(command)) {
            return LENGTH;
        }
        return -LENGTH;
    }

    private static boolean isLeftRotation(String command) {
        return command.equals("l");
    }

    private static boolean isRightRotation(String command) {
        return command.equals("r");
    }

    private static boolean shouldMoveForwards(String command) {
        return command.equals("f");
    }
}
