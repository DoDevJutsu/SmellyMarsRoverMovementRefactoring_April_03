package com.dodevjutsu.rover.commands;

import com.dodevjutsu.rover.Vector;

class LeftRotation implements Command {

    public Vector apply(Vector vector) {
        return vector.rotateLeft();
    }
}
