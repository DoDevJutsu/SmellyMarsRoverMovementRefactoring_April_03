package com.dodevjutsu.rover.commands;

import com.dodevjutsu.rover.Vector;

class Displacement implements Command {
    private int displacement;

    public Displacement(int displacement) {
        this.displacement = displacement;
    }

    public Vector apply(Vector vector) {
        return vector.displace(displacement);
    }
}
