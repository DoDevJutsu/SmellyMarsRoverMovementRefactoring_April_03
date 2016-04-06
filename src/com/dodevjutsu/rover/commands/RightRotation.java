package com.dodevjutsu.rover.commands;

import com.dodevjutsu.rover.Vector;

class RightRotation implements Command {
    @Override
    public Vector apply(Vector vector) {
        return vector.rotateRight();
    }
}
