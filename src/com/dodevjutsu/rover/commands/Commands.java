package com.dodevjutsu.rover.commands;

import com.dodevjutsu.rover.Vector;

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

    public static Commands createFrom(String sequence) {
        List<Command> commands = new ArrayList<>();
        for (int i = 0; i < sequence.length(); ++i) {
            String representation = sequence.substring(i, i + 1);
            commands.add(CommandInterpreter.interpret(representation));
        }
        return new Commands(commands);
    }
}
