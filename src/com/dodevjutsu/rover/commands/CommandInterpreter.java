package com.dodevjutsu.rover.commands;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class CommandInterpreter {
    private static final String FORWARDS_DISPLACEMENT = "f";
    private static final String BACKWARDS_DISPLACEMENT = "b";
    private static final String LEFT_ROTATION = "l";
    private static final String RIGHT_ROTATION = "r";
    private static Map<String, Command> knownCommands = knownCommands();

    public static Command interpret(String representation) {
        if (!knownCommands.containsKey(representation)) {
            return new UnknownCommand();
        }
        return knownCommands.get(representation);
    }

    private static Map<String, Command> knownCommands() {
        Map<String, Command> knownCommands = new HashMap<>();
        knownCommands.put(LEFT_ROTATION, new LeftRotation());
        knownCommands.put(RIGHT_ROTATION, new RightRotation());
        knownCommands.put(FORWARDS_DISPLACEMENT, new Displacement(1));
        knownCommands.put(BACKWARDS_DISPLACEMENT, new Displacement(-1));
        return Collections.unmodifiableMap(knownCommands);
    }
}
