package com.dodevjutsu.rover.directions;

import com.dodevjutsu.rover.Coordinates;
import com.dodevjutsu.rover.Direction;

public class East extends Direction {
    public Direction rotateRight() {
        return south();
    }

    public Direction rotateLeft() {
        return north();
    }

    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(displacement, 0));
    }
}
