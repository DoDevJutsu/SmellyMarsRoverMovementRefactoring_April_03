package com.dodevjutsu.rover.directions;

import com.dodevjutsu.rover.Coordinates;
import com.dodevjutsu.rover.Direction;

public class South extends Direction {
    public Direction rotateRight() {
        return Direction.west();
    }

    public Direction rotateLeft() {
        return Direction.east();
    }

    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(0, -displacement));
    }
}
