package com.dodevjutsu.rover.directions;

import com.dodevjutsu.rover.Coordinates;
import com.dodevjutsu.rover.Direction;

public class West extends Direction {
    public Direction rotateRight() {
        return Direction.north();
    }

    public Direction rotateLeft() {
        return Direction.south();
    }

    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(-displacement, 0));
    }
}