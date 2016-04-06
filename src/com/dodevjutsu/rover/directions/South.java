package com.dodevjutsu.rover.directions;

import com.dodevjutsu.rover.Coordinates;
import com.dodevjutsu.rover.Direction;

public class South extends Direction {
    @Override
    public Direction rotateRight() {
        return west();
    }

    @Override
    public Direction rotateLeft() {
        return east();
    }

    @Override
    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(0, -displacement));
    }
}
