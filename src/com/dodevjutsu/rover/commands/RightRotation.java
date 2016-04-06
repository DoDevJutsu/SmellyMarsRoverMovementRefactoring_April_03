package com.dodevjutsu.rover.commands;

import com.dodevjutsu.rover.Vector;

class RightRotation implements Command {
    public Vector apply(Vector vector) {
        return vector.rotateRight();
    }
}
