package com.dodevjutsu.rover.directions;

import com.dodevjutsu.rover.Coordinates;
import com.dodevjutsu.rover.Direction;

public class North extends Direction {
    public Direction rotateRight() {
        return east();
    }

    public Direction rotateLeft() {
        return west();
    }

    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(0, displacement));
    }
}
